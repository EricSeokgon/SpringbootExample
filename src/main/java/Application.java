import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Project: SpringbootExample
 * FileName: Application
 * Date: 2015-10-29
 * Time: 오후 5:17
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */

@ComponentScan
@EnableAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
