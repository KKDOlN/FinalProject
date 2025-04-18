package com.house.jachui.member.model.service;

import java.util.List;

import com.house.jachui.member.dto.MemberLoginRequest;
import com.house.jachui.member.dto.SignupJachuiRequest;
import com.house.jachui.member.dto.SignupRealtorRequest;
import com.house.jachui.member.dto.UpdateRealtorRequest;
import com.house.jachui.member.dto.UpdateRequest;
import com.house.jachui.member.model.vo.Member;

public interface MemberService {

    // 자취생 회원가입
    boolean signupJachui(SignupJachuiRequest request);

    // 공인중개사 회원가입
    int signupRealtor(SignupRealtorRequest request);

    // 로그인
    Member selectOneByLogin(MemberLoginRequest member);

    // 자취생/공인중개사 상세 조회 (마이페이지용)
    Member selectRealtorById(String userId);

    // 아이디 찾기 - 입력 정보와 일치하는 아이디 존재 여부
    Member selectFindId(Member member);

    // 아이디 찾기 결과 - 일치하는 아이디 목록 반환
    List<Member> selectFoundId(Member member);

    // 비밀번호 재설정
    int updateResetPw(Member member);

    // 회원정보 수정
    int updateMember(UpdateRequest member);

    
    int deleteMember(String userId);

    // 비밀번호 확인 (회원탈퇴 시)
    boolean checkPw(String userId, String userPw);

	int updateRealtor(UpdateRealtorRequest realtor);

	Member selectMemberById(String userId);
	
}
