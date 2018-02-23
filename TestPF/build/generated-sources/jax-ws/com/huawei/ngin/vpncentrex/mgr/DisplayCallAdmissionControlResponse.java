
package com.huawei.ngin.vpncentrex.mgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.ngin.vpncentrex.domain.CallAdmissionControl;
import com.huawei.ngin.vpncentrex.domain.ResponseHeader;
import com.huawei.ngin.vpncentrex.domain.ReturnDes;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseHeader" type="{http://www.huawei.com/ngin/vpncentrex/domain}ResponseHeader"/&gt;
 *         &lt;element name="returnDes" type="{http://www.huawei.com/ngin/vpncentrex/domain}ReturnDes"/&gt;
 *         &lt;element name="callAdmissionControl" type="{http://www.huawei.com/ngin/vpncentrex/domain}CallAdmissionControl"/&gt;
 *         &lt;element name="entTotalMaxConcurrentLimit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "responseHeader",
    "returnDes",
    "callAdmissionControl",
    "entTotalMaxConcurrentLimit"
})
@XmlRootElement(name = "displayCallAdmissionControlResponse")
public class DisplayCallAdmissionControlResponse {

    @XmlElement(required = true, nillable = true)
    protected ResponseHeader responseHeader;
    @XmlElement(required = true, nillable = true)
    protected ReturnDes returnDes;
    @XmlElement(required = true, nillable = true)
    protected CallAdmissionControl callAdmissionControl;
    @XmlElement(required = true, nillable = true)
    protected String entTotalMaxConcurrentLimit;

    /**
     * Obtiene el valor de la propiedad responseHeader.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader }
     *     
     */
    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    /**
     * Define el valor de la propiedad responseHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader }
     *     
     */
    public void setResponseHeader(ResponseHeader value) {
        this.responseHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad returnDes.
     * 
     * @return
     *     possible object is
     *     {@link ReturnDes }
     *     
     */
    public ReturnDes getReturnDes() {
        return returnDes;
    }

    /**
     * Define el valor de la propiedad returnDes.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnDes }
     *     
     */
    public void setReturnDes(ReturnDes value) {
        this.returnDes = value;
    }

    /**
     * Obtiene el valor de la propiedad callAdmissionControl.
     * 
     * @return
     *     possible object is
     *     {@link CallAdmissionControl }
     *     
     */
    public CallAdmissionControl getCallAdmissionControl() {
        return callAdmissionControl;
    }

    /**
     * Define el valor de la propiedad callAdmissionControl.
     * 
     * @param value
     *     allowed object is
     *     {@link CallAdmissionControl }
     *     
     */
    public void setCallAdmissionControl(CallAdmissionControl value) {
        this.callAdmissionControl = value;
    }

    /**
     * Obtiene el valor de la propiedad entTotalMaxConcurrentLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntTotalMaxConcurrentLimit() {
        return entTotalMaxConcurrentLimit;
    }

    /**
     * Define el valor de la propiedad entTotalMaxConcurrentLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntTotalMaxConcurrentLimit(String value) {
        this.entTotalMaxConcurrentLimit = value;
    }

}
