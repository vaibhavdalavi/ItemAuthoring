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
 * <p>Java class for educationalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="educationalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interactivityType" type="{http://pacificmetrics.com/apip/cp/manifest}interactivityTypeType"/>
 *         &lt;element name="learningResourceType" type="{http://pacificmetrics.com/apip/cp/manifest}learningResourceTypeType"/>
 *         &lt;element name="interactivityLevel" type="{http://pacificmetrics.com/apip/cp/manifest}interactivityLevelType"/>
 *         &lt;element name="semanticDensity" type="{http://pacificmetrics.com/apip/cp/manifest}semanticDensityType"/>
 *         &lt;element name="intendedEndUserRole" type="{http://pacificmetrics.com/apip/cp/manifest}intendedEndUserRoleType" maxOccurs="unbounded"/>
 *         &lt;element name="context" type="{http://pacificmetrics.com/apip/cp/manifest}contextType" maxOccurs="unbounded"/>
 *         &lt;element name="typicalAgeRange" type="{http://pacificmetrics.com/apip/cp/manifest}typicalAgeRangeType" maxOccurs="unbounded"/>
 *         &lt;element name="difficulty" type="{http://pacificmetrics.com/apip/cp/manifest}difficultyType"/>
 *         &lt;element name="typicalLearningTime" type="{http://pacificmetrics.com/apip/cp/manifest}typicalLearningTimeType"/>
 *         &lt;element name="description" type="{http://pacificmetrics.com/apip/cp/manifest}descriptionType"/>
 *         &lt;element name="language" type="{http://pacificmetrics.com/apip/cp/manifest}languageType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "educationalType", propOrder = {
    "interactivityType",
    "learningResourceType",
    "interactivityLevel",
    "semanticDensity",
    "intendedEndUserRoles",
    "contexts",
    "typicalAgeRanges",
    "difficulty",
    "typicalLearningTime",
    "description",
    "languages"
})
public class EducationalType {

    @XmlElement(required = true)
    protected InteractivityTypeType interactivityType;
    @XmlElement(required = true)
    protected LearningResourceTypeType learningResourceType;
    @XmlElement(required = true)
    protected InteractivityLevelType interactivityLevel;
    @XmlElement(required = true)
    protected SemanticDensityType semanticDensity;
    @XmlElement(name = "intendedEndUserRole", required = true)
    protected List<IntendedEndUserRoleType> intendedEndUserRoles;
    @XmlElement(name = "context", required = true)
    protected List<ContextType> contexts;
    @XmlElement(name = "typicalAgeRange", required = true)
    protected List<TypicalAgeRangeType> typicalAgeRanges;
    @XmlElement(required = true)
    protected DifficultyType difficulty;
    @XmlElement(required = true)
    protected TypicalLearningTimeType typicalLearningTime;
    @XmlElement(required = true)
    protected DescriptionType description;
    @XmlElement(name = "language", required = true)
    protected List<LanguageType> languages;

    /**
     * Gets the value of the interactivityType property.
     * 
     * @return
     *     possible object is
     *     {@link InteractivityTypeType }
     *     
     */
    public InteractivityTypeType getInteractivityType() {
        return interactivityType;
    }

    /**
     * Sets the value of the interactivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractivityTypeType }
     *     
     */
    public void setInteractivityType(InteractivityTypeType value) {
        this.interactivityType = value;
    }

    /**
     * Gets the value of the learningResourceType property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceTypeType }
     *     
     */
    public LearningResourceTypeType getLearningResourceType() {
        return learningResourceType;
    }

    /**
     * Sets the value of the learningResourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceTypeType }
     *     
     */
    public void setLearningResourceType(LearningResourceTypeType value) {
        this.learningResourceType = value;
    }

    /**
     * Gets the value of the interactivityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link InteractivityLevelType }
     *     
     */
    public InteractivityLevelType getInteractivityLevel() {
        return interactivityLevel;
    }

    /**
     * Sets the value of the interactivityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractivityLevelType }
     *     
     */
    public void setInteractivityLevel(InteractivityLevelType value) {
        this.interactivityLevel = value;
    }

    /**
     * Gets the value of the semanticDensity property.
     * 
     * @return
     *     possible object is
     *     {@link SemanticDensityType }
     *     
     */
    public SemanticDensityType getSemanticDensity() {
        return semanticDensity;
    }

    /**
     * Sets the value of the semanticDensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SemanticDensityType }
     *     
     */
    public void setSemanticDensity(SemanticDensityType value) {
        this.semanticDensity = value;
    }

    /**
     * Gets the value of the intendedEndUserRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intendedEndUserRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntendedEndUserRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntendedEndUserRoleType }
     * 
     * 
     */
    public List<IntendedEndUserRoleType> getIntendedEndUserRoles() {
        if (intendedEndUserRoles == null) {
            intendedEndUserRoles = new ArrayList<IntendedEndUserRoleType>();
        }
        return this.intendedEndUserRoles;
    }

    /**
     * Gets the value of the contexts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contexts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContexts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContextType }
     * 
     * 
     */
    public List<ContextType> getContexts() {
        if (contexts == null) {
            contexts = new ArrayList<ContextType>();
        }
        return this.contexts;
    }

    /**
     * Gets the value of the typicalAgeRanges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typicalAgeRanges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypicalAgeRanges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypicalAgeRangeType }
     * 
     * 
     */
    public List<TypicalAgeRangeType> getTypicalAgeRanges() {
        if (typicalAgeRanges == null) {
            typicalAgeRanges = new ArrayList<TypicalAgeRangeType>();
        }
        return this.typicalAgeRanges;
    }

    /**
     * Gets the value of the difficulty property.
     * 
     * @return
     *     possible object is
     *     {@link DifficultyType }
     *     
     */
    public DifficultyType getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the value of the difficulty property.
     * 
     * @param value
     *     allowed object is
     *     {@link DifficultyType }
     *     
     */
    public void setDifficulty(DifficultyType value) {
        this.difficulty = value;
    }

    /**
     * Gets the value of the typicalLearningTime property.
     * 
     * @return
     *     possible object is
     *     {@link TypicalLearningTimeType }
     *     
     */
    public TypicalLearningTimeType getTypicalLearningTime() {
        return typicalLearningTime;
    }

    /**
     * Sets the value of the typicalLearningTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypicalLearningTimeType }
     *     
     */
    public void setTypicalLearningTime(TypicalLearningTimeType value) {
        this.typicalLearningTime = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link DescriptionType }
     *     
     */
    public DescriptionType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescriptionType }
     *     
     */
    public void setDescription(DescriptionType value) {
        this.description = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageType }
     * 
     * 
     */
    public List<LanguageType> getLanguages() {
        if (languages == null) {
            languages = new ArrayList<LanguageType>();
        }
        return this.languages;
    }

}
