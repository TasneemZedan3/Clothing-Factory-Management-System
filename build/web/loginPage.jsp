<%-- 
    Document   : loginPage
    Created on : Dec 16, 2023, 1:57:26 PM
    Author     : semoz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

        <style>
            .btn-login {
                font-size: 0.9rem;
                letter-spacing: 0.05rem;
                padding: 0.75rem 1rem;
            }   
        </style>
    </head>
    <body style="background-image: url(https://ucarecdn.com/671500d2-4351-45dc-badf-57ae6af26102/-/preview/500x500/-/quality/smart_retina/-/format/auto/); background-position: center;
          background-size: cover;">
<!--        <h1>Welcome to Firewood's System</h1>
        <p> please login to your account:</p>
        <form action="userController" method="get">

            User Name:<input type="text" name="Uname"><br>
            Password: <input type="text" name="Upass"><br>

            <input type="submit" value="Submit"><br>
        </form>-->


<div class="container" style="height: 90vh !important;">
            <div class="row">
                <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
                    <div class="card border-0 shadow rounded-3 my-4">
                        <img src="https://ucarecdn.com/d2d5ab06-41e5-4dae-8d10-490802933dc6/-/preview/500x500/-/quality/smart_retina/-/format/auto/" style="height: 250px;">
                        <div class="card-body p-0 p-sm-5">
                            <h5 class="card-title text-center mb-3 fw-light fs-3">Welcome to Firewood's System</h5>
                            <h5 class="card-title text-center mb-5 fw-light fs-5">login to your account</h5>
                            <form action="userController" method="get">
                                <div class="form-floating mb-3">
                                    <input type="text" name="Uname" class="form-control" id="floatingInput" placeholder="name@example.com">
                                    <label for="floatingInput">User Name</label>
                                </div>
                                <div class="form-floating mb-3">
                                    <input type="text" name="Upass" class="form-control" id="floatingPassword" placeholder="Password">
                                    <label for="floatingPassword">Password</label>
                                </div>

                                <div class="d-grid mt-5">
                                    <input type="submit" class="btn btn-info btn-login text-uppercase fw-bold" value="Sign in">
                                </div>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <script type="text/javascript">

        </script>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>