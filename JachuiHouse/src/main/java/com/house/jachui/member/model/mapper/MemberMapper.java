package com.house.jachui.member.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.house.jachui.member.dto.MemberLoginRequest;
import com.house.jachui.member.dto.SignupJachuiRequest;
import com.house.jachui.member.dto.SignupRealtorRequest;
import com.house.jachui.member.dto.UpdateRealtorRequest;
import com.house.jachui.member.dto.UpdateRequest;
import com.house.jachui.member.model.vo.Member;

@Mapper
public interface MemberMapper {

	int signupJachui(SignupJachuiRequest request);

	int signupRealtor(SignupRealtorRequest request);

	Member selectOneByLogin(MemberLoginRequest member);

	Member selectRealtorById(String userId);

	Member selectFindId(Member member);

	List<Member> selectFoundId(Member member);

	int updateResetPw(Member member);

	int updateMember(UpdateRequest member);

	int deleteMember(String userId);

	String selectPassword(String userId);

	int updateRealtor(UpdateRealtorRequest realtor);

	Member selectMemberById(String userId);

}