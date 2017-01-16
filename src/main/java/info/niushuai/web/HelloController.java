package info.niushuai.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by niushuai on 12/01/2017.
 */
@RestController
@RequestMapping("info")
public class HelloController {

    @RequestMapping("hello")
    public String index(){
        return "Hello world!";
    }

}
