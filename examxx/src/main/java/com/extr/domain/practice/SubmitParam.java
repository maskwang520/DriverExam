package com.extr.domain.practice;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author maskwang
 * @date 2017年3月3日 下午7:56:19
 * 点击回答提交时候的参数
 */
@XmlRootElement	
public class SubmitParam {
	private int questionId;
	private String answer;
	private String userId;
	private Date submitDate;
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}
	
	
	
}
