package com.surt.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.surt.action.Action;

public class MemberRegistFormAction implements Action{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url="/member/regist";
		return url;
	}

}