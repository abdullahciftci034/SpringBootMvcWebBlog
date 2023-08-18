<%@ page language="java" contentType="text/html" %>
<%@ taglib uri="/WEB-INF/lib/tablig.tld"  prefix="tablig" %>


<div id="sidebar">
	<jsp:include page="/WEB-INF/layouts/search_layout.jsp" />
   <h3>Sidebar</h3>
   <img src="${initParam.webname}/static/public/images/rose.jpg" alt="" />
   <h3>Archives</h3>
	 

   <p>Mauris ultricies neque nec augue. Aenean vehicula. Ut dictum. Vivamus placerat diam nec velit. Suspendisse ornare. Ut viverra. Mauris sagittis nisl sed ante.</p>
   <div id="navcontainer">
   	<tablig:newslist/>
   </div>
   
 </div>