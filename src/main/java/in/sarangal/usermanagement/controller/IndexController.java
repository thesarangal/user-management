package in.sarangal.usermanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/")
public class IndexController {

    /**
     * Index API
     */
    @GetMapping
    public ResponseEntity<String> create() {
        return new ResponseEntity<>("Welcome to User Management REST APIs", HttpStatus.OK);
    }

}
