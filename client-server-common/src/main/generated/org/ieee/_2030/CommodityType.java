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
 *  0 = Not Applicable (default, if not specified)
 *  1 = Electricity secondary metered value (a premises meter is typically on the low voltage, or secondary, side of a service transformer)
 *  2 = Electricity primary metered value (measured on the high voltage, or primary, side of the service transformer)
 *  4 = Air
 *  7 = NaturalGas
 *  8 = Propane
 *  9 = PotableWater
 *  10 = Steam
 *  11 = WasteWater
 *  12 = HeatingFluid
 *  13 = CoolingFluid
 * All other values reserved.
 * 
 * <p>Java class for CommodityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityType"&gt;
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
@XmlType(name = "CommodityType", propOrder = {
    "value"
})
public class CommodityType {

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