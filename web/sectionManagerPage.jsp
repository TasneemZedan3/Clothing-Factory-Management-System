<%-- 
    Document   : sectionManagerPage
    Created on : Dec 16, 2023, 2:52:49 PM
    Author     : semoz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body style="background-image: url(https://ucarecdn.com/671500d2-4351-45dc-badf-57ae6af26102/-/preview/500x500/-/quality/smart_retina/-/format/auto/); background-position: center;
          background-size: cover;">
<!--        <h1 class="text-center">Section Manager</h1>
        <p>(check for updates @CEO)</p>
        <form action="SectionController" method="get"  >
            <a class="btn btn-outline-info shadow-lg p-4 my-5 bg-body-tertiary rounded justify-content-center" style="width: 50%; margin: 0 25%;" href="AddReport.jsp">
                <p class="fs-3"> Add report </p></a>
        </form>-->
        <div class="shadow-lg p-3 mb-5 bg-body-tertiary rounded"
             style="width: 45%; margin: auto; margin-top: 10%; padding: 100px;">
            <p class="text-center fs-2">Welcome to Section Manager</p>
            <p class="text-center">(check for updates @CEO)</p>
        <form action="SectionController" method="get"  >
            <a class="btn btn-outline-info shadow-lg p-4 my-5 bg-body-tertiary rounded justify-content-center" style="width: 50%; margin: 0 25%;" href="AddReport.jsp">
                <svg xmlns="http://www.w3.org/2000/svg" enable-background="new 0 0 32 32" viewBox="0 0 32 32" id="lists" width="100" height="100"><path d="M3.9257812,24.1850586c0,2.675293,2.1767578,4.8520508,4.8515625,4.8520508h9.1875c0.5527344,0,1-0.4477539,1-1
	c0-0.2763062-0.1120605-0.5263672-0.2931519-0.7073364c-0.1809082-0.1807861-0.4306641-0.2926636-0.7068481-0.2926636h-9.1875
	c-1.5722656,0-2.8515625-1.2792969-2.8515625-2.8520508V6.8520508C5.9257812,5.2792969,7.2050781,4,8.7773438,4h13.4814453
	c1.5732422,0,2.8525391,1.2792969,2.8525391,2.8520508v13.0380859c0,0.2761841,0.1118774,0.5261841,0.2928467,0.7071533
	c0.1809082,0.1809082,0.4308472,0.2928467,0.7071533,0.2928467c0.5527344,0,1-0.4477539,1-1V6.8520508
	C27.1113281,4.1767578,24.9345703,2,22.2587891,2H8.7773438C6.1025391,2,3.9257812,4.1767578,3.9257812,6.8520508V24.1850586z"></path><path d="M21.2958984 14.5185547h-7.703125c-.5527344 0-1 .4477539-1 1s.4472656 1 1 1h7.703125c.5527344 0 1-.4477539 1-1S21.8486328 14.5185547 21.2958984 14.5185547zM21.2958984 9.7036133h-7.703125c-.5527344 0-1 .4477539-1 1s.4472656 1 1 1h7.703125c.5527344 0 1-.4477539 1-1S21.8486328 9.7036133 21.2958984 9.7036133zM21.2958984 19.3334961h-7.703125c-.5527344 0-1 .4477539-1 1s.4472656 1 1 1h7.703125c.5527344 0 1-.4477539 1-1S21.8486328 19.3334961 21.2958984 19.3334961zM9.7607422 9.7036133H9.7509766c-.5517578 0-.9951172.4477539-.9951172 1s.453125 1 1.0048828 1c.5527344 0 1-.4477539 1-1S10.3134766 9.7036133 9.7607422 9.7036133zM9.7607422 14.5185547H9.7509766c-.5517578 0-.9951172.4477539-.9951172 1s.453125 1 1.0048828 1c.5527344 0 1-.4477539 1-1S10.3134766 14.5185547 9.7607422 14.5185547zM9.7607422 19.3334961H9.7509766c-.5517578 0-.9951172.4477539-.9951172 1s.453125 1 1.0048828 1c.5527344 0 1-.4477539 1-1S10.3134766 19.3334961 9.7607422 19.3334961zM23.4614868 22.539978c-.1685791.1790161-.2759399.4168701-.2759399.6821899v1.8891602h-1.8896484c-.2648926 0-.5020142.1071777-.6808472.2750854-.1949768.1850147-.3185596.4377747-.3191528.7249146 0 .5522461.4472656 1 1 1h1.8896484V29c0 .5522461.4472656 1 1 1s1-.4477539 1-1v-1.8886719h1.8886719c.5527344 0 1-.4477539 1-1s-.4472656-1-1-1h-1.8886719V23.222168c0-.5522461-.4472656-1-1-1C23.8986893 22.2227249 23.6463127 22.3457184 23.4614868 22.539978z"></path></svg>
                <p class="fs-3"> Add report </p>
            </a>
        </form>

        </div>



        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>