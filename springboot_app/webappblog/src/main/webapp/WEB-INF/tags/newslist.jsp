<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<ul>
	<c:forEach  items="${news}" var="p">
		<li><a href="${initParam.newsById}/${p.id}">${p.title}</a></li>
	</c:forEach>
</ul>