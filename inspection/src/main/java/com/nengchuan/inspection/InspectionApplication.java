package com.nengchuan.inspection;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author chenr
 * @date 2021/01/07 10:40
 *
 */
@SpringBootApplication
@EnableSwagger2
@MapperScan("com.nengchuan.**.dao")
public class InspectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(InspectionApplication.class, args);
    }

}
