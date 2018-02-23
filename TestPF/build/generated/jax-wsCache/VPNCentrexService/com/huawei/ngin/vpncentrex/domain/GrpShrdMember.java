
package com.huawei.ngin.vpncentrex.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GrpShrdMember complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GrpShrdMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MembeAccountrLmt" type="{http://www.huawei.com/ngin/vpncentrex/domain}MembeAccountrLmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MemberSAccountUsage" type="{http://www.huawei.com/ngin/vpncentrex/domain}MemberSAccountUsage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gPRSsharingFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrpShrdMember", propOrder = {
    "enterpriseID",
    "fullNumber",
    "membeAccountrLmt",
    "memberSAccountUsage",
    "gprSsharingFlag"
})
public class GrpShrdMember {

    protected String enterpriseID;
    protected String fullNumber;
    @XmlElement(name = "MembeAccountrLmt")
    protected List<MembeAccountrLmt> membeAccountrLmt;
    @XmlElement(name = "MemberSAccountUsage")
    protected List<MemberSAccountUsage> memberSAccountUsage;
    @XmlElement(name = "gPRSsharingFlag")
    protected String gprSsharingFlag;

    /**
     * Obtiene el valor de la propiedad enterpriseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseID() {
        return enterpriseID;
    }

    /**
     * Define el valor de la propiedad enterpriseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseID(String value) {
        this.enterpriseID = value;
    }

    /**
     * Obtiene el valor de la propiedad fullNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNumber() {
        return fullNumber;
    }

    /**
     * Define el valor de la propiedad fullNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNumber(String value) {
        this.fullNumber = value;
    }

    /**
     * Gets the value of the membeAccountrLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membeAccountrLmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMembeAccountrLmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MembeAccountrLmt }
     * 
     * 
     */
    public List<MembeAccountrLmt> getMembeAccountrLmt() {
        if (membeAccountrLmt == null) {
            membeAccountrLmt = new ArrayList<MembeAccountrLmt>();
        }
        return this.membeAccountrLmt;
    }

    /**
     * Gets the value of the memberSAccountUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberSAccountUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberSAccountUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemberSAccountUsage }
     * 
     * 
     */
    public List<MemberSAccountUsage> getMemberSAccountUsage() {
        if (memberSAccountUsage == null) {
            memberSAccountUsage = new ArrayList<MemberSAccountUsage>();
        }
        return this.memberSAccountUsage;
    }

    /**
     * Obtiene el valor de la propiedad gprSsharingFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPRSsharingFlag() {
        return gprSsharingFlag;
    }

    /**
     * Define el valor de la propiedad gprSsharingFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPRSsharingFlag(String value) {
        this.gprSsharingFlag = value;
    }

}
