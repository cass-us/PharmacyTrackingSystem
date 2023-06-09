
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <style>
            body{
                background-image: url("resources/images/f4.jpg")
                
            }
            h6{
                
                margin:auto 20px;
                padding:auto 20px;
                background-color:grey;
               
            } 
           
         
            
            
        </style>
   <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </head>
    <body>
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
     <center>    
    
         <div class="container-fluid">
            <div class="row-g3">
            <form action="AddPatient" method="post">
                         ---- ADD PATIENT INFORMATION -----
                 <div class="col">  <div class="form-group row"><br>
               <label for="username" 
                      class="col-md-4 col-form-label text-md-right">Username<font color="red">*</font></label>
                <div class="col-md-5">
                  <input type="text" id="user_name"  class="form-control" placeholder=""
                    name="user_name" value="" >
                    <font  color="red"></font>
                </div>
              </div>
              <div class="form-group row">
                <label for="telephone_number"
                  class="col-md-4 col-form-label text-md-right">Telephone<font color="red">*</font></label>
                <div class="col-md-5">
                  <input type="text" id="telephone_number" class="form-control" placeholder=""
                    name="telephone_number" value="" >
                    <font color="red"> </font>
                </div>
              </div>
                <div class="form-group row">
                <label for="date_of_birth"
                  class="col-md-4 col-form-label text-md-right">Date of Birth<font color="red">*</font></label>
                <div class="col-md-5">
                  <input type="date" id="telephone_number" class="form-control" placeholder=""
                    name="date_of_birth" value="" >
                    <font color="red"> </font>
                </div>
              </div>
              <div class="form-group row">
                <label for="medical_aid"
                  class="col-md-4 col-form-label text-md-right">Medical Aid<font color="red">*</font></label>
                <div class="col-md-5">
                  <input type="text" id="medical_aid" class="form-control" placeholder=""
                    name="medical_aid" value="" >
                    <font color="red"> </font>
                </div>
              </div>
                <div class="form-group row">
                <label for="medical_number"
                  class="col-md-4 col-form-label text-md-right">Medical Number<font color="red">*</font></label>
                <div class="col-md-5">
                  <input type="text" id="medical_number" class="form-control" placeholder=""
                    name="medical_number" value="" >
                </div><!-- comment -->
                </div>
   
                    ----- MEDICATION INFORMATION -----
                 
                     <div class="col">  <div class="form-group row"><br>
               <label for="medicationName" 
                      class="col-md-4 col-form-label text-md-right">Medication Name<font color="red">*</font></label>
                <div class="col-md-5">
                  <input type="text" id="user_name"  class="form-control" placeholder=""
                    name="medicationName" value="" >
                    <font  color="red"></font>
                </div>
              </div>
                                  
              <div class="form-group row">
                <label for="sideEffect"
                  class="col-md-4 col-form-label text-md-right">Common Side Effect <font color="red">*</font></label>
                <div class="col-md-5">
                  <input type="text" id="telephone_number" class="form-control" placeholder=""
                    name="sideEffect" value="" >
                    <font color="red"> </font>
                </div>
              </div>
                  
                <p> --MEDICATION FORM-- </p>
                <input type="radio" id="liquid" name="form" value="Liquid">
                <label for="age1">Liquid</label>
                <input type="radio" id="pills" name="form" value="Pills">
                <label for="age2">Pills</label>
                 <input type="radio" id="powder" name="form" value="Powder">
                 <label for="age3">Powder</label><br>
               

                 
                  <p> --MEDICATION UNIT-- </p>
                <input type="radio" id="ml" name="unit" value="MilliLitre">
                <label for="ml">ml</label>
                <input type="radio" id="lit" name="unit" value="Litre">
                <label for="lit">L</label>
                 <input type="radio" id="kg" name="unit" value="Kilograms">
                 <label for="kg">kg</label>
                 <input type="radio" id="mg" name="unit" value="MiliGrans">
                 <label for="mg">mg</label><br>
                 
               
                 
                   ---- GENERIC SUBSTITUTION PERMITTED ----
                <br> <div class="form-group row"></br>
                <label for="medical_number"
                  class="col-md-4 col-form-label text-md-right">Generic Medication<font color="red"></font></label>
                <div class="col-md-5">
                  <input type="text" id="medical_number" class="form-control" placeholder=""
                    name="gen" value="" >
                </div><!-- comment -->
                </div>
                
           
              
                      ----- PHYSICIAN DETAILS ------
                      
                   <div class="col">  <div class="form-group row"><br>
                   
               <label for="name" 
                      class="col-md-4 col-form-label text-md-right">Name<font color="red">*</font></label>
                <div class="col-md-5">
                  <input type="text" id="user_name"  class="form-control" placeholder=""
                    name="name" value="" >
                    <font  color="red"></font>
                </div>
              </div>
              <div class="form-group row">
                <label for="tel"
                  class="col-md-4 col-form-label text-md-right">Telephone<font color="red">*</font></label>
                <div class="col-md-5">
                  <input type="text" id="telephone_number" class="form-control" placeholder=""
                    name="tel" value="" >
                    <font color="red"> </font>
                </div>
              </div>
                       
             <div class="container-fluid">
            <div class="row-g3">
            <form action="#" method="post">
                <p>-- PRESCRIPTION INFORMATION --</p><!-- comment -->
                 <div class="form-group row">
                <label for="issued<"
                  class="col-md-4 col-form-label text-md-right">Date issued<font color="red">*</font></label>
                <div class="col-md-5">
                  <input type="date" id="issued<" class="form-control" placeholder=""
                    name="issued<" value="" >
                    <font color="red"> </font>
                </div>
                 </div>
                   <div class="form-group row">
                <label for="exp"
                  class="col-md-4 col-form-label text-md-right">Expiry Date<font color="red">*</font></label>
                <div class="col-md-5">
                  <input type="date" id="exp" class="form-control" placeholder=""
                    name="exp" value="" >
                    <font color="red"> </font>
                </div>
              </div>
              <div class="form-group row">
                <label for="refills"
                  class="col-md-4 col-form-label text-md-right">No refills<font color="red"></font></label>
                <div class="col-md-5">
                  <input type="text" id="refills" class="form-control" placeholder=""
                    name="refills" value="" >
                </div><!-- comment -->
                </div>
                
               <div class="form-group row">
                <label for="dosage"
                  class="col-md-4 col-form-label text-md-right">Dosage<font color="red"></font></label>
                <div class="col-md-5">
                  <input type="text" id="dosage" class="form-control" placeholder=""
                    name="dosage" value="" >
                </div><!-- comment -->
                </div>
                 <div class="container align-center">
                <input type="submit" class="btn btn-primary" name="operation" value="Add Patient">
                 </div>
            </form>
            </div>
             </div>
                      
                 </div><br><b><br>
        </center>     
     <footer style="background: rgb(23,56,89);" class="page-footer font-small blue"> 

  <div class="footer-copyright text-center py-3">© 2023 Copyright:</div>
 </footer>
  </div>
 
    </body>
</html>
