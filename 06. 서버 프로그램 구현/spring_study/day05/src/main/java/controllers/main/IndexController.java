package controllers.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class IndexController { //메인페이지
    @GetMapping("/")
    public String index(Model model){
        //배열또는 컬렉션 사용 - 하나만 써도 상관없는데 두가지 사용하는 모습을 보여주기 위해 두가지 사용
        String[] addCss = {"board/form", "board/fileupload"};
        List<String> addScript = Arrays.asList("board/form", "board/fileupload");

        model.addAttribute("addCss", addCss);
        model.addAttribute("addScript", addScript);

        //사이트 제목(맨 위 타이틀)
        model.addAttribute("pageTitle", "메인페이지");

        return "main/index";
    }
}
