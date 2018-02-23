
package com.huawei.ngin.vpncentrex.mgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.ngin.vpncentrex.domain.MembeAccountrLmt;
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
 *         &lt;element name="fullNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="membeAccountrLmt" type="{http://www.huawei.com/ngin/vpncentrex/domain}MembeAccountrLmt" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "requestHeader",
    "enterpriseID",
    "fullNumber",
    "membeAccountrLmt",
    "gprSsharingFlag"
})
@XmlRootElement(name = "setGrpShrdMember")
public class SetGrpShrdMember {

    @XmlElementRef(name = "requestHeader", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    protected String enterpriseID;
    protected String fullNumber;
    @XmlElementRef(name = "membeAccountrLmt", type = JAXBElement.class, required = false)
    protected JAXBElement<MembeAccountrLmt> membeAccountrLmt;
    @XmlElement(name = "gPRSsharingFlag")
    protected String gprSsharingFlag;

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
     * Obtiene el valor de la propiedad membeAccountrLmt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MembeAccountrLmt }{@code >}
     *     
     */
    public JAXBElement<MembeAccountrLmt> getMembeAccountrLmt() {
        return membeAccountrLmt;
    }

    /**
     * Define el valor de la propiedad membeAccountrLmt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MembeAccountrLmt }{@code >}
     *     
     */
    public void setMembeAccountrLmt(JAXBElement<MembeAccountrLmt> value) {
        this.membeAccountrLmt = value;
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
