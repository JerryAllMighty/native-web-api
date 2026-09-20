package temp.nativewebapi.exception;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    DUPLICATE_EMAIL_EXCEPTION(HttpStatus.CONFLICT,"mbr-01", "중복된 회원 이메일 주소입니다");

    private final HttpStatus httpStatus;
    private final String businessCode;
    private final String message;
}
