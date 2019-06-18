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
 * 2019-06-18T14:05:52.988+01:00
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "verifyNHSNumber-v1-0",
                  wsdlLocation = "file:/C:/Development/DWP/smsp-adaptor/src/main/resources/wsdl/PDSMiniServices-v1-0.wsdl",
                  targetNamespace = "urn:nhs-itk:ns:201005")
public class VerifyNHSNumberV10 extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:nhs-itk:ns:201005", "verifyNHSNumber-v1-0");
    public final static QName VerifyNHSNumberV10PttPort = new QName("urn:nhs-itk:ns:201005", "verifyNHSNumber-v1-0_pttPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Development/DWP/smsp-adaptor/src/main/resources/wsdl/PDSMiniServices-v1-0.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(VerifyNHSNumberV10.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Development/DWP/smsp-adaptor/src/main/resources/wsdl/PDSMiniServices-v1-0.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public VerifyNHSNumberV10(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public VerifyNHSNumberV10(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VerifyNHSNumberV10() {
        super(WSDL_LOCATION, SERVICE);
    }

    public VerifyNHSNumberV10(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public VerifyNHSNumberV10(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public VerifyNHSNumberV10(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns VerifyNHSNumberV10Ptt
     */
    @WebEndpoint(name = "verifyNHSNumber-v1-0_pttPort")
    public VerifyNHSNumberV10Ptt getVerifyNHSNumberV10PttPort() {
        return super.getPort(VerifyNHSNumberV10PttPort, VerifyNHSNumberV10Ptt.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VerifyNHSNumberV10Ptt
     */
    @WebEndpoint(name = "verifyNHSNumber-v1-0_pttPort")
    public VerifyNHSNumberV10Ptt getVerifyNHSNumberV10PttPort(WebServiceFeature... features) {
        return super.getPort(VerifyNHSNumberV10PttPort, VerifyNHSNumberV10Ptt.class, features);
    }

}
