//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.10.22 at 03:51:28 PM IST 
//


package com.pacificmetrics.saaif.item1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 *     Define the AnswerSet type.
 *     Response to an item included in the original question rendering.
 *     
 * 
 * <p>Java class for AnswerSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnswerSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjectSet" type="{http://www.smarterapp.org/xsd/saaif/v1p0/assessmentitem_v1p0.xsd}ObjectSetType"/>
 *         &lt;element name="SnapPoint" type="{http://www.smarterapp.org/xsd/saaif/v1p0/assessmentitem_v1p0.xsd}SnapPointType" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnswerSetType", propOrder = {
    "objectSet",
    "snapPoint",
    "any"
})
public class AnswerSetType {

    @XmlElement(name = "ObjectSet", required = true)
    protected ObjectSetType objectSet;
    @XmlElement(name = "SnapPoint")
    protected String snapPoint;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the objectSet property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectSetType }
     *     
     */
    public ObjectSetType getObjectSet() {
        return objectSet;
    }

    /**
     * Sets the value of the objectSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectSetType }
     *     
     */
    public void setObjectSet(ObjectSetType value) {
        this.objectSet = value;
    }

    /**
     * Gets the value of the snapPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnapPoint() {
        return snapPoint;
    }

    /**
     * Sets the value of the snapPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnapPoint(String value) {
        this.snapPoint = value;
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

}
