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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *     Define the rubriclist type.
 *     Rubrics associated with the item.
 *     
 * 
 * <p>Java class for rubriclistType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rubriclistType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rubric" type="{http://www.smarterapp.org/xsd/saaif/v1p0/assessmentitem_v1p0.xsd}rubricType" maxOccurs="unbounded"/>
 *         &lt;element name="samplelist" type="{http://www.smarterapp.org/xsd/saaif/v1p0/assessmentitem_v1p0.xsd}samplelistType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rubriclistType", propOrder = {
    "rubric",
    "samplelist"
})
public class RubriclistType {

    @XmlElement(required = true)
    protected List<RubricType> rubric;
    @XmlElement(required = true)
    protected List<SamplelistType> samplelist;

    /**
     * Gets the value of the rubric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rubric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRubric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RubricType }
     * 
     * 
     */
    public List<RubricType> getRubric() {
        if (rubric == null) {
            rubric = new ArrayList<RubricType>();
        }
        return this.rubric;
    }

    /**
     * Gets the value of the samplelist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the samplelist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSamplelist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SamplelistType }
     * 
     * 
     */
    public List<SamplelistType> getSamplelist() {
        if (samplelist == null) {
            samplelist = new ArrayList<SamplelistType>();
        }
        return this.samplelist;
    }

}