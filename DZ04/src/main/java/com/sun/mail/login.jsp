<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Login Form</title>
  </head>
  <body>
    <h1>Login Form</h1>
    <form method="post" action="loginValidation.jsp">
      <label for="email">Email:</label>
      <input type="email" id="email" name="email" required><br><br>
      <label for="password">Password:</label>
      <input type="password" id="password" name="password" required><br><br>
      <input type="submit" value="Submit">
    </form>

  </body>
</html>