package org.lawfirm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authz) -> authz
                // Allow access to "/public" endpoint without authorization
                        .requestMatchers("/myAccount").authenticated()
                    .requestMatchers("/home", "/login", "register").permitAll()
                // Other requests require authentication
                .anyRequest().authenticated()

        )

                .httpBasic(withDefaults());
        return http.build();
    }


}

/*@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        return http
                .authorizeHttpRequests((requests) -> requests
                        .anyRequest().authenticated()
                )
                .formLogin(login -> login
                        .loginPage("/login-page")
                        .permitAll())
                .logout(logout -> logout.permitAll())
                .build();
    }

    // Additional security configuration methods (e.g., user details service)
}*/