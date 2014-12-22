//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 03:53:01 PM IST 
//


package com.pacificmetrics.saaif.passage1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 *     Define the apipAccessibility type.
 *     [APIP] accessibility information for the item.
 *     Add the schemaversion attribute to enable this to be a standalone document.
 *     
 * 
 * <p>Java class for apipAccessibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="apipAccessibilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessibilityInfo" type="{http://www.smarterapp.org/xsd/saaif/v1p0/passageitem_v1p0.xsd}accessibilityInfoType"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="schemaversion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "apipAccessibilityType", propOrder = {
    "accessibilityInfo",
    "any"
})
public class ApipAccessibilityType {

    @XmlElement(required = true)
    protected AccessibilityInfoType accessibilityInfo;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "schemaversion")
    protected String schemaversion;

    /**
     * Gets the value of the accessibilityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityInfoType }
     *     
     */
    public AccessibilityInfoType getAccessibilityInfo() {
        return accessibilityInfo;
    }

    /**
     * Sets the value of the accessibilityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityInfoType }
     *     
     */
    public void setAccessibilityInfo(AccessibilityInfoType value) {
        this.accessibilityInfo = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the schemaversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaversion() {
        return schemaversion;
    }

    /**
     * Sets the value of the schemaversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaversion(String value) {
        this.schemaversion = value;
    }

}
