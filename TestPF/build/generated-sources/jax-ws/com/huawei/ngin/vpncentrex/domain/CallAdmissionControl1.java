
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CallAdmissionControl1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CallAdmissionControl1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="siteID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callLimitGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallAdmissionControl1", propOrder = {
    "spID",
    "siteID",
    "callLimitGroupName",
    "enterpriseID",
    "serviceType"
})
public class CallAdmissionControl1 {

    protected String spID;
    protected String siteID;
    protected String callLimitGroupName;
    protected String enterpriseID;
    protected String serviceType;

    /**
     * Obtiene el valor de la propiedad spID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpID() {
        return spID;
    }

    /**
     * Define el valor de la propiedad spID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpID(String value) {
        this.spID = value;
    }

    /**
     * Obtiene el valor de la propiedad siteID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteID() {
        return siteID;
    }

    /**
     * Define el valor de la propiedad siteID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteID(String value) {
        this.siteID = value;
    }

    /**
     * Obtiene el valor de la propiedad callLimitGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallLimitGroupName() {
        return callLimitGroupName;
    }

    /**
     * Define el valor de la propiedad callLimitGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallLimitGroupName(String value) {
        this.callLimitGroupName = value;
    }

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
     * Obtiene el valor de la propiedad serviceType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Define el valor de la propiedad serviceType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

}
