//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 03:54:09 PM IST 
//


package com.pacificmetrics.saaif.tutorial;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			    Define the definitionId type.
 * 			    String containing language information.
 * 			    
 * 
 * <p>Java class for definitionIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="definitionIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="textString" type="{http://www.smarterapp.org/xsd/saaif/v1p0/tutorial_v1p0.xsd}brailleTextStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lang" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "definitionIdType", propOrder = {
    "textString"
})
public class DefinitionIdType {

    protected String textString;
    @XmlAttribute(name = "lang", required = true)
    protected String lang;

    /**
     * Gets the value of the textString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextString() {
        return textString;
    }

    /**
     * Sets the value of the textString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextString(String value) {
        this.textString = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
