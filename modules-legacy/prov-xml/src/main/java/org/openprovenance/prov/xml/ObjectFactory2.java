//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.09 at 01:51:58 AM BST 
//


package org.openprovenance.prov.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import org.openprovenance.prov.model.LangString;
import org.openprovenance.prov.model.NamespacePrefixMapper;
import org.openprovenance.prov.model.Type;
import org.openprovenance.prov.model.Document;
import org.openprovenance.prov.model.Location;
import org.openprovenance.prov.model.Value;
import org.openprovenance.prov.model.Used;
import org.openprovenance.prov.model.WasGeneratedBy;
import org.openprovenance.prov.model.WasDerivedFrom;
import org.openprovenance.prov.model.WasStartedBy;
import org.openprovenance.prov.model.WasEndedBy;
import org.openprovenance.prov.model.WasInvalidatedBy;
import org.openprovenance.prov.model.MentionOf;
import org.openprovenance.prov.model.WasInfluencedBy;
import org.openprovenance.prov.model.WasInformedBy;
import org.openprovenance.prov.model.SpecializationOf;
import org.openprovenance.prov.model.AlternateOf;
import org.openprovenance.prov.model.Entity;
import org.openprovenance.prov.model.Agent;
import org.openprovenance.prov.model.Activity;
import org.openprovenance.prov.model.WasAttributedTo;
import org.openprovenance.prov.model.ActedOnBehalfOf;
import org.openprovenance.prov.model.WasAssociatedWith;
import org.openprovenance.prov.model.extension.QualifiedAlternateOf;
import org.openprovenance.prov.model.extension.QualifiedHadMember;
import org.openprovenance.prov.model.extension.QualifiedSpecializationOf;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openprovenance.prov.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new org.openprovenance.prov.xml.instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory2 implements org.openprovenance.prov.model.ObjectFactory {
    

    private final static String PROV_NS = NamespacePrefixMapper.PROV_NS;
    private final static String PROV_EXT_NS = NamespacePrefixMapper.PROV_EXT_NS;


    private final static QName _HadPrimarySource_QNAME = new QName(PROV_NS, "hadPrimarySource");
    private final static QName _Collection_QNAME = new QName(PROV_NS, "collection");
    private final static QName _WasDerivedFrom_QNAME = new QName(PROV_NS, "wasDerivedFrom");
    private final static QName _Used_QNAME = new QName(PROV_NS, "used");
    private final static QName _Type_QNAME = new QName(PROV_NS, "type");
    private final static QName _WasInformedBy_QNAME = new QName(PROV_NS, "wasInformedBy");
    private final static QName _ActedOnBehalfOf_QNAME = new QName(PROV_NS, "actedOnBehalfOf");
    private final static QName _EmptyDictionary_QNAME = new QName(PROV_NS, "emptyDictionary");
    private final static QName _WasAssociatedWith_QNAME = new QName(PROV_NS, "wasAssociatedWith");
    private final static QName _SoftwareAgent_QNAME = new QName(PROV_NS, "softwareAgent");
    private final static QName _Person_QNAME = new QName(PROV_NS, "person");
    private final static QName _WasRevisionOf_QNAME = new QName(PROV_NS, "wasRevisionOf");
    private final static QName _Location_QNAME = new QName(PROV_NS, "location");
    private final static QName _WasInfluencedBy_QNAME = new QName(PROV_NS, "wasInfluencedBy");
    private final static QName _Entity_QNAME = new QName(PROV_NS, "entity");
    private final static QName _EmptyCollection_QNAME = new QName(PROV_NS, "emptyCollection");
    private final static QName _Role_QNAME = new QName(PROV_NS, "role");
    private final static QName _Bundle_QNAME = new QName(PROV_NS, "bundle");
    private final static QName _Value_QNAME = new QName(PROV_NS, "value");
    private final static QName _AlternateOf_QNAME = new QName(PROV_NS, "alternateOf");
    private final static QName _Activity_QNAME = new QName(PROV_NS, "activity");
    private final static QName _HadDictionaryMember_QNAME = new QName(PROV_NS, "hadDictionaryMember");
    private final static QName _WasEndedBy_QNAME = new QName(PROV_NS, "wasEndedBy");
    private final static QName _Document_QNAME = new QName(PROV_NS, "document");
    private final static QName _Organization_QNAME = new QName(PROV_NS, "organization");
    private final static QName _HadMember_QNAME = new QName(PROV_NS, "hadMember");
    private final static QName _Dictionary_QNAME = new QName(PROV_NS, "dictionary");
    private final static QName _Label_QNAME = new QName(PROV_NS, "label");
    private final static QName _Agent_QNAME = new QName(PROV_NS, "agent");
    private final static QName _WasInvalidatedBy_QNAME = new QName(PROV_NS, "wasInvalidatedBy");
    private final static QName _MentionOf_QNAME = new QName(PROV_NS, "mentionOf");
    private final static QName _WasAttributedTo_QNAME = new QName(PROV_NS, "wasAttributedTo");
    private final static QName _SpecializationOf_QNAME = new QName(PROV_NS, "specializationOf");
    private final static QName _WasStartedBy_QNAME = new QName(PROV_NS, "wasStartedBy");
    private final static QName _DerivedByRemovalFrom_QNAME = new QName(PROV_NS, "derivedByRemovalFrom");
    private final static QName _DerivedByInsertionFrom_QNAME = new QName(PROV_NS, "derivedByInsertionFrom");
    private final static QName _WasQuotedFrom_QNAME = new QName(PROV_NS, "wasQuotedFrom");
    private final static QName _KeyEntityPair_QNAME = new QName(PROV_NS, "keyEntityPair");
    private final static QName _Plan_QNAME = new QName(PROV_NS, "plan");
    private final static QName _WasGeneratedBy_QNAME = new QName(PROV_NS, "wasGeneratedBy");
    private final static QName _QualifiedSpecializationOf_QNAME = new QName(PROV_EXT_NS, "specializationOf");
    private final static QName _QualifiedAlternateOf_QNAME = new QName(PROV_EXT_NS, "alternateOf");
    private final static QName _QualifiedHadMember_QNAME = new QName(PROV_EXT_NS, "hadMember");

    /**
     * Create a new org.openprovenance.prov.xml.ObjectFactory that can be used to create new instances of schema derived classes for package: org.openprovenance.prov.xml
     * 
     */
    public ObjectFactory2() {
    }

    /**
     * Create an instance of {@link EmptyDictionary }
     * 
     */
    public EmptyDictionary createEmptyDictionary() {
        return new org.openprovenance.prov.xml.EmptyDictionary();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new org.openprovenance.prov.xml.Person();
    }

    /**
     * Create an instance of {@link SoftwareAgent }
     * 
     */
    public SoftwareAgent createSoftwareAgent() {
        return new org.openprovenance.prov.xml.SoftwareAgent();
    }

    /**
     * Create an instance of {@link WasAssociatedWith }
     * 
     */
    public WasAssociatedWith createWasAssociatedWith() {
        return new org.openprovenance.prov.xml.WasAssociatedWith();
    }

    /**
     * Create an instance of {@link WasInfluencedBy }
     * 
     */
    public WasInfluencedBy createWasInfluencedBy() {
        return new org.openprovenance.prov.xml.WasInfluencedBy();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new org.openprovenance.prov.xml.Location();
    }

    /**
     * Create an instance of {@link Revision }
     * 
     */
    public Revision createRevision() {
        return new org.openprovenance.prov.xml.Revision();
    }

    /**
     * Create an instance of {@link EmptyCollection }
     * 
     */
    public EmptyCollection createEmptyCollection() {
        return new org.openprovenance.prov.xml.EmptyCollection();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new org.openprovenance.prov.xml.Entity();
    }

    /**
     * Create an instance of {@link PrimarySource }
     * 
     */
    public PrimarySource createPrimarySource() {
        return new org.openprovenance.prov.xml.PrimarySource();
    }

    /**
     * Create an instance of {@link Collection }
     * 
     */
    public Collection createCollection() {
        return new org.openprovenance.prov.xml.Collection();
    }

    /**
     * Create an instance of {@link WasDerivedFrom }
     * 
     */
    public WasDerivedFrom createWasDerivedFrom() {
        return new org.openprovenance.prov.xml.WasDerivedFrom();
    }

    /**
     * Create an instance of {@link Used }
     * 
     */
    public Used createUsed() {
        return new org.openprovenance.prov.xml.Used();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new org.openprovenance.prov.xml.Type();
    }
    
    /**
     * Create an instance of {@link Type }
     * 
     */
    public Other createOther() {
        return new org.openprovenance.prov.xml.Other();
    }


    /**
     * Create an instance of {@link ActedOnBehalfOf }
     * 
     */
    public ActedOnBehalfOf createActedOnBehalfOf() {
        return new org.openprovenance.prov.xml.ActedOnBehalfOf();
    }

    /**
     * Create an instance of {@link WasInformedBy }
     * 
     */
    public WasInformedBy createWasInformedBy() {
        return new org.openprovenance.prov.xml.WasInformedBy();
    }

    /**
     * Create an instance of {@link DictionaryMembership }
     * 
     */
    public DictionaryMembership createDictionaryMembership() {
        return new org.openprovenance.prov.xml.DictionaryMembership();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new org.openprovenance.prov.xml.Document();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new org.openprovenance.prov.xml.Organization();
    }

    /**
     * Create an instance of {@link WasEndedBy }
     * 
     */
    public WasEndedBy createWasEndedBy() {
        return new org.openprovenance.prov.xml.WasEndedBy();
    }

    /**
     * Create an instance of {@link HadMember }
     * 
     */
    public HadMember createHadMember() {
        return new org.openprovenance.prov.xml.HadMember();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new org.openprovenance.prov.xml.Value();
    }

    /**
     * Create an instance of {@link BundleEntity }
     * 
     */
    public BundleEntity createBundle() {
        return new org.openprovenance.prov.xml.BundleEntity();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new org.openprovenance.prov.xml.Role();
    }

    /**
     * Create an instance of {@link AlternateOf }
     * 
     */
    public AlternateOf createAlternateOf() {
        return new org.openprovenance.prov.xml.AlternateOf();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new org.openprovenance.prov.xml.Activity();
    }


    /**
     * Create an instance of {@link SpecializationOf }
     * 
     */
    public SpecializationOf createSpecializationOf() {
        return new org.openprovenance.prov.xml.SpecializationOf();
    }
    
    /**
     * Create an instance of {@link SpecializationOf }
     * 
     */
    public QualifiedSpecializationOf createQualifiedSpecializationOf() {
        return new org.openprovenance.prov.xml.extension.QualifiedSpecializationOf();
    }

    /**
     * Create an instance of {@link SpecializationOf }
     * 
     */
    public QualifiedHadMember createQualifiedHadMember() {
        return new org.openprovenance.prov.xml.extension.QualifiedHadMember();
    }

    /**
     * Create an instance of {@link SpecializationOf }
     * 
     */
    public QualifiedAlternateOf createQualifiedAlternateOf() {
        return new org.openprovenance.prov.xml.extension.QualifiedAlternateOf();
    }

    /**
     * Create an instance of {@link WasAttributedTo }
     * 
     */
    public WasAttributedTo createWasAttributedTo() {
        return new org.openprovenance.prov.xml.WasAttributedTo();
    }

    /**
     * Create an instance of {@link LangString }
     * 
     */
    public InternationalizedString createInternationalizedString() {
        return new org.openprovenance.prov.xml.InternationalizedString();
    }

    /**
     * Create an instance of {@link Dictionary }
     * 
     */
    public Dictionary createDictionary() {
        return new org.openprovenance.prov.xml.Dictionary();
    }

    /**
     * Create an instance of {@link MentionOf }
     * 
     */
    public MentionOf createMentionOf() {
        return new org.openprovenance.prov.xml.MentionOf();
    }

    /**
     * Create an instance of {@link WasInvalidatedBy }
     * 
     */
    public WasInvalidatedBy createWasInvalidatedBy() {
        return new org.openprovenance.prov.xml.WasInvalidatedBy();
    }

    /**
     * Create an instance of {@link Agent }
     * 
     */
    public Agent createAgent() {
        return new org.openprovenance.prov.xml.Agent();
    }

    /**
     * Create an instance of {@link DerivedByInsertionFrom }
     * 
     */
    public DerivedByInsertionFrom createDerivedByInsertionFrom() {
        return new org.openprovenance.prov.xml.DerivedByInsertionFrom();
    }

    /**
     * Create an instance of {@link DerivedByRemovalFrom }
     * 
     */
    public DerivedByRemovalFrom createDerivedByRemovalFrom() {
        return new org.openprovenance.prov.xml.DerivedByRemovalFrom();
    }

    /**
     * Create an instance of {@link Plan }
     * 
     */
    public Plan createPlan() {
        return new org.openprovenance.prov.xml.Plan();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new org.openprovenance.prov.xml.Entry();
    }

    /**
     * Create an instance of {@link Quotation }
     * 
     */
    public Quotation createQuotation() {
        return new org.openprovenance.prov.xml.Quotation();
    }

    /**
     * Create an instance of {@link WasGeneratedBy }
     * 
     */
    public WasGeneratedBy createWasGeneratedBy() {
        return new org.openprovenance.prov.xml.WasGeneratedBy();
    }

    /**
     * Create an instance of {@link WasStartedBy }
     * 
     */
    public WasStartedBy createWasStartedBy() {
        return new org.openprovenance.prov.xml.WasStartedBy();
    }

    /**
     * Create an instance of {@link TypedValue }
     * 
     */
    public TypedValue createTypedValue() {
        return new org.openprovenance.prov.xml.TypedValue();
    }

    /**
     * Create an instance of {@link Key }
     * 
     */
    public Key createKey() {
        return new org.openprovenance.prov.xml.Key();
    }

    
    /**
     * Create an instance of {@link Bundle }
     * 
     */
    public Bundle createNamedBundle() {
        return new org.openprovenance.prov.xml.Bundle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimarySource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "hadPrimarySource")
    public JAXBElement<PrimarySource> createHadPrimarySource(PrimarySource value) {
        return new JAXBElement<PrimarySource>(_HadPrimarySource_QNAME, PrimarySource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "collection")
    public JAXBElement<Collection> createCollection(Collection value) {
        return new JAXBElement<Collection>(_Collection_QNAME, Collection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasDerivedFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "wasDerivedFrom")
    public JAXBElement<WasDerivedFrom> createWasDerivedFrom(WasDerivedFrom value) {
        return new JAXBElement<WasDerivedFrom>(_WasDerivedFrom_QNAME, WasDerivedFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Used }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "used")
    public JAXBElement<Used> createUsed(Used value) {
        return new JAXBElement<Used>(_Used_QNAME, Used.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "type")
    public JAXBElement<Type> createType(Type value) {
        return new JAXBElement<Type>(_Type_QNAME, Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasInformedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "wasInformedBy")
    public JAXBElement<WasInformedBy> createWasInformedBy(WasInformedBy value) {
        return new JAXBElement<WasInformedBy>(_WasInformedBy_QNAME, WasInformedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActedOnBehalfOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "actedOnBehalfOf")
    public JAXBElement<ActedOnBehalfOf> createActedOnBehalfOf(ActedOnBehalfOf value) {
        return new JAXBElement<ActedOnBehalfOf>(_ActedOnBehalfOf_QNAME, ActedOnBehalfOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyDictionary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "emptyDictionary")
    public JAXBElement<EmptyDictionary> createEmptyDictionary(EmptyDictionary value) {
        return new JAXBElement<EmptyDictionary>(_EmptyDictionary_QNAME, EmptyDictionary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasAssociatedWith }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "wasAssociatedWith")
    public JAXBElement<WasAssociatedWith> createWasAssociatedWith(WasAssociatedWith value) {
        return new JAXBElement<WasAssociatedWith>(_WasAssociatedWith_QNAME, WasAssociatedWith.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoftwareAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "softwareAgent")
    public JAXBElement<SoftwareAgent> createSoftwareAgent(SoftwareAgent value) {
        return new JAXBElement<SoftwareAgent>(_SoftwareAgent_QNAME, SoftwareAgent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Revision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "wasRevisionOf")
    public JAXBElement<Revision> createWasRevisionOf(Revision value) {
        return new JAXBElement<Revision>(_WasRevisionOf_QNAME, Revision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "location")
    public JAXBElement<Location> createLocation(Location value) {
        return new JAXBElement<Location>(_Location_QNAME, Location.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasInfluencedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "wasInfluencedBy")
    public JAXBElement<WasInfluencedBy> createWasInfluencedBy(WasInfluencedBy value) {
        return new JAXBElement<WasInfluencedBy>(_WasInfluencedBy_QNAME, WasInfluencedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "entity")
    public JAXBElement<Entity> createEntity(Entity value) {
        return new JAXBElement<Entity>(_Entity_QNAME, Entity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "emptyCollection")
    public JAXBElement<EmptyCollection> createEmptyCollection(EmptyCollection value) {
        return new JAXBElement<EmptyCollection>(_EmptyCollection_QNAME, EmptyCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Role }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "role")
    public JAXBElement<Role> createRole(Role value) {
        return new JAXBElement<Role>(_Role_QNAME, Role.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BundleEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "bundle")
    public JAXBElement<BundleEntity> createBundle(BundleEntity value) {
        return new JAXBElement<BundleEntity>(_Bundle_QNAME, BundleEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Value }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "value")
    public JAXBElement<Value> createValue(Value value) {
        return new JAXBElement<Value>(_Value_QNAME, Value.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternateOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "alternateOf")
    public JAXBElement<AlternateOf> createAlternateOf(AlternateOf value) {
        return new JAXBElement<AlternateOf>(_AlternateOf_QNAME, AlternateOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Activity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "activity")
    public JAXBElement<Activity> createActivity(Activity value) {
        return new JAXBElement<Activity>(_Activity_QNAME, Activity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryMembership }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "hadDictionaryMember")
    public JAXBElement<DictionaryMembership> createHadDictionaryMember(DictionaryMembership value) {
        return new JAXBElement<DictionaryMembership>(_HadDictionaryMember_QNAME, DictionaryMembership.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasEndedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "wasEndedBy")
    public JAXBElement<WasEndedBy> createWasEndedBy(WasEndedBy value) {
        return new JAXBElement<WasEndedBy>(_WasEndedBy_QNAME, WasEndedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "organization")
    public JAXBElement<Organization> createOrganization(Organization value) {
        return new JAXBElement<Organization>(_Organization_QNAME, Organization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HadMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "hadMember")
    public JAXBElement<HadMember> createHadMember(HadMember value) {
        return new JAXBElement<HadMember>(_HadMember_QNAME, HadMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dictionary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "dictionary")
    public JAXBElement<Dictionary> createDictionary(Dictionary value) {
        return new JAXBElement<Dictionary>(_Dictionary_QNAME, Dictionary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LangString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "label")
    public JAXBElement<InternationalizedString> createLabel(InternationalizedString value) {
        return new JAXBElement<InternationalizedString>(_Label_QNAME, InternationalizedString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "agent")
    public JAXBElement<Agent> createAgent(Agent value) {
        return new JAXBElement<Agent>(_Agent_QNAME, Agent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasInvalidatedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "wasInvalidatedBy")
    public JAXBElement<WasInvalidatedBy> createWasInvalidatedBy(WasInvalidatedBy value) {
        return new JAXBElement<WasInvalidatedBy>(_WasInvalidatedBy_QNAME, WasInvalidatedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MentionOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "mentionOf")
    public JAXBElement<MentionOf> createMentionOf(MentionOf value) {
        return new JAXBElement<MentionOf>(_MentionOf_QNAME, MentionOf.class, null, value);
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasAttributedTo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "wasAttributedTo")
    public JAXBElement<WasAttributedTo> createWasAttributedTo(WasAttributedTo value) {
        return new JAXBElement<WasAttributedTo>(_WasAttributedTo_QNAME, WasAttributedTo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecializationOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "specializationOf")
    public JAXBElement<SpecializationOf> createSpecializationOf(SpecializationOf value) {
        return new JAXBElement<SpecializationOf>(_SpecializationOf_QNAME, SpecializationOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifiedSpecializationOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_EXT_NS, name = "specializationOf")
    public JAXBElement<QualifiedSpecializationOf> createQualifiedSpecializationOf(QualifiedSpecializationOf value) {
        return new JAXBElement<QualifiedSpecializationOf>(_QualifiedSpecializationOf_QNAME, QualifiedSpecializationOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifiedSpecializationOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_EXT_NS, name = "alternateOf")
    public JAXBElement<QualifiedAlternateOf> createQualifiedAlternateOf(QualifiedAlternateOf value) {
        return new JAXBElement<QualifiedAlternateOf>(_QualifiedSpecializationOf_QNAME, QualifiedAlternateOf.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifiedSpecializationOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_EXT_NS, name = "hadMember")
    public JAXBElement<QualifiedHadMember> createQualifiedHadMemberf(QualifiedHadMember value) {
        return new JAXBElement<QualifiedHadMember>(_QualifiedHadMember_QNAME, QualifiedHadMember.class, null, value);
    }
   
   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasStartedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "wasStartedBy")
    public JAXBElement<WasStartedBy> createWasStartedBy(WasStartedBy value) {
        return new JAXBElement<WasStartedBy>(_WasStartedBy_QNAME, WasStartedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerivedByRemovalFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "derivedByRemovalFrom")
    public JAXBElement<DerivedByRemovalFrom> createDerivedByRemovalFrom(DerivedByRemovalFrom value) {
        return new JAXBElement<DerivedByRemovalFrom>(_DerivedByRemovalFrom_QNAME, DerivedByRemovalFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerivedByInsertionFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "derivedByInsertionFrom")
    public JAXBElement<DerivedByInsertionFrom> createDerivedByInsertionFrom(DerivedByInsertionFrom value) {
        return new JAXBElement<DerivedByInsertionFrom>(_DerivedByInsertionFrom_QNAME, DerivedByInsertionFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quotation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "wasQuotedFrom")
    public JAXBElement<Quotation> createWasQuotedFrom(Quotation value) {
        return new JAXBElement<Quotation>(_WasQuotedFrom_QNAME, Quotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "keyEntityPair")
    public JAXBElement<Entry> createKeyEntityPair(Entry value) {
        return new JAXBElement<Entry>(_KeyEntityPair_QNAME, Entry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Plan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "plan")
    public JAXBElement<Plan> createPlan(Plan value) {
        return new JAXBElement<Plan>(_Plan_QNAME, Plan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasGeneratedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = PROV_NS, name = "wasGeneratedBy")
    public JAXBElement<WasGeneratedBy> createWasGeneratedBy(WasGeneratedBy value) {
        return new JAXBElement<WasGeneratedBy>(_WasGeneratedBy_QNAME, WasGeneratedBy.class, null, value);
    }

}
