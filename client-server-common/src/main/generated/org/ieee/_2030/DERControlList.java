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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A List element to hold DERControl objects.
 * 
 * <p>Java class for DERControlList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DERControlList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ieee.org/2030.5}SubscribableList"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DERControl" type="{http://ieee.org/2030.5}DERControl" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DERControlList", propOrder = {
    "derControl"
})
public class DERControlList
    extends SubscribableList
{

    @XmlElement(name = "DERControl")
    protected List<DERControl> derControl;

    /**
     * Gets the value of the derControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the derControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDERControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DERControl }
     * 
     * 
     */
    public List<DERControl> getDERControl() {
        if (derControl == null) {
            derControl = new ArrayList<DERControl>();
        }
        return this.derControl;
    }

}
