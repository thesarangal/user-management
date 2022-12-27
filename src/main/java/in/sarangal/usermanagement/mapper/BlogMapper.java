package in.sarangal.usermanagement.mapper;

import in.sarangal.usermanagement.dto.BlogRequest;
import in.sarangal.usermanagement.dto.BlogResponse;
import in.sarangal.usermanagement.entity.Blog;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BlogMapper {

    Blog toEntity(BlogRequest request);

    BlogResponse toDto(Blog data);

}
