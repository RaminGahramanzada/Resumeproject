<%@ page import="com.company.dao.inter.UserDaoInter" %>
<%@ page import="com.company.main.Context" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 4/9/2023
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="assets/js/login.js"></script>
    <link rel="stylesheet" href="assets/css/login.css">

    <title>Login Page</title>
</head>
<body>
<%

%>
<form class="form-signin" action="#" method="post">
    <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
    <label for="inputEmail" class="sr-only">Email address</label>
    <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
    <div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="remember-me"> Remember me
        </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    <button class="btn btn-lg btn-secondary btn-block" id="show-signup">Sign up</button>
</form>

<form class="form-signup" action="#" method="post">
    <h2 class="h4 mb-4 font-weight-normal">Don't have an account? Sign up</h2>
    <label for="inputName" class="sr-only">Name</label>
    <input type="text" id="inputName" class="form-control mb-2" placeholder="Name" required>
    <label for="inputSignupEmail" class="sr-only">Email address</label>
    <input type="email" id="inputSignupEmail" class="form-control mb-2" placeholder="Email address" required>
    <label for="inputSignupPassword" class="sr-only">Password</label>
    <input type="password" id="inputSignupPassword" class="form-control mb-2" placeholder="Password" required>
    <label for="inputSignupPassword2" class="sr-only">Confirm Password</label>
    <input type="password" id="inputSignupPassword2" class="form-control mb-2" placeholder="Confirm Password" required>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
</form>

<script>
    $(document).ready(function() {
        $('.form-signup').hide(); // hide the sign up form initially

        $('#show-signup').click(function() {
            $('.form-signup').show(); // show the sign up form when button is clicked
        });
    });
</script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>

</body>
</html>
