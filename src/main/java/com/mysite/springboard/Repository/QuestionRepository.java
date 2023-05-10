package com.mysite.springboard.Repository;

import com.mysite.springboard.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository를 상속할 때는 제네릭스 타입으로 <repository 대상이 되는 엔티티 타입, 해당 엔티티의 Pk 타입> 지정
 */
public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
