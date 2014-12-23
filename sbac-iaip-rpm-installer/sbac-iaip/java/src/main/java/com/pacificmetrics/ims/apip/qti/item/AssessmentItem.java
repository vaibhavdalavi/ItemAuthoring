//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 09:22:32 PM IST 
//

package com.pacificmetrics.ims.apip.qti.item;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.pacificmetrics.ims.apip.qti.ApipAccessibility;

/**
 * 
 * An Assessment consists of one or more Items. An 'assessmentItem' is the
 * binding form of an Item. An Item is the smallest exchangeable assessment
 * object. An Item is more than a 'Question' in that it contains the question
 * and instructions to be presented, the response processing to be applied to
 * the candidates response(s) and then feedback that may be presented (including
 * hints and solutions).
 * 
 * 
 * <p>
 * Java class for AssessmentItem.Type complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentItem.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}responseDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}outcomeDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}templateDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}templateProcessing" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}assessmentStimulusRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}stylesheet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}itemBody" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}responseProcessing" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}modalFeedback" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}apipAccessibility" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}adaptive.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}toolName.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}toolVersion.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}label.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}timeDependent.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}xmllang.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}title.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/qtiitem/imsqti_v2p2}identifier.AssessmentItem.Attr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentItem.Type", propOrder = { "responseDeclarations",
		"outcomeDeclarations", "templateDeclarations", "templateProcessing",
		"assessmentStimulusReves", "stylesheets", "itemBody",
		"responseProcessing", "modalFeedbacks", "apipAccessibility" })
@XmlRootElement(name = "assessmentItem")
public class AssessmentItem {

	@XmlElement(name = "responseDeclaration")
	protected List<ResponseDeclaration> responseDeclarations;
	@XmlElement(name = "outcomeDeclaration")
	protected List<OutcomeDeclaration> outcomeDeclarations;
	@XmlElement(name = "templateDeclaration")
	protected List<TemplateDeclaration> templateDeclarations;
	protected TemplateProcessing templateProcessing;
	@XmlElement(name = "assessmentStimulusRef")
	protected List<AssessmentStimulusRef> assessmentStimulusReves;
	@XmlElement(name = "stylesheet")
	protected List<Stylesheet> stylesheets;
	protected ItemBody itemBody;
	protected ResponseProcessing responseProcessing;
	@XmlElement(name = "modalFeedback")
	protected List<ModalFeedback> modalFeedbacks;
	@XmlElement(namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0")
	protected ApipAccessibility apipAccessibility;
	@XmlAttribute(name = "adaptive")
	protected Boolean adaptive;
	@XmlAttribute(name = "toolName")
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	@XmlSchemaType(name = "normalizedString")
	protected String toolName;
	@XmlAttribute(name = "toolVersion")
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	@XmlSchemaType(name = "normalizedString")
	protected String toolVersion;
	@XmlAttribute(name = "label")
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	@XmlSchemaType(name = "normalizedString")
	protected String label;
	@XmlAttribute(name = "timeDependent", required = true)
	protected boolean timeDependent;
	@XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
	protected String lang;
	@XmlAttribute(name = "title", required = true)
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	@XmlSchemaType(name = "normalizedString")
	protected String title;
	@XmlAttribute(name = "identifier", required = true)
	@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
	@XmlSchemaType(name = "normalizedString")
	protected String identifier;

	/**
	 * Gets the value of the responseDeclarations property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the responseDeclarations property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getResponseDeclarations().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ResponseDeclaration }
	 * 
	 * 
	 */
	public List<ResponseDeclaration> getResponseDeclarations() {
		if (responseDeclarations == null) {
			responseDeclarations = new ArrayList<ResponseDeclaration>();
		}
		return responseDeclarations;
	}

	/**
	 * Gets the value of the outcomeDeclarations property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the outcomeDeclarations property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getOutcomeDeclarations().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link OutcomeDeclaration }
	 * 
	 * 
	 */
	public List<OutcomeDeclaration> getOutcomeDeclarations() {
		if (outcomeDeclarations == null) {
			outcomeDeclarations = new ArrayList<OutcomeDeclaration>();
		}
		return outcomeDeclarations;
	}

	/**
	 * Gets the value of the templateDeclarations property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the templateDeclarations property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getTemplateDeclarations().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link TemplateDeclaration }
	 * 
	 * 
	 */
	public List<TemplateDeclaration> getTemplateDeclarations() {
		if (templateDeclarations == null) {
			templateDeclarations = new ArrayList<TemplateDeclaration>();
		}
		return templateDeclarations;
	}

	/**
	 * Gets the value of the templateProcessing property.
	 * 
	 * @return possible object is {@link TemplateProcessing }
	 * 
	 */
	public TemplateProcessing getTemplateProcessing() {
		return templateProcessing;
	}

	/**
	 * Sets the value of the templateProcessing property.
	 * 
	 * @param value
	 *            allowed object is {@link TemplateProcessing }
	 * 
	 */
	public void setTemplateProcessing(TemplateProcessing value) {
		templateProcessing = value;
	}

	/**
	 * Gets the value of the assessmentStimulusReves property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the assessmentStimulusReves property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAssessmentStimulusReves().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link AssessmentStimulusRef }
	 * 
	 * 
	 */
	public List<AssessmentStimulusRef> getAssessmentStimulusReves() {
		if (assessmentStimulusReves == null) {
			assessmentStimulusReves = new ArrayList<AssessmentStimulusRef>();
		}
		return assessmentStimulusReves;
	}

	/**
	 * Gets the value of the stylesheets property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the stylesheets property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getStylesheets().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Stylesheet }
	 * 
	 * 
	 */
	public List<Stylesheet> getStylesheets() {
		if (stylesheets == null) {
			stylesheets = new ArrayList<Stylesheet>();
		}
		return stylesheets;
	}

	/**
	 * Gets the value of the itemBody property.
	 * 
	 * @return possible object is {@link ItemBody }
	 * 
	 */
	public ItemBody getItemBody() {
		return itemBody;
	}

	/**
	 * Sets the value of the itemBody property.
	 * 
	 * @param value
	 *            allowed object is {@link ItemBody }
	 * 
	 */
	public void setItemBody(ItemBody value) {
		itemBody = value;
	}

	/**
	 * Gets the value of the responseProcessing property.
	 * 
	 * @return possible object is {@link ResponseProcessing }
	 * 
	 */
	public ResponseProcessing getResponseProcessing() {
		return responseProcessing;
	}

	/**
	 * Sets the value of the responseProcessing property.
	 * 
	 * @param value
	 *            allowed object is {@link ResponseProcessing }
	 * 
	 */
	public void setResponseProcessing(ResponseProcessing value) {
		responseProcessing = value;
	}

	/**
	 * Gets the value of the modalFeedbacks property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the modalFeedbacks property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getModalFeedbacks().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ModalFeedback }
	 * 
	 * 
	 */
	public List<ModalFeedback> getModalFeedbacks() {
		if (modalFeedbacks == null) {
			modalFeedbacks = new ArrayList<ModalFeedback>();
		}
		return modalFeedbacks;
	}

	/**
	 * Gets the value of the apipAccessibility property.
	 * 
	 * @return possible object is {@link ApipAccessibility }
	 * 
	 */
	public ApipAccessibility getApipAccessibility() {
		return apipAccessibility;
	}

	/**
	 * Sets the value of the apipAccessibility property.
	 * 
	 * @param value
	 *            allowed object is {@link ApipAccessibility }
	 * 
	 */
	public void setApipAccessibility(ApipAccessibility value) {
		apipAccessibility = value;
	}

	/**
	 * Gets the value of the adaptive property.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isAdaptive() {
		if (adaptive == null) {
			return false;
		} else {
			return adaptive;
		}
	}

	/**
	 * Sets the value of the adaptive property.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setAdaptive(Boolean value) {
		adaptive = value;
	}

	/**
	 * Gets the value of the toolName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToolName() {
		return toolName;
	}

	/**
	 * Sets the value of the toolName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setToolName(String value) {
		toolName = value;
	}

	/**
	 * Gets the value of the toolVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToolVersion() {
		return toolVersion;
	}

	/**
	 * Sets the value of the toolVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setToolVersion(String value) {
		toolVersion = value;
	}

	/**
	 * Gets the value of the label property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * Sets the value of the label property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLabel(String value) {
		label = value;
	}

	/**
	 * Gets the value of the timeDependent property.
	 * 
	 */
	public boolean isTimeDependent() {
		return timeDependent;
	}

	/**
	 * Sets the value of the timeDependent property.
	 * 
	 */
	public void setTimeDependent(boolean value) {
		timeDependent = value;
	}

	/**
	 * Gets the value of the lang property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * Sets the value of the lang property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLang(String value) {
		lang = value;
	}

	/**
	 * Gets the value of the title property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the value of the title property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTitle(String value) {
		title = value;
	}

	/**
	 * Gets the value of the identifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * Sets the value of the identifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIdentifier(String value) {
		identifier = value;
	}

}