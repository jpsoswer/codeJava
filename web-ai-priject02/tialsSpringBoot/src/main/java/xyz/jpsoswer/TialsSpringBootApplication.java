package xyz.jpsoswer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//开启Spring对Servlet组件的支持
@ServletComponentScan
@SpringBootApplication
public class TialsSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TialsSpringBootApplication.class, args);
    }

}
