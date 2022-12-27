package in.sarangal.usermanagement.usecase;

import in.sarangal.usermanagement.dto.BlogRequest;
import in.sarangal.usermanagement.dto.BlogResponse;
import in.sarangal.usermanagement.entity.Blog;
import in.sarangal.usermanagement.mapper.BlogMapper;
import in.sarangal.usermanagement.repository.BlogRepository;
import in.sarangal.usermanagement.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository repository;

    @Autowired
    private BlogMapper mapper;

    /**
     * Create a blog
     *
     * @param request Combination of Title and Content
     */
    @Override
    public BlogResponse create(BlogRequest request) {
        Blog blog = mapper.toEntity(request);
        Blog record = repository.save(blog);
        return mapper.toDto(record);
    }

    /**
     * @return List of {@link Blog}
     */
    @Override
    public List<Blog> getBlogs() {
        return null;
    }
}
