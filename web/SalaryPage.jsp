<%-- 
    Document   : SalaryPage
    Created on : Dec 18, 2023, 4:51:52 PM
    Author     : semoz
--%>

<%@page import="Model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salary Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body style="background-image: url(https://ucarecdn.com/671500d2-4351-45dc-badf-57ae6af26102/-/preview/500x500/-/quality/smart_retina/-/format/auto/); background-position: center;
          background-size: cover;">
        <% Employee e = (Employee) request.getAttribute("showSalary");%>

        <!--        <table>
                    <tr>
                        <td>
                            ID
                        </td>
                        <td>
                            Salary
                        </td>
                    </tr>
                    <tr>
                        <td>
        <%--<%= e.getId()%>--%>
    </td>
    <td>
        <%--<%= e.getEmpSalary()%>--%>
    </td>
</tr>
</table>-->

        <div
            class="shadow-lg p-0 bg-body-tertiary rounded"
            style="width: 90%; margin: auto; margin-top: 12%; padding: 100px; font-family: sans-serif;">
            <h1 class="text-center fs-2">Salary Page</h1>
            <table class=" table table-bordered border-info text-center">
                <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Salary</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope="row"><%= e.getId()%></th>
                        <td><%= e.getEmpSalary()%></td>
                    </tr>
                </tbody>
            </table>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
