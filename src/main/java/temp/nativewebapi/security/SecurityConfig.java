package temp.nativewebapi.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/**").permitAll() // 모든 요청에 대해 인증 없이 접근 허용
                        .anyRequest().authenticated()
                )
                .csrf(csrf -> csrf.disable()); // 테스트 편의를 위해 CSRF 보안도 일시 비활성화

        return http.build();
    }
}
