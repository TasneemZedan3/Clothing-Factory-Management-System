<%-- 
    Document   : AddProduct
    Created on : Dec 18, 2023, 11:54:32 PM
    Author     : semoz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>Add Product</title
    </head>
   <body style="background-image: url(https://ucarecdn.com/671500d2-4351-45dc-badf-57ae6af26102/-/preview/500x500/-/quality/smart_retina/-/format/auto/); background-position: center;
          background-size: cover;" >
        
         <div
            class="shadow-lg p-3 mb-5 bg-body-tertiary rounded"
            style="width: 45%; margin: auto; margin-top: 5%; padding: 100px; font-family: sans-serif; border: 1px solid #0dcaf0;">
        <h1 class="text-center fs-2">Add Product </h1>
        <form action="AddProductController" method="get">
            
            <div class="input-group mb-3">
                <span class="input-group-text" id="inputGroup-sizing-default">product ID</span>
                <input type="text"name="prodID" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
            </div>
            
            <div class="input-group mb-3">
                <span class="input-group-text" id="inputGroup-sizing-default">product Name</span>
                <input type="text"name="prodName" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
            </div>
            
            <div class="input-group mb-3">
                <span class="input-group-text" id="inputGroup-sizing-default">product Color</span>
                <input type="text"name="prodColor" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
            </div>
            
            <div class="input-group mb-3">
                <span class="input-group-text" id="inputGroup-sizing-default">product Price</span>
                <input type="text"name="prodPrice"
                       class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default">
            </div>
             <!--: <input type="text"name="prodID"><br><br>-->
<!--            product Name : <input type="text"name="prodName"><br><br>
            product Color: <input type="text"name="prodColor"><br><br>
            product Price: <input type="text"name="prodPrice"><br><br>
            -->
      
             <input class="btn btn-outline-info m-auto d-flex justify-content-center" type="submit" value="Add Product">  
              </form>
       </div>
            
       
       
         <!--<a href="Product.jsp"><input type="submit" name="" value="Product"></a>-->
          <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
