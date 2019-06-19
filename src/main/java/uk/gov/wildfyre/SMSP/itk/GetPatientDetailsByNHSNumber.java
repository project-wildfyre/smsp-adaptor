
package uk.gov.wildfyre.SMSP.itk;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import uk.gov.wildfyre.SMSP.HapiProperties;
import uk.hscic.itk.pds.FaultResponse;
import uk.hscic.itk.pds.GetPatientDetailsByNHSNumberV10;
import uk.hscic.itk.pds.GetPatientDetailsByNHSNumberV10Ptt;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2019-06-18T14:05:52.729+01:00
 * Generated source version: 3.3.2
 *
 */
public class GetPatientDetailsByNHSNumber {

    private static final QName SERVICE_NAME = new QName("urn:nhs-itk:ns:201005", "getPatientDetailsByNHSNumber-v1-0");



    public void callService() throws Exception {



        URL wsdlURL = GetPatientDetailsByNHSNumberV10.WSDL_LOCATION;

            File wsdlFile = new File(HapiProperties.getNhsServer());
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(HapiProperties.getNhsServer());
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }


        GetPatientDetailsByNHSNumberV10 ss = new GetPatientDetailsByNHSNumberV10(wsdlURL, SERVICE_NAME);
        GetPatientDetailsByNHSNumberV10Ptt port = ss.getGetPatientDetailsByNHSNumberV10PttPort();

        {
        System.out.println("Invoking getPatientDetailsByNHSNumberV10...");
        uk.hscic.itk.pds.DistributionEnvelopeType _getPatientDetailsByNHSNumberV10_getPatientDetailsByNHSNumberRequestV10 = null;
        try {
            uk.hscic.itk.pds.DistributionEnvelopeType _getPatientDetailsByNHSNumberV10__return = port.getPatientDetailsByNHSNumberV10(_getPatientDetailsByNHSNumberV10_getPatientDetailsByNHSNumberRequestV10);
            System.out.println("getPatientDetailsByNHSNumberV10.result=" + _getPatientDetailsByNHSNumberV10__return);

        } catch (FaultResponse e) {
            System.out.println("Expected exception: faultResponse has occurred.");
            System.out.println(e.toString());
        }

            }

      //  System.exit(0);
    }

}
