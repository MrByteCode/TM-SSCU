
package com.huawei.ngin.vpncentrex.mgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="cpc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="q825" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cpc",
    "q825",
    "displayInfo",
    "displayFlag",
    "currentPage"
})
@XmlRootElement(name = "listCPC")
public class ListCPC {

    @XmlElementRef(name = "requestHeader", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    protected String cpc;
    protected String q825;
    protected String displayInfo;
    protected String displayFlag;
    protected String currentPage;

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
     * Obtiene el valor de la propiedad cpc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpc() {
        return cpc;
    }

    /**
     * Define el valor de la propiedad cpc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpc(String value) {
        this.cpc = value;
    }

    /**
     * Obtiene el valor de la propiedad q825.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQ825() {
        return q825;
    }

    /**
     * Define el valor de la propiedad q825.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQ825(String value) {
        this.q825 = value;
    }

    /**
     * Obtiene el valor de la propiedad displayInfo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayInfo() {
        return displayInfo;
    }

    /**
     * Define el valor de la propiedad displayInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayInfo(String value) {
        this.displayInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad displayFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayFlag() {
        return displayFlag;
    }

    /**
     * Define el valor de la propiedad displayFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayFlag(String value) {
        this.displayFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad currentPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPage() {
        return currentPage;
    }

    /**
     * Define el valor de la propiedad currentPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPage(String value) {
        this.currentPage = value;
    }

}
