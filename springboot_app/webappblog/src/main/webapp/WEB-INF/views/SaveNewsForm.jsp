<%@ page language="java" contentType="text/html;"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<mt:index_layout title="News">
	<jsp:attribute name="content">
		 <form action = "${initParam.SaveNews}" method="GET" >
		 	<input class="title" id="title" name="title" placeholder="Title">
		 	<input class="content" id="content" name="content" placeholder="Content">
		 	<button type="submit"> KAYDET</button>
		 </form>
	</jsp:attribute>
</mt:index_layout>
<style>
	input.title{
		width: 90%;
		height: 30px;
		
	}
	input.content{
		margin-top :10px;
		width: 90%;
		min-height: 200px; 
	}
</style>