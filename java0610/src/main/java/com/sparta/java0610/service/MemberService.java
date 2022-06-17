package com.sparta.java0610.service;


import com.sparta.java0610.dto.RequestCreateMemberDTO;
import com.sparta.java0610.dto.RequestUpdateMemberDTO;
import com.sparta.java0610.dto.ResponseMemberDTO;

import java.util.List;

public interface MemberService {
    long saveMember(RequestCreateMemberDTO requestCreateMemberDTO);
    ResponseMemberDTO findMember(Long id);
    long removeMember(Long id);
    long modifyMember(Long id, RequestUpdateMemberDTO requestUpdateMemberDTO);
    List<ResponseMemberDTO> recommendMember(Long id);
}
