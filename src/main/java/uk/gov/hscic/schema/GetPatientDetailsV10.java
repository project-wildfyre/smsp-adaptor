
package uk.gov.hscic.schema;

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
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "getPatientDetails-v1-0", targetNamespace = "urn:nhs-itk:ns:201005", wsdlLocation = "file:/Development/DWP/smsp-adaptor/src/main/xsd/wsdl/PDSMiniServices-v1-0.wsdl")
public class GetPatientDetailsV10
    extends Service
{

    private final static URL GETPATIENTDETAILSV10_WSDL_LOCATION;
    private final static WebServiceException GETPATIENTDETAILSV10_EXCEPTION;
    private final static QName GETPATIENTDETAILSV10_QNAME = new QName("urn:nhs-itk:ns:201005", "getPatientDetails-v1-0");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Development/DWP/smsp-adaptor/src/main/xsd/wsdl/PDSMiniServices-v1-0.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETPATIENTDETAILSV10_WSDL_LOCATION = url;
        GETPATIENTDETAILSV10_EXCEPTION = e;
    }

    public GetPatientDetailsV10() {
        super(__getWsdlLocation(), GETPATIENTDETAILSV10_QNAME);
    }

    public GetPatientDetailsV10(WebServiceFeature... features) {
        super(__getWsdlLocation(), GETPATIENTDETAILSV10_QNAME, features);
    }

    public GetPatientDetailsV10(URL wsdlLocation) {
        super(wsdlLocation, GETPATIENTDETAILSV10_QNAME);
    }

    public GetPatientDetailsV10(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GETPATIENTDETAILSV10_QNAME, features);
    }

    public GetPatientDetailsV10(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetPatientDetailsV10(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GetPatientDetailsV10Ptt
     */
    @WebEndpoint(name = "getPatientDetails-v1-0_pttPort")
    public GetPatientDetailsV10Ptt getGetPatientDetailsV10PttPort() {
        return super.getPort(new QName("urn:nhs-itk:ns:201005", "getPatientDetails-v1-0_pttPort"), GetPatientDetailsV10Ptt.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetPatientDetailsV10Ptt
     */
    @WebEndpoint(name = "getPatientDetails-v1-0_pttPort")
    public GetPatientDetailsV10Ptt getGetPatientDetailsV10PttPort(WebServiceFeature... features) {
        return super.getPort(new QName("urn:nhs-itk:ns:201005", "getPatientDetails-v1-0_pttPort"), GetPatientDetailsV10Ptt.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GETPATIENTDETAILSV10_EXCEPTION!= null) {
            throw GETPATIENTDETAILSV10_EXCEPTION;
        }
        return GETPATIENTDETAILSV10_WSDL_LOCATION;
    }

}
