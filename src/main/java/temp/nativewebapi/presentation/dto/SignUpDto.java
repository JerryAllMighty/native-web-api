package temp.nativewebapi.presentation.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Schema(description = "회원가입 요청 정보")
public record SignUpDto(
        //TODO: 요청과 응답 dto를 같이 쓰는게 마음에 걸리는데 더 나은 선택이 있는지
        @Schema(description = "회원 ID")
        Long memberId,

        @Schema(description = "이메일", example = "test@email.com")
        @NotBlank
        String email,

        @Schema(description = "이메일", example = "test_password")
        @NotBlank
        String password,

        @Schema(description = "이메일", example = "test_name")
        @NotBlank
        @Size(min = 2, max = 12)
        String nickName
) {
}
