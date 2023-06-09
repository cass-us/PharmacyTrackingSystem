<%-- 
    Document   : Physician
    Created on : Jun 8, 2023, 9:49:52 AM
    Author     : STUDIO 18
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <center>
               
                     
        <br><br><p style="position: absolute">
           
            <form action="AddPatient" method="post">
                  
              <div class="form-group row">
               <label for="username" 
                      class="col-md-4 col-form-label text-md-right">Username<font color="red">*</font></label> <br><br>
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
                  <input type="text" id="medical_number" class="form-control" placeholder=""
                    name="medical_number" value="" >
                    <font color="red"> </font>
                </div>
                    <div class="col-md-6 offset-md-4"><br>
                <input type="submit" class="btn btn-primary" name="operation" value="Add Patient">
              </div>
            </form>
    </p>
    
</center>
    </body>
</html>
