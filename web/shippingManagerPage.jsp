<%-- 
    Document   : shippingManagerPage
    Created on : Dec 16, 2023, 2:53:16 PM
    Author     : semoz
--%>
<%@page import="Model.shippingManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shipp</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body style="background-image: url(https://ucarecdn.com/671500d2-4351-45dc-badf-57ae6af26102/-/preview/500x500/-/quality/smart_retina/-/format/auto/); background-position: center;
          background-size: cover;">
        <% //shippingManager sm= request.getMethod("");%>

        <div
            class="shadow-lg p-3 mb-5 bg-body-tertiary rounded"
            style="width: 45%; margin: auto; margin-top: 5%; padding: 100px;">
            <p class="text-center fs-2">You need</p>
            <button class="btn btn-outline-info shadow-lg p-4 m-5 bg-body-tertiary rounded" style="width: 30%;">
                <svg
                    width="70"
                    height=70"
                    xmlns="http://www.w3.org/2000/svg"
                    data-name="1"
                    viewBox="0 0 128 128"
                    id="start">
                <path
                    d="M10 128a2 2 0 0 1-1-.27A2 2 0 0 1 8 126V2a2 2 0 0 1 3-1.73l108 62a2 2 0 0 1 0 3.46l-108 62a2 2 0 0 1-1 .27ZM12 5.45v117.1L114 64Z"></path>
                </svg>
                <p class="fs-3">Start</p></button
            >
            <a class="btn btn-outline-info shadow-lg p-4 m-5 bg-body-tertiary rounded" style="width: 30%;" href="">
                <svg
                    xmlns="http://www.w3.org/2000/svg"
                    width="70"
                    height="70"
                    viewBox="0 0 24 24"
                    id="cancel-circle">
                <g
                    fill="none"
                    stroke="#000"
                    stroke-linecap="square"
                    stroke-miterlimit="10"
                    stroke-width="1.5">
                <path
                    d="M21.999000000000002 12 A10 10 0 0 1 11.999 22 A10 10 0 0 1 1.9990000000000006 12 A10 10 0 0 1 21.999000000000002 12 z"
                    transform="rotate(-35.782 12 12)"></path>
                <path d="M14.266 9.739l-4.534 4.522M14.261 14.267L9.738 9.733"></path>
                </g>
                </svg>
                <p class="fs-3">End</p></a>

        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
