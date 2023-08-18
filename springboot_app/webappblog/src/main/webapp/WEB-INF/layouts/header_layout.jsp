<%@ page language="java" contentType="text/html" %>
  <div id="masthead">
    <h1>Abdullah Çiftçi</h1>
    <h2>
    <a href="${initParam.webname}">homepage</a> | 
    <a href="${initParam.contact}">contact</a> | 
    
    
     <% if (session.getAttribute("user") == null) { %>
        <a href="${initParam.login}">login</a>
    <% } else { %>
         <a href="${initParam.exit}">exit</a>
    <% } %>
    
    </h2>
  </div>