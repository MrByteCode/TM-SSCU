
package com.huawei.ngin.vpncentrex.mgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="huntingSeqListID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="seqRowIndex" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "huntingSeqListID",
    "seqRowIndex"
})
@XmlRootElement(name = "createPersonalHuntSeqListResponse")
public class CreatePersonalHuntSeqListResponse {

    @XmlElement(required = true, nillable = true)
    protected ResponseHeader responseHeader;
    @XmlElement(required = true, nillable = true)
    protected ReturnDes returnDes;
    @XmlElement(required = true, nillable = true)
    protected String huntingSeqListID;
    @XmlElement(required = true, nillable = true)
    protected String seqRowIndex;

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
     * Obtiene el valor de la propiedad huntingSeqListID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuntingSeqListID() {
        return huntingSeqListID;
    }

    /**
     * Define el valor de la propiedad huntingSeqListID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuntingSeqListID(String value) {
        this.huntingSeqListID = value;
    }

    /**
     * Obtiene el valor de la propiedad seqRowIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqRowIndex() {
        return seqRowIndex;
    }

    /**
     * Define el valor de la propiedad seqRowIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqRowIndex(String value) {
        this.seqRowIndex = value;
    }

}
