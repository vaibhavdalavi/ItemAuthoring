//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.09 at 09:22:32 PM IST 
//


package org.w3.synthesis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for level.datatype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="level.datatype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="strong"/>
 *     &lt;enumeration value="moderate"/>
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="reduced"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "level.datatype")
@XmlEnum
public enum LevelDatatype {

    @XmlEnumValue("strong")
    STRONG("strong"),
    @XmlEnumValue("moderate")
    MODERATE("moderate"),
    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("reduced")
    REDUCED("reduced");
    private final String value;

    LevelDatatype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LevelDatatype fromValue(String v) {
        for (LevelDatatype c: LevelDatatype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}