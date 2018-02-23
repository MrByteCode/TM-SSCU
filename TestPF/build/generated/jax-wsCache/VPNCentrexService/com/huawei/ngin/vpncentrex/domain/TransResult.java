
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para transResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="transResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EnterpriseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transStauts" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="transResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="oprTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="failList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuccessNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="failureNum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transResult", propOrder = {
    "enterpriseID",
    "transStauts",
    "transResult",
    "oprTime",
    "failList",
    "successNum",
    "failureNum"
})
public class TransResult {

    @XmlElement(name = "EnterpriseID")
    protected String enterpriseID;
    protected Integer transStauts;
    protected Integer transResult;
    protected String oprTime;
    protected String failList;
    @XmlElement(name = "SuccessNum")
    protected Integer successNum;
    protected Integer failureNum;

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
     * Obtiene el valor de la propiedad transStauts.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransStauts() {
        return transStauts;
    }

    /**
     * Define el valor de la propiedad transStauts.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransStauts(Integer value) {
        this.transStauts = value;
    }

    /**
     * Obtiene el valor de la propiedad transResult.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransResult() {
        return transResult;
    }

    /**
     * Define el valor de la propiedad transResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransResult(Integer value) {
        this.transResult = value;
    }

    /**
     * Obtiene el valor de la propiedad oprTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOprTime() {
        return oprTime;
    }

    /**
     * Define el valor de la propiedad oprTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOprTime(String value) {
        this.oprTime = value;
    }

    /**
     * Obtiene el valor de la propiedad failList.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailList() {
        return failList;
    }

    /**
     * Define el valor de la propiedad failList.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailList(String value) {
        this.failList = value;
    }

    /**
     * Obtiene el valor de la propiedad successNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSuccessNum() {
        return successNum;
    }

    /**
     * Define el valor de la propiedad successNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSuccessNum(Integer value) {
        this.successNum = value;
    }

    /**
     * Obtiene el valor de la propiedad failureNum.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailureNum() {
        return failureNum;
    }

    /**
     * Define el valor de la propiedad failureNum.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailureNum(Integer value) {
        this.failureNum = value;
    }

}
