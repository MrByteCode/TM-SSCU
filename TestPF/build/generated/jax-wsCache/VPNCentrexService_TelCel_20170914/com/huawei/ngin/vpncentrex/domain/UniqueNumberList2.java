
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UniqueNumberList2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UniqueNumberList2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uniqueNumberListID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "UniqueNumberList2", propOrder = {
    "enterpriseID",
    "uniqueNumberListID",
    "entryRowIndex"
})
public class UniqueNumberList2 {

    protected String enterpriseID;
    protected String uniqueNumberListID;
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
     * Obtiene el valor de la propiedad uniqueNumberListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueNumberListID() {
        return uniqueNumberListID;
    }

    /**
     * Define el valor de la propiedad uniqueNumberListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueNumberListID(String value) {
        this.uniqueNumberListID = value;
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
