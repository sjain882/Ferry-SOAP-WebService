
package ferry;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ferry package. 
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

    private final static QName _AddFerry_QNAME = new QName("http://ferry/", "addFerry");
    private final static QName _AddFerryResponse_QNAME = new QName("http://ferry/", "addFerryResponse");
    private final static QName _AddPort_QNAME = new QName("http://ferry/", "addPort");
    private final static QName _AddPortResponse_QNAME = new QName("http://ferry/", "addPortResponse");
    private final static QName _CreateFerry_QNAME = new QName("http://ferry/", "createFerry");
    private final static QName _CreateFerryResponse_QNAME = new QName("http://ferry/", "createFerryResponse");
    private final static QName _CreatePort_QNAME = new QName("http://ferry/", "createPort");
    private final static QName _CreatePortResponse_QNAME = new QName("http://ferry/", "createPortResponse");
    private final static QName _DoesFerryServiceGoToPort_QNAME = new QName("http://ferry/", "doesFerryServiceGoToPort");
    private final static QName _DoesFerryServiceGoToPortResponse_QNAME = new QName("http://ferry/", "doesFerryServiceGoToPortResponse");
    private final static QName _FerryExistsWithID_QNAME = new QName("http://ferry/", "ferryExistsWithID");
    private final static QName _FerryExistsWithIDResponse_QNAME = new QName("http://ferry/", "ferryExistsWithIDResponse");
    private final static QName _GetAllFerryServicesByPortID_QNAME = new QName("http://ferry/", "getAllFerryServicesByPortID");
    private final static QName _GetAllFerryServicesByPortIDAsString_QNAME = new QName("http://ferry/", "getAllFerryServicesByPortIDAsString");
    private final static QName _GetAllFerryServicesByPortIDAsStringResponse_QNAME = new QName("http://ferry/", "getAllFerryServicesByPortIDAsStringResponse");
    private final static QName _GetAllFerryServicesByPortIDResponse_QNAME = new QName("http://ferry/", "getAllFerryServicesByPortIDResponse");
    private final static QName _GetFerryByID_QNAME = new QName("http://ferry/", "getFerryByID");
    private final static QName _GetFerryByIDResponse_QNAME = new QName("http://ferry/", "getFerryByIDResponse");
    private final static QName _GetPortByID_QNAME = new QName("http://ferry/", "getPortByID");
    private final static QName _GetPortByIDResponse_QNAME = new QName("http://ferry/", "getPortByIDResponse");
    private final static QName _PortExistsWithID_QNAME = new QName("http://ferry/", "portExistsWithID");
    private final static QName _PortExistsWithIDResponse_QNAME = new QName("http://ferry/", "portExistsWithIDResponse");
    private final static QName _RemoveFerryServiceByID_QNAME = new QName("http://ferry/", "removeFerryServiceByID");
    private final static QName _RemoveFerryServiceByIDResponse_QNAME = new QName("http://ferry/", "removeFerryServiceByIDResponse");
    private final static QName _SetFerryDestinationPort_QNAME = new QName("http://ferry/", "setFerryDestinationPort");
    private final static QName _SetFerryDestinationPortResponse_QNAME = new QName("http://ferry/", "setFerryDestinationPortResponse");
    private final static QName _SetFerrySourcePort_QNAME = new QName("http://ferry/", "setFerrySourcePort");
    private final static QName _SetFerrySourcePortResponse_QNAME = new QName("http://ferry/", "setFerrySourcePortResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ferry
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddFerry }
     * 
     */
    public AddFerry createAddFerry() {
        return new AddFerry();
    }

    /**
     * Create an instance of {@link AddFerryResponse }
     * 
     */
    public AddFerryResponse createAddFerryResponse() {
        return new AddFerryResponse();
    }

    /**
     * Create an instance of {@link AddPort }
     * 
     */
    public AddPort createAddPort() {
        return new AddPort();
    }

    /**
     * Create an instance of {@link AddPortResponse }
     * 
     */
    public AddPortResponse createAddPortResponse() {
        return new AddPortResponse();
    }

    /**
     * Create an instance of {@link CreateFerry }
     * 
     */
    public CreateFerry createCreateFerry() {
        return new CreateFerry();
    }

    /**
     * Create an instance of {@link CreateFerryResponse }
     * 
     */
    public CreateFerryResponse createCreateFerryResponse() {
        return new CreateFerryResponse();
    }

    /**
     * Create an instance of {@link CreatePort }
     * 
     */
    public CreatePort createCreatePort() {
        return new CreatePort();
    }

    /**
     * Create an instance of {@link CreatePortResponse }
     * 
     */
    public CreatePortResponse createCreatePortResponse() {
        return new CreatePortResponse();
    }

    /**
     * Create an instance of {@link DoesFerryServiceGoToPort }
     * 
     */
    public DoesFerryServiceGoToPort createDoesFerryServiceGoToPort() {
        return new DoesFerryServiceGoToPort();
    }

    /**
     * Create an instance of {@link DoesFerryServiceGoToPortResponse }
     * 
     */
    public DoesFerryServiceGoToPortResponse createDoesFerryServiceGoToPortResponse() {
        return new DoesFerryServiceGoToPortResponse();
    }

    /**
     * Create an instance of {@link FerryExistsWithID }
     * 
     */
    public FerryExistsWithID createFerryExistsWithID() {
        return new FerryExistsWithID();
    }

    /**
     * Create an instance of {@link FerryExistsWithIDResponse }
     * 
     */
    public FerryExistsWithIDResponse createFerryExistsWithIDResponse() {
        return new FerryExistsWithIDResponse();
    }

    /**
     * Create an instance of {@link GetAllFerryServicesByPortID }
     * 
     */
    public GetAllFerryServicesByPortID createGetAllFerryServicesByPortID() {
        return new GetAllFerryServicesByPortID();
    }

    /**
     * Create an instance of {@link GetAllFerryServicesByPortIDAsString }
     * 
     */
    public GetAllFerryServicesByPortIDAsString createGetAllFerryServicesByPortIDAsString() {
        return new GetAllFerryServicesByPortIDAsString();
    }

    /**
     * Create an instance of {@link GetAllFerryServicesByPortIDAsStringResponse }
     * 
     */
    public GetAllFerryServicesByPortIDAsStringResponse createGetAllFerryServicesByPortIDAsStringResponse() {
        return new GetAllFerryServicesByPortIDAsStringResponse();
    }

    /**
     * Create an instance of {@link GetAllFerryServicesByPortIDResponse }
     * 
     */
    public GetAllFerryServicesByPortIDResponse createGetAllFerryServicesByPortIDResponse() {
        return new GetAllFerryServicesByPortIDResponse();
    }

    /**
     * Create an instance of {@link GetFerryByID }
     * 
     */
    public GetFerryByID createGetFerryByID() {
        return new GetFerryByID();
    }

    /**
     * Create an instance of {@link GetFerryByIDResponse }
     * 
     */
    public GetFerryByIDResponse createGetFerryByIDResponse() {
        return new GetFerryByIDResponse();
    }

    /**
     * Create an instance of {@link GetPortByID }
     * 
     */
    public GetPortByID createGetPortByID() {
        return new GetPortByID();
    }

    /**
     * Create an instance of {@link GetPortByIDResponse }
     * 
     */
    public GetPortByIDResponse createGetPortByIDResponse() {
        return new GetPortByIDResponse();
    }

    /**
     * Create an instance of {@link PortExistsWithID }
     * 
     */
    public PortExistsWithID createPortExistsWithID() {
        return new PortExistsWithID();
    }

    /**
     * Create an instance of {@link PortExistsWithIDResponse }
     * 
     */
    public PortExistsWithIDResponse createPortExistsWithIDResponse() {
        return new PortExistsWithIDResponse();
    }

    /**
     * Create an instance of {@link RemoveFerryServiceByID }
     * 
     */
    public RemoveFerryServiceByID createRemoveFerryServiceByID() {
        return new RemoveFerryServiceByID();
    }

    /**
     * Create an instance of {@link RemoveFerryServiceByIDResponse }
     * 
     */
    public RemoveFerryServiceByIDResponse createRemoveFerryServiceByIDResponse() {
        return new RemoveFerryServiceByIDResponse();
    }

    /**
     * Create an instance of {@link SetFerryDestinationPort }
     * 
     */
    public SetFerryDestinationPort createSetFerryDestinationPort() {
        return new SetFerryDestinationPort();
    }

    /**
     * Create an instance of {@link SetFerryDestinationPortResponse }
     * 
     */
    public SetFerryDestinationPortResponse createSetFerryDestinationPortResponse() {
        return new SetFerryDestinationPortResponse();
    }

    /**
     * Create an instance of {@link SetFerrySourcePort }
     * 
     */
    public SetFerrySourcePort createSetFerrySourcePort() {
        return new SetFerrySourcePort();
    }

    /**
     * Create an instance of {@link SetFerrySourcePortResponse }
     * 
     */
    public SetFerrySourcePortResponse createSetFerrySourcePortResponse() {
        return new SetFerrySourcePortResponse();
    }

    /**
     * Create an instance of {@link Ferry }
     * 
     */
    public Ferry createFerry() {
        return new Ferry();
    }

    /**
     * Create an instance of {@link Port }
     * 
     */
    public Port createPort() {
        return new Port();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFerry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddFerry }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "addFerry")
    public JAXBElement<AddFerry> createAddFerry(AddFerry value) {
        return new JAXBElement<AddFerry>(_AddFerry_QNAME, AddFerry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFerryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddFerryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "addFerryResponse")
    public JAXBElement<AddFerryResponse> createAddFerryResponse(AddFerryResponse value) {
        return new JAXBElement<AddFerryResponse>(_AddFerryResponse_QNAME, AddFerryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPort }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "addPort")
    public JAXBElement<AddPort> createAddPort(AddPort value) {
        return new JAXBElement<AddPort>(_AddPort_QNAME, AddPort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPortResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPortResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "addPortResponse")
    public JAXBElement<AddPortResponse> createAddPortResponse(AddPortResponse value) {
        return new JAXBElement<AddPortResponse>(_AddPortResponse_QNAME, AddPortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFerry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateFerry }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "createFerry")
    public JAXBElement<CreateFerry> createCreateFerry(CreateFerry value) {
        return new JAXBElement<CreateFerry>(_CreateFerry_QNAME, CreateFerry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFerryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateFerryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "createFerryResponse")
    public JAXBElement<CreateFerryResponse> createCreateFerryResponse(CreateFerryResponse value) {
        return new JAXBElement<CreateFerryResponse>(_CreateFerryResponse_QNAME, CreateFerryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreatePort }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "createPort")
    public JAXBElement<CreatePort> createCreatePort(CreatePort value) {
        return new JAXBElement<CreatePort>(_CreatePort_QNAME, CreatePort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePortResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreatePortResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "createPortResponse")
    public JAXBElement<CreatePortResponse> createCreatePortResponse(CreatePortResponse value) {
        return new JAXBElement<CreatePortResponse>(_CreatePortResponse_QNAME, CreatePortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoesFerryServiceGoToPort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoesFerryServiceGoToPort }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "doesFerryServiceGoToPort")
    public JAXBElement<DoesFerryServiceGoToPort> createDoesFerryServiceGoToPort(DoesFerryServiceGoToPort value) {
        return new JAXBElement<DoesFerryServiceGoToPort>(_DoesFerryServiceGoToPort_QNAME, DoesFerryServiceGoToPort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoesFerryServiceGoToPortResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoesFerryServiceGoToPortResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "doesFerryServiceGoToPortResponse")
    public JAXBElement<DoesFerryServiceGoToPortResponse> createDoesFerryServiceGoToPortResponse(DoesFerryServiceGoToPortResponse value) {
        return new JAXBElement<DoesFerryServiceGoToPortResponse>(_DoesFerryServiceGoToPortResponse_QNAME, DoesFerryServiceGoToPortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FerryExistsWithID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FerryExistsWithID }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "ferryExistsWithID")
    public JAXBElement<FerryExistsWithID> createFerryExistsWithID(FerryExistsWithID value) {
        return new JAXBElement<FerryExistsWithID>(_FerryExistsWithID_QNAME, FerryExistsWithID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FerryExistsWithIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FerryExistsWithIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "ferryExistsWithIDResponse")
    public JAXBElement<FerryExistsWithIDResponse> createFerryExistsWithIDResponse(FerryExistsWithIDResponse value) {
        return new JAXBElement<FerryExistsWithIDResponse>(_FerryExistsWithIDResponse_QNAME, FerryExistsWithIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFerryServicesByPortID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllFerryServicesByPortID }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getAllFerryServicesByPortID")
    public JAXBElement<GetAllFerryServicesByPortID> createGetAllFerryServicesByPortID(GetAllFerryServicesByPortID value) {
        return new JAXBElement<GetAllFerryServicesByPortID>(_GetAllFerryServicesByPortID_QNAME, GetAllFerryServicesByPortID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFerryServicesByPortIDAsString }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllFerryServicesByPortIDAsString }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getAllFerryServicesByPortIDAsString")
    public JAXBElement<GetAllFerryServicesByPortIDAsString> createGetAllFerryServicesByPortIDAsString(GetAllFerryServicesByPortIDAsString value) {
        return new JAXBElement<GetAllFerryServicesByPortIDAsString>(_GetAllFerryServicesByPortIDAsString_QNAME, GetAllFerryServicesByPortIDAsString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFerryServicesByPortIDAsStringResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllFerryServicesByPortIDAsStringResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getAllFerryServicesByPortIDAsStringResponse")
    public JAXBElement<GetAllFerryServicesByPortIDAsStringResponse> createGetAllFerryServicesByPortIDAsStringResponse(GetAllFerryServicesByPortIDAsStringResponse value) {
        return new JAXBElement<GetAllFerryServicesByPortIDAsStringResponse>(_GetAllFerryServicesByPortIDAsStringResponse_QNAME, GetAllFerryServicesByPortIDAsStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllFerryServicesByPortIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllFerryServicesByPortIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getAllFerryServicesByPortIDResponse")
    public JAXBElement<GetAllFerryServicesByPortIDResponse> createGetAllFerryServicesByPortIDResponse(GetAllFerryServicesByPortIDResponse value) {
        return new JAXBElement<GetAllFerryServicesByPortIDResponse>(_GetAllFerryServicesByPortIDResponse_QNAME, GetAllFerryServicesByPortIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFerryByID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFerryByID }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getFerryByID")
    public JAXBElement<GetFerryByID> createGetFerryByID(GetFerryByID value) {
        return new JAXBElement<GetFerryByID>(_GetFerryByID_QNAME, GetFerryByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFerryByIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFerryByIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getFerryByIDResponse")
    public JAXBElement<GetFerryByIDResponse> createGetFerryByIDResponse(GetFerryByIDResponse value) {
        return new JAXBElement<GetFerryByIDResponse>(_GetFerryByIDResponse_QNAME, GetFerryByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortByID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPortByID }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getPortByID")
    public JAXBElement<GetPortByID> createGetPortByID(GetPortByID value) {
        return new JAXBElement<GetPortByID>(_GetPortByID_QNAME, GetPortByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPortByIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPortByIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "getPortByIDResponse")
    public JAXBElement<GetPortByIDResponse> createGetPortByIDResponse(GetPortByIDResponse value) {
        return new JAXBElement<GetPortByIDResponse>(_GetPortByIDResponse_QNAME, GetPortByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortExistsWithID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PortExistsWithID }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "portExistsWithID")
    public JAXBElement<PortExistsWithID> createPortExistsWithID(PortExistsWithID value) {
        return new JAXBElement<PortExistsWithID>(_PortExistsWithID_QNAME, PortExistsWithID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortExistsWithIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PortExistsWithIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "portExistsWithIDResponse")
    public JAXBElement<PortExistsWithIDResponse> createPortExistsWithIDResponse(PortExistsWithIDResponse value) {
        return new JAXBElement<PortExistsWithIDResponse>(_PortExistsWithIDResponse_QNAME, PortExistsWithIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFerryServiceByID }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveFerryServiceByID }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "removeFerryServiceByID")
    public JAXBElement<RemoveFerryServiceByID> createRemoveFerryServiceByID(RemoveFerryServiceByID value) {
        return new JAXBElement<RemoveFerryServiceByID>(_RemoveFerryServiceByID_QNAME, RemoveFerryServiceByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveFerryServiceByIDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveFerryServiceByIDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "removeFerryServiceByIDResponse")
    public JAXBElement<RemoveFerryServiceByIDResponse> createRemoveFerryServiceByIDResponse(RemoveFerryServiceByIDResponse value) {
        return new JAXBElement<RemoveFerryServiceByIDResponse>(_RemoveFerryServiceByIDResponse_QNAME, RemoveFerryServiceByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFerryDestinationPort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetFerryDestinationPort }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "setFerryDestinationPort")
    public JAXBElement<SetFerryDestinationPort> createSetFerryDestinationPort(SetFerryDestinationPort value) {
        return new JAXBElement<SetFerryDestinationPort>(_SetFerryDestinationPort_QNAME, SetFerryDestinationPort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFerryDestinationPortResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetFerryDestinationPortResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "setFerryDestinationPortResponse")
    public JAXBElement<SetFerryDestinationPortResponse> createSetFerryDestinationPortResponse(SetFerryDestinationPortResponse value) {
        return new JAXBElement<SetFerryDestinationPortResponse>(_SetFerryDestinationPortResponse_QNAME, SetFerryDestinationPortResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFerrySourcePort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetFerrySourcePort }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "setFerrySourcePort")
    public JAXBElement<SetFerrySourcePort> createSetFerrySourcePort(SetFerrySourcePort value) {
        return new JAXBElement<SetFerrySourcePort>(_SetFerrySourcePort_QNAME, SetFerrySourcePort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFerrySourcePortResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetFerrySourcePortResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ferry/", name = "setFerrySourcePortResponse")
    public JAXBElement<SetFerrySourcePortResponse> createSetFerrySourcePortResponse(SetFerrySourcePortResponse value) {
        return new JAXBElement<SetFerrySourcePortResponse>(_SetFerrySourcePortResponse_QNAME, SetFerrySourcePortResponse.class, null, value);
    }

}
