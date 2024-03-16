
   <%
      String email = request.getParameter("email");
      String password = request.getParameter("password");
      String confirmPassword = request.getParameter("confirm-password");

      boolean isValid = true;
      if (email == null || email.trim().equals("")) {
        isValid = false;
      }
      if (password == null || password.trim().equals("")) {
        isValid = false;
      }
      if (confirmPassword == null || confirmPassword.trim().equals("")) {
        isValid = false;
      }
      if (!password.equals(confirmPassword)) {
        isValid = false;
      }

      if (isValid) {
        response.addCookie(new Cookie("email", email));
        response.addCookie(new Cookie("password", password));
        response.addCookie(new Cookie("confirmPassword", confirmPassword));

        response.sendRedirect("login.jsp");
      } else {
        out.println("<p>Passwords not matching.</p>");
      }
   %>