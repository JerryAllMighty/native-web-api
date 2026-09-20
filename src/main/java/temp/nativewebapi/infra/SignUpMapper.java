package temp.nativewebapi.infra;

import org.apache.ibatis.annotations.Mapper;
import temp.nativewebapi.presentation.dto.SignUpDto;

@Mapper
public interface SignUpMapper {
    int insert(SignUpDto signUpDto);
}
