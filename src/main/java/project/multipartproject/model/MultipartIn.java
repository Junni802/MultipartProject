package project.multipartproject.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MultipartIn {

    /**
     * 쿼리 테이블에 맞는 model 객체 생성
     */

    /**
     * 회원 이메일
     */
    private String miMail;

    /**
     * 회원 이미지1
     */
    private String miImage1;

    /**
     * 회원 이미지2
     */
    private String miImage2;

    /**
     * 회원 이미지3
     */
    private String miImage3;

}
