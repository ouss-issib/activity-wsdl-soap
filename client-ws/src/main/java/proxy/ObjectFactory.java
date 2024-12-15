
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConversionEuroToDH_QNAME = new QName("http://ws.main.src/", "ConversionEuroToDH");
    private static final QName _ConversionEuroToDHResponse_QNAME = new QName("http://ws.main.src/", "ConversionEuroToDHResponse");
    private static final QName _GetAll_QNAME = new QName("http://ws.main.src/", "getAll");
    private static final QName _GetAllResponse_QNAME = new QName("http://ws.main.src/", "getAllResponse");
    private static final QName _GetCompte_QNAME = new QName("http://ws.main.src/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://ws.main.src/", "getCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEuroToDH }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToDH }
     */
    public ConversionEuroToDH createConversionEuroToDH() {
        return new ConversionEuroToDH();
    }

    /**
     * Create an instance of {@link ConversionEuroToDHResponse }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToDHResponse }
     */
    public ConversionEuroToDHResponse createConversionEuroToDHResponse() {
        return new ConversionEuroToDHResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     * @return
     *     the new instance of {@link GetAll }
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     * @return
     *     the new instance of {@link GetAllResponse }
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.main.src/", name = "ConversionEuroToDH")
    public JAXBElement<ConversionEuroToDH> createConversionEuroToDH(ConversionEuroToDH value) {
        return new JAXBElement<>(_ConversionEuroToDH_QNAME, ConversionEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.main.src/", name = "ConversionEuroToDHResponse")
    public JAXBElement<ConversionEuroToDHResponse> createConversionEuroToDHResponse(ConversionEuroToDHResponse value) {
        return new JAXBElement<>(_ConversionEuroToDHResponse_QNAME, ConversionEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.main.src/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.main.src/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.main.src/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.main.src/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

}
