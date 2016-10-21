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

		//@formatter:off

		
		
		//ZEZWOŁ WSZYSTKIM NA DOSTEP DO "/" oraz "css,js,img", reszta wymaga authenticated
		
			http
				.authorizeRequests()
					.antMatchers("/"
							,"/tutorials"
							,"/search"
							,"/about"
							,"/contact")
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
					.defaultSuccessUrl("/")
					.permitAll(); // redirect to page after successfull logIN KURWA
			
			//@formatter:on		

	}

}
