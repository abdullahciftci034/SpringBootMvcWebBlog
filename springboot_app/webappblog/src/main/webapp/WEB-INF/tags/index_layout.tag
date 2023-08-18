<%@ tag language="java"  pageEncoding="UTF-8" %>
<%@ attribute name="title" required="true" rtexprvalue="true"  %>
<%@ attribute name="content" fragment="true"%>
<!DOCTYPE html>
<html>
	<head>
		<jsp:include page="/WEB-INF/layouts/script_layout.jsp" />
	</head>
	<body>
		<div id="wrap">
		  <jsp:include page="/WEB-INF/layouts/header_layout.jsp" />
		  <!-- header bar -->
		  <jsp:include page="/WEB-INF/layouts/navbar_layout.jsp" />
		  <!-- nav bar --> 
		  <div id="container">
		  <jsp:include page="/WEB-INF/layouts/side_layout.jsp" />

		  <!-- side bar -->
		  <div id="content">
		  	<jsp:invoke fragment="content"></jsp:invoke>
  		  </div>
  		   <!-- Debug output -->
		
		  <!-- section bar -->
		  </div>
		  <jsp:include page="/WEB-INF/layouts/footer_layout.jsp" />
		  <!-- footer bar -->
		</div>
	</body>
</html>