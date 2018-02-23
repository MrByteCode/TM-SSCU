
package com.huawei.ngin.vpncentrex.mgr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.ngin.vpncentrex.domain.PBXPrevent1;
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
 *         &lt;element name="totalSize" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rowsPerPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalPageNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pbxPrevents" type="{http://www.huawei.com/ngin/vpncentrex/domain}PBXPrevent1" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "totalSize",
    "rowsPerPage",
    "totalPageNum",
    "pbxPrevents"
})
@XmlRootElement(name = "listPBXPreventResponse")
public class ListPBXPreventResponse {

    @XmlElement(required = true, nillable = true)
    protected ResponseHeader responseHeader;
    @XmlElement(required = true, nillable = true)
    protected ReturnDes returnDes;
    @XmlElement(required = true, nillable = true)
    protected String totalSize;
    protected String rowsPerPage;
    @XmlElement(required = true, nillable = true)
    protected String totalPageNum;
    @XmlElement(nillable = true)
    protected List<PBXPrevent1> pbxPrevents;

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
     * Obtiene el valor de la propiedad totalSize.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalSize() {
        return totalSize;
    }

    /**
     * Define el valor de la propiedad totalSize.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalSize(String value) {
        this.totalSize = value;
    }

    /**
     * Obtiene el valor de la propiedad rowsPerPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowsPerPage() {
        return rowsPerPage;
    }

    /**
     * Define el valor de la propiedad rowsPerPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowsPerPage(String value) {
        this.rowsPerPage = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPageNum.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPageNum() {
        return totalPageNum;
    }

    /**
     * Define el valor de la propiedad totalPageNum.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPageNum(String value) {
        this.totalPageNum = value;
    }

    /**
     * Gets the value of the pbxPrevents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pbxPrevents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPbxPrevents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PBXPrevent1 }
     * 
     * 
     */
    public List<PBXPrevent1> getPbxPrevents() {
        if (pbxPrevents == null) {
            pbxPrevents = new ArrayList<PBXPrevent1>();
        }
        return this.pbxPrevents;
    }

}
