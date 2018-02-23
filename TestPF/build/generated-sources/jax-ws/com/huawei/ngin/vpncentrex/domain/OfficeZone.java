
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OfficeZone complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OfficeZone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cellID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officeZoneDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficeZone", propOrder = {
    "enterpriseID",
    "cellID",
    "officeZoneDesc"
})
public class OfficeZone {

    protected String enterpriseID;
    protected String cellID;
    protected String officeZoneDesc;

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
     * Obtiene el valor de la propiedad cellID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellID() {
        return cellID;
    }

    /**
     * Define el valor de la propiedad cellID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellID(String value) {
        this.cellID = value;
    }

    /**
     * Obtiene el valor de la propiedad officeZoneDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeZoneDesc() {
        return officeZoneDesc;
    }

    /**
     * Define el valor de la propiedad officeZoneDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeZoneDesc(String value) {
        this.officeZoneDesc = value;
    }

}
