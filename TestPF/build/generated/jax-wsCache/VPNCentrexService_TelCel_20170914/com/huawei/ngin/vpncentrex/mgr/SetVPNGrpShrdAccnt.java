
package com.huawei.ngin.vpncentrex.mgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.ngin.vpncentrex.domain.GPRSAccountLmt;
import com.huawei.ngin.vpncentrex.domain.RequestHeader;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestHeader" type="{http://www.huawei.com/ngin/vpncentrex/domain}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="administrator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gPRSAccountLmt" type="{http://www.huawei.com/ngin/vpncentrex/domain}GPRSAccountLmt" minOccurs="0"/&gt;
 *         &lt;element name="gSharedFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="threshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="balanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nextBalanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestHeader",
    "enterpriseID",
    "administrator",
    "gprsAccountLmt",
    "gSharedFuncFlag",
    "threshold",
    "balanceDate",
    "nextBalanceDate"
})
@XmlRootElement(name = "setVPNGrpShrdAccnt")
public class SetVPNGrpShrdAccnt {

    @XmlElementRef(name = "requestHeader", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    protected String enterpriseID;
    protected String administrator;
    @XmlElementRef(name = "gPRSAccountLmt", type = JAXBElement.class, required = false)
    protected JAXBElement<GPRSAccountLmt> gprsAccountLmt;
    protected String gSharedFuncFlag;
    protected String threshold;
    protected String balanceDate;
    protected String nextBalanceDate;

    /**
     * Obtiene el valor de la propiedad requestHeader.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}
     *     
     */
    public JAXBElement<RequestHeader> getRequestHeader() {
        return requestHeader;
    }

    /**
     * Define el valor de la propiedad requestHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}
     *     
     */
    public void setRequestHeader(JAXBElement<RequestHeader> value) {
        this.requestHeader = value;
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
     * Obtiene el valor de la propiedad administrator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrator() {
        return administrator;
    }

    /**
     * Define el valor de la propiedad administrator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrator(String value) {
        this.administrator = value;
    }

    /**
     * Obtiene el valor de la propiedad gprsAccountLmt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GPRSAccountLmt }{@code >}
     *     
     */
    public JAXBElement<GPRSAccountLmt> getGPRSAccountLmt() {
        return gprsAccountLmt;
    }

    /**
     * Define el valor de la propiedad gprsAccountLmt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GPRSAccountLmt }{@code >}
     *     
     */
    public void setGPRSAccountLmt(JAXBElement<GPRSAccountLmt> value) {
        this.gprsAccountLmt = value;
    }

    /**
     * Obtiene el valor de la propiedad gSharedFuncFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSharedFuncFlag() {
        return gSharedFuncFlag;
    }

    /**
     * Define el valor de la propiedad gSharedFuncFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSharedFuncFlag(String value) {
        this.gSharedFuncFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad threshold.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreshold() {
        return threshold;
    }

    /**
     * Define el valor de la propiedad threshold.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreshold(String value) {
        this.threshold = value;
    }

    /**
     * Obtiene el valor de la propiedad balanceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceDate() {
        return balanceDate;
    }

    /**
     * Define el valor de la propiedad balanceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceDate(String value) {
        this.balanceDate = value;
    }

    /**
     * Obtiene el valor de la propiedad nextBalanceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextBalanceDate() {
        return nextBalanceDate;
    }

    /**
     * Define el valor de la propiedad nextBalanceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextBalanceDate(String value) {
        this.nextBalanceDate = value;
    }

}
