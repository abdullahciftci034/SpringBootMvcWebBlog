<%@ page language="java" contentType="text/html;"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<mt:index_layout title="Merhaba">
	<jsp:attribute name="content">
		Java spring ile web page yaptik ve dinamic ve guzel uygulama oldu.<br/>
		mail:abdullahciftci034<br/>
		password:abdullah123<br/>	
	  	<c:choose>
	        <c:when test="${user.id != null}">
	            <p>oturum acildi</p>
	            <p>${user.name} , ${user.email} , ${user.password} </p>
	        </c:when>
	        <c:otherwise>
	            <p>oturum yok</p>
	        </c:otherwise>
	    </c:choose>
	
	</jsp:attribute>
</mt:index_layout>