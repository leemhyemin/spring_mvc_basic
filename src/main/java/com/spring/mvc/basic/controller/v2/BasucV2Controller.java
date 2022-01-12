package com.spring.mvc.basic.controller.v2;


import com.sun.prism.d3d.D3DTextureData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BasucV2Controller {
    //@ResponseBody 붙이면 문자열이 그대로 브라우저에게 전달됨
    // 떼면 해당 문자열의 경로에 있는 파일을 열어줌
    @GetMapping("/join")
    public String join() {
        return "/register.html"; // 열어줄 파일의 경로
    }

    @GetMapping("/gugudan")
    public String gugudan() {
        return "/common/gugu3.html";
    }

    @GetMapping("/gugu7")
    public String gugu7() {
        return "/WEB-INF/views/gugu7.jsp";
    }

    //요청 파라미터 읽기 (쿼리 스트링 읽기): 클라이언트라가 서버로 전송한데이터
    // www.abc.com/v2/hello?pet=dog&name=뽀삐 <- pet,name정보 얻어내기
    @GetMapping("/v2/hello")
    public String hello(@RequestParam("p") String pet, int age) { //RequestParam p 라 입력하면 pet으로 되게 ..ㅇㅇ
        System.out.println("/v2/hello 들어옴~! ");
        System.out.println("pet = " + pet);
        System.out.println("age = " + age);
        return "";
    }

    //요청 파라미터가 많을경우 객체를 이용
    //서버에서 클라이언트로 데이터를 보내는 방법
    //Model 객체를 활용
    @PostMapping("/pet/info")
    public String pet(PetInfo petInfo, Model model) {
        System.out.println(petInfo);
        //jsp파일에게 데이터를 전송
        //전달할 데이터가 많으면 여러줄 써도 됌.
        model.addAttribute("pi", petInfo);
        return "/WEB-INF/views/pet-result.jsp";
    }
    //404 에러는 페이즈를 찾을수 없음 .

    //pet-from.jsp를 열어주려면?
    @GetMapping("/pet/form")
    public String petForm() {
        return "/WEB-INF/views/pet-form.jsp";
    }

    //============ 실습문제 ======================//
    /*
            1. 우선 register.jsp를 열어주는 메서드를 작성하세요.
            URL: /user/form입니다.

            2.사용자가 form에 등록한 회원정보를 받아서 처리하는 요청메서드를 작성하세요
            URL: /user/join 입니다.

            3. 2번 요청이 끝난 후 user-result.jsp로 이동시키시고 해당 파일에서는
            회원의 정보를 출력해주세요
            ex) 아이디는 ?? 이고 비밀번호는 ?? 입니다. 이름은 ??이고~~~~

     */

    @GetMapping("/user/form")
    public String userForm() {
        return "/WEB-INF/views/register.jsp";
    }

    @PostMapping("/user/join")
    public String userJoin(User user, Model model) {
        System.out.println("/user/join POST! - " + user);
        model.addAttribute("u", user);
        return "/WEB-INF/views/user-result.jsp";
    }

    /*
    사용자에게 키(cm)랑 몸무게(kg)를 이름 입력받아서 결과페이지에서 bmi를 알려주세요
    ex) XXX님의 bmi지수는 XXX입니다.

    bmi = kg/ (m * m)
    bmi = 무게를 키의제곱으로 나눈값
     */

    //health.jsp 를 열어주려면?
    @GetMapping("/abc")
    public String userP() {
        return "/WEB-INF/views/health.jsp";
    }

}
