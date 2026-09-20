package temp.nativewebapi.application.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import temp.nativewebapi.infra.SignUpMapper;
import temp.nativewebapi.presentation.dto.SignUpDto;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class SignUpServiceImpl implements SignUpService {
    private final SignUpMapper signUpMapper;

    @Override
    @Transactional
    public int signUp(SignUpDto signUpDto) {
        return signUpMapper.insert(signUpDto);
    }
}
