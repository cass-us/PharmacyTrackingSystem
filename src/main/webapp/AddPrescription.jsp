<%-- 
    Document   : AddPrescription
    Created on : Jun 8, 2023, 10:18:12 AM
    Author     : STUDIO 18
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
      <form action="#" method="post">  
   <main class="#" method="post" action="#">
  <div  class="cotainer">
    <div class="row justify-content-center">
      <div class="col-md-4">
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
                    name="username" value="" >
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
    </body>
</html>
