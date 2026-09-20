package temp.nativewebapi.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record SignUpDto(
        //TODO: 요청과 응답 dto를 같이 쓰는게 마음에 걸리는데 더 나은 선택이 있는지
        Long memberId,
        @NotBlank
        String email,
        @NotBlank
        String password,
        @NotBlank
        @Size(min = 2, max = 12)
        String nickName
) {
}
