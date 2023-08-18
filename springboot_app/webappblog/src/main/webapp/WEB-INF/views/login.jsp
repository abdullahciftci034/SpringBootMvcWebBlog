<%@ page language="java" contentType="text/html;" %>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<mt:index_layout title="login">
	<jsp:attribute name="content">
		<c:choose>
	        <c:when test="${user.id == null }">
            	<link href='${initParam.webname}/static/public/css/login.css' rel='stylesheet' type='text/css'>
				<div class="login logins">
				  <h2 class="active logins"> sign in </h2>
				  <h2 class="nonactive logins"> sign up </h2>
				  <form class="logins" method="GET" action="${initParam.userlogin}">
				    <input type="text" class="text logins" name="email">
				     <span class="logins">username</span>
				    <br>
				    <br>
				    <input type="password" class="text logins" name="password">
				    <span class="logins">password</span>
				    <br>
				    <input type="checkbox" id="checkbox-1-1" class="custom-checkbox logins" />
				    <label for="checkbox-1-1" class="logins">Keep me Signed in</label>
				    <button type="submit" class="signin logins">
				      Sign In
				    </button>
				    <hr>
				    <a href="#" class="logins">Forgot Password?</a>
				  </form>
				</div>
	        </c:when>
	        <c:otherwise>
	            <p>Zaten oturum actiniz.</p>
	        </c:otherwise>
	    </c:choose>
	</jsp:attribute>
</mt:index_layout>