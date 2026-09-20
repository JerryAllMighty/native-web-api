package temp.nativewebapi.presentation.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import temp.nativewebapi.application.service.SignUpService;
import temp.nativewebapi.presentation.dto.SignUpDto;

import java.net.URI;

@RestController
@RequestMapping("/api/v1/sign-up")
@RequiredArgsConstructor
public class SignUpController {
    private final SignUpService signUpService;

    @PostMapping
    public ResponseEntity<HttpStatus> signUp(@RequestBody @Valid SignUpDto signUpDto){
        return ResponseEntity
                .created(URI.create("/api/v1/sign-up/" + signUpService.signUp(signUpDto)))
                .build();
    }
}