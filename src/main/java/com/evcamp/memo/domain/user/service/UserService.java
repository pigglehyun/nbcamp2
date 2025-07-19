package com.evcamp.memo.domain.user.service;

import com.evcamp.memo.domain.user.DTO.LoginResponseDto;
import com.evcamp.memo.domain.user.DTO.UserResponseDto;
import com.evcamp.memo.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public LoginResponseDto login(String userName, String password) {
        // 입력받은 userName, password와 일치하는 Database 조회
        Long index = userRepository.findIdByUserNameAndPassword(userName, password);

        return new LoginResponseDto(index);
    }

    public UserResponseDto findById(Long id) {
        User user = findUserById(id);
        return new UserResponseDto(user.getId(),user.getUserName());
    }

        return userRepository.findById(id);
    }

    private User findUserById(Long id){
        return userRepository.findById(id).orElseThrow( () -> new NoSuchElementException("존재 하지 않는 사용자입니다" + id));
    }
}