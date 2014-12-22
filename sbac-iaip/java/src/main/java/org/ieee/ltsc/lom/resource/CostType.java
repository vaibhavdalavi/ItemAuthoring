//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 06:44:50 PM IST 
//


package org.ieee.ltsc.lom.resource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The Cost complexType is the container for whether use of this learning object requires payment.
 *             
 * 
 * <p>Java class for Cost.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cost.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="source" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource}CharacterString.Type" minOccurs="0"/>
 *         &lt;element name="value" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cost.Type", propOrder = {
    "sourcesAndValues"
})
public class CostType {

    @XmlElementRefs({
        @XmlElementRef(name = "value", namespace = "http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "source", namespace = "http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> sourcesAndValues;

    /**
     * Gets the value of the sourcesAndValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourcesAndValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourcesAndValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getSourcesAndValues() {
        if (sourcesAndValues == null) {
            sourcesAndValues = new ArrayList<JAXBElement<String>>();
        }
        return this.sourcesAndValues;
    }

}
