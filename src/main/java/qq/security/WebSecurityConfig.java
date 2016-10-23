package qq.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import qq.service.UserService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserService userService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		//@formatter:off
		http
			.authorizeRequests()
				.antMatchers("/"
					,"/tutorials"
					,"/search"
					,"/about"
					,"/contact"
					,"/register",
					"/css/*",
					"/js/*",
					"/img/*")
						.permitAll()
				.antMatchers(
					"/suggestnews",
					"/suggesttutorial")
						.hasRole("MOD")
				.antMatchers(
					"/newsmanager",
					"/tutorialsmanager",
					"/usersmanager",
					"/sendemails")
						.hasRole("ADMIN")
				.antMatchers(
					"/messages",
					"/profile",
					"/logout")
				.authenticated()	
					.and()
				.formLogin()
					.loginPage("/login")
					.defaultSuccessUrl("/")
					.permitAll()
					.and()
				.logout()
					.permitAll(); 
			
			//@formatter:on		
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.userDetailsService(userService).passwordEncoder(passwordEncoder);

	}

}
