package com.extr.service;

import java.util.List;

import com.extr.domain.exam.PracticePaper;
import com.extr.domain.question.Question;
/**
 * @author maskwang
 * @date 2017年6月8日 下午5:52:44
 */
public interface PracticeService {

	List<Question> getQuestionListByQuestionTypeIdAndReferenceId(int questionTypeId, int fieldId, int limitNum);

	PracticePaper getPracticePaperByUserID(int userid);

	int insertPracticePaper(PracticePaper practicePaper);

}
