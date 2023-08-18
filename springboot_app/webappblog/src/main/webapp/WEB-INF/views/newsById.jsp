<%@ page language="java" contentType="text/html;"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<mt:index_layout title="News">
	<jsp:attribute name="content">
		    <h3>${newsler.title}</h3>
		    <p> ${newsler.content}</p>
	</jsp:attribute>
</mt:index_layout>