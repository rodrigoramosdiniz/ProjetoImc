
package br.ifms.tsi.ipli.servidorimc;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ImcServiceService", targetNamespace = "http://servidorimc.ipli.tsi.ifms.br/", wsdlLocation = "http://localhost:7000/Imsc?WSDL")
public class ImcServiceService
    extends Service
{

    private final static URL IMCSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException IMCSERVICESERVICE_EXCEPTION;
    private final static QName IMCSERVICESERVICE_QNAME = new QName("http://servidorimc.ipli.tsi.ifms.br/", "ImcServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7000/Imsc?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IMCSERVICESERVICE_WSDL_LOCATION = url;
        IMCSERVICESERVICE_EXCEPTION = e;
    }

    public ImcServiceService() {
        super(__getWsdlLocation(), IMCSERVICESERVICE_QNAME);
    }

    public ImcServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IMCSERVICESERVICE_QNAME, features);
    }

    public ImcServiceService(URL wsdlLocation) {
        super(wsdlLocation, IMCSERVICESERVICE_QNAME);
    }

    public ImcServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IMCSERVICESERVICE_QNAME, features);
    }

    public ImcServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImcServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ImcService
     */
    @WebEndpoint(name = "ImcServicePort")
    public ImcService getImcServicePort() {
        return super.getPort(new QName("http://servidorimc.ipli.tsi.ifms.br/", "ImcServicePort"), ImcService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImcService
     */
    @WebEndpoint(name = "ImcServicePort")
    public ImcService getImcServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servidorimc.ipli.tsi.ifms.br/", "ImcServicePort"), ImcService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IMCSERVICESERVICE_EXCEPTION!= null) {
            throw IMCSERVICESERVICE_EXCEPTION;
        }
        return IMCSERVICESERVICE_WSDL_LOCATION;
    }

}
