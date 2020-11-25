package spitter.web;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Request;


/**
 * @author howey
 */
@RestController
public class HomeController {
    @RequestMapping(value = "/")
    public String home(@RequestParam("id") int id) {
        return id + "";
    }
}
