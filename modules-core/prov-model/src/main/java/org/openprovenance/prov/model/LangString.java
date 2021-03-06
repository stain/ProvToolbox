package org.openprovenance.prov.model;

/**
* <p>Interface for strings with language attribute.
* 
* <p>The following schema fragment specifies the expected content contained within this class.
* 
* <pre>
* &lt;complexType name="InternationalizedString"&gt;
*   &lt;simpleContent&gt;
*     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
*       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/&gt;
*     &lt;/extension&gt;
*   &lt;/simpleContent&gt;
* &lt;/complexType&gt;
* </pre>
* 
* 
*/
public interface LangString {

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public abstract String getValue();

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public abstract void setValue(String value);

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public abstract String getLang();

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public abstract void setLang(String value);

}
