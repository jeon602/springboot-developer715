// 2024 - 07 - 15 Monday


//psvm: public static void main(String[] args) 메서드 생성
//sout: System.out.println(); 생성
//fori: 기본 for 루프를 생성
//iter: 컬렉션을 반복하는 for-each 루프 생성
//ifn: if (obj == null) 체크를 생성
//inn: if (obj != null) 체크를 생성
//serr: System.err.println();을 생성



//@SpringBootConfiguration : 스프링 부트 관련 설정 annotation  @Configuration을 상속해서 만든 annotation임.

//@ComponentScan : 사용자가 빈을 읽고 등록하는 annotation. @Component 어노테이션을 가진 클래스를 찾아 빈으로 등록하는 역할을
//모든 빈에 component어노테이션만 사용하는게 아님... 다음 용도에 따라 어노테이션을 익혀둘 것.
//@Configuration : 설정 파일 등록
//@Repository  : ORM Mapping
//@Controller, @RestController :  라우터
//@Service : 비지니스 로직


//@EnableAutoConfiguration
// 자동 구성을 활성화하는 어노테이션. 스프링 부트 서버가 실행될 때, 스프링 부트의 메타 파일을 읽고 설정을 자동으로 구성하는 역할을 수행함

//@RestController
//public class TestController{
// @GetMapping("/test")          /test Get요청이 오면 test()메소드 실행
// public String test()}

/*@RestController : 라우터 역할을 함
* 라우터 : HTTP요청과 메소드를 연결하는 장치
* @RestController가 있어야 클라이언트 요청에 맞는 메소드를 실행할 수 있음
* Page 72 .. */