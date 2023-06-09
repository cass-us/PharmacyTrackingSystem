<%-- 
    Document   : AddPatient
    Created on : Jun 6, 2023, 1:10:19 PM
    Author     : STUDIO 18
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </head>
    
       <nav class="navbar navbar-expand-lg navbar-light bg-secondary">
  <a class="navbar-brand" href="AdminLogin.jsp">| Home |</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
   <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
  <a class="nav-link" href="#"> List of Patients |</a>
    </li>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Records |<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="AddPatient.jsp">Add Patient |</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"> Medication |</a>
      </li>
       </li>
     
    </ul>
  </div>
</nav> 
 </head>
    <body>
      <%
         
      
      %>
            <form action="AddPatient" method="post">
              <div class="form-group row">
               <label for="username" 
                  class="col-md-4 col-form-label text-md-right">Username<font color="red">*</font></label>
                <div class="col-md-6">
                  <input type="text" id="user_name"  class="form-control" placeholder=""
                    name="user_name" value="" >
                    <font  color="red"></font>
                </div>
              </div>
              <div class="form-group row">
                <label for="telephone_number"
                  class="col-md-4 col-form-label text-md-right">Telephone<font color="red">*</font></label>
                <div class="col-md-6">
                  <input type="text" id="telephone_number" class="form-control" placeholder=""
                    name="telephone_number" value="" >
                    <font color="red"> </font>
                </div>
              </div>
                <div class="form-group row">
                <label for="date_of_birth"
                  class="col-md-4 col-form-label text-md-right">Date of Birth<font color="red">*</font></label>
                <div class="col-md-6">
                  <input type="date" id="telephone_number" class="form-control" placeholder=""
                    name="date_of_birth" value="" >
                    <font color="red"> </font>
                </div>
              </div>
              <div class="form-group row">
                <label for="medical_aid"
                  class="col-md-4 col-form-label text-md-right">Medical Aid<font color="red">*</font></label>
                <div class="col-md-6">
                  <input type="text" id="medical_aid" class="form-control" placeholder=""
                    name="medical_aid" value="" >
                    <font color="red"> </font>
                </div>
              </div>
                <div class="form-group row">
                <label for="medical_number"
                  class="col-md-4 col-form-label text-md-right">Medical Number<font color="red">*</font></label>
                <div class="col-md-6">
                  <input type="text" id="medical_number" class="form-control" 
                    name="medical_number" value="" >
                    <font color="red"> </font>
                </div>
                    <div class="col-md-6 offset-md-4"><br>
                <input type="submit" class="btn btn-primary" name="operation" value="Add Patient">
              </div>
            </form>
   
    
       
            
            
            
            
           
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    
</html>
