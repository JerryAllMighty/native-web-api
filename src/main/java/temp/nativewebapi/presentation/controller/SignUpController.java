package temp.nativewebapi.presentation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import temp.nativewebapi.application.service.SignUpService;
import temp.nativewebapi.presentation.dto.SignUpDto;

import java.net.URI;

@Tag(name = "Sign Up API", description = "회원가입 관련 API")
@RestController
@RequestMapping("/api/v1/sign-up")
@RequiredArgsConstructor
public class SignUpController {
    private final SignUpService signUpService;

    @Operation(summary = "사용자 등록", description = "이름과 비밀번호, 닉네임을 입력받아 새로운 사용자를 등록한다")
    @PostMapping
    public ResponseEntity<HttpStatus> signUp(@RequestBody @Valid SignUpDto signUpDto) {
        return ResponseEntity
                .created(URI.create("/api/v1/sign-up/" + signUpService.signUp(signUpDto)))
                .build();
    }
}