<%@ page language="java" contentType="text/html" %>
<div id="menucontainer">
   <div id="menu">
     <ul>
       <li><a href="${initParam.webname}" class="current">Home</a></li>
       <li><a href="${initParam.news}">News</a></li>
       <li><a href="${initParam.about}">About Us</a></li>
      <% if (session.getAttribute("user") != null) { %>
        <li><a href="${initParam.AddNews}">Add News</a></li>
      <% } %> 
     </ul>
     
   </div>
 </div>