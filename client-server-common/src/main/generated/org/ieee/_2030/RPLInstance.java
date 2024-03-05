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
 * Specific RPLInstance resource.  This resource may be thought of as network status information for a specific RPL instance associated with IPInterface.
 * 
 * <p>Java class for RPLInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RPLInstance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ieee.org/2030.5}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DODAGid" type="{http://ieee.org/2030.5}UInt8"/&gt;
 *         &lt;element name="DODAGroot" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="flags" type="{http://ieee.org/2030.5}UInt8"/&gt;
 *         &lt;element name="groundedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MOP" type="{http://ieee.org/2030.5}UInt8"/&gt;
 *         &lt;element name="PRF" type="{http://ieee.org/2030.5}UInt8"/&gt;
 *         &lt;element name="rank" type="{http://ieee.org/2030.5}UInt16"/&gt;
 *         &lt;element name="RPLInstanceID" type="{http://ieee.org/2030.5}UInt8"/&gt;
 *         &lt;element name="RPLSourceRoutesListLink" type="{http://ieee.org/2030.5}RPLSourceRoutesListLink" minOccurs="0"/&gt;
 *         &lt;element name="versionNumber" type="{http://ieee.org/2030.5}UInt8"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RPLInstance", propOrder = {
    "dodaGid",
    "dodaGroot",
    "flags",
    "groundedFlag",
    "mop",
    "prf",
    "rank",
    "rplInstanceID",
    "rplSourceRoutesListLink",
    "versionNumber"
})
public class RPLInstance
    extends Resource
{

    @XmlElement(name = "DODAGid")
    @XmlSchemaType(name = "unsignedByte")
    protected short dodaGid;
    @XmlElement(name = "DODAGroot")
    protected boolean dodaGroot;
    @XmlSchemaType(name = "unsignedByte")
    protected short flags;
    protected boolean groundedFlag;
    @XmlElement(name = "MOP")
    @XmlSchemaType(name = "unsignedByte")
    protected short mop;
    @XmlElement(name = "PRF")
    @XmlSchemaType(name = "unsignedByte")
    protected short prf;
    @XmlSchemaType(name = "unsignedShort")
    protected int rank;
    @XmlElement(name = "RPLInstanceID")
    @XmlSchemaType(name = "unsignedByte")
    protected short rplInstanceID;
    @XmlElement(name = "RPLSourceRoutesListLink")
    protected RPLSourceRoutesListLink rplSourceRoutesListLink;
    @XmlSchemaType(name = "unsignedByte")
    protected short versionNumber;

    /**
     * Gets the value of the dodaGid property.
     * 
     */
    public short getDODAGid() {
        return dodaGid;
    }

    /**
     * Sets the value of the dodaGid property.
     * 
     */
    public void setDODAGid(short value) {
        this.dodaGid = value;
    }

    /**
     * Gets the value of the dodaGroot property.
     * 
     */
    public boolean isDODAGroot() {
        return dodaGroot;
    }

    /**
     * Sets the value of the dodaGroot property.
     * 
     */
    public void setDODAGroot(boolean value) {
        this.dodaGroot = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     */
    public short getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     */
    public void setFlags(short value) {
        this.flags = value;
    }

    /**
     * Gets the value of the groundedFlag property.
     * 
     */
    public boolean isGroundedFlag() {
        return groundedFlag;
    }

    /**
     * Sets the value of the groundedFlag property.
     * 
     */
    public void setGroundedFlag(boolean value) {
        this.groundedFlag = value;
    }

    /**
     * Gets the value of the mop property.
     * 
     */
    public short getMOP() {
        return mop;
    }

    /**
     * Sets the value of the mop property.
     * 
     */
    public void setMOP(short value) {
        this.mop = value;
    }

    /**
     * Gets the value of the prf property.
     * 
     */
    public short getPRF() {
        return prf;
    }

    /**
     * Sets the value of the prf property.
     * 
     */
    public void setPRF(short value) {
        this.prf = value;
    }

    /**
     * Gets the value of the rank property.
     * 
     */
    public int getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     */
    public void setRank(int value) {
        this.rank = value;
    }

    /**
     * Gets the value of the rplInstanceID property.
     * 
     */
    public short getRPLInstanceID() {
        return rplInstanceID;
    }

    /**
     * Sets the value of the rplInstanceID property.
     * 
     */
    public void setRPLInstanceID(short value) {
        this.rplInstanceID = value;
    }

    /**
     * Gets the value of the rplSourceRoutesListLink property.
     * 
     * @return
     *     possible object is
     *     {@link RPLSourceRoutesListLink }
     *     
     */
    public RPLSourceRoutesListLink getRPLSourceRoutesListLink() {
        return rplSourceRoutesListLink;
    }

    /**
     * Sets the value of the rplSourceRoutesListLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link RPLSourceRoutesListLink }
     *     
     */
    public void setRPLSourceRoutesListLink(RPLSourceRoutesListLink value) {
        this.rplSourceRoutesListLink = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     */
    public short getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     */
    public void setVersionNumber(short value) {
        this.versionNumber = value;
    }

}
