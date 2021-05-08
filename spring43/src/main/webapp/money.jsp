<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	 String money = request.getParameter("money");
	 String choice = request.getParameter("choice");
	 double money2 = Double.parseDouble(money);
	 if(choice.equals("1")){
		 money2 = money2 * 0.8;
	 }else if(choice.equals("2")){
		 money2 = money2 * 0.9;
	 }else if(choice.equals("3")){
		 money2 = money2 * 1;
	 }else
		 choice = "잘못된 결제수단입니다.";
%>선택하신 결제 수단 <%= choice %> ==> 결제 금액은  <%= (int)money2 %>원