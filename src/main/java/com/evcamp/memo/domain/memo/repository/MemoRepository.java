package com.evcamp.memo.domain.memo.repository;

import com.evcamp.memo.domain.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();

    /**
     *
     * @param keyword : 찾고자 하는 특정 키워드
     * 키워드와 '일치'하는 것이 아니라 '포함'되어야 하는 것이기 때문에 '%keyword%'형식으로 작성했고, concat 함수를 통해 JPQL에 적용
     *
     */
    @Query("select m from Memo m where m.contents like concat('%',:keyword,'%') order by m.modifiedAt desc ")
    List<Memo> findAllByKeywordOrderByModifiedAtDesc(@Param("keyword")String keyword);
}
