//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 06:44:50 PM IST 
//

package com.pacificmetrics.ims.apip.cp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.ieee.ltsc.lom.manifest.Lom;

import com.pacificmetrics.ims.apip.csmd.CurriculumStandardsMetadataSet;

/**
 * 
 * This metadata element contains data structures that declare descriptive
 * information about an entire Package. One or more different metadata models
 * may be declared as child extensions of a metadata element. The schema and
 * schemaversion children define the kind or collection of metadata models being
 * used. Represents a binding of the kinds of child objects defined for
 * ims-cp-imManifestMetadata: ManifestMetadata.[ Schema, SchemaVersion,
 * MetadataModel ].. [APIPv1p0] Profile - the changes to the XML element list
 * are: * The "extension" element has been prohibited; * The "schema" element
 * has been made required i.e. multiplicity [1..1]; * The "schemaversion"
 * element has been made required i.e. multiplicity [1..1]; * The "schema"
 * element class type has been changed to the class "Schema"; * The
 * "schemaversion" element class type has been changed to the class
 * "SchemaVersion"; * The "lom" element has been added using Import; * The
 * "curriculumStandardsMetadataSet" element has been added using Import;
 * 
 * 
 * <p>
 * Java class for ManifestMetadata.Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ManifestMetadata.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schema">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="APIP Package"/>
 *               &lt;enumeration value="APIP Test Bank"/>
 *               &lt;enumeration value="APIP Item Bank"/>
 *               &lt;enumeration value="APIP Object Bank"/>
 *               &lt;enumeration value="APIP Test"/>
 *               &lt;enumeration value="APIP Section"/>
 *               &lt;enumeration value="APIP Item"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="schemaversion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1.0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://ltsc.ieee.org/xsd/apipv1p0/LOM/manifest}lom"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/imscsmd_v1p0}curriculumStandardsMetadataSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManifestMetadata.Type", propOrder = { "schema",
        "schemaversion", "lom", "curriculumStandardsMetadataSet" })
public class ManifestMetadataType {

    @XmlElement(required = true)
    protected String schema;
    @XmlElement(required = true)
    protected String schemaversion;
    @XmlElement(required = true)
    protected Lom lom;
    @XmlElement(namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/imscsmd_v1p0")
    protected CurriculumStandardsMetadataSet curriculumStandardsMetadataSet;

    /**
     * Gets the value of the schema property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the schemaversion property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSchemaversion() {
        return schemaversion;
    }

    /**
     * Sets the value of the schemaversion property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setSchemaversion(String value) {
        this.schemaversion = value;
    }

    /**
     * Gets the value of the lom property.
     * 
     * @return possible object is {@link Lom }
     * 
     */
    public Lom getLom() {
        return lom;
    }

    /**
     * Sets the value of the lom property.
     * 
     * @param value
     *            allowed object is {@link Lom }
     * 
     */
    public void setLom(Lom value) {
        this.lom = value;
    }

    /**
     * Gets the value of the curriculumStandardsMetadataSet property.
     * 
     * @return possible object is {@link CurriculumStandardsMetadataSet }
     * 
     */
    public CurriculumStandardsMetadataSet getCurriculumStandardsMetadataSet() {
        return curriculumStandardsMetadataSet;
    }

    /**
     * Sets the value of the curriculumStandardsMetadataSet property.
     * 
     * @param value
     *            allowed object is {@link CurriculumStandardsMetadataSet }
     * 
     */
    public void setCurriculumStandardsMetadataSet(
            CurriculumStandardsMetadataSet value) {
        this.curriculumStandardsMetadataSet = value;
    }

}