package com.ibeans.blog;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by igotavares on 07/08/2018.
 */
@SpringBootApplication
public class BlogApplication {

    @Bean
    public static DozerBeanMapper mapper() {
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.setMappingFiles(Arrays.asList("dozerJdk8Converters.xml"));
        return mapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }


}
