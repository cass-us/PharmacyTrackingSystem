<%-- 
    Document   : PatientsList
    Created on : Jun 7, 2023, 9:49:33 AM
    Author     : STUDIO 18
--%>

<%@page import="java.util.List"%>
<%@page import="za.co.mie.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>

        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>

        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    </head>
    <body>
       
        <nav class="navbar navbar-expand-lg navbar-light bg-secondary">
            <a class="navbar-brand" href="AdminLogin.jsp">HOME</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="#">CONTACT US |</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">ABOUT US |</a>
                    </li>
                </ul>
            </div>
        </nav>   


        <form action="UpdatePatient" method="GET">    
           <div  class="container align-center">
               <br>   
<!--              <form class="form-inline md-form mr-auto mb-4">
         <input class="form-control mr-sm-6" type="text" placeholder="Search" aria-label="Search">
         <button class="btn aqua-gradient btn-rounded btn-sm my-6" type="submit">Search</button><br><br>
     </form>-->
            <table class="table">
                <thead>
                    <tr>
                        
                        <th scope="col">First Name</th>
                        <th scope="col">Telephone</th>
                        <th scope="col">Date of Birth</th>
                        <th scope="col">Medical Aid</th>
                        <th scope="col">Medical Number</th>
                <a><th scope="col" onclick="" href="#">Update Details</a></th>
                </tr>
                </thead>
                <tbody>
                      <%
                            List<User> user = (List<User>) request.getAttribute("userList");
                       %>
                        <% for(User userList :  user) {%>
                        <tr>
                        <% userList = (User)userList; %>
                         <td><%= userList.getUserName()%></td>
                         <td><%= userList.getTelephone() %></td>
                        <td><%= userList.getBirthDate() %></td>
                        <td><%= userList.getMedicalAid() %></td>
                      <td><%= userList.getMedicalAidContactNumbers() %></td>
                      <td><a href="PatientsList?id=<%=userList.getId()%>" class="btn btn-primary" style="background-color:rgb(23,56,89)" > update</a></td>
                     </tr>
                     <%}%>
                    </div>
                   </div>
                  </div>
                </tbody>
              
            </table>
        </form>      
    </div>               
                        
  <footer style="background: rgb(23,56,89);" class="page-footer font-small blue"> 
  
  <div class="footer-copyright text-center py-3">© 2023 Copyright:</div>
 </footer>
    </div>
 
    </body>
</html>
