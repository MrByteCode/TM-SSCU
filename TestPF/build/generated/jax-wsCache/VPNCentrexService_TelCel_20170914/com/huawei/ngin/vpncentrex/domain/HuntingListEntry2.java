
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HuntingListEntry2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="HuntingListEntry2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="huntingListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entryRowIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HuntingListEntry2", propOrder = {
    "enterpriseID",
    "huntingListID",
    "entryRowIndex"
})
public class HuntingListEntry2 {

    protected String enterpriseID;
    protected String huntingListID;
    protected String entryRowIndex;

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
     * Obtiene el valor de la propiedad huntingListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntingListID() {
        return huntingListID;
    }

    /**
     * Define el valor de la propiedad huntingListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntingListID(String value) {
        this.huntingListID = value;
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

}