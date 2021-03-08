package luiznux.learning.microservices.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
@Slf4j
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClient(@PathVariable Long id){

        try {
            Client client = clientService.getClient(id);
            return ResponseEntity.ok(client);

        } catch (ClientNotFoundException e) {
            log.error("client not found",e);
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<HttpStatus> createClient(@RequestBody Client client){
       clientService.createClient(client);
       return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
