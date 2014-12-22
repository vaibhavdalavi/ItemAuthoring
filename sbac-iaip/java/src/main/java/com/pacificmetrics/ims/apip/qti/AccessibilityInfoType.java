//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 09:22:32 PM IST 
//


package com.pacificmetrics.ims.apip.qti;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The AccessibilityInfo complexType is the container for all of the new content defined for teh set of accessibility features.
 *             
 * 
 * <p>Java class for AccessibilityInfo.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccessibilityInfo.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessElement" type="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}AccessElement.Type" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessibilityInfo.Type", propOrder = {
    "accessElements"
})
public class AccessibilityInfoType {

    @XmlElement(name = "accessElement", required = true)
    protected List<AccessElementType> accessElements;

    /**
     * Gets the value of the accessElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessElementType }
     * 
     * 
     */
    public List<AccessElementType> getAccessElements() {
        if (accessElements == null) {
            accessElements = new ArrayList<AccessElementType>();
        }
        return this.accessElements;
    }

}
