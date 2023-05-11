package com.mysite.springboard.question;

import com.mysite.springboard.answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Entity의 각 프로퍼티들은
 * Table의 컬럼이 됨
 */
@Getter
@Setter
@Entity
public class Question {
    @Id // 기본 키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    // cascade type : 질문 삭제 시 답변 모두 삭제
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
