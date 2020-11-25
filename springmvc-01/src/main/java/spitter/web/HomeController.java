package spitter.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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
