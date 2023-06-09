<%-- 
    Document   : Header
    Created on : Jun 2, 2023, 10:12:56 AM
    Author     : STUDIO 18
--%>

<%@page import="za.co.mie.daoImp.CustomerDaoImp"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="za.co.mie.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </head>
    <body>
       <nav class="navbar navbar-expand-lg navbar-light bg-secondary">
  <a class="navbar-brand" href="PatientsList">| List of Patients |</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="#">Records |<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="AddPatient.jsp">Add Patient Prescription |</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"> Medication |</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"> Physician |</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="PrescriptionHistory"> Prescription History |</a>
      </li>
    </ul>
  </div>
</nav> 
    
    <center>
        <div class="container" draggable="#">
            <div id="col" >
               <form>
                   
                
             </form>   
          </div>
         </div>
    </center>  
        
        
        
        
        
        
        
        
        
    </body>
</html>
