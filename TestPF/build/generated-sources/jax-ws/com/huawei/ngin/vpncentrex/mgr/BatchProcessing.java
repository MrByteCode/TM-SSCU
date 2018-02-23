
package com.huawei.ngin.vpncentrex.mgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.ngin.vpncentrex.domain.FullNumberList;
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
 *         &lt;element name="fullNumberList" type="{http://www.huawei.com/ngin/vpncentrex/domain}FullNumberList" minOccurs="0"/&gt;
 *         &lt;element name="batchProcessing" type="{http://www.huawei.com/ngin/vpncentrex/domain}BatchProcessing" minOccurs="0"/&gt;
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
    "fullNumberList",
    "batchProcessing"
})
@XmlRootElement(name = "batchProcessing")
public class BatchProcessing {

    @XmlElementRef(name = "requestHeader", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "fullNumberList", type = JAXBElement.class, required = false)
    protected JAXBElement<FullNumberList> fullNumberList;
    @XmlElementRef(name = "batchProcessing", type = JAXBElement.class, required = false)
    protected JAXBElement<com.huawei.ngin.vpncentrex.domain.BatchProcessing> batchProcessing;

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
     * Obtiene el valor de la propiedad fullNumberList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FullNumberList }{@code >}
     *     
     */
    public JAXBElement<FullNumberList> getFullNumberList() {
        return fullNumberList;
    }

    /**
     * Define el valor de la propiedad fullNumberList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FullNumberList }{@code >}
     *     
     */
    public void setFullNumberList(JAXBElement<FullNumberList> value) {
        this.fullNumberList = value;
    }

    /**
     * Obtiene el valor de la propiedad batchProcessing.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.huawei.ngin.vpncentrex.domain.BatchProcessing }{@code >}
     *     
     */
    public JAXBElement<com.huawei.ngin.vpncentrex.domain.BatchProcessing> getBatchProcessing() {
        return batchProcessing;
    }

    /**
     * Define el valor de la propiedad batchProcessing.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.huawei.ngin.vpncentrex.domain.BatchProcessing }{@code >}
     *     
     */
    public void setBatchProcessing(JAXBElement<com.huawei.ngin.vpncentrex.domain.BatchProcessing> value) {
        this.batchProcessing = value;
    }

}
