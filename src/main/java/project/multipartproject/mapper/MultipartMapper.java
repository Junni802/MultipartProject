package project.multipartproject.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import project.multipartproject.model.MultipartIn;

@Mapper
@Component
public interface MultipartMapper {

    void insertMultipart(MultipartIn multipartIn);

}
