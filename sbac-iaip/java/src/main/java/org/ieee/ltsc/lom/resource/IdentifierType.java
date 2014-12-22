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
 *                 The Identifier complexType is the container for the globally unique idenitifer that identifies 
 * the associated parent object.
 *             
 * 
 * <p>Java class for Identifier.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identifier.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="catalog" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource}CharacterString.Type" minOccurs="0"/>
 *         &lt;element name="entry" type="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource}CharacterString.Type" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifier.Type", propOrder = {
    "catalogsAndEntries"
})
public class IdentifierType {

    @XmlElementRefs({
        @XmlElementRef(name = "entry", namespace = "http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "catalog", namespace = "http://ltsc.ieee.org/xsd/apipv1p0/LOM/resource", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> catalogsAndEntries;

    /**
     * Gets the value of the catalogsAndEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalogsAndEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCatalogsAndEntries().add(newItem);
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
    public List<JAXBElement<String>> getCatalogsAndEntries() {
        if (catalogsAndEntries == null) {
            catalogsAndEntries = new ArrayList<JAXBElement<String>>();
        }
        return this.catalogsAndEntries;
    }

}
