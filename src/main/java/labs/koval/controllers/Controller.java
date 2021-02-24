package labs.koval.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class Controller {

    @RequestMapping(path = "/test")
    public ResponseEntity<?> testMethod(@RequestParam(value = "id", defaultValue = "0") String id){
        System.out.println("Test start id: " + id);
        return ResponseEntity.ok("OK");
    }

}
