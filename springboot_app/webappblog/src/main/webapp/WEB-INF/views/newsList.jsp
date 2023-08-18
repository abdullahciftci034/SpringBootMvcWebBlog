<%@ page language="java" contentType="text/html;"%>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<mt:index_layout title="News">
    <jsp:attribute name="content">
        <ul>
            <c:forEach var="newsList" items="${newsLists}">
                <li> 
                    <h4><a href="${initParam.newsById}/${newsList.id}">${newsList.title}</a></h4>
                    <p>${newsList.content}</p>
                </li>
            </c:forEach>
        </ul>
    </jsp:attribute>
</mt:index_layout>
