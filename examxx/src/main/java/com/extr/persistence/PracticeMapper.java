package com.extr.persistence;

import org.apache.ibatis.annotations.Param;

import com.extr.domain.exam.PracticePaper;

/**
 * @author maskwang
 * @date 2017年3月8日 下午8:40:22
 */
public interface PracticeMapper {

	PracticePaper getPracticePaperByUserID(@Param("userId")int userId);

	void deletePracticePaperByUserId(@Param("userId")int userId);

	void insertPracticePaper(PracticePaper practicePaper);

}
