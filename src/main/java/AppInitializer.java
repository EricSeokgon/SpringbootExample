import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Project: SpringbootExample
 * FileName: AppInitializer
 * Date: 2015-12-09
 * Time: 오후 2:11
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class AppInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

}
