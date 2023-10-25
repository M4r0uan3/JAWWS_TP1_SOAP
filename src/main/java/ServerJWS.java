import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:1337/", new BanqueService());
        System.out.println("Web Service Running on port 1337");
    }
}
