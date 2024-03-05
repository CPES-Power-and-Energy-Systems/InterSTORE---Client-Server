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
 *  0 - opModVoltVar (Volt-Var Mode)
 *  1 - opModFreqWatt (Frequency-Watt Curve Mode)
 *  2 - opModWattPF (Watt-PowerFactor Mode)
 *  3 - opModVoltWatt (Volt-Watt Mode)
 *  4 - opModLVRTMomentaryCessation (Low Voltage Ride Through, Momentary Cessation Mode)
 *  5 - opModLVRTMustTrip (Low Voltage Ride Through, Must Trip Mode)
 *  6 - opModHVRTMomentaryCessation (High Voltage Ride Through, Momentary Cessation Mode)
 *  7 - opModHVRTMustTrip (High Voltage Ride Through, Must Trip Mode)
 *  8 - opModLFRTMustTrip (Low Frequency Ride Through, Must Trip Mode)
 *  9 - opModHFRTMustTrip (High Frequency Ride Through, Must Trip Mode)
 *  10 - opModWattVar (Watt-Var Mode)
 * All other values reserved.
 * 
 * <p>Java class for DERCurveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERCurveType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://ieee.org/2030.5&gt;UInt8"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERCurveType", propOrder = {
    "value"
})
public class DERCurveType {

    @XmlValue
    protected short value;

    /**
     * Unsigned integer, max inclusive 255 (2^8-1)
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
