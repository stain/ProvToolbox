//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.25 at 11:38:35 AM BST 
//


package org.openprovenance.prov.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anySimpleType">
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", namespace = "http://www.w3.org/ns/prov#")
public class Location extends TypedValue
    implements Equals, HashCode, ToString, org.openprovenance.prov.model.Location
{
}

// {

//     @XmlValue
//     @XmlSchemaType(name = "anySimpleType")
//     protected Object value;
//     @XmlAttribute(name = "type", namespace = "http://www.w3.org/2001/XMLSchema-instance")
//     protected QName type;

    
//     transient protected Object valueAsJava;

//     /**
//      * Gets the value of the value property.
//      * 
//      * @return
//      *     possible object is
//      *     {@link Object }
//      *     
//      */
//     public Object getValue() {
//         return value;
//     }

//     /**
//      * Sets the value of the value property.
//      * 
//      * @param value
//      *     allowed object is
//      *     {@link Object }
//      *     
//      */
//     public void setValue(Object value) {
//         this.value = value;
//     }



//     /**
//      * Gets the value of the type property.
//      * 
//      * @return
//      *     possible object is
//      *     {@link QName }
//      *     
//      */
//     public QName getType() {
//         return type;
//     }



//     /**
//      * Gets the value of the value property.
//      * 
//      * @return
//      *     possible object is
//      *     {@link Object }
//      *     
//      */
//     public Object getValueAsJava(ValueConverter vconv) {
//     	if (valueAsJava==null) {
//     		valueAsJava=vconv.convertToJava(getType(), (String)value);
//     	}
//         return valueAsJava;
//     }

//     /**
//      * Sets the value of the value property.
//      * 
//      * @param value
//      *     allowed object is
//      *     {@link Object }
//      *     
//      */
//     public void setValueAsJava(Object valueAsJava) {
// 	if (valueAsJava!=null)
// 	    this.value = valueAsJava.toString();
//         this.valueAsJava = valueAsJava;
//     }

//     /*
//      * Sets the value of the type property.
//      * 
//      * @param value
//      *     allowed object is
//      *     {@link QName }
//      *     
//      */
//     public void setType(QName value) {
//         this.type = value;
//     }

//     public void equals(Object object, EqualsBuilder equalsBuilder) {
//         if (!(object instanceof Location)) {
//             equalsBuilder.appendSuper(false);
//             return ;
//         }
//         if (this == object) {
//             return ;
//         }
//         final Location that = ((Location) object);
//         equalsBuilder.append(this.getValue(), that.getValue());
//         equalsBuilder.append(this.getType(), that.getType());
//     }

//     public boolean equals(Object object) {
//         if (!(object instanceof Location)) {
//             return false;
//         }
//         if (this == object) {
//             return true;
//         }
//         final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
//         equals(object, equalsBuilder);
//         return equalsBuilder.isEquals();
//     }

//     public void hashCode(HashCodeBuilder hashCodeBuilder) {
//         hashCodeBuilder.append(this.getValue());
//         hashCodeBuilder.append(this.getType());
//     }

//     public int hashCode() {
//         final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
//         hashCode(hashCodeBuilder);
//         return hashCodeBuilder.toHashCode();
//     }

//     public void toString(ToStringBuilder toStringBuilder) {
//         {
//             Object theValue;
//             theValue = this.getValue();
//             toStringBuilder.append("value", theValue);
//         }
//         {
//             QName theType;
//             theType = this.getType();
//             toStringBuilder.append("type", theType);
//         }
//     }

//     public String toString() {
//         final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
//         toString(toStringBuilder);
//         return toStringBuilder.toString();
//     }

// }
