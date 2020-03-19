package com.teach.me.app.Service;

import com.teach.me.app.Model.Question;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface QuestionService {

    /**
     *
     * @param question
     */
     void insertQuestion(Question question);

    /**
     *
     * @return
     */
     List<Question> getAllQuestions();

    /**
     *
     * @param id
     * @return
     */
     Optional<Question> getQuestionById(int id);

     List<Question> getAllQuestionByTestId(int testId);
}
