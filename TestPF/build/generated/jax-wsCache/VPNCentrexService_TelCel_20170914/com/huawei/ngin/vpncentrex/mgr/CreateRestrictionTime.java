
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
import com.huawei.ngin.vpncentrex.domain.RestrictionTimeList;


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
 *         &lt;element name="timeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeIDName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timeIDDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="restrictionTimeLists" type="{http://www.huawei.com/ngin/vpncentrex/domain}RestrictionTimeList" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "timeID",
    "timeIDName",
    "timeIDDescription",
    "restrictionTimeLists"
})
@XmlRootElement(name = "createRestrictionTime")
public class CreateRestrictionTime {

    @XmlElementRef(name = "requestHeader", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    protected String enterpriseID;
    protected String timeID;
    protected String timeIDName;
    protected String timeIDDescription;
    @XmlElement(nillable = true)
    protected List<RestrictionTimeList> restrictionTimeLists;

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
     * Obtiene el valor de la propiedad timeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeID() {
        return timeID;
    }

    /**
     * Define el valor de la propiedad timeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeID(String value) {
        this.timeID = value;
    }

    /**
     * Obtiene el valor de la propiedad timeIDName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeIDName() {
        return timeIDName;
    }

    /**
     * Define el valor de la propiedad timeIDName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeIDName(String value) {
        this.timeIDName = value;
    }

    /**
     * Obtiene el valor de la propiedad timeIDDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeIDDescription() {
        return timeIDDescription;
    }

    /**
     * Define el valor de la propiedad timeIDDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeIDDescription(String value) {
        this.timeIDDescription = value;
    }

    /**
     * Gets the value of the restrictionTimeLists property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictionTimeLists property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictionTimeLists().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictionTimeList }
     * 
     * 
     */
    public List<RestrictionTimeList> getRestrictionTimeLists() {
        if (restrictionTimeLists == null) {
            restrictionTimeLists = new ArrayList<RestrictionTimeList>();
        }
        return this.restrictionTimeLists;
    }

}
