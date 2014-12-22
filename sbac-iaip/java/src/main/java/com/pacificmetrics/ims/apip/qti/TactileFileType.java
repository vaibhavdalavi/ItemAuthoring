//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 09:22:32 PM IST 
//


package com.pacificmetrics.ims.apip.qti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The TactileFile complexType is the container for the audio/Braille accessibility content as an alternative to tactile content.
 *             
 * 
 * <p>Java class for TactileFile.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TactileFile.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tactileAudioFile" type="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}AudioFileInfo.Type" minOccurs="0"/>
 *         &lt;element name="tactileAudioText" type="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}LabelledString.Type"/>
 *         &lt;element name="tactileBrailleText" type="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}LabelledString.Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TactileFile.Type", propOrder = {
    "tactileAudioFile",
    "tactileAudioText",
    "tactileBrailleText"
})
public class TactileFileType {

    protected AudioFileInfoType tactileAudioFile;
    @XmlElement(required = true)
    protected LabelledStringType tactileAudioText;
    protected LabelledStringType tactileBrailleText;

    /**
     * Gets the value of the tactileAudioFile property.
     * 
     * @return
     *     possible object is
     *     {@link AudioFileInfoType }
     *     
     */
    public AudioFileInfoType getTactileAudioFile() {
        return tactileAudioFile;
    }

    /**
     * Sets the value of the tactileAudioFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioFileInfoType }
     *     
     */
    public void setTactileAudioFile(AudioFileInfoType value) {
        this.tactileAudioFile = value;
    }

    /**
     * Gets the value of the tactileAudioText property.
     * 
     * @return
     *     possible object is
     *     {@link LabelledStringType }
     *     
     */
    public LabelledStringType getTactileAudioText() {
        return tactileAudioText;
    }

    /**
     * Sets the value of the tactileAudioText property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelledStringType }
     *     
     */
    public void setTactileAudioText(LabelledStringType value) {
        this.tactileAudioText = value;
    }

    /**
     * Gets the value of the tactileBrailleText property.
     * 
     * @return
     *     possible object is
     *     {@link LabelledStringType }
     *     
     */
    public LabelledStringType getTactileBrailleText() {
        return tactileBrailleText;
    }

    /**
     * Sets the value of the tactileBrailleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelledStringType }
     *     
     */
    public void setTactileBrailleText(LabelledStringType value) {
        this.tactileBrailleText = value;
    }

}
