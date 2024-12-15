
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://ws.main.src/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAll", targetNamespace = "http://ws.main.src/", className = "proxy.GetAll")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "http://ws.main.src/", className = "proxy.GetAllResponse")
    @Action(input = "http://ws.main.src/BanqueService/getAllRequest", output = "http://ws.main.src/BanqueService/getAllResponse")
    public List<Compte> getAll();

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionEuroToDH")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionEuroToDH", targetNamespace = "http://ws.main.src/", className = "proxy.ConversionEuroToDH")
    @ResponseWrapper(localName = "ConversionEuroToDHResponse", targetNamespace = "http://ws.main.src/", className = "proxy.ConversionEuroToDHResponse")
    @Action(input = "http://ws.main.src/BanqueService/ConversionEuroToDHRequest", output = "http://ws.main.src/BanqueService/ConversionEuroToDHResponse")
    public double conversionEuroToDH(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://ws.main.src/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://ws.main.src/", className = "proxy.GetCompteResponse")
    @Action(input = "http://ws.main.src/BanqueService/getCompteRequest", output = "http://ws.main.src/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}