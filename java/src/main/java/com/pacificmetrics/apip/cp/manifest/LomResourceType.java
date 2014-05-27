//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.06 at 01:14:11 PM MST 
//


package com.pacificmetrics.apip.cp.manifest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lomResourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lomResourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="general" type="{http://pacificmetrics.com/apip/cp/manifest}generalType"/>
 *         &lt;element name="lifeCycle" type="{http://pacificmetrics.com/apip/cp/manifest}lifeCycleType"/>
 *         &lt;element name="metaMetadata" type="{http://pacificmetrics.com/apip/cp/manifest}metaMetadataType" minOccurs="0"/>
 *         &lt;element name="technical" type="{http://pacificmetrics.com/apip/cp/manifest}technicalType" minOccurs="0"/>
 *         &lt;element name="educational" type="{http://pacificmetrics.com/apip/cp/manifest}educationalType"/>
 *         &lt;element name="rights" type="{http://pacificmetrics.com/apip/cp/manifest}rightsType" minOccurs="0"/>
 *         &lt;element name="relation" type="{http://pacificmetrics.com/apip/cp/manifest}relationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="annotation" type="{http://pacificmetrics.com/apip/cp/manifest}annotationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="classification" type="{http://pacificmetrics.com/apip/cp/manifest}classificationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qtiMetadata" type="{http://pacificmetrics.com/apip/cp/manifest}qtiMetadataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lomResourceType", propOrder = {
    "general",
    "lifeCycle",
    "metaMetadata",
    "technical",
    "educational",
    "rights",
    "relations",
    "annotations",
    "classifications",
    "qtiMetadata"
})
public class LomResourceType {

    @XmlElement(required = true)
    protected GeneralType general;
    @XmlElement(required = true)
    protected LifeCycleType lifeCycle;
    protected MetaMetadataType metaMetadata;
    protected TechnicalType technical;
    @XmlElement(required = true)
    protected EducationalType educational;
    protected RightsType rights;
    @XmlElement(name = "relation")
    protected List<RelationType> relations;
    @XmlElement(name = "annotation")
    protected List<AnnotationType> annotations;
    @XmlElement(name = "classification")
    protected List<ClassificationType> classifications;
    protected QtiMetadataType qtiMetadata;

    /**
     * Gets the value of the general property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralType }
     *     
     */
    public GeneralType getGeneral() {
        return general;
    }

    /**
     * Sets the value of the general property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralType }
     *     
     */
    public void setGeneral(GeneralType value) {
        this.general = value;
    }

    /**
     * Gets the value of the lifeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleType }
     *     
     */
    public LifeCycleType getLifeCycle() {
        return lifeCycle;
    }

    /**
     * Sets the value of the lifeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleType }
     *     
     */
    public void setLifeCycle(LifeCycleType value) {
        this.lifeCycle = value;
    }

    /**
     * Gets the value of the metaMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link MetaMetadataType }
     *     
     */
    public MetaMetadataType getMetaMetadata() {
        return metaMetadata;
    }

    /**
     * Sets the value of the metaMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetaMetadataType }
     *     
     */
    public void setMetaMetadata(MetaMetadataType value) {
        this.metaMetadata = value;
    }

    /**
     * Gets the value of the technical property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalType }
     *     
     */
    public TechnicalType getTechnical() {
        return technical;
    }

    /**
     * Sets the value of the technical property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalType }
     *     
     */
    public void setTechnical(TechnicalType value) {
        this.technical = value;
    }

    /**
     * Gets the value of the educational property.
     * 
     * @return
     *     possible object is
     *     {@link EducationalType }
     *     
     */
    public EducationalType getEducational() {
        return educational;
    }

    /**
     * Sets the value of the educational property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationalType }
     *     
     */
    public void setEducational(EducationalType value) {
        this.educational = value;
    }

    /**
     * Gets the value of the rights property.
     * 
     * @return
     *     possible object is
     *     {@link RightsType }
     *     
     */
    public RightsType getRights() {
        return rights;
    }

    /**
     * Sets the value of the rights property.
     * 
     * @param value
     *     allowed object is
     *     {@link RightsType }
     *     
     */
    public void setRights(RightsType value) {
        this.rights = value;
    }

    /**
     * Gets the value of the relations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getRelations() {
        if (relations == null) {
            relations = new ArrayList<RelationType>();
        }
        return this.relations;
    }

    /**
     * Gets the value of the annotations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AnnotationType }
     * 
     * 
     */
    public List<AnnotationType> getAnnotations() {
        if (annotations == null) {
            annotations = new ArrayList<AnnotationType>();
        }
        return this.annotations;
    }

    /**
     * Gets the value of the classifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * 
     * 
     */
    public List<ClassificationType> getClassifications() {
        if (classifications == null) {
            classifications = new ArrayList<ClassificationType>();
        }
        return this.classifications;
    }

    /**
     * Gets the value of the qtiMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link QtiMetadataType }
     *     
     */
    public QtiMetadataType getQtiMetadata() {
        return qtiMetadata;
    }

    /**
     * Sets the value of the qtiMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link QtiMetadataType }
     *     
     */
    public void setQtiMetadata(QtiMetadataType value) {
        this.qtiMetadata = value;
    }

}
