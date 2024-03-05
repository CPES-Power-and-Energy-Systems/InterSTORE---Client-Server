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
 * Current status information relevant to a specific object. The Status object is used to indicate the current status of an Event. Devices can read the containing resource (e.g. TextMessage) to get the most up to date status of the event.  Devices can also subscribe to a specific resource instance to get updates when any of its attributes change, including the Status object.
 * 
 * <p>Java class for EventStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentStatus" type="{http://ieee.org/2030.5}UInt8"/&gt;
 *         &lt;element name="dateTime" type="{http://ieee.org/2030.5}TimeType"/&gt;
 *         &lt;element name="potentiallySuperseded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="potentiallySupersededTime" type="{http://ieee.org/2030.5}TimeType" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://ieee.org/2030.5}String192" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventStatus", propOrder = {
    "currentStatus",
    "dateTime",
    "potentiallySuperseded",
    "potentiallySupersededTime",
    "reason"
})
public class EventStatus {

    @XmlSchemaType(name = "unsignedByte")
    protected short currentStatus;
    @XmlElement(required = true)
    protected TimeType dateTime;
    protected boolean potentiallySuperseded;
    protected TimeType potentiallySupersededTime;
    protected String reason;

    /**
     * Gets the value of the currentStatus property.
     * 
     */
    public short getCurrentStatus() {
        return currentStatus;
    }

    /**
     * Sets the value of the currentStatus property.
     * 
     */
    public void setCurrentStatus(short value) {
        this.currentStatus = value;
    }

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
     * Gets the value of the potentiallySuperseded property.
     * 
     */
    public boolean isPotentiallySuperseded() {
        return potentiallySuperseded;
    }

    /**
     * Sets the value of the potentiallySuperseded property.
     * 
     */
    public void setPotentiallySuperseded(boolean value) {
        this.potentiallySuperseded = value;
    }

    /**
     * Gets the value of the potentiallySupersededTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getPotentiallySupersededTime() {
        return potentiallySupersededTime;
    }

    /**
     * Sets the value of the potentiallySupersededTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setPotentiallySupersededTime(TimeType value) {
        this.potentiallySupersededTime = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
