package com.example.hello;

import com.example.hello.ioc.ApplicationContextProvider;
import com.example.hello.ioc.Base64Encode;
import com.example.hello.ioc.Encode;
import com.example.hello.ioc.UrlEncoder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);


        ApplicationContext context = ApplicationContextProvider.getContext();

//        Base64Encode base64Encode = context.getBean(Base64Encode.class);
//        UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);

        Encode encode = context.getBean("urlEncod", Encode.class);
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        String result = encode.encode(url);
        System.out.println(result);

    }


@Configuration
class AppConfig{

    @Bean("Base64Encod")
    public Encode encode(Base64Encode base64Encode){
        return new Encode(base64Encode);
    }

    @Bean("urlEncod")
    public Encode encode(UrlEncoder urlEncoder){
        return new Encode(urlEncoder);
    }


}

}
