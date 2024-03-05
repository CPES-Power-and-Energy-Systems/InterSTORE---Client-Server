//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.25 at 08:56:47 PM CET 
//


package org.ieee._2030;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Indicates a condition that must be satisfied for the Notification to be triggered.
 * 
 * <p>Java class for Condition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Condition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributeIdentifier" type="{http://ieee.org/2030.5}UInt8"/&gt;
 *         &lt;element name="lowerThreshold" type="{http://ieee.org/2030.5}Int48"/&gt;
 *         &lt;element name="upperThreshold" type="{http://ieee.org/2030.5}Int48"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condition", propOrder = {
    "attributeIdentifier",
    "lowerThreshold",
    "upperThreshold"
})
public class Condition {

    @XmlSchemaType(name = "unsignedByte")
    protected short attributeIdentifier;
    protected long lowerThreshold;
    protected long upperThreshold;

    /**
     * Gets the value of the attributeIdentifier property.
     * 
     */
    public short getAttributeIdentifier() {
        return attributeIdentifier;
    }

    /**
     * Sets the value of the attributeIdentifier property.
     * 
     */
    public void setAttributeIdentifier(short value) {
        this.attributeIdentifier = value;
    }

    /**
     * Gets the value of the lowerThreshold property.
     * 
     */
    public long getLowerThreshold() {
        return lowerThreshold;
    }

    /**
     * Sets the value of the lowerThreshold property.
     * 
     */
    public void setLowerThreshold(long value) {
        this.lowerThreshold = value;
    }

    /**
     * Gets the value of the upperThreshold property.
     * 
     */
    public long getUpperThreshold() {
        return upperThreshold;
    }

    /**
     * Sets the value of the upperThreshold property.
     * 
     */
    public void setUpperThreshold(long value) {
        this.upperThreshold = value;
    }

}