package com.evcamp.memo.domain.user.entity;

import com.evcamp.memo.domain.user.DTO.SignupRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // JPA가 관리할 수 있는 Entity 클래스 지정
@Getter
@Table(name = "user_tb") // 매핑할 테이블의 이름을 지정
@NoArgsConstructor
public class User {
    // 식별자
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // 이메일
    @Column(nullable = false)
    private String email;
    // 로그인 ID
    @Column(nullable = false)
    private String userName;
    // 비밀번호
    @Column(nullable = false)
    private String password;

    public User(Long id, String eamil, String userName, String password) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public User(SignupRequestDto signupRequestDto) {
        this.email = signupRequestDto.getEmail();
        this.userName = signupRequestDto.getUserName();
        this.password = signupRequestDto.getPassword();
    }
}