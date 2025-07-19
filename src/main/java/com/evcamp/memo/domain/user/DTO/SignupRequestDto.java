package com.evcamp.memo.domain.user.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@AllArgsConstructor
public class SignupRequestDto {

    @Pattern(regexp = "^[a-zA-z0-9]+" + // 영어와 숫자로 이루어진 계정 아이디
            "@ " +                      // @
            "[a-zA-z0-9]+" +            // 영어와 숫자로 이루어진 도메인
            "\\." +                     // .
            "[a-zA-z0-9]+$ ",           // 영어와 숫자로 이루어진 최상위 도메인
            message = "올바른 이메일 형식을 입력해주세요. ( 예 : ssar01@nate.com ) "
    )
    private final String email;

    @NotBlank
    private final String userName;
    // 사용자가 입력한 비밀번호
    @Pattern(regexp = "^(?=.*[a-zA-Z])" +   //영문자
            "(?=.*[0-9])" +                 //숫자
            "(?=.*[!@#$%^&*])" +            //특수문자
            "[a-zA-Z0-9!@#$%^&*]{1,15}$",   //1자 이상 15자 이하
            message = "비밀번호는 숫자, 영문자, 특수 문자(!@#$%^&*)를 포함한 15자 이하여야 합니다.")
    private final String password;

}
