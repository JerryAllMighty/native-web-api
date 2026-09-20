package temp.nativewebapi.exception;

import java.time.LocalDateTime;

public class BaseException extends RuntimeException {
    private ErrorCode errorCode;
    private LocalDateTime occuredAt;

    BaseException(ErrorCode errorCode) {
        super(errorCode.getMessage());
    }
}
