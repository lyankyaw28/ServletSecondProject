<%@page import="hibernate_example.hb_web_application.UserDao"%>
<jsp:useBean id="obj" class="hibernate_example.hb_web_application.User">
</jsp:useBean>
<jsp:setProperty property="*" name="obj" />

<%
	int i = UserDao.register(obj);
	if (i > 0)
		out.print("You are successfully registered");
%>
