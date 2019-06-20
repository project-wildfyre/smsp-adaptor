
### Certificates Notes 


## keystore - to prove identity on SSL connection

## 1. Check certificate works

Re: https://www.ssl.com/how-to/create-a-pfx-p12-certificate-file-using-openssl/

Store the private key into privateKey.key (copy)

Store the certificate (endpoint cert only) into certificate.crt

*openssl pkcs12 -export -out certificate.p12 -inkey privateKey.key -in certificate.crt*

then test with 

following https://digital.nhs.uk/services/spine/spine-mini-service-provider-for-personal-demographics-service/stage-1-getting-started-quick-start


## MAC (Only???)

Convert p12 to PEM (maybe mac OSX only) 

*openssl pkcs12 -in certificate.p12 -out smsp.pem -nodes -clcerts*

then use this to test the certificate (this worked on mac OSX)

curl -i -X POST -H "SOAPAction: urn:nhs-itk:services:201005:getNHSNumber-v1-0" -H "content-type: text/xml" -E smsp.pem -k https://192.168.128.11/smsp/pds -d @getNHSNumber.xml

## JAVA KeyStore

Once ok, convert the pem to p12

*keytool -importkeystore -destkeystore keystore.jks -srckeystore certificate.p12 -srcstoretype PKCS12*

## trusted certs store 

Now need to import the servers certificate into the store to trust it

https://stackoverflow.com/questions/32051596/exception-unable-to-validate-certificate-of-the-target-in-spring-mvc

openssl s_client -connect 192.168.128.11:443 < /dev/null | sed -ne '/-BEGIN CERTIFICATE-/,/-END CERTIFICATE-/p' > public.crt

(I used the jdk certificate store)
keytool -import -alias SMSPSRVR -keystore cacerts.jks -file public.crt



### Docker 

In this directory

mvn install 

docker build . -t smsp-adaptor

docker tag smsp-adaptor thorlogic/smsp-adaptor

docker push thorlogic/smsp-adaptor

