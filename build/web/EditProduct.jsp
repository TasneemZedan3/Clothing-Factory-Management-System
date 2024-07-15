<%-- 
    Document   : EditProduct
    Created on : Dec 19, 2023, 2:16:49 PM
    Author     : semoz
--%>

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
        
<!--        <form action="EditProductController" method="get">
            
            Enter ID of product:<input type="text" name="prodID"><br>
            Enter new price <input type="text" name="prodPrice"><br>
            
            <input type="submit" value="Edit"><br>
        </form>-->
        
        
        
          <div
            class="shadow-lg p-3 mb-5 bg-body-tertiary rounded"
            style="width: 45%; margin: auto; margin-top: 12%; padding: 100px; font-family: sans-serif; border: 1px solid #0dcaf0;">
        <h1 class="text-center fs-2 mb-4">Edit Product</h1>
         <form action="EditProductController" method="get">
            
            <div class="input-group mb-3">
                <span class="input-group-text" id="inputGroup-sizing-default">Enter ID of product</span>
                <input type="text" name="prodID" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
            </div>
            
            <div class="input-group mb-3">
                <span class="input-group-text" id="inputGroup-sizing-default">Enter new price </span>
                <input type="text" name="prodPrice" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
            </div>
           
             <input class="btn btn-outline-info m-auto d-flex justify-content-center" type="submit" value="Edit">  
              </form>
       </div>
          <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>