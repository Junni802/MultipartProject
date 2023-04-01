package project.multipartproject.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.multipartproject.model.MultipartIn;
import project.multipartproject.service.MultipartService;

@RestController
@Controller
@RequiredArgsConstructor
@RequestMapping("/join")
public class MultipartController {

    private final MultipartService multipartService;

    @PostMapping("/test1/input")
    public void multipartPRoject(MultipartIn multipartIn) {
        multipartService.saveMultipart(multipartIn);
    }

}
