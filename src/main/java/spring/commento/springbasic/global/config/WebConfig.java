package spring.commento.springbasic.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import spring.commento.springbasic.chapter02.SessionLoginArgumentResolver;

import java.util.List;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
//        resolvers.add(new SessionLoginArgumentResolver());
    }

}
