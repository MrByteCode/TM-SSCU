
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CurrentFilterID complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CurrentFilterID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fullNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="curListNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operatorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentFilterID", propOrder = {
    "fullNumber",
    "curListNo",
    "operatorType"
})
public class CurrentFilterID {

    protected String fullNumber;
    protected String curListNo;
    protected String operatorType;

    /**
     * Obtiene el valor de la propiedad fullNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNumber() {
        return fullNumber;
    }

    /**
     * Define el valor de la propiedad fullNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNumber(String value) {
        this.fullNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad curListNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurListNo() {
        return curListNo;
    }

    /**
     * Define el valor de la propiedad curListNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurListNo(String value) {
        this.curListNo = value;
    }

    /**
     * Obtiene el valor de la propiedad operatorType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorType() {
        return operatorType;
    }

    /**
     * Define el valor de la propiedad operatorType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorType(String value) {
        this.operatorType = value;
    }

}
