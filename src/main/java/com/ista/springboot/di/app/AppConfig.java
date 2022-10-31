package com.ista.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ista.springboot.di.app.models.domain.Empleado;

@Configuration
public class AppConfig {

	 @Bean
	    public List<Empleado> registrar(){

	        Empleado e1 = new Empleado("Matius","Vidal","mvidal342@gmail.com","0994240639","Gerente General","https://i.postimg.cc/zfB4vXf9/avatar-m.png");
	        Empleado e2 = new Empleado("Juan","Perez","juan@gmail.com","0984215671","Secretario","https://i.postimg.cc/zfB4vXf9/avatar-m.png");

	        return Arrays.asList(e1,e2);
	    }
}
