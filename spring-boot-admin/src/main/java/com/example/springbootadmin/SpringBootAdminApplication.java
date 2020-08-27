package com.example.springbootadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class SpringBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminApplication.class, args);
	}

}

//@Configuration
//class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	final static int tokenValidity = 1209600;
//	private final AdminServerProperties adminServer;
//
//	public WebSecurityConfig(AdminServerProperties adminServer) {
//		this.adminServer = adminServer;
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
//		successHandler.setTargetUrlParameter("redirectTo");
//		successHandler.setDefaultTargetUrl(this.adminServer.getContextPath() + "/");
//
//		final String assets = this.adminServer.getContextPath() + "/assets/**";
//		final String login = this.adminServer.getContextPath() + "/login";
//
//		http
//				.authorizeRequests()
//				.antMatchers(assets, login, this.adminServer.getContextPath() + "/").permitAll()
//				.anyRequest().authenticated()
//				.and()
//				.formLogin()
//				.loginPage(this.adminServer.getContextPath() + "/login")
//				.successHandler(successHandler)
//				.and()
//				.logout()
//				.logoutUrl(this.adminServer.getContextPath() + "/logout")
//				.and()
//				.httpBasic()
//				.and()
//				.csrf()
//				.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//				.ignoringRequestMatchers(
//						new AntPathRequestMatcher(this.adminServer.getContextPath() +
//								"/instances", HttpMethod.POST.toString()),
//						new AntPathRequestMatcher(this.adminServer.getContextPath() +
//								"/instances/*", HttpMethod.DELETE.toString()),
//						new AntPathRequestMatcher(this.adminServer.getContextPath() + "/actuator/**"))
//				.and()
//				.rememberMe()
//				.key(UUID.randomUUID().toString())
//				.tokenValiditySeconds(tokenValidity);
//	}
//}