
package com.huawei.ngin.vpncentrex.mgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.ngin.vpncentrex.domain.DiscountList;
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
 *         &lt;element name="discountList" type="{http://www.huawei.com/ngin/vpncentrex/domain}DiscountList" minOccurs="0"/&gt;
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountListDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "discountList",
    "currentPage",
    "discountListName",
    "discountListDescription",
    "queryMode"
})
@XmlRootElement(name = "listDiscountlist")
public class ListDiscountlist {

    @XmlElementRef(name = "requestHeader", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "discountList", type = JAXBElement.class, required = false)
    protected JAXBElement<DiscountList> discountList;
    protected String currentPage;
    protected String discountListName;
    protected String discountListDescription;
    protected String queryMode;

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
     * Obtiene el valor de la propiedad discountList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DiscountList }{@code >}
     *     
     */
    public JAXBElement<DiscountList> getDiscountList() {
        return discountList;
    }

    /**
     * Define el valor de la propiedad discountList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DiscountList }{@code >}
     *     
     */
    public void setDiscountList(JAXBElement<DiscountList> value) {
        this.discountList = value;
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
     * Obtiene el valor de la propiedad discountListName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountListName() {
        return discountListName;
    }

    /**
     * Define el valor de la propiedad discountListName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountListName(String value) {
        this.discountListName = value;
    }

    /**
     * Obtiene el valor de la propiedad discountListDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountListDescription() {
        return discountListDescription;
    }

    /**
     * Define el valor de la propiedad discountListDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountListDescription(String value) {
        this.discountListDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad queryMode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryMode() {
        return queryMode;
    }

    /**
     * Define el valor de la propiedad queryMode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryMode(String value) {
        this.queryMode = value;
    }

}
