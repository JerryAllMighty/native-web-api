package temp.nativewebapi.common;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "temp.nativewebapi.common")
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        // 1. API 문서 기본 정보 설정
        Info info = new Info()
                .title("서비스 API 명세서")
                .version("v1.0.0")
                .description("API 기능 명세 및 테스트를 위한 Swagger 문서입니다.");

        // 2. JWT 또는 Bearer 인증이 필요한 경우 설정 (선택 사항)
        String securityJwtName = "JWT_Token";
        SecurityRequirement securityRequirement = new SecurityRequirement().addList(securityJwtName);
        Components components = new Components().addSecuritySchemes(securityJwtName, new SecurityScheme()
                .name(securityJwtName)
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT"));

        // 3. OpenAPI 객체 빌드 및 반환
        return new OpenAPI()
                .info(info)
                .addSecurityItem(securityRequirement)
                .components(components);
    }
}
