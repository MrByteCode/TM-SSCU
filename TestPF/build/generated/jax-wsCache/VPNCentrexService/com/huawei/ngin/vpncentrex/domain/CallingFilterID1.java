
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CallingFilterID1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CallingFilterID1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listProperty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fWNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ifScreenAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenNumPrefix1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenNumPrefix2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenNumPrefix3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenNumPrefix4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenNumPrefix5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenNumPrefix6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenNumPrefix7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenNumPrefix8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenNumPrefix9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="screenNumPrefix10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallingFilterID1", propOrder = {
    "listNo",
    "listProperty",
    "fwNumber",
    "ifScreenAll",
    "screenNumPrefix1",
    "screenNumPrefix2",
    "screenNumPrefix3",
    "screenNumPrefix4",
    "screenNumPrefix5",
    "screenNumPrefix6",
    "screenNumPrefix7",
    "screenNumPrefix8",
    "screenNumPrefix9",
    "screenNumPrefix10"
})
public class CallingFilterID1 {

    protected String listNo;
    protected String listProperty;
    @XmlElement(name = "fWNumber")
    protected String fwNumber;
    protected String ifScreenAll;
    protected String screenNumPrefix1;
    protected String screenNumPrefix2;
    protected String screenNumPrefix3;
    protected String screenNumPrefix4;
    protected String screenNumPrefix5;
    protected String screenNumPrefix6;
    protected String screenNumPrefix7;
    protected String screenNumPrefix8;
    protected String screenNumPrefix9;
    protected String screenNumPrefix10;

    /**
     * Obtiene el valor de la propiedad listNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListNo() {
        return listNo;
    }

    /**
     * Define el valor de la propiedad listNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListNo(String value) {
        this.listNo = value;
    }

    /**
     * Obtiene el valor de la propiedad listProperty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListProperty() {
        return listProperty;
    }

    /**
     * Define el valor de la propiedad listProperty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListProperty(String value) {
        this.listProperty = value;
    }

    /**
     * Obtiene el valor de la propiedad fwNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWNumber() {
        return fwNumber;
    }

    /**
     * Define el valor de la propiedad fwNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWNumber(String value) {
        this.fwNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad ifScreenAll.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfScreenAll() {
        return ifScreenAll;
    }

    /**
     * Define el valor de la propiedad ifScreenAll.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfScreenAll(String value) {
        this.ifScreenAll = value;
    }

    /**
     * Obtiene el valor de la propiedad screenNumPrefix1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenNumPrefix1() {
        return screenNumPrefix1;
    }

    /**
     * Define el valor de la propiedad screenNumPrefix1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenNumPrefix1(String value) {
        this.screenNumPrefix1 = value;
    }

    /**
     * Obtiene el valor de la propiedad screenNumPrefix2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenNumPrefix2() {
        return screenNumPrefix2;
    }

    /**
     * Define el valor de la propiedad screenNumPrefix2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenNumPrefix2(String value) {
        this.screenNumPrefix2 = value;
    }

    /**
     * Obtiene el valor de la propiedad screenNumPrefix3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenNumPrefix3() {
        return screenNumPrefix3;
    }

    /**
     * Define el valor de la propiedad screenNumPrefix3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenNumPrefix3(String value) {
        this.screenNumPrefix3 = value;
    }

    /**
     * Obtiene el valor de la propiedad screenNumPrefix4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenNumPrefix4() {
        return screenNumPrefix4;
    }

    /**
     * Define el valor de la propiedad screenNumPrefix4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenNumPrefix4(String value) {
        this.screenNumPrefix4 = value;
    }

    /**
     * Obtiene el valor de la propiedad screenNumPrefix5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenNumPrefix5() {
        return screenNumPrefix5;
    }

    /**
     * Define el valor de la propiedad screenNumPrefix5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenNumPrefix5(String value) {
        this.screenNumPrefix5 = value;
    }

    /**
     * Obtiene el valor de la propiedad screenNumPrefix6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenNumPrefix6() {
        return screenNumPrefix6;
    }

    /**
     * Define el valor de la propiedad screenNumPrefix6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenNumPrefix6(String value) {
        this.screenNumPrefix6 = value;
    }

    /**
     * Obtiene el valor de la propiedad screenNumPrefix7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenNumPrefix7() {
        return screenNumPrefix7;
    }

    /**
     * Define el valor de la propiedad screenNumPrefix7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenNumPrefix7(String value) {
        this.screenNumPrefix7 = value;
    }

    /**
     * Obtiene el valor de la propiedad screenNumPrefix8.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenNumPrefix8() {
        return screenNumPrefix8;
    }

    /**
     * Define el valor de la propiedad screenNumPrefix8.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenNumPrefix8(String value) {
        this.screenNumPrefix8 = value;
    }

    /**
     * Obtiene el valor de la propiedad screenNumPrefix9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenNumPrefix9() {
        return screenNumPrefix9;
    }

    /**
     * Define el valor de la propiedad screenNumPrefix9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenNumPrefix9(String value) {
        this.screenNumPrefix9 = value;
    }

    /**
     * Obtiene el valor de la propiedad screenNumPrefix10.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScreenNumPrefix10() {
        return screenNumPrefix10;
    }

    /**
     * Define el valor de la propiedad screenNumPrefix10.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScreenNumPrefix10(String value) {
        this.screenNumPrefix10 = value;
    }

}
