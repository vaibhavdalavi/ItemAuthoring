//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.10 at 09:54:32 AM IST 
//


package com.pacificmetrics.ims.apip.qti.section;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3.math.mathml.Math;
import org.w3.xinclude.Include;


/**
 * 
 *                 The 'DT' complexType is the container for term definitions as per the HTML 'dt' markup.
 *             
 * 
 * <p>Java class for DT.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DT.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *           &lt;element ref="{http://www.w3.org/2001/XInclude}include"/>
 *           &lt;choice>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}img"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}br"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}object"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}em"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}a"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}code"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}span"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}sub"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}acronym"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}big"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}tt"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}kbd"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}q"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}i"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}dfn"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}abbr"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}strong"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}sup"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}var"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}small"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}samp"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}b"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}cite"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}xmlbase.DT.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}id.DT.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}label.DT.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}xmllang.DT.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2}class.DT.Attr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT.Type", propOrder = {
    "content"
})
@XmlRootElement(name = "dt")
public class Dt {

    @XmlElementRefs({
        @XmlElementRef(name = "q", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = Q.class, required = false),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = Math.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = Br.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "kbd", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "include", namespace = "http://www.w3.org/2001/XInclude", type = Include.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = Img.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = com.pacificmetrics.ims.apip.qti.section.Object.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = A.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/qtisection/imsqti_v2p2", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<java.lang.Object> content;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "label")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String label;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "class")
    protected List<String> clazzs;

    /**
     * 
     *                 The 'DT' complexType is the container for term definitions as per the HTML 'dt' markup.
     *             Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Q }
     * {@link Math }
     * {@link Br }
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link Include }
     * {@link Img }
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link com.pacificmetrics.ims.apip.qti.section.Object }
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link A }
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the clazzs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazzs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazzs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClazzs() {
        if (clazzs == null) {
            clazzs = new ArrayList<String>();
        }
        return this.clazzs;
    }

}