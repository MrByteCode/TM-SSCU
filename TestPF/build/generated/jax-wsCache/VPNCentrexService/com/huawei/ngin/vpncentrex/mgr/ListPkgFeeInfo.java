
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
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pkgFeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pkgFeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "currentPage",
    "pkgFeeType",
    "pkgFeeName"
})
@XmlRootElement(name = "listPkgFeeInfo")
public class ListPkgFeeInfo {

    @XmlElementRef(name = "requestHeader", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    protected String currentPage;
    protected String pkgFeeType;
    protected String pkgFeeName;

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

    /**
     * Obtiene el valor de la propiedad pkgFeeType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgFeeType() {
        return pkgFeeType;
    }

    /**
     * Define el valor de la propiedad pkgFeeType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgFeeType(String value) {
        this.pkgFeeType = value;
    }

    /**
     * Obtiene el valor de la propiedad pkgFeeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkgFeeName() {
        return pkgFeeName;
    }

    /**
     * Define el valor de la propiedad pkgFeeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkgFeeName(String value) {
        this.pkgFeeName = value;
    }

}
