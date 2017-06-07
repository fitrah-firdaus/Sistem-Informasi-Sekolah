package com.sisfo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@EnableSwagger2
class CoreApplication{
    @Bean
    fun newsApi()= Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.sisfo.controller"))
            .paths(PathSelectors.any())
            .build()!!
}

fun main(args: Array<String>) {
    SpringApplication.run(CoreApplication::class.java, *args)
}


