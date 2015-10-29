import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project: SpringbootExample
 * FileName: MainController
 * Date: 2015-10-29
 * Time: 오후 5:21
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping
    public @ResponseBody String index() {
        return "Hello Hadeslee Spring Boot!!!";
    }
}
