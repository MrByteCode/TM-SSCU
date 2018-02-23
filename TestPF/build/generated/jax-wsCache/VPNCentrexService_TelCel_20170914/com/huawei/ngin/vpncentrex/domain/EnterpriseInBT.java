
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnterpriseInBT complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EnterpriseInBT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="btName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnterpriseInBT", propOrder = {
    "spID",
    "btName",
    "enterpriseID"
})
public class EnterpriseInBT {

    protected String spID;
    protected String btName;
    protected String enterpriseID;

    /**
     * Obtiene el valor de la propiedad spID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpID() {
        return spID;
    }

    /**
     * Define el valor de la propiedad spID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpID(String value) {
        this.spID = value;
    }

    /**
     * Obtiene el valor de la propiedad btName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBtName() {
        return btName;
    }

    /**
     * Define el valor de la propiedad btName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBtName(String value) {
        this.btName = value;
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

}
