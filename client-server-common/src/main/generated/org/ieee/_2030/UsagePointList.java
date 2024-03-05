//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.25 at 08:56:47 PM CET 
//


package org.ieee._2030;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A List element to hold UsagePoint objects.
 * 
 * <p>Java class for UsagePointList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsagePointList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ieee.org/2030.5}SubscribableList"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UsagePoint" type="{http://ieee.org/2030.5}UsagePoint" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="pollRate" type="{http://ieee.org/2030.5}UInt32" default="900" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsagePointList", propOrder = {
    "usagePoint"
})
public class UsagePointList
    extends SubscribableList
{

    @XmlElement(name = "UsagePoint")
    protected List<UsagePoint> usagePoint;
    @XmlAttribute(name = "pollRate")
    protected Long pollRate;

    /**
     * Gets the value of the usagePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the usagePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsagePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsagePoint }
     * 
     * 
     */
    public List<UsagePoint> getUsagePoint() {
        if (usagePoint == null) {
            usagePoint = new ArrayList<UsagePoint>();
        }
        return this.usagePoint;
    }

    /**
     * Gets the value of the pollRate property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getPollRate() {
        if (pollRate == null) {
            return  900L;
        } else {
            return pollRate;
        }
    }

    /**
     * Sets the value of the pollRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPollRate(Long value) {
        this.pollRate = value;
    }

}
