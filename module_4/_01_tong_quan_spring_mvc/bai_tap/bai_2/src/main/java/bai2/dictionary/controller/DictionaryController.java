package bai2.dictionary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DictionaryController {
    @GetMapping(value = "/dictionary")
    public String showTrans() {
        return "dictionary";
    }

    @PostMapping(value = "/dictionary")
    public ModelAndView translate(@RequestParam String word) {
        String result = "";
        String[] vn = {"mèo", "chó", "chim", "trường học"};
        String[] eng = {"cat", "dog", "bird", "school"};
        boolean check = false;
        for (int i = 0; i < vn.length; i++) {
            if (word.equals(vn[i])) {
                result = eng[i];
                check = true;
            } else if (word.equals(eng[i])){
                result = vn[i];
                check = true;
            }
            if (check == false) {
                result = "Can't find";
            }
        }
        return new ModelAndView("dictionary", "trans", result);
    }
}
