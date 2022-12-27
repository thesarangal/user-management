package in.sarangal.usermanagement.service;

import in.sarangal.usermanagement.dto.BlogRequest;
import in.sarangal.usermanagement.dto.BlogResponse;
import in.sarangal.usermanagement.entity.Blog;

import java.util.List;

public interface BlogService {

    /**
     * Create a blog
     *
     * @param request Combination of Title and Content
     */
    BlogResponse create(BlogRequest request);

    /**
     * @return List of {@link Blog}
     */
    List<Blog> getBlogs();

}
