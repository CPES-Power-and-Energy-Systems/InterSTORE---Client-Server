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
 * Contains configuration related to the device's power sources
 * 
 * <p>Java class for PowerConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="batteryInstallTime" type="{http://ieee.org/2030.5}TimeType" minOccurs="0"/&gt;
 *         &lt;element name="lowChargeThreshold" type="{http://ieee.org/2030.5}UInt32" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerConfiguration", propOrder = {
    "batteryInstallTime",
    "lowChargeThreshold"
})
public class PowerConfiguration {

    protected TimeType batteryInstallTime;
    @XmlSchemaType(name = "unsignedInt")
    protected Long lowChargeThreshold;

    /**
     * Gets the value of the batteryInstallTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getBatteryInstallTime() {
        return batteryInstallTime;
    }

    /**
     * Sets the value of the batteryInstallTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setBatteryInstallTime(TimeType value) {
        this.batteryInstallTime = value;
    }

    /**
     * Gets the value of the lowChargeThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLowChargeThreshold() {
        return lowChargeThreshold;
    }

    /**
     * Sets the value of the lowChargeThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLowChargeThreshold(Long value) {
        this.lowChargeThreshold = value;
    }

}
