package in.sarangal.usermanagement.controller;

import in.sarangal.usermanagement.dto.BlogRequest;
import in.sarangal.usermanagement.dto.BlogResponse;
import in.sarangal.usermanagement.dto.Response;
import in.sarangal.usermanagement.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/blog")
public class BlogController {

    @Autowired
    private BlogService service;

    /**
     * Add Blog
     *
     * @param requestDto Request Data Object
     */
    @PostMapping(value = "/create")
    public ResponseEntity<Response<BlogResponse>> create(
            @RequestBody BlogRequest requestDto) {

        // Save Record
        BlogResponse response = service.create(requestDto);

        return new ResponseEntity<>(new Response<>(true, response), HttpStatus.CREATED);
    }

}
