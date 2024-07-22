package me.heeyeon.springbootdeveloper;

import me.heeyeon.springbootdeveloper.study.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TestController {
    @Autowired
    TestService testService;
    @GetMapping("/test")
    public List<Member> getAllMembers() {
        List<Member> members = testService.getAllMembers();
        return members;
    }
}
//http://localhost:8080/test
//       현재 사용 중인 컴퓨터 ---포트번호 -----경로


//spring-boot-starter-web : spring MVC를 사용해서 Restful 웹 서비스를 개발 시 필요한 의존성 모음
//spring-boot-starter-test : 스프링 애플리케이션을 테스트하기 위해 필요한 의존성 모음
//spring-boot-starter-validation : 유효성 검사를 위해 필요한 의존성 모음
//spring-boot-starter-actuator : 모니터링을 위해 애플리케이션 제공하는 다양한 정보를 제공하기 쉽게 하는 의존성 모음
//spring-boot-starter-data-jpa : ORM을 사용하기 위한 인터페이스의 모음인 jpa를 더 쉽게 사용하기 위한 의존성 모음