package javaCamp.HRMSProject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2//swagger ı başlatan anotasyon
public class HrmsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsProjectApplication.class, args);
	}
	
	
	@Bean
    public Docket api() { //docket tüm apileri gezip dokumantasyon haline getiriyor
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("javaCamp.HRMSProject"))              
          .build();  
        
	}
	
}
