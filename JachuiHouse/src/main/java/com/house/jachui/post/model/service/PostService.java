package com.house.jachui.post.model.service;

import java.util.List;

import com.house.jachui.post.controller.dto.PostInsertRequest;
import com.house.jachui.post.model.vo.PostVO;

public interface PostService {

	List<PostVO> selectList();//게시글 전체 조회 리스트

	int insertPost(PostInsertRequest post);//게시글 작성

}
	
	

