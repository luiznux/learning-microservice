package luiznux.learning.microservices.client;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

    private  final ClientRepository clientRepository;


    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    /**
     * Create a new  client
     *
      * @param client necessary data to create a client
     */
    public void createClient(Client client){
        clientRepository.save(client);
    }

    /**
     *
     * @param id id of a client
     *
     * @return the found client
     *
     * @throws ClientNotFoundException
     */
    public Client getClient(Long id) throws ClientNotFoundException {

       Optional<Client> foundClient = clientRepository.findById(id);
        if(foundClient.isPresent()){
            return foundClient.get();
        }

        throw new ClientNotFoundException(id);
    }

}
