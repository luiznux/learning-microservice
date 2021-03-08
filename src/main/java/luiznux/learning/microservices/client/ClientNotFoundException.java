package luiznux.learning.microservices.client;

public class ClientNotFoundException extends Exception{

    public ClientNotFoundException(Long id) {
        super("Client not found id="+id);
    }
}
