
package com.huawei.ngin.vpncentrex.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para groupInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="groupInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="groupID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ivpnSyncError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reSyncCounter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupInfo", propOrder = {
    "groupID",
    "groupName",
    "ivpnSyncError",
    "reSyncCounter"
})
public class GroupInfo {

    protected String groupID;
    protected String groupName;
    protected String ivpnSyncError;
    protected String reSyncCounter;

    /**
     * Obtiene el valor de la propiedad groupID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * Define el valor de la propiedad groupID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * Obtiene el valor de la propiedad groupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Define el valor de la propiedad groupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Obtiene el valor de la propiedad ivpnSyncError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIvpnSyncError() {
        return ivpnSyncError;
    }

    /**
     * Define el valor de la propiedad ivpnSyncError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIvpnSyncError(String value) {
        this.ivpnSyncError = value;
    }

    /**
     * Obtiene el valor de la propiedad reSyncCounter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReSyncCounter() {
        return reSyncCounter;
    }

    /**
     * Define el valor de la propiedad reSyncCounter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReSyncCounter(String value) {
        this.reSyncCounter = value;
    }

}
