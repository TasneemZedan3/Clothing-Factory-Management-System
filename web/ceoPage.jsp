<%-- 
    Document   : ceoPage
    Created on : Dec 16, 2023, 2:51:53 PM
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

        <div
            class="shadow-lg p-3 mb-5 bg-body-tertiary rounded"
            style="width: 45%; margin: auto; margin-top: 12%; padding: 100px; font-family: sans-serif; border: 1px solid #0dcaf0;">
            <h1 class="text-center fs-2 mb-4 mb-5">This month report</h1>
            <form action="ReportController" method="get">
                <button class="btn btn-outline-info m-auto d-flex justify-content-center fs-3">SHOW</button>
            </form>
        </div>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>