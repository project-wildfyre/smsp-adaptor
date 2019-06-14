
package uk.gov.hscic.schema;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebService(name = "getPatientDetails-v1-0_ptt", targetNamespace = "urn:nhs-itk:ns:201005")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetPatientDetailsV10Ptt {


    /**
     * 
     * @param getPatientDetailsRequestV10
     * @return
     *     returns uk.gov.hscic.schema.DistributionEnvelopeType
     * @throws FaultResponse
     */
    @WebMethod(operationName = "getPatientDetails-v1-0", action = "urn:nhs-itk:services:201005:getPatientDetails-v1-0")
    @WebResult(name = "DistributionEnvelope", targetNamespace = "urn:nhs-itk:ns:201005", partName = "getPatientDetailsResponse-v1-0")
    public DistributionEnvelopeType getPatientDetailsV10(
        @WebParam(name = "DistributionEnvelope", targetNamespace = "urn:nhs-itk:ns:201005", partName = "getPatientDetailsRequest-v1-0")
        DistributionEnvelopeType getPatientDetailsRequestV10)
        throws FaultResponse
    ;

}