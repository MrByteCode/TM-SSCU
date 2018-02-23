
package com.huawei.ngin.vpncentrex.mgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.ngin.vpncentrex.domain.DiscountNumberList;
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
 *         &lt;element name="discountNumberLists" type="{http://www.huawei.com/ngin/vpncentrex/domain}DiscountNumberList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="discountIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="discountListDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "discountNumberLists",
    "discountIndex",
    "discountListName",
    "discountListDescription"
})
@XmlRootElement(name = "createDiscountlist")
public class CreateDiscountlist {

    @XmlElementRef(name = "requestHeader", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    protected String enterpriseID;
    @XmlElement(nillable = true)
    protected List<DiscountNumberList> discountNumberLists;
    protected String discountIndex;
    protected String discountListName;
    protected String discountListDescription;

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
     * Gets the value of the discountNumberLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountNumberLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountNumberLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountNumberList }
     * 
     * 
     */
    public List<DiscountNumberList> getDiscountNumberLists() {
        if (discountNumberLists == null) {
            discountNumberLists = new ArrayList<DiscountNumberList>();
        }
        return this.discountNumberLists;
    }

    /**
     * Obtiene el valor de la propiedad discountIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountIndex() {
        return discountIndex;
    }

    /**
     * Define el valor de la propiedad discountIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountIndex(String value) {
        this.discountIndex = value;
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

}
