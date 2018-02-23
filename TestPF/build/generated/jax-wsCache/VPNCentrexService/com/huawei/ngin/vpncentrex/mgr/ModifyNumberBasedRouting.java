
package com.huawei.ngin.vpncentrex.mgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.ngin.vpncentrex.domain.RequestHeader;
import com.huawei.ngin.vpncentrex.domain.RoutingBasedOnCaller;


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
 *         &lt;element name="routingBasedOnCaller" type="{http://www.huawei.com/ngin/vpncentrex/domain}RoutingBasedOnCaller" minOccurs="0"/&gt;
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
    "routingBasedOnCaller"
})
@XmlRootElement(name = "modifyNumberBasedRouting")
public class ModifyNumberBasedRouting {

    @XmlElementRef(name = "requestHeader", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "routingBasedOnCaller", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutingBasedOnCaller> routingBasedOnCaller;

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
     * Obtiene el valor de la propiedad routingBasedOnCaller.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutingBasedOnCaller }{@code >}
     *     
     */
    public JAXBElement<RoutingBasedOnCaller> getRoutingBasedOnCaller() {
        return routingBasedOnCaller;
    }

    /**
     * Define el valor de la propiedad routingBasedOnCaller.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutingBasedOnCaller }{@code >}
     *     
     */
    public void setRoutingBasedOnCaller(JAXBElement<RoutingBasedOnCaller> value) {
        this.routingBasedOnCaller = value;
    }

}
