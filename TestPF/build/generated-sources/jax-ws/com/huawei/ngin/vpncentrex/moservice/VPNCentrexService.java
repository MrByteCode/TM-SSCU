
package com.huawei.ngin.vpncentrex.moservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VPNCentrexService", targetNamespace = "http://www.huawei.com/ngin/vpncentrex/moservice", wsdlLocation = "http://10.209.67.103:14388/bmp/services/VPNCentrexService?wsdl")
public class VPNCentrexService
    extends Service
{

    private final static URL VPNCENTREXSERVICE_WSDL_LOCATION;
    private final static WebServiceException VPNCENTREXSERVICE_EXCEPTION;
    private final static QName VPNCENTREXSERVICE_QNAME = new QName("http://www.huawei.com/ngin/vpncentrex/moservice", "VPNCentrexService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.209.67.103:14388/bmp/services/VPNCentrexService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VPNCENTREXSERVICE_WSDL_LOCATION = url;
        VPNCENTREXSERVICE_EXCEPTION = e;
    }

    public VPNCentrexService() {
        super(__getWsdlLocation(), VPNCENTREXSERVICE_QNAME);
    }

    public VPNCentrexService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VPNCENTREXSERVICE_QNAME, features);
    }

    public VPNCentrexService(URL wsdlLocation) {
        super(wsdlLocation, VPNCENTREXSERVICE_QNAME);
    }

    public VPNCentrexService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VPNCENTREXSERVICE_QNAME, features);
    }

    public VPNCentrexService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VPNCentrexService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VPNCentrexServicePortType
     */
    @WebEndpoint(name = "VPNCentrexServiceSOAP11port_http")
    public VPNCentrexServicePortType getVPNCentrexServiceSOAP11PortHttp() {
        return super.getPort(new QName("http://www.huawei.com/ngin/vpncentrex/moservice", "VPNCentrexServiceSOAP11port_http"), VPNCentrexServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VPNCentrexServicePortType
     */
    @WebEndpoint(name = "VPNCentrexServiceSOAP11port_http")
    public VPNCentrexServicePortType getVPNCentrexServiceSOAP11PortHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.huawei.com/ngin/vpncentrex/moservice", "VPNCentrexServiceSOAP11port_http"), VPNCentrexServicePortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VPNCENTREXSERVICE_EXCEPTION!= null) {
            throw VPNCENTREXSERVICE_EXCEPTION;
        }
        return VPNCENTREXSERVICE_WSDL_LOCATION;
    }

}
