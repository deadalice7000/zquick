package qq.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import qq.service.UserService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserService userService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		//@formatter:off

		
		
		//ZEZWOŁ WSZYSTKIM NA DOSTEP DO "/" oraz "css,js,img", reszta wymaga authenticated
		
			http
				.authorizeRequests()
					.antMatchers("/"
							,"/tutorials"
							,"/search"
							,"/about"
							,"/contact"
							,"/register")
					.permitAll()
					.antMatchers(
							"/css/*",
							"/js/*",
							"/img/*"
							)
					.permitAll()
				.anyRequest()
					.authenticated()
					.and()
				.formLogin()
					.loginPage("/login")
					.defaultSuccessUrl("/")// redirect to page after successfull login
					.permitAll()
					.and()
				.logout()
					.permitAll(); 
			
			//@formatter:on		

	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(userService);

	}

}
