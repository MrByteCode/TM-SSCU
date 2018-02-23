
package com.huawei.ngin.vpncentrex.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VPNGrpShrdAccnt complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VPNGrpShrdAccnt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gPRSAccountLmt" type="{http://www.huawei.com/ngin/vpncentrex/domain}GPRSAccountLmt" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gPRSAccountUsage" type="{http://www.huawei.com/ngin/vpncentrex/domain}GPRSAccountUsage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gSharedInfo" type="{http://www.huawei.com/ngin/vpncentrex/domain}GSharedInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VPNGrpShrdAccnt", propOrder = {
    "enterpriseID",
    "gprsAccountLmt",
    "gprsAccountUsage",
    "gSharedInfo"
})
public class VPNGrpShrdAccnt {

    protected String enterpriseID;
    @XmlElement(name = "gPRSAccountLmt")
    protected List<GPRSAccountLmt> gprsAccountLmt;
    @XmlElement(name = "gPRSAccountUsage")
    protected List<GPRSAccountUsage> gprsAccountUsage;
    protected List<GSharedInfo> gSharedInfo;

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
     * Gets the value of the gprsAccountLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gprsAccountLmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGPRSAccountLmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GPRSAccountLmt }
     * 
     * 
     */
    public List<GPRSAccountLmt> getGPRSAccountLmt() {
        if (gprsAccountLmt == null) {
            gprsAccountLmt = new ArrayList<GPRSAccountLmt>();
        }
        return this.gprsAccountLmt;
    }

    /**
     * Gets the value of the gprsAccountUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gprsAccountUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGPRSAccountUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GPRSAccountUsage }
     * 
     * 
     */
    public List<GPRSAccountUsage> getGPRSAccountUsage() {
        if (gprsAccountUsage == null) {
            gprsAccountUsage = new ArrayList<GPRSAccountUsage>();
        }
        return this.gprsAccountUsage;
    }

    /**
     * Gets the value of the gSharedInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gSharedInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGSharedInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GSharedInfo }
     * 
     * 
     */
    public List<GSharedInfo> getGSharedInfo() {
        if (gSharedInfo == null) {
            gSharedInfo = new ArrayList<GSharedInfo>();
        }
        return this.gSharedInfo;
    }

}
