package uk.hscic.itk.pds;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-06-18T14:05:53.052+01:00
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "getPatientDetailsByNHSNumber-v1-0",
                  wsdlLocation = "wsdl/PDSMiniServices-v1-0.wsdl",
                  targetNamespace = "urn:nhs-itk:ns:201005")
public class GetPatientDetailsByNHSNumberV10 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:nhs-itk:ns:201005", "getPatientDetailsByNHSNumber-v1-0");
    public final static QName GetPatientDetailsByNHSNumberV10PttPort = new QName("urn:nhs-itk:ns:201005", "getPatientDetailsByNHSNumber-v1-0_pttPort");
    static {
        URL url = null;
        try {
            url = new URL("wsdl/PDSMiniServices-v1-0.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GetPatientDetailsByNHSNumberV10.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "wsdl/PDSMiniServices-v1-0.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GetPatientDetailsByNHSNumberV10(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetPatientDetailsByNHSNumberV10(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetPatientDetailsByNHSNumberV10() {
        super(WSDL_LOCATION, SERVICE);
    }

    public GetPatientDetailsByNHSNumberV10(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GetPatientDetailsByNHSNumberV10(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GetPatientDetailsByNHSNumberV10(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns GetPatientDetailsByNHSNumberV10Ptt
     */
    @WebEndpoint(name = "getPatientDetailsByNHSNumber-v1-0_pttPort")
    public GetPatientDetailsByNHSNumberV10Ptt getGetPatientDetailsByNHSNumberV10PttPort() {
        return super.getPort(GetPatientDetailsByNHSNumberV10PttPort, GetPatientDetailsByNHSNumberV10Ptt.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetPatientDetailsByNHSNumberV10Ptt
     */
    @WebEndpoint(name = "getPatientDetailsByNHSNumber-v1-0_pttPort")
    public GetPatientDetailsByNHSNumberV10Ptt getGetPatientDetailsByNHSNumberV10PttPort(WebServiceFeature... features) {
        return super.getPort(GetPatientDetailsByNHSNumberV10PttPort, GetPatientDetailsByNHSNumberV10Ptt.class, features);
    }

}
