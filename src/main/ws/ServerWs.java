package src.main.ws;

import jakarta.xml.ws.Endpoint;

public class ServerWs {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8787/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("The web service is currently deployed on "+url);
    }

}
