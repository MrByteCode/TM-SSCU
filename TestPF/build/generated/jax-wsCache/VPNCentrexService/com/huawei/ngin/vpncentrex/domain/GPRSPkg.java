
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GPRSPkg complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GPRSPkg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gprsPkgID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gprsPkgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPRSPkg", propOrder = {
    "spID",
    "gprsPkgID",
    "gprsPkgName"
})
public class GPRSPkg {

    protected String spID;
    protected String gprsPkgID;
    protected String gprsPkgName;

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
     * Obtiene el valor de la propiedad gprsPkgID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprsPkgID() {
        return gprsPkgID;
    }

    /**
     * Define el valor de la propiedad gprsPkgID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprsPkgID(String value) {
        this.gprsPkgID = value;
    }

    /**
     * Obtiene el valor de la propiedad gprsPkgName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGprsPkgName() {
        return gprsPkgName;
    }

    /**
     * Define el valor de la propiedad gprsPkgName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGprsPkgName(String value) {
        this.gprsPkgName = value;
    }

}
