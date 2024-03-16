<%
  String email = request.getParameter("email");
  String password = request.getParameter("password");

  boolean isValid = true;
  Cookie[] cookies = request.getCookies();
  if (cookies != null) {
    for (Cookie cookie : cookies) {
      if (cookie.getName().equals("email")) {
        String savedEmail = cookie.getValue();
        if (savedEmail.equals(email)) {
          for (Cookie cookie2 : cookies) {
            if (cookie2.getName().equals("password")) {
              String savedPassword = cookie2.getValue();
              if (!savedPassword.equals(password)) {
                isValid = false;
              }
              break;
            }
          }
        }
        break;
      }
    }
  }

  if (isValid) {
    response.sendRedirect("home.jsp");
  }
  else{
    out.println("<p>Invalid email or password.</p>");
  }
%>