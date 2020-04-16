
package br.ifms.tsi.ipli.servidorimc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.ifms.tsi.ipli.servidorimc package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetImc_QNAME = new QName("http://servidorimc.ipli.tsi.ifms.br/", "getImc");
    private final static QName _GetImcResponse_QNAME = new QName("http://servidorimc.ipli.tsi.ifms.br/", "getImcResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.ifms.tsi.ipli.servidorimc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetImc }
     * 
     */
    public GetImc createGetImc() {
        return new GetImc();
    }

    /**
     * Create an instance of {@link GetImcResponse }
     * 
     */
    public GetImcResponse createGetImcResponse() {
        return new GetImcResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorimc.ipli.tsi.ifms.br/", name = "getImc")
    public JAXBElement<GetImc> createGetImc(GetImc value) {
        return new JAXBElement<GetImc>(_GetImc_QNAME, GetImc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImcResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidorimc.ipli.tsi.ifms.br/", name = "getImcResponse")
    public JAXBElement<GetImcResponse> createGetImcResponse(GetImcResponse value) {
        return new JAXBElement<GetImcResponse>(_GetImcResponse_QNAME, GetImcResponse.class, null, value);
    }

}
