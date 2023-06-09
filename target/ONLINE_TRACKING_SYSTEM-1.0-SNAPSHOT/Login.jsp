<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
 <style>
            body{
              background-image: url("resources/images/f3.jpg")
            }
            
       </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-secondary">
  <a class="navbar-brand" href="Home.jsp
     ">HOME</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">| LOGIN | <span class="sr-only">(current)</span></a>
      </li>
     <li class="nav-item">
        <a class="nav-link" href="#">CONTACT US |</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">ABOUT US |</a>
      </li>
    </ul>
  </div>
</nav>   
    <form action="AdminLogin" method="post">  
   <main class="login-form" method="post" action="/Login">
  <div  class="cotainer">
    <div class="row justify-content-center">
      <div class="col-md-8">
        <div class="card">
          <div class="card-header">
           
            <h6 style="color: green;"></h6>
          </div>
          <div class="card-body">
            <form action="" method="post">
              <div class="form-group row">
                <label for="username" 
                  class="col-md-4 col-form-label text-md-right">Username<font color="red">*</font></label>
                <div class="col-md-6">
                  <input type="text" id="username"  class="form-control" placeholder="Enter username"
                    name="username" value=""  required>
                    <font  color="red"></font>
                </div>
              </div>
              <div class="form-group row">
                <label for="password"
                  class="col-md-4 col-form-label text-md-right">Password<font color="red">*</font></label>
                <div class="col-md-6">
                  <input type="password" id="password" class="form-control" placeholder="Enter Password"
                    name="password" value="" required >
                    <font color="red"> </font>
                </div>
              </div>
              <div class="col-md-6 offset-md-4">
                <input type="submit" class="btn btn-primary" name="operation" value="Login">
                <a href="#" class="btn btn-link"> Forgot Your Password? </a>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  </main>
    </form>  
<!--<p align="center"
<main class="login-form" method="post" action="/Login">
  <div  class="cotainer">
    <div class="row justify-content-center">
      <div class="col-md-8">
        <div class="card">
          <div class="card-header">
           
            <h6 style="color: green;"></h6>
          </div>
          <div class="card-body">
            <form action="" method="post">
              <div class="form-group row">
                <label for="username" 
                  class="col-md-4 col-form-label text-md-right">Username<font color="red">*</font></label>
                <div class="col-md-6">
                  <input type="text" id="login"  class="form-control" placeholder="Enter username"
                    name="login" value="" >
                    <font  color="red"></font>
                </div>
              </div>
              <div class="form-group row">
                <label for="password"
                  class="col-md-4 col-form-label text-md-right">Password<font color="red">*</font></label>
                <div class="col-md-6">
                  <input type="password" id="password" class="form-control" placeholder="Enter Password"
                    name="password" value="" >
                    <font color="red"> </font>
                </div>
              </div>
              <div class="col-md-6 offset-md-4">
                <input type="submit" class="btn btn-primary" name="operation" value="Login">
                <a href="AdminLogin.jsp" class="btn btn-link"> Forgot Your Password? </a>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  </main>
</p>-->

<footer style="background: rgb(23,56,89);" class="page-footer font-small blue"> 
   Copyright 
  <div class="footer-copyright text-center py-3">© 2023 Copyright:</div>
 </footer>
  </div>
 

 
</body>
</html>
</body>
</html>