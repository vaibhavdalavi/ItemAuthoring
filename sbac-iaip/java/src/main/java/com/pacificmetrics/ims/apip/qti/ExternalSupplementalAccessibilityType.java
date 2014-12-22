//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 09:22:32 PM IST 
//


package com.pacificmetrics.ims.apip.qti;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This is the container for the supplemental information that can be used to provide further guidance on how to render the alternative accessibility information i.e. the use of the Pronunciation Lexicon Standard (PLS), etc.
 *             
 * 
 * <p>Java class for ExternalSupplementalAccessibility.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalSupplementalAccessibility.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="textToSpeechLexicon" type="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}TextToSpeechSupplement.Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="textToSpeechStylesheet" type="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}TextToSpeechSupplement.Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}grpStrict.any"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalSupplementalAccessibility.Type", propOrder = {
    "textToSpeechLexiconsAndTextToSpeechStylesheetsAndAnies"
})
public class ExternalSupplementalAccessibilityType {

    @XmlElementRefs({
        @XmlElementRef(name = "textToSpeechStylesheet", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "textToSpeechLexicon", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0", type = JAXBElement.class, required = false)
    })
    @XmlAnyElement(lax = true)
    protected List<Object> textToSpeechLexiconsAndTextToSpeechStylesheetsAndAnies;

    /**
     * Gets the value of the textToSpeechLexiconsAndTextToSpeechStylesheetsAndAnies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textToSpeechLexiconsAndTextToSpeechStylesheetsAndAnies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextToSpeechLexiconsAndTextToSpeechStylesheetsAndAnies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link JAXBElement }{@code <}{@link TextToSpeechSupplementType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextToSpeechSupplementType }{@code >}
     * 
     * 
     */
    public List<Object> getTextToSpeechLexiconsAndTextToSpeechStylesheetsAndAnies() {
        if (textToSpeechLexiconsAndTextToSpeechStylesheetsAndAnies == null) {
            textToSpeechLexiconsAndTextToSpeechStylesheetsAndAnies = new ArrayList<Object>();
        }
        return this.textToSpeechLexiconsAndTextToSpeechStylesheetsAndAnies;
    }

}
