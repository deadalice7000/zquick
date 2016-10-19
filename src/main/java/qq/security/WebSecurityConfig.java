package qq.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		//@// @formatter:off

			http
			.authorizeRequests()
				.antMatchers("/","/tutorials","/search","/about","/contact")
				.permitAll()
				.antMatchers("/js/**","/css/**","/img/**")
				.permitAll()
			.anyRequest()
				.authenticated()
				.and()
			.formLogin()
			//login page url
				.loginPage("/login")
			//REDIRECT NA POPRAWNE ZALOGOWANIE	
				.defaultSuccessUrl("/")
				.permitAll();
				
			// @formatter:on
	}

	@Autowired

	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		//@// @formatter:off
			auth.inMemoryAuthentication()
				.withUser("root")
				.password("root")
				.roles("USER");
			
			//@// @formatter:on
	}

}
