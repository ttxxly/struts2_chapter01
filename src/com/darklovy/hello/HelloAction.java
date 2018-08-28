package com.darklovy.hello;

import com.opensymphony.xwork2.Action;


public class helloaction implements Action{

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("执行了 HelloAction");
		return "success";
	}
	

}
