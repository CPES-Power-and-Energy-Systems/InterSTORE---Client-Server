//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.25 at 08:56:47 PM CET 
//


package org.ieee._2030;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * DER InverterStatus value:
 *  0 - N/A
 *  1 - off
 *  2 - sleeping (auto-shutdown) or DER is at low output power/voltage
 *  3 - starting up or ON but not producing power
 *  4 - tracking MPPT power point
 *  5 - forced power reduction/derating
 *  6 - shutting down
 *  7 - one or more faults exist
 *  8 - standby (service on unit) - DER may be at high output voltage/power
 *  9 - test mode
 *  10 - as defined in manufacturer status
 * All other values reserved.
 * 
 * <p>Java class for InverterStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InverterStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTime" type="{http://ieee.org/2030.5}TimeType"/&gt;
 *         &lt;element name="value" type="{http://ieee.org/2030.5}UInt8"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InverterStatusType", propOrder = {
    "dateTime",
    "value"
})
public class InverterStatusType {

    @XmlElement(required = true)
    protected TimeType dateTime;
    @XmlSchemaType(name = "unsignedByte")
    protected short value;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setDateTime(TimeType value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the value property.
     * 
     */
    public short getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(short value) {
        this.value = value;
    }

}
