package com.evcamp.memo.DTO;

import com.evcamp.memo.entity.Memo;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemoResponseDto {
    private Long id;
    private String username;
    private String contents;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public MemoResponseDto(Memo saveMemo) {
        this.id = saveMemo.getId();
        this.username = saveMemo.getUsername();
        this.contents = saveMemo.getContents();
        this.createdAt = saveMemo.getCreatedAt();
        this.modifiedAt = saveMemo.getModifiedAt();
    }
}