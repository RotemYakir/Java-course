package app.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import app.core.auth.JwtUtil;
import app.core.filters.AdminAuthorizationFilter;
import app.core.filters.AuthenticationFilter;
import app.core.filters.CompanyAuthorizationFilter;
import app.core.filters.CustomerAuthorizationFilter;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	FilterRegistrationBean<AuthenticationFilter> authenticationFilter(JwtUtil jwtUtil) {
		FilterRegistrationBean<AuthenticationFilter> regBean = new FilterRegistrationBean<>();
		regBean.setFilter(new AuthenticationFilter(jwtUtil));
		regBean.addUrlPatterns("/api/*");
		return regBean;
	}

	@Bean
	FilterRegistrationBean<AdminAuthorizationFilter> adminAuthorization() {
		FilterRegistrationBean<AdminAuthorizationFilter> regBean = new FilterRegistrationBean<>();
		regBean.setFilter(new AdminAuthorizationFilter());
		regBean.addUrlPatterns("/api/admin/*");
		return regBean;
	}

	@Bean
	FilterRegistrationBean<CompanyAuthorizationFilter> companyAuthorization() {
		FilterRegistrationBean<CompanyAuthorizationFilter> regBean = new FilterRegistrationBean<>();
		regBean.setFilter(new CompanyAuthorizationFilter());
		regBean.addUrlPatterns("/api/company/*");
		return regBean;
	}


	@Bean
	FilterRegistrationBean<CustomerAuthorizationFilter> customerAuthorization() {
		FilterRegistrationBean<CustomerAuthorizationFilter> regBean = new FilterRegistrationBean<>();
		regBean.setFilter(new CustomerAuthorizationFilter());
		regBean.addUrlPatterns("/api/customer/*");
		return regBean;
	}

	// for swagger authorization
	@Bean
	OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("title").version("version").description("description"))
				.addSecurityItem(new SecurityRequirement().addList("my security"))
				.components(new Components().addSecuritySchemes("my security",
						new SecurityScheme().name("my security").type(SecurityScheme.Type.HTTP).scheme("bearer")));
	}

}
