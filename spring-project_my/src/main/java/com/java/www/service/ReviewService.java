package com.java.www.service;

import java.util.Map;

import com.java.www.dto.Cps_reviewDto;

public interface ReviewService {

	//캠핑리뷰 - 리스트(캠핑장)    전체글가져오기
	Map<String, Object> Cps_selectAll(int page, String re_category, String re_searchWord);
	//캠핑리뷰 - 리스트(캠핑장)    전체글가져오기 - 게시글 검색
	Map<String, Object> Cps_selectsearch(int page, String re_category, String re_searchWord);
	
	//캠핑리뷰 - 뷰(캠핑장)    게시글 1개 가져오기
	Map<String, Object> Cps_selectOne(int cps_bno);
	
	//캠핑리뷰 - 리스트(캠핑장)    게시글 글작성
	void siteWrite(Cps_reviewDto c_redto);
	
	//캠핑리뷰 - 리스트(캠핑장)    게시글 수정
	void site_doUpdate(Cps_reviewDto c_redto);
	
	//캠핑리뷰 - 리스트(캠핑장)    게시글 삭제
	void siteDelete(int cps_bno);

}
