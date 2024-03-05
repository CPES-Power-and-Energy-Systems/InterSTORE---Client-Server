//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.25 at 08:56:47 PM CET 
//


package org.ieee._2030;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Version SHALL indicate a distinct identifier for each revision of an IdentifiedObject. If not specified, a default version of "0" (initial version) SHALL be assumed. Upon modification of any IdentifiedObject, the mRID SHALL remain the same, but the version SHALL be incremented. Servers MAY NOT modify objects that they did not create, unless they were notified of the change from the entity controlling the object's PEN.
 * 
 * <p>Java class for VersionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VersionType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://ieee.org/2030.5&gt;UInt16"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VersionType", propOrder = {
    "value"
})
public class VersionType {

    @XmlValue
    protected int value;

    /**
     * Unsigned integer, max inclusive 65535 (2^16-1)
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

}