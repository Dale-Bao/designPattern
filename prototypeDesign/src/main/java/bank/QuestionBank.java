package bank;

import lombok.Data;
import question.AnswerQuestion;
import question.ChoiceQuestion;
import util.Topic;
import util.TopicRandomUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author xueneng on 2020/11/12.
 *         Description:
 */
@Data
public class QuestionBank implements Cloneable {
    /**
     * 考生
     */
    private String candidate;
    /**
     * 学号
     */
    private String number;
    private ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<ChoiceQuestion>();
    private ArrayList<AnswerQuestion> answerQuestionsList = new ArrayList<AnswerQuestion>();
    public QuestionBank append(ChoiceQuestion choiceQuestion){
        choiceQuestionList.add(choiceQuestion);
        return this;
    }
    public QuestionBank append(AnswerQuestion answerQuestion){
        answerQuestionsList.add(answerQuestion);
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        questionBank.choiceQuestionList = (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();
        questionBank.answerQuestionsList = (ArrayList<AnswerQuestion>) answerQuestionsList.clone();
        //题目乱序
        Collections.shuffle(questionBank.choiceQuestionList);
        Collections.shuffle(questionBank.answerQuestionsList);
        //答案乱序
        for (ChoiceQuestion question : questionBank.choiceQuestionList) {
            Topic random = TopicRandomUtil.random(question.getOption(),question.getKey());
            question.setOption(random.getOption());
            question.setKey(random.getKey());
        }
        return questionBank;

    }
    @Override
    public String toString() {

        StringBuilder detail = new StringBuilder("考生：" + candidate + "\r\n" +
                "考号：" + number + "\r\n" +
                "--------------------------------------------\r\n" +
                "一、选择题" + "\r\n\n");

        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(choiceQuestionList.get(idx).getName()).append("\r\n");
            Map<String, String> option = choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()) {
                detail.append(key).append("：").append(option.get(key)).append("\r\n");;
            }
            detail.append("答案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        detail.append("二、问答题" + "\r\n\n");

        for (int idx = 0; idx < answerQuestionsList.size(); idx++) {
            detail.append("第").append(idx + 1).append("题：").append(answerQuestionsList.get(idx).getName()).append("\r\n");
            detail.append("答案：").append(answerQuestionsList.get(idx).getKey()).append("\r\n\n");
        }

        return detail.toString();
    }

}
