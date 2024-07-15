//자바의 main()메소드와 같은 역할
//@SpringBootApplication을 추가하면 스프링 부트 사용에 필요한 기본설정을 해줌
//@SpringBootApplication

package me.heeyeon.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDeveloperApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }
}

//@SpringBootApplication //스프링 부트 관련 설정
//@Filter (type =filerType.CUSTOM) //사용자가 등록한 빈을 읽고 등록
//@EnableAutoConfiguration : 자동으로 들록된 빈을 읽고 등록