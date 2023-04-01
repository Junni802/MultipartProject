package project.multipartproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import project.multipartproject.mapper.MultipartMapper;
import project.multipartproject.model.MultipartIn;

@RequiredArgsConstructor
@Service
public class MultipartService {

    /**
     * Mapper 생성자 선언
     */


    private final MultipartMapper multipartMapper;

    /**
     * 파일 생성을 위한 임의 메소스 생성
     * @param multipartIn
     */
    public void saveMultipart(MultipartIn multipartIn) {
        multipartIn.setMiMail("test1");
        multipartIn.setMiImage1("image1");
        multipartIn.setMiImage2("image2");
        multipartIn.setMiImage3("image3");
        multipartMapper.insertMultipart(multipartIn);
    }

}
