package spitter.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spitter.domain.Spitter;
import spitter.service.UserServiceImpl;


/**
 * @author howey
 */
@RestController
public class HomeController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/", produces = "text/html;charset=utf-8")
    public String home() {
        return userService.findOne(28).getName();
    }
}
