<%
  Cookie cookieEmail = new Cookie("email", "");
  cookieEmail.setMaxAge(0);
  response.addCookie(cookieEmail);

  Cookie cookiePassword = new Cookie("password", "");
  cookiePassword.setMaxAge(0);
  response.addCookie(cookiePassword);
  response.sendRedirect("index.jsp");
%>