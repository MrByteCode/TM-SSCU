
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RoutingBasedOnCaller4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RoutingBasedOnCaller4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numBasedRoutingListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="callingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numberFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entryRowIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="suscriberNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="connectingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingBasedOnCaller4", propOrder = {
    "numBasedRoutingListID",
    "callingNumber",
    "numberFormat",
    "entryRowIndex",
    "enterpriseID",
    "suscriberNumber",
    "connectingNumber"
})
public class RoutingBasedOnCaller4 {

    protected String numBasedRoutingListID;
    protected String callingNumber;
    protected String numberFormat;
    protected String entryRowIndex;
    protected String enterpriseID;
    protected String suscriberNumber;
    protected String connectingNumber;

    /**
     * Obtiene el valor de la propiedad numBasedRoutingListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumBasedRoutingListID() {
        return numBasedRoutingListID;
    }

    /**
     * Define el valor de la propiedad numBasedRoutingListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumBasedRoutingListID(String value) {
        this.numBasedRoutingListID = value;
    }

    /**
     * Obtiene el valor de la propiedad callingNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallingNumber() {
        return callingNumber;
    }

    /**
     * Define el valor de la propiedad callingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallingNumber(String value) {
        this.callingNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad numberFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberFormat() {
        return numberFormat;
    }

    /**
     * Define el valor de la propiedad numberFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberFormat(String value) {
        this.numberFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad entryRowIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryRowIndex() {
        return entryRowIndex;
    }

    /**
     * Define el valor de la propiedad entryRowIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryRowIndex(String value) {
        this.entryRowIndex = value;
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
     * Obtiene el valor de la propiedad suscriberNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuscriberNumber() {
        return suscriberNumber;
    }

    /**
     * Define el valor de la propiedad suscriberNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuscriberNumber(String value) {
        this.suscriberNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad connectingNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectingNumber() {
        return connectingNumber;
    }

    /**
     * Define el valor de la propiedad connectingNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectingNumber(String value) {
        this.connectingNumber = value;
    }

}
