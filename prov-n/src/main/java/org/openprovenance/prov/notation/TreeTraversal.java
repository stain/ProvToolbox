package org.openprovenance.prov.notation;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import  org.antlr.runtime.tree.Tree;
import  org.antlr.runtime.tree.CommonTree;
import org.openprovenance.prov.model.Entry;
import org.openprovenance.prov.model.LangString;
import org.openprovenance.prov.model.Key;
import org.openprovenance.prov.model.Attribute;
import org.openprovenance.prov.model.ModelConstructor;
import org.openprovenance.prov.model.Name;
import org.openprovenance.prov.model.Bundle;
import org.openprovenance.prov.model.Namespace;
import org.openprovenance.prov.model.ProvUtilities;
import org.openprovenance.prov.model.ProvFactory;
import org.openprovenance.prov.model.QualifiedName;
import org.openprovenance.prov.model.Statement;

/* Class to traverse the syntax tree generated by antl parser, invoking constructor methods in TreeConstructor interface. */

public class TreeTraversal {

    final private ModelConstructor c;
    final private ProvFactory pFactory;
    final private Name name;
    //final private ValueConverter vconv;
    
    public TreeTraversal(ModelConstructor c, ProvFactory pFactory) {
        this.c=c;
        this.pFactory=pFactory;
        this.name=pFactory.getName();
        this.namespace=pFactory.newNamespace();
        this.namespace.addKnownNamespaces();
        
        //this.vconv=new ValueConverter(pFactory,null);
    }
   

    public String getTokenString(Tree t) {
        if (t==null) return null;
        if (((CommonTree)t).getToken()==null) return null;
        return ((CommonTree)t).getToken().getText();
    }

    public String convertToken(String token) {
        return token;
    }

    public int convertInt(String token) {
        return Integer.valueOf(token);
    }

    public String stripAmpersand(String token) {
        return token.substring(1);
    }

    public String unquoteTwice(String token) {
        return token.substring(2,token.length()-2);
    }
    public String unquoteTrice(String token) {
        return token.substring(3,token.length()-3);
    }

    public Object convert(Tree ast) {
        switch(ast.getType()) {

            /* Component 1 */

        case PROV_NParser.ENTITY:
            QualifiedName id=(QualifiedName)convert(ast.getChild(0));
            List<Attribute> eAttrs=(List<Attribute>) convert(ast.getChild(1));
            return c.newEntity(id,eAttrs);

        case PROV_NParser.ACTIVITY:
            id=(QualifiedName)convert(ast.getChild(0));
            XMLGregorianCalendar startTime=(XMLGregorianCalendar)convert(ast.getChild(1));
            XMLGregorianCalendar endTime=(XMLGregorianCalendar)convert(ast.getChild(2));
            List<Attribute> aAttrs=(List<Attribute>) convert(ast.getChild(3));
            return c.newActivity(id,startTime,endTime,aAttrs);

        case PROV_NParser.START:
        case PROV_NParser.END:
            if (ast.getChildCount()==0) return null;
            if (ast.getChild(0)==null) return null;
	    return convert (ast.getChild(0)); 

        case PROV_NParser.USED:
            Tree uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            QualifiedName uid=(QualifiedName) convert(uidTree);
            QualifiedName id2=(QualifiedName) convert(ast.getChild(1));
            QualifiedName id1=(QualifiedName) convert(ast.getChild(2));
            XMLGregorianCalendar time=(XMLGregorianCalendar) convert(ast.getChild(3));
            List<Attribute> rAttrs=(List<Attribute>) convert(ast.getChild(4));
            return c.newUsed(uid, id2, id1,time,rAttrs);

        case PROV_NParser.WGB:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName) convert(uidTree);
            id2=(QualifiedName) convert(ast.getChild(1));
            id1=(QualifiedName) convert(ast.getChild(2));
            time=(XMLGregorianCalendar) convert(ast.getChild(3));
            rAttrs=(List<Attribute>) convert(ast.getChild(4));
            return c.newWasGeneratedBy(uid,id2,id1,time,rAttrs);

        case PROV_NParser.WSB:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName)convert(uidTree);
            id2=(QualifiedName)convert(ast.getChild(1));
            id1=(QualifiedName)convert(ast.getChild(2));
            QualifiedName id3=(QualifiedName)convert(ast.getChild(3));
            time=(XMLGregorianCalendar) convert(ast.getChild(4));
            rAttrs=(List<Attribute>) convert(ast.getChild(5));
            return c.newWasStartedBy(uid,id2,id1,id3,time,rAttrs);


        case PROV_NParser.WEB:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName)convert(uidTree);
            id2=(QualifiedName)convert(ast.getChild(1));
            id1=(QualifiedName)convert(ast.getChild(2));
            id3=(QualifiedName) convert(ast.getChild(3));
            time=(XMLGregorianCalendar) convert(ast.getChild(4));
            rAttrs=(List<Attribute>) convert(ast.getChild(5));
            return c.newWasEndedBy(uid,id2,id1,id3,time,rAttrs);

        case PROV_NParser.TIME:
            if (ast.getChildCount()==0) return null;
            if (ast.getChild(0)==null) return null;
            return pFactory.newISOTime(getTokenString(ast.getChild(0)));

        case PROV_NParser.WINVB:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName)convert(uidTree);
            id2=(QualifiedName)convert(ast.getChild(1));
            id1=(QualifiedName)convert(ast.getChild(2));
            time=(XMLGregorianCalendar) convert(ast.getChild(3));
            rAttrs=(List<Attribute>) convert(ast.getChild(4));
            return c.newWasInvalidatedBy(uid,id2,id1,time,rAttrs);


        case PROV_NParser.WIB:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName)convert(uidTree);
            id2=(QualifiedName)convert(ast.getChild(1));
            id1=(QualifiedName)convert(ast.getChild(2));
            rAttrs=(List<Attribute>) convert(ast.getChild(3));
            return c.newWasInformedBy(uid,id2,id1,rAttrs);


            /* Component 2 */

        case PROV_NParser.AGENT:
            id=(QualifiedName) convert(ast.getChild(0));
            List<Attribute> agAttrs=(List<Attribute>) convert(ast.getChild(1));
            return c.newAgent(id,agAttrs);


        case PROV_NParser.WAT:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName)convert(uidTree);
            id2=(QualifiedName)convert(ast.getChild(1));
            id1=(QualifiedName)convert(ast.getChild(2));
            rAttrs=(List<Attribute>) convert(ast.getChild(3));
            return c.newWasAttributedTo(uid,id2,id1,rAttrs);


        case PROV_NParser.WAW:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName)convert(uidTree);
            id2=(QualifiedName)convert(ast.getChild(1));
            id1=(QualifiedName) ((ast.getChild(2)==null)?null : convert(ast.getChild(2)));
            QualifiedName pl=(QualifiedName) ((ast.getChild(3)==null)?null : convert(ast.getChild(3)));
            rAttrs=(List<Attribute>) convert(ast.getChild(4));
            return c.newWasAssociatedWith(uid,id2,id1,pl,rAttrs);


        case PROV_NParser.AOBO:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName)convert(uidTree);
            id2=(QualifiedName)convert(ast.getChild(1));
            id1=(QualifiedName)convert(ast.getChild(2));
            QualifiedName a=(QualifiedName) ((ast.getChild(3)==null)?null : convert(ast.getChild(3)));
            rAttrs=(List<Attribute>) convert(ast.getChild(4));
            return c.newActedOnBehalfOf(uid,id2,id1,a,rAttrs);


            /* Component 3 */

        case PROV_NParser.WDF:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName)convert(uidTree);
            id2=(QualifiedName)convert(ast.getChild(1));
            id1=(QualifiedName)convert(ast.getChild(2));
            QualifiedName pe=(QualifiedName) convert(ast.getChild(3));
            QualifiedName q2=(QualifiedName) convert(ast.getChild(4));
            QualifiedName q1=(QualifiedName) convert(ast.getChild(5));
            List<Attribute> dAttrs=(List<Attribute>) convert(ast.getChild(6));
            return c.newWasDerivedFrom(uid,id2,id1,pe,q2,q1,dAttrs);

            /*
        case PROV_NParser.WRO:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QName)convert(uidTree);
            id2=(QName)convert(ast.getChild(1));
            id1=(QName)convert(ast.getChild(2));
            pe=convert(ast.getChild(3));
            q2=convert(ast.getChild(4));
            q1=convert(ast.getChild(5));
            dAttrs=convert(ast.getChild(6));
            return c.newWasRevisionOf(uid,id2,id1,pe,q2,q1,dAttrs);

        case PROV_NParser.WQF:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QName)convert(uidTree);
            id2=(QName)convert(ast.getChild(1));
            id1=(QName)convert(ast.getChild(2));
            pe=convert(ast.getChild(3));
            q2=convert(ast.getChild(4));
            q1=convert(ast.getChild(5));
            dAttrs=convert(ast.getChild(6));
            return c.newWasQuotedFrom(uid,id2,id1,pe,q2,q1,dAttrs);

        case PROV_NParser.PRIMARYSOURCE:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QName)convert(uidTree);
            id2=(QName)convert(ast.getChild(1));
            id1=(QName)convert(ast.getChild(2));
            pe=convert(ast.getChild(3));
            q2=convert(ast.getChild(4));
            q1=convert(ast.getChild(5));
            dAttrs=convert(ast.getChild(6));
            return c.newHadPrimarySource(uid,id2,id1,pe,q2,q1,dAttrs);
*/
            
        case PROV_NParser.INFL:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName)convert(uidTree);
            id2=(QualifiedName)convert(ast.getChild(1));
            id1=(QualifiedName)convert(ast.getChild(2));
            dAttrs=(List<Attribute>) convert(ast.getChild(3));
            return c.newWasInfluencedBy(uid,id2,id1,dAttrs);

            /* Component 4 */

            /* Component 5 */

        case PROV_NParser.ALTERNATE:
            id2=(QualifiedName)convert(ast.getChild(0));
            id1=(QualifiedName)convert(ast.getChild(1));
            return c.newAlternateOf(id2,id1);

        case PROV_NParser.SPECIALIZATION:
            id2=(QualifiedName)convert(ast.getChild(0));
            id1=(QualifiedName)convert(ast.getChild(1));
            return c.newSpecializationOf(id2,id1);

        case PROV_NParser.MEM:
            id2=(QualifiedName)convert(ast.getChild(0));
            id1=(QualifiedName)convert(ast.getChild(1));
            List<QualifiedName> ll=new LinkedList<QualifiedName>();
            if (id1!=null) ll.add(id1);
            return c.newHadMember(id2,ll);

        case PROV_NParser.CTX:
            QualifiedName su=(QualifiedName)convert(ast.getChild(0));
            QualifiedName bu=(QualifiedName)convert(ast.getChild(1));
            QualifiedName ta=(QualifiedName)convert(ast.getChild(2));
            return c.newMentionOf(su,bu,ta);



            /* Component 6 */

        case PROV_NParser.DBIF:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName)convert(uidTree);
            id2=(QualifiedName)convert(ast.getChild(1));
            id1=(QualifiedName)convert(ast.getChild(2));
            List<Entry> keymap=(List<Entry>)convert(ast.getChild(3));
            dAttrs=(List<Attribute>) convert(ast.getChild(4));
            return c.newDerivedByInsertionFrom(uid,id2,id1,keymap,dAttrs);

        case PROV_NParser.DBRF:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName)convert(uidTree);
            id2=(QualifiedName)convert(ast.getChild(1));
            id1=(QualifiedName)convert(ast.getChild(2));
            Object keyset=convert(ast.getChild(3));
            dAttrs=(List<Attribute>)convert(ast.getChild(4));
            return c.newDerivedByRemovalFrom(uid,id2,id1,(List<org.openprovenance.prov.model.Key>)keyset,dAttrs);

        case PROV_NParser.DMEM:
            //uidTree=ast.getChild(0);
            //if (uidTree.getChildCount()>0) {
            //    uidTree=uidTree.getChild(0);
            //}
            //uid=(QualifiedName)convert(uidTree);
            id2=(QualifiedName)convert(ast.getChild(1));
            keymap=(List<Entry>) convert(ast.getChild(2));
            //dAttrs=(List<Attribute>) convert(ast.getChild(4));
            return c.newDictionaryMembership(id2,keymap);

        case PROV_NParser.CMEM:
            uidTree=ast.getChild(0);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName)convert(uidTree);
            id2=(QualifiedName)convert(ast.getChild(1));
            Object cmemEntities=convert(ast.getChild(2));
            //complete=convert(ast.getChild(3));
            dAttrs=(List<Attribute>) convert(ast.getChild(4));
            //return c.newCollectionMemberOf(uid,id2,cmemEntities,complete,dAttrs);
            return null;


        case PROV_NParser.KEYS:
            List<Key> keys=new LinkedList<Key>();
            for (int i=0; i< ast.getChildCount(); i++) {
                Object o=convert(ast.getChild(i));
                Object [] pair=(Object[]) o;         
                keys.add(pFactory.newKey(pair[0], (QualifiedName)pair[1]));

            }
            return keys;


        case PROV_NParser.VALUES:
            List<Object> values=new LinkedList<Object>();
            for (int i=0; i< ast.getChildCount(); i++) {
                Object o=convert(ast.getChild(i));
                values.add(o);
            }
            return values;

        case PROV_NParser.KES:
            Object keys1=convert(ast.getChild(0));
            Object entities=convert(ast.getChild(1));

            @SuppressWarnings("unchecked")
            List<Object> keys2 = (List<Object>)keys1;
	    
            @SuppressWarnings("unchecked")
            List<QualifiedName> qnames = (List<QualifiedName>)entities;
	    
            List<Entry> entries=new LinkedList<Entry>();
            int ii=0;
            for (Object o : keys2) {
                QualifiedName value=qnames.get(ii);
                Entry p=pFactory.newEntry((org.openprovenance.prov.model.Key)o, value);
                
                entries.add(p);
                ii++;
            }

            return entries;

        case PROV_NParser.ES:
            List<Object> listOfEntities=new LinkedList<Object>();
            for (int i=0; i< ast.getChildCount(); i++) {
                Object o=convert(ast.getChild(i));
                listOfEntities.add(o);
            }
            return listOfEntities;

            /* Component 6 */

        case PROV_NParser.EXT:
        	System.out.println("FOUND Extension " + ast);
            Object extName=convert(ast.getChild(0));
            uidTree=ast.getChild(1);
            if (uidTree.getChildCount()>0) {
                uidTree=uidTree.getChild(0);
            }
            uid=(QualifiedName)convert(uidTree);

            Object optionalAttributes=convert(ast.getChild(ast.getChildCount()-1));
            List<Object> args=new LinkedList<Object>();
            for (int i=2; i< ast.getChildCount()-1; i++) {
                Object o=convert(ast.getChild(i));
                args.add(o);
            }
            //return c.newExtension(extName, uid, args, optionalAttributes);
            return null;

            /* Miscellaneous Constructs */

        case PROV_NParser.EXPRESSIONS:
        case PROV_NParser.BUNDLES:
            List<Object> records=new LinkedList<Object>();
            for (int i=0; i< ast.getChildCount(); i++) {
                Object o=convert(ast.getChild(i));
                records.add(o);
            }
            return records;

        case PROV_NParser.DOCUMENT:
            Namespace nss=(Namespace)convert(ast.getChild(0));
            //System.out.println("+++ namespace" + nss);
            @SuppressWarnings("unchecked")
            List<Statement> records2=(List<Statement>)convert(ast.getChild(1));
            List<Bundle> bundles=null;
            if (ast.getChild(2)!=null) {
	        @SuppressWarnings("unchecked")
                List<Bundle> tmp = (List<Bundle>)convert(ast.getChild(2));
	        bundles=tmp;
            }
            return c.newDocument(nss,records2, bundles);

        case PROV_NParser.BUNDLE:
	    
	    Namespace localNamespace=pFactory.newNamespace();
	    localNamespace.addKnownNamespaces();
            localNamespace.setParent(namespace);

            // make the local namespace to become the current namespace
            namespace=localNamespace;
            
            convert(ast.getChild(1));
            
            
            // parse bundleId after namespace declarations
            QualifiedName bundleId=(QualifiedName) convert(ast.getChild(0));

            //c.startBundle(bundleId);

            @SuppressWarnings("unchecked")
            List<Statement> records3=(List<Statement>)convert(ast.getChild(2));
            
            //restore the parent namespace
            namespace=localNamespace.getParent();
            return c.newNamedBundle(bundleId,localNamespace,records3);
            
        case PROV_NParser.ATTRIBUTES:
            List<Attribute> attributes=new LinkedList<Attribute>();
            for (int i=0; i< ast.getChildCount(); i++) {
                attributes.add((Attribute)convert(ast.getChild(i)));
            }
            return attributes;

        case PROV_NParser.ID:
            return stringToQualifiedName(convertToken(getTokenString(ast.getChild(0))));

        case PROV_NParser.ATTRIBUTE:
            String attr1=convertToken(getTokenString(ast.getChild(0)));
            Object val1=convert(ast.getChild(1));
            
            if (val1 instanceof Object[]) {
            	Object [] values2=(Object[])val1;
            	Object theValue=values2[0];
            	QualifiedName theType=(QualifiedName)values2[1];
		    

            	return pFactory.newAttribute(stringToQualifiedName(attr1),
                	                             theValue,
                	                             theType);
            
            	
            } else if (val1 instanceof LangString) {
            	return pFactory.newAttribute(stringToQualifiedName(attr1),
            	                             val1,
            	                             name.XSD_STRING);	
            } else if (val1 instanceof Integer) {
            	return pFactory.newAttribute(stringToQualifiedName(attr1),
            	                             val1,
            	                             name.XSD_INT);	
            } else if (val1 instanceof String) {
            	return pFactory.newAttribute(stringToQualifiedName(attr1),
            	                             val1,
            	                             name.XSD_STRING);	
            } else {
        	System.out.println("****** " + val1); // TODO what case is it?
        	System.out.println("****** " + val1.getClass());
                return pFactory.newAttribute(stringToQualifiedName(attr1),
                                             val1,
                                             name.XSD_STRING);	            	
            }

        case PROV_NParser.STRING:
            if (ast.getChildCount()==1) {
                return unescape(unwrap(convertToken(getTokenString(ast.getChild(0)))));
            } else {
                return pFactory.newInternationalizedString(unescape(unwrap(convertToken(getTokenString(ast.getChild(0))))),
                                                           stripAmpersand(convertToken(getTokenString(ast.getChild(1)))));
            }
        case PROV_NParser.STRING_LONG:
            if (ast.getChildCount()==1) {
                return unescape(unquoteTrice(convertToken(getTokenString(ast.getChild(0)))));
            } else {
                return pFactory.newInternationalizedString(unescape(unquoteTrice(convertToken(getTokenString(ast.getChild(0))))),
                                                           stripAmpersand(convertToken(getTokenString(ast.getChild(1)))));
            }

        case PROV_NParser.INT:
            return convertInt(getTokenString(ast.getChild(0)));
        
        case PROV_NParser.QNAM:
            return stringToQualifiedName(convertToken(getTokenString(ast.getChild(0))));

        case PROV_NParser.IRI:
            String iri=convertToken(getTokenString(ast.getChild(0)));
            return URI.create(unwrap(iri));

        case PROV_NParser.TYPEDLITERAL:
            String v1=convertToken(getTokenString(ast.getChild(0)));
            QualifiedName v2;
            
            if (ast.getChild(1)==null) {
                v2=name.PROV_QUALIFIED_NAME;
                //v1="\"" + v1 + "\"";
                Object ooo=stringToQualifiedName(v1);
                return convertTypedLiteral(v2,ooo);
            } else {
        	v2=(QualifiedName)convert(ast.getChild(1));
                if (ast.getChild(2)!=null) {
                    Object iv1=pFactory.newInternationalizedString(unescape(unwrap(v1)),
                                                                   stripAmpersand(convertToken(getTokenString(ast.getChild(2)))));
                    return convertTypedLiteral(v2,iv1);
                } else {
                    v1=unescape(unwrap(v1));
                    return convertTypedLiteral(v2,v1);
                }
            }

        case PROV_NParser.NAMESPACE:
            String pre=(String)convert(ast.getChild(0));
            String iri1=unwrap(getTokenString(ast.getChild(1)));
            if (pre!=null) { // should not occur
        	namespace.register(pre, iri1);
            }
            return null;

        case PROV_NParser.DEFAULTNAMESPACE:
            iri1=unwrap(getTokenString(ast.getChild(0)));
            namespace.registerDefault(iri1);
            return null;

        case PROV_NParser.PREFIX:
            String prefix=getTokenString(ast.getChild(0));
            return prefix;

        case PROV_NParser.NAMESPACES:
            for (int i=0; i< ast.getChildCount(); i++) {
                Object o=convert(ast.getChild(i));            
            }
            return namespace;


        case PROV_NParser.TRUE:
            return true;
        case PROV_NParser.FALSE:
            return false;
        case PROV_NParser.UNKNOWN:
            return null;

        }


        return null;

    }
    
    private QualifiedName stringToQualifiedName(String attr1) {
	return namespace.stringToQualifiedName(attr1,pFactory);
    }


    private String unescape(String s) {
	return ProvUtilities.unescape(s);
    }

    Namespace namespace;
    

    public Object convertTypedLiteral(QualifiedName datatype, Object value) {
    	Object [] valueTypePair=new Object[] {value,datatype};
    	return valueTypePair;
    /*	
        if (value instanceof String) {
            Object val=vconv.convertToJava(datatype,(String)value);
            return val;
        } else {
            return value;
        }
        */
    }



    public String unwrap (String s) {
        return s.substring(1,s.length()-1);
    }
   

}

