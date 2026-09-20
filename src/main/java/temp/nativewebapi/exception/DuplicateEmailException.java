package temp.nativewebapi.exception;

public class DuplicateEmailException extends BaseException {
    public DuplicateEmailException() {
        super(ErrorCode.DUPLICATE_EMAIL_EXCEPTION);
    }
}
