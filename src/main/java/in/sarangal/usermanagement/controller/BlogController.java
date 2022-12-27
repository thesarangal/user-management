package in.sarangal.usermanagement.controller;

import in.sarangal.usermanagement.dto.BlogRequest;
import in.sarangal.usermanagement.dto.BlogResponse;
import in.sarangal.usermanagement.dto.Response;
import in.sarangal.usermanagement.service.BlogService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    @ApiOperation(value = "Add New Blog", response = BlogResponse.class,
            notes = "Returns a blog record as per the id")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Blog Created"),
    }
    )
    @PostMapping(value = "/create")
    public ResponseEntity<Response<BlogResponse>> create(
            @RequestBody BlogRequest requestDto) {

        // Save Record
        BlogResponse response = service.create(requestDto);

        return new ResponseEntity<>(new Response<>(true, response), HttpStatus.CREATED);
    }

}
