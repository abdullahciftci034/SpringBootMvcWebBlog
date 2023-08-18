<!-- home.jsp -->
<%@ page language="java" contentType="text/html;" %>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<mt:index_layout title="Home">
	<jsp:attribute name="content">
		<c:choose>
	        <c:when test="${user.id != null }">
	            <p> oturum acildi </p>
	            <p> ${user.name} , ${user.email} , ${user.password} </p>
	        </c:when>
	        <c:otherwise>
	            <p>oturum yok</p>
	        </c:otherwise>
	    </c:choose>
		<h3>Welcome to <span style="color:#000;">Ruby</span> Template</h3>
		  <p>Mauris ultricies neque nec augue. Aenean vehicula. Ut dictum. Vivamus placerat diam nec velit. Suspendisse ornare. Ut viverra. Mauris sagittis nisl sed ante. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos hymenaeos. </p>
		  <p>Mauris ultricies neque nec augue. Aenean vehicula. Ut dictum. Vivamus placerat diam nec velit. Suspendisse ornare. Ut viverra. Mauris sagittis nisl sed ante. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos hymenaeos. Suspendisse est. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos hymenaeos. Vivamus placerat metus eu urna. Etiam dictum. Aliquam eu dui eu ante euismod tristique. Donec posuere augue varius mi. Nunc erat ligula, ultrices eu, ultrices sed, sodales ut, magna. Mauris ultricies neque nec augue. </p>
		  <blockquote>This template has been tested in Mozilla Firefox and IE7. The page validates as XHTML 1.0 Transitional using valid CSS. It will work in browser widths of 800x600, 1024x768 &amp; 1280x1064. The images used in this template are courtesy of <a href="http://www.sxc.hu/" title="free images">stock xchng</a>. The top navigation menu is from <a href="http://www.13styles.com/" title="free CSS menus">13 Styles</a> and has been amended to suit this template. For more FREE CSS templates visit <a href="http://www.mitchinson.net">my website</a>.</blockquote>
		  <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Suspendisse in odio et nibh volutpat eleifend. Donec rutrum, risus sed auctor malesuada, augue felis placerat neque, vel vestibulum odio erat eget felis. Phasellus id mauris eu urna sagittis posuere. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Mauris elementum elit et ipsum. Cras ornare magna eu felis. Morbi convallis. Nunc fermentum, odio sed ornare ultricies, urna odio egestas sem, vel scelerisque nisi neque vitae lectus. Proin dolor. Vestibulum condimentum urna dignissim arcu. Nullam interdum. Proin lacinia, magna ut scelerisque facilisis, augue sem tempor purus, consequat suscipit tellus ligula et justo. Nam magna. Donec magna sapien, aliquam non, egestas eu, hendrerit nec, quam. Donec commodo auctor lectus. Suspendisse rhoncus. Proin tincidunt euismod nisi. Cras nibh ante, ultrices non, placerat quis, placerat id, est. Suspendisse sed quam volutpat lacus faucibus venenatis.</p>
	
	
	</jsp:attribute>
</mt:index_layout>

      
