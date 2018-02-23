
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
import com.huawei.ngin.vpncentrex.domain.RequestHeader;
import com.huawei.ngin.vpncentrex.domain.RestrictionUserListInfoList;


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
 *         &lt;element name="userListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userListDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restrictionUserListInfoLists" type="{http://www.huawei.com/ngin/vpncentrex/domain}RestrictionUserListInfoList" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "userListID",
    "userListName",
    "userListDescription",
    "restrictionUserListInfoLists"
})
@XmlRootElement(name = "createRestrictionUserList")
public class CreateRestrictionUserList {

    @XmlElementRef(name = "requestHeader", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    protected String enterpriseID;
    protected String userListID;
    protected String userListName;
    protected String userListDescription;
    @XmlElement(nillable = true)
    protected List<RestrictionUserListInfoList> restrictionUserListInfoLists;

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
     * Obtiene el valor de la propiedad userListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserListID() {
        return userListID;
    }

    /**
     * Define el valor de la propiedad userListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserListID(String value) {
        this.userListID = value;
    }

    /**
     * Obtiene el valor de la propiedad userListName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserListName() {
        return userListName;
    }

    /**
     * Define el valor de la propiedad userListName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserListName(String value) {
        this.userListName = value;
    }

    /**
     * Obtiene el valor de la propiedad userListDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserListDescription() {
        return userListDescription;
    }

    /**
     * Define el valor de la propiedad userListDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserListDescription(String value) {
        this.userListDescription = value;
    }

    /**
     * Gets the value of the restrictionUserListInfoLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictionUserListInfoLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictionUserListInfoLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictionUserListInfoList }
     * 
     * 
     */
    public List<RestrictionUserListInfoList> getRestrictionUserListInfoLists() {
        if (restrictionUserListInfoLists == null) {
            restrictionUserListInfoLists = new ArrayList<RestrictionUserListInfoList>();
        }
        return this.restrictionUserListInfoLists;
    }

}
