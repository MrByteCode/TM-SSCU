
package com.huawei.ngin.vpncentrex.mgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.ngin.vpncentrex.domain.HuntingGroupSeqList2;
import com.huawei.ngin.vpncentrex.domain.RequestHeader;


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
 *         &lt;element name="requestHeader" type="{http://www.huawei.com/ngin/vpncentrex/domain}RequestHeader" minOccurs="0"/&gt;
 *         &lt;element name="huntingGroupSeqList" type="{http://www.huawei.com/ngin/vpncentrex/domain}HuntingGroupSeqList2" minOccurs="0"/&gt;
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
    "requestHeader",
    "huntingGroupSeqList"
})
@XmlRootElement(name = "displayHuntingGroupSeqList")
public class DisplayHuntingGroupSeqList {

    @XmlElementRef(name = "requestHeader", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "huntingGroupSeqList", type = JAXBElement.class, required = false)
    protected JAXBElement<HuntingGroupSeqList2> huntingGroupSeqList;

    /**
     * Obtiene el valor de la propiedad requestHeader.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}
     *     
     */
    public JAXBElement<RequestHeader> getRequestHeader() {
        return requestHeader;
    }

    /**
     * Define el valor de la propiedad requestHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RequestHeader }{@code >}
     *     
     */
    public void setRequestHeader(JAXBElement<RequestHeader> value) {
        this.requestHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad huntingGroupSeqList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HuntingGroupSeqList2 }{@code >}
     *     
     */
    public JAXBElement<HuntingGroupSeqList2> getHuntingGroupSeqList() {
        return huntingGroupSeqList;
    }

    /**
     * Define el valor de la propiedad huntingGroupSeqList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HuntingGroupSeqList2 }{@code >}
     *     
     */
    public void setHuntingGroupSeqList(JAXBElement<HuntingGroupSeqList2> value) {
        this.huntingGroupSeqList = value;
    }

}
