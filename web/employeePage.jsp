<%-- 
    Document   : employeePage
    Created on : Dec 16, 2023, 2:52:07 PM
    Author     : semoz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body style="background-image: url(https://ucarecdn.com/671500d2-4351-45dc-badf-57ae6af26102/-/preview/500x500/-/quality/smart_retina/-/format/auto/); background-position: center;
          background-size: cover;">
        <!--        <form action="SalaryController" method="get">
                    show salary: <input type="text" name="id">
                    <input type="submit" value="Search (enter your ID)"> 
                </form>
                <form action="AttendanceController" method="get">
                    Show attendance: <input type="text" name="date">
                    <input type="submit" value="Search (enter the date)"> 
                </form>-->


        <div
            class="shadow-lg p-3 mb-5 bg-body-tertiary rounded"
            style="width: 65%; margin: auto; margin-top: 12%; padding: 100px; font-family: sans-serif; border: 1px solid #0dcaf0;">
            <h1 class="text-center fs-2 mb-5 pb-2">Employee Page</h1>

            <h4>show Salary :</h4>
            <form action="SalaryController" method="get" class="input-group mb-3">
                    <input type="text" name="id" class="form-control" placeholder="Enter your ID" aria-label="Recipient's username" aria-describedby="button-addon2">
                    <input type="submit" value="Search" class="btn btn-outline-info " id="button-addon2">
            </form>

            <h4 class="mt-5">Show Attendance :</h4>
            <form action="AttendanceController" method="get" class="input-group mb-3">        
                    <input type="text" name="date" class="form-control" placeholder="Enter the date" aria-label="Recipient's username" aria-describedby="button-addon2">
                    <input type="submit" value="Search" class="btn btn-outline-info " id="button-addon2">
            </form>
        </div>



        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>