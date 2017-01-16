package info.niushuai.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by niushuai on 12/01/2017.
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("index")
    public String index(ModelMap map){
        map.addAttribute("host","http://www.baidu.com");
        return "index";
    }

}
