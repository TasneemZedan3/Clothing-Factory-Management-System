<%-- 
    Document   : AddReport
    Created on : Dec 18, 2023, 4:02:15 PM
    Author     : semoz
--%>

<%@page import="Model.Report"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body style="background-image: url(https://ucarecdn.com/671500d2-4351-45dc-badf-57ae6af26102/-/preview/500x500/-/quality/smart_retina/-/format/auto/); background-position: center;
          background-size: cover;">
<!--        <form action="ManageReport" method="get">
            
            week:<input type="text" name="week"><br>
            sales <input type="text" name="sales"><br>
            profit: <input type="text" name="profit"><br>
            
                <input type="submit" value="ADD"><br>
        </form>-->
        
        
        
        <div
            class="shadow-lg p-3 mb-5 bg-body-tertiary rounded"
            style="width: 45%; margin: auto; margin-top: 12%; padding: 100px; font-family: sans-serif; border: 1px solid #0dcaf0;">
        <h1 class="text-center fs-2 mb-4">Add Report</h1>
        <form action="ManageReport" method="get">
            
            <div class="input-group mb-3">
                <span class="input-group-text" id="inputGroup-sizing-default">Week</span>
                <input type="text"name="week" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
            </div>
            
            <div class="input-group mb-3">
                <span class="input-group-text" id="inputGroup-sizing-default">Sales</span>
                <input type="text"name="sales" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
            </div>
            
            <div class="input-group mb-3">
                <span class="input-group-text" id="inputGroup-sizing-default">Profit</span>
                <input type="text"name="profit" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
            </div>
             <!--: <input type="text"name="prodID"><br><br>-->
<!--            product Name : <input type="text"name="prodName"><br><br>
            product Color: <input type="text"name="prodColor"><br><br>
            product Price: <input type="text"name="prodPrice"><br><br>
            -->
      
             <input class="btn btn-outline-info m-auto d-flex justify-content-center" type="submit" value="Add">  
              </form>
       </div>
          <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
