
package br.ifms.tsi.ipli.servidorimc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ImcService", targetNamespace = "http://servidorimc.ipli.tsi.ifms.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ImcService {


    /**
     * 
     * @param altura
     * @param peso
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getImc", targetNamespace = "http://servidorimc.ipli.tsi.ifms.br/", className = "br.ifms.tsi.ipli.servidorimc.GetImc")
    @ResponseWrapper(localName = "getImcResponse", targetNamespace = "http://servidorimc.ipli.tsi.ifms.br/", className = "br.ifms.tsi.ipli.servidorimc.GetImcResponse")
    @Action(input = "http://servidorimc.ipli.tsi.ifms.br/ImcService/getImcRequest", output = "http://servidorimc.ipli.tsi.ifms.br/ImcService/getImcResponse")
    public double getImc(
        @WebParam(name = "altura", targetNamespace = "")
        double altura,
        @WebParam(name = "peso", targetNamespace = "")
        double peso);

}
