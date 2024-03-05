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
import jakarta.xml.bind.annotation.adapters.HexBinaryAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Device category types defined.
 * Bit positions SHALL be defined as follows:
 *  0 - Programmable Communicating Thermostat 
 *  1 - Strip Heaters 
 *  2 - Baseboard Heaters 
 *  3 - Water Heater 
 *  4 - Pool Pump 
 *  5 - Sauna 
 *  6 - Hot tub
 *  7 - Smart Appliance 
 *  8 - Irrigation Pump 
 *  9 - Managed Commercial and Industrial (C&amp;I) Loads 
 *  10 - Simple misc. (Residential On/Off) loads 
 *  11 - Exterior Lighting 
 *  12 - Interior Lighting 
 *  13 - Electric Vehicle 
 *  14 - Generation Systems 
 *  15 - Load Control Switch 
 *  16 - Smart Inverter 
 *  17 - EVSE 
 *  18 - RESU (Residential Energy Storage Unit)
 *  19 - Energy Management System 
 *  20 - Smart Energy Module
 * All other values reserved.
 * 
 * <p>Java class for DeviceCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceCategoryType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://ieee.org/2030.5&gt;HexBinary32"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceCategoryType", propOrder = {
    "value"
})
public class DeviceCategoryType {

    @XmlValue
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] value;

    /**
     * A 32-bit field encoded as a hex string (8 hex characters max). Where applicable, bit 0, or the least significant bit, goes on the right. Note that hexBinary requires pairs of hex characters, so an odd number of characters requires a leading "0".
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

}