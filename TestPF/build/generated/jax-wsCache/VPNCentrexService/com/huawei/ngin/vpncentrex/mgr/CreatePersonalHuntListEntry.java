
package com.huawei.ngin.vpncentrex.mgr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.huawei.ngin.vpncentrex.domain.HuntingListEntry;
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
 *         &lt;element name="huntingListEntry" type="{http://www.huawei.com/ngin/vpncentrex/domain}HuntingListEntry" minOccurs="0"/&gt;
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
    "huntingListEntry"
})
@XmlRootElement(name = "createPersonalHuntListEntry")
public class CreatePersonalHuntListEntry {

    @XmlElementRef(name = "requestHeader", type = JAXBElement.class, required = false)
    protected JAXBElement<RequestHeader> requestHeader;
    @XmlElementRef(name = "huntingListEntry", type = JAXBElement.class, required = false)
    protected JAXBElement<HuntingListEntry> huntingListEntry;

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
     * Obtiene el valor de la propiedad huntingListEntry.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HuntingListEntry }{@code >}
     *     
     */
    public JAXBElement<HuntingListEntry> getHuntingListEntry() {
        return huntingListEntry;
    }

    /**
     * Define el valor de la propiedad huntingListEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HuntingListEntry }{@code >}
     *     
     */
    public void setHuntingListEntry(JAXBElement<HuntingListEntry> value) {
        this.huntingListEntry = value;
    }

}
