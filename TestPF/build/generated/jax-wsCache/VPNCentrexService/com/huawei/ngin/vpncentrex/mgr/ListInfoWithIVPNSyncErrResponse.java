
package com.huawei.ngin.vpncentrex.mgr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.ngin.vpncentrex.domain.ListGroupInfo;
import com.huawei.ngin.vpncentrex.domain.ListMemberInfo;
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
 *         &lt;element name="rowsPerPage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalPageNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enterpriseID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enterpriseName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="listGroupInfo" type="{http://www.huawei.com/ngin/vpncentrex/domain}listGroupInfo"/&gt;
 *         &lt;element name="listMemberInfo" type="{http://www.huawei.com/ngin/vpncentrex/domain}listMemberInfo"/&gt;
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
    "rowsPerPage",
    "totalPageNum",
    "enterpriseID",
    "enterpriseName",
    "listGroupInfo",
    "listMemberInfo"
})
@XmlRootElement(name = "listInfoWithIVPNSyncErrResponse")
public class ListInfoWithIVPNSyncErrResponse {

    @XmlElement(required = true, nillable = true)
    protected ResponseHeader responseHeader;
    @XmlElement(required = true, nillable = true)
    protected ReturnDes returnDes;
    @XmlElement(required = true, nillable = true)
    protected String rowsPerPage;
    @XmlElement(required = true, nillable = true)
    protected String totalPageNum;
    @XmlElement(required = true, nillable = true)
    protected String enterpriseID;
    @XmlElement(required = true, nillable = true)
    protected String enterpriseName;
    @XmlElement(required = true, nillable = true)
    protected ListGroupInfo listGroupInfo;
    @XmlElement(required = true, nillable = true)
    protected ListMemberInfo listMemberInfo;

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
     * Obtiene el valor de la propiedad enterpriseName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * Define el valor de la propiedad enterpriseName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseName(String value) {
        this.enterpriseName = value;
    }

    /**
     * Obtiene el valor de la propiedad listGroupInfo.
     * 
     * @return
     *     possible object is
     *     {@link ListGroupInfo }
     *     
     */
    public ListGroupInfo getListGroupInfo() {
        return listGroupInfo;
    }

    /**
     * Define el valor de la propiedad listGroupInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ListGroupInfo }
     *     
     */
    public void setListGroupInfo(ListGroupInfo value) {
        this.listGroupInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad listMemberInfo.
     * 
     * @return
     *     possible object is
     *     {@link ListMemberInfo }
     *     
     */
    public ListMemberInfo getListMemberInfo() {
        return listMemberInfo;
    }

    /**
     * Define el valor de la propiedad listMemberInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ListMemberInfo }
     *     
     */
    public void setListMemberInfo(ListMemberInfo value) {
        this.listMemberInfo = value;
    }

}
