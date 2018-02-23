
package com.huawei.ngin.vpncentrex.mgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.ngin.vpncentrex.domain.RequestHeader;
import com.huawei.ngin.vpncentrex.domain.ResyncDataToiVPN;


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
 *         &lt;element name="resyncDataToiVPN" type="{http://www.huawei.com/ngin/vpncentrex/domain}ResyncDataToiVPN" minOccurs="0"/&gt;
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
    "resyncDataToiVPN"
})
@XmlRootElement(name = "reSyncToIVPN")
public class ReSyncToIVPN {

    @XmlElementRef(name = "requestHeader", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "resyncDataToiVPN", type = JAXBElement.class, required = false)
    protected JAXBElement<ResyncDataToiVPN> resyncDataToiVPN;

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
     * Obtiene el valor de la propiedad resyncDataToiVPN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResyncDataToiVPN }{@code >}
     *     
     */
    public JAXBElement<ResyncDataToiVPN> getResyncDataToiVPN() {
        return resyncDataToiVPN;
    }

    /**
     * Define el valor de la propiedad resyncDataToiVPN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResyncDataToiVPN }{@code >}
     *     
     */
    public void setResyncDataToiVPN(JAXBElement<ResyncDataToiVPN> value) {
        this.resyncDataToiVPN = value;
    }

}
