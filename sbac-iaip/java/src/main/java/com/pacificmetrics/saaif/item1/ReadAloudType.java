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
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 *     Define the readAloud type.
 *     Pronunciation text for text-to-speech.
 *     While all elements are optional in the XSD, one MUST be present.
 *     
 * 
 * <p>Java class for readAloudType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readAloudType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="textToSpeechPronunciation" type="{http://www.smarterapp.org/xsd/saaif/v1p0/assessmentitem_v1p0.xsd}IPAStringType" minOccurs="0"/>
 *         &lt;element name="textToSpeechPronunciationAlternate" type="{http://www.smarterapp.org/xsd/saaif/v1p0/assessmentitem_v1p0.xsd}IPAStringType" minOccurs="0"/>
 *         &lt;element name="audioText" type="{http://www.smarterapp.org/xsd/saaif/v1p0/assessmentitem_v1p0.xsd}IPAStringType" minOccurs="0"/>
 *         &lt;element name="audioShortDesc" type="{http://www.smarterapp.org/xsd/saaif/v1p0/assessmentitem_v1p0.xsd}IPAStringType" minOccurs="0"/>
 *         &lt;element name="audioLongDesc" type="{http://www.smarterapp.org/xsd/saaif/v1p0/assessmentitem_v1p0.xsd}IPAStringType" minOccurs="0"/>
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
@XmlType(name = "readAloudType", propOrder = {
    "textToSpeechPronunciation",
    "textToSpeechPronunciationAlternate",
    "audioText",
    "audioShortDesc",
    "audioLongDesc",
    "any"
})
public class ReadAloudType {

    protected String textToSpeechPronunciation;
    protected String textToSpeechPronunciationAlternate;
    protected String audioText;
    protected String audioShortDesc;
    protected String audioLongDesc;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the textToSpeechPronunciation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextToSpeechPronunciation() {
        return textToSpeechPronunciation;
    }

    /**
     * Sets the value of the textToSpeechPronunciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextToSpeechPronunciation(String value) {
        this.textToSpeechPronunciation = value;
    }

    /**
     * Gets the value of the textToSpeechPronunciationAlternate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextToSpeechPronunciationAlternate() {
        return textToSpeechPronunciationAlternate;
    }

    /**
     * Sets the value of the textToSpeechPronunciationAlternate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextToSpeechPronunciationAlternate(String value) {
        this.textToSpeechPronunciationAlternate = value;
    }

    /**
     * Gets the value of the audioText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioText() {
        return audioText;
    }

    /**
     * Sets the value of the audioText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioText(String value) {
        this.audioText = value;
    }

    /**
     * Gets the value of the audioShortDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioShortDesc() {
        return audioShortDesc;
    }

    /**
     * Sets the value of the audioShortDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioShortDesc(String value) {
        this.audioShortDesc = value;
    }

    /**
     * Gets the value of the audioLongDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudioLongDesc() {
        return audioLongDesc;
    }

    /**
     * Sets the value of the audioLongDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudioLongDesc(String value) {
        this.audioLongDesc = value;
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
