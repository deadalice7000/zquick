	package qq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public UrlBasedViewResolver tilesViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setViewClass(TilesView.class);

		return resolver;
	}

	@Bean
	public TilesConfigurer tilesCoenfigurer() {
		TilesConfigurer configurer = new TilesConfigurer();
		String[] defs = { "/WEB-INF/tiles.xml" };
		configurer.setDefinitions(defs);
		
		return configurer;

	}
	
	@Bean
	public PasswordEncoder getEncoder(){
		
		return new BCryptPasswordEncoder();
	}
	

}
