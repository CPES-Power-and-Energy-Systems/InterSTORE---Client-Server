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
import jakarta.xml.bind.annotation.adapters.HexBinaryAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A RPL source routes object.
 * 
 * <p>Java class for RPLSourceRoutes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RPLSourceRoutes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ieee.org/2030.5}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestAddress" type="{http://ieee.org/2030.5}HexBinary128"/&gt;
 *         &lt;element name="SourceRoute" type="{http://ieee.org/2030.5}HexBinary128"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RPLSourceRoutes", propOrder = {
    "destAddress",
    "sourceRoute"
})
public class RPLSourceRoutes
    extends Resource
{

    @XmlElement(name = "DestAddress", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] destAddress;
    @XmlElement(name = "SourceRoute", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] sourceRoute;

    /**
     * Gets the value of the destAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getDestAddress() {
        return destAddress;
    }

    /**
     * Sets the value of the destAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAddress(byte[] value) {
        this.destAddress = value;
    }

    /**
     * Gets the value of the sourceRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSourceRoute() {
        return sourceRoute;
    }

    /**
     * Sets the value of the sourceRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceRoute(byte[] value) {
        this.sourceRoute = value;
    }

}