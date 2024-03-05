//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.25 at 08:56:47 PM CET 
//


package org.ieee._2030;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.HexBinaryAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Specific value measured by a meter or other asset.
 * 
 * <p>Java class for Reading complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reading"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ieee.org/2030.5}ReadingBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localID" type="{http://ieee.org/2030.5}HexBinary16" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="subscribable" type="{http://ieee.org/2030.5}SubscribableType" default="0" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reading", propOrder = {
    "localID"
})
public class Reading
    extends ReadingBase
{

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] localID;
    @XmlAttribute(name = "subscribable")
    protected Short subscribable;

    /**
     * Gets the value of the localID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getLocalID() {
        return localID;
    }

    /**
     * Sets the value of the localID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalID(byte[] value) {
        this.localID = value;
    }

    /**
     * Gets the value of the subscribable property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public short getSubscribable() {
        if (subscribable == null) {
            return ((short) 0);
        } else {
            return subscribable;
        }
    }

    /**
     * Sets the value of the subscribable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setSubscribable(Short value) {
        this.subscribable = value;
    }

}
