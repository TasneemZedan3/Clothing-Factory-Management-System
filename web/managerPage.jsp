<%-- 
    Document   : managerPage
    Created on : Dec 16, 2023, 2:52:23 PM
    Author     : semoz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
        <title>Manager</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body style="background-image: url(https://ucarecdn.com/671500d2-4351-45dc-badf-57ae6af26102/-/preview/500x500/-/quality/smart_retina/-/format/auto/); background-position: center;
          background-size: cover;">

        

        <div
            class="shadow-lg p-3 mb-5 bg-body-tertiary rounded"
            style="width: 45%; margin: auto; margin-top: 5%; padding: 100px;">
            <p class="text-center fs-2">Pick which manager are you</p>
            <a class="btn btn-outline-info shadow-lg p-4 m-5 bg-body-tertiary rounded" style="width: 30%;" href="sectionManagerPage.jsp"
               ><svg
                    xmlns="http://www.w3.org/2000/svg"
                    width="24"
                    height="24"
                    fill-rule="evenodd"
                    stroke-linejoin="round"
                    stroke-miterlimit="2"
                    clip-rule="evenodd"
                    id="web-section">
                <path
                    d="M129,125L129,115C129,112.791 127.209,111 125,111L115,111C112.791,111 111,112.791 111,115L111,125C111,127.209 112.791,129 115,129L125,129C127.209,129 129,127.209 129,125ZM121,113L121,127L115,127C113.895,127 113,126.105 113,125C113,125 113,115 113,115C113,113.895 113.895,113 115,113L121,113ZM123,113L125,113C126.105,113 127,113.895 127,115L127,125C127,126.105 126.105,127 125,127L123,127L123,113Z"
                    transform="translate(-108 -108)"></path>
                </svg>
                <p class="fs-3">Section</p></a
            >
            <a class="btn btn-outline-info shadow-lg p-4 m-5 bg-body-tertiary rounded" style="width: 30%;" href="productManagerPage.jsp"
               ><svg
                    xmlns="http://www.w3.org/2000/svg"
                    width="24"
                    height="24"
                    viewBox="0 0 64 64"
                    id="product">
                <path
                    d="M27 51.87A3.9916 3.9916 0 0030 48V28a3.9916 3.9916 0 00-3-3.87A3.65643 3.65643 0 0026 24H6a3.99887 3.99887 0 00-4 4V48a3.99891 3.99891 0 004 4H26A3.65874 3.65874 0 0027 51.87zM11 48H7a1.00011 1.00011 0 01.00006-2H11A1.00011 1.00011 0 0111 48zm2-4H7a1.00011 1.00011 0 01.00006-2H13A1.00011 1.00011 0 0113 44zm9-15a3.00883 3.00883 0 01-3 3H13a3.00883 3.00883 0 01-3-3V26h2v3a1.003 1.003 0 001 1h6a1.003 1.003 0 001-1V26h2zM36 17H46a3.01107 3.01107 0 003-3V9a3.00879 3.00879 0 00-3-3H36a3.00879 3.00879 0 00-3 3v5A3.01309 3.01309 0 0036 17z"></path>
                <path
                    d="M57 10H51v4h4a2.00587 2.00587 0 012 2V52a2.00591 2.00591 0 01-2 2c-5.10565.00378-30.35992-.004-34.9 0A5.00051 5.00051 0 0025 58H57a5.00181 5.00181 0 005-5V15A5.00181 5.00181 0 0057 10zM25 16a2.00587 2.00587 0 012-2h4V10H25a5.00181 5.00181 0 00-5 5v7h5z"></path>
                <path
                    d="M27,22.08A5.99882,5.99882,0,0,1,32,28V48a5.979,5.979,0,0,1-1.53,4H55V16H50.58A5.05069,5.05069,0,0,1,46,19H36a5.01743,5.01743,0,0,1-4.57-3H27Zm17.79,2.21a1.008,1.008,0,0,1,1.42,0l1.29,1.3,3.79-3.8a1.00429,1.00429,0,0,1,1.42,1.42L48.21,27.71a1.01673,1.01673,0,0,1-1.42,0l-2-2A1.008,1.008,0,0,1,44.79,24.29Zm0,9a1.008,1.008,0,0,1,1.42,0l1.29,1.3,3.79-3.8a1.00429,1.00429,0,0,1,1.42,1.42L48.21,36.71a1.01673,1.01673,0,0,1-1.42,0l-2-2A1.008,1.008,0,0,1,44.79,33.29Zm0,9a1.008,1.008,0,0,1,1.42,0l1.29,1.3,3.79-3.8a1.00429,1.00429,0,0,1,1.42,1.42L48.21,45.71a1.01673,1.01673,0,0,1-1.42,0l-2-2A1.008,1.008,0,0,1,44.79,42.29ZM33.5,25c.08313.00183,8.02789-.00134,8.00006,0a1.00011,1.00011,0,0,1-.00012,2H33.5A1.00011,1.00011,0,0,1,33.5,25Zm0,9c.08313.00183,8.02789-.00134,8.00006,0a1.00011,1.00011,0,0,1-.00012,2H33.5A1.00011,1.00011,0,0,1,33.5,34Zm0,9c.08313.00183,8.02789-.00134,8.00006,0a1.00011,1.00011,0,0,1-.00012,2H33.5A1.00011,1.00011,0,0,1,33.5,43Z"></path>
                </svg>
                <p class="fs-3">Product</p></a
            >
            <br>
            <a class="btn btn-outline-info shadow-lg p-4 m-5 bg-body-tertiary rounded" style="width: 30%;" href="saleManagerPage.jsp"
               ><svg
                    xmlns="http://www.w3.org/2000/svg"
                    width="24"
                    height="24"
                    fill="none"
                    id="sale">
                <path
                    fill="#292D32"
                    d="M6.01 15.99c.316.232.72.348 1.212.348.324 0 .604-.058.84-.174.24-.116.422-.274.546-.474.128-.2.192-.426.192-.678 0-.248-.064-.452-.192-.612a1.273 1.273 0 0 0-.45-.378 4.573 4.573 0 0 0-.66-.276 6.888 6.888 0 0 1-.408-.156 1.024 1.024 0 0 1-.234-.15.288.288 0 0 1-.09-.21c0-.096.028-.17.084-.222a.305.305 0 0 1 .216-.078.409.409 0 0 1 .305.117l.048.051c.097.105.2.216.34.216h.672c.172 0 .312-.145.27-.311a1.167 1.167 0 0 0-.429-.655C7.98 12.116 7.588 12 7.096 12c-.304 0-.576.05-.816.15-.24.1-.428.248-.564.444a1.173 1.173 0 0 0-.204.696c0 .268.062.486.186.654.128.164.276.29.444.378.172.084.396.172.672.264.26.084.448.16.564.228a.318.318 0 0 1 .174.288.273.273 0 0 1-.108.228.423.423 0 0 1-.264.078.424.424 0 0 1-.294-.102.324.324 0 0 1-.053-.062c-.087-.13-.2-.262-.356-.262h-.66c-.172 0-.313.146-.27.313.073.287.227.519.463.695Z"></path>
                <path
                    fill="#292D32"
                    fill-rule="evenodd"
                    d="M11.95 15.606a.1.1 0 0 1 .095.069l.138.415a.3.3 0 0 0 .284.206h.598a.3.3 0 0 0 .282-.402l-1.319-3.63a.3.3 0 0 0-.282-.198h-.935a.3.3 0 0 0-.282.197l-1.323 3.63a.3.3 0 0 0 .281.403h.59a.3.3 0 0 0 .286-.206l.137-.415a.1.1 0 0 1 .095-.069h1.355Zm-.265-1.032a.1.1 0 0 1-.095.132h-.63a.1.1 0 0 1-.094-.131l.312-.95a.1.1 0 0 1 .19 0l.317.95Z"
                    clip-rule="evenodd"></path>
                <path
                    fill="#292D32"
                    d="M15.052 15.096a.3.3 0 0 0 .3.3h.714a.3.3 0 0 1 .3.3v.3a.3.3 0 0 1-.3.3h-1.89a.3.3 0 0 1-.3-.3v-3.63a.3.3 0 0 1 .3-.3h.576a.3.3 0 0 1 .3.3v2.73zm2.947-1.888c0-.11.09-.2.2-.2h1.03a.3.3 0 0 0 .3-.3v-.342a.3.3 0 0 0-.3-.3h-2.106a.3.3 0 0 0-.3.3v3.63a.3.3 0 0 0 .3.3h2.106a.3.3 0 0 0 .3-.3v-.342a.3.3 0 0 0-.3-.3H18.2a.2.2 0 0 1-.2-.2v-.362c0-.11.09-.2.2-.2h.85a.3.3 0 0 0 .3-.3v-.294a.3.3 0 0 0-.3-.3h-.85a.2.2 0 0 1-.2-.2v-.29z"></path>
                <path
                    fill="#292D32"
                    fill-rule="evenodd"
                    d="M10.033 3.913a7.732 7.732 0 0 0-2.729 3.841 16.61 16.61 0 0 0-1.628.078c-.754.085-1.403.266-1.959.693-.26.2-.493.432-.692.692-.427.556-.608 1.205-.693 1.96-.082.729-.082 1.643-.082 2.778v.09c0 1.135 0 2.05.082 2.779.085.754.266 1.403.693 1.959.2.26.432.493.692.692.556.427 1.205.608 1.96.693.729.082 1.643.082 2.778.082h8.09c1.135 0 2.05 0 2.779-.082.754-.085 1.403-.266 1.959-.693.26-.2.493-.432.692-.692.427-.556.608-1.205.693-1.96.082-.729.082-1.643.082-2.778v-.09c0-1.135 0-2.05-.082-2.779-.085-.754-.266-1.403-.693-1.959a3.75 3.75 0 0 0-.692-.692c-.556-.427-1.205-.608-1.96-.693a16.61 16.61 0 0 0-1.627-.078 7.732 7.732 0 0 0-2.729-3.841 4.112 4.112 0 0 0-4.934 0Zm4.034 1.2a2.612 2.612 0 0 0-3.134 0A6.232 6.232 0 0 0 8.9 7.75h7.2a6.233 6.233 0 0 0-2.033-2.637ZM6.772 9.818l.14-.557c-.413.01-.763.027-1.068.062-.62.07-.962.199-1.214.392-.156.12-.295.26-.415.415-.193.252-.322.594-.392 1.214C3.75 11.98 3.75 12.81 3.75 14c0 1.19.001 2.02.073 2.656.07.62.199.962.392 1.214.12.156.26.295.415.415.252.193.594.322 1.214.392.636.072 1.466.073 2.656.073h8c1.19 0 2.02-.001 2.656-.073.62-.07.962-.199 1.214-.392.156-.12.295-.26.415-.415.193-.252.322-.594.392-1.214.072-.636.073-1.466.073-2.656 0-1.19-.001-2.02-.073-2.656-.07-.62-.199-.962-.392-1.214a2.25 2.25 0 0 0-.415-.415c-.252-.193-.594-.322-1.214-.392a12.219 12.219 0 0 0-1.068-.062l.14.557a.75.75 0 0 1-1.456.364l-.233-.932H8.461l-.233.932a.75.75 0 0 1-1.456-.364Z"
                    clip-rule="evenodd"></path>
                </svg>
                <p class="fs-3">Sale</p></a
            >
            <a class="btn btn-outline-info shadow-lg p-4 m-5 bg-body-tertiary rounded" style="width: 30%;" href="shippingManagerPage.jsp"
               ><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 48 48" id="shipping" width="24"
                  height="24">
                <path
                    fill="#f8f9f9"
                    d="M46 26c-3.13 5.49-3.75 8-5 13H8a43.25 43.25 0 0 0-2.62-8.74A38.58 38.58 0 0 0 2 24h17l5 2Z"></path>
                <path fill="#bec6c6" d="M5 16h12v8H5z"></path>
                <path
                    fill="#f8f9f9"
                    d="M14 10v6H8v-6a2 2 0 0 1 2-2h2a2 2 0 0 1 2 2Z"></path>
                <path fill="#bec6c6" d="M27 2v3l-13 7v-2a2 2 0 0 0-2-2h-2Z"></path>
                <path
                    fill="#414141"
                    d="M41 40H8a1 1 0 0 1-1-.78l-.43-2a37.6 37.6 0 0 0-5.4-12.67A1 1 0 0 1 2 23c18.16 0 17.11 0 17.37.07L24.19 25H46a1 1 0 0 1 .86 1.52A40.73 40.73 0 0 0 42 39.24a1 1 0 0 1-1 .76ZM8.8 38h31.42a41.38 41.38 0 0 1 4.05-11H24c-.26 0-.07.05-5.19-2h-15A40.13 40.13 0 0 1 8.8 38Z"></path>
                <path
                    fill="#bec6c6"
                    d="M46 36c-2.75 0-2.75 2-5.5 2s-2.76-2-5.5-2-2.75 2-5.5 2-2.75-2-5.5-2-2.75 2-5.5 2-2.76-2-5.5-2-2.75 2-5.5 2-2.75-2-5.5-2v11h44Z"></path>
                <path
                    fill="#414141"
                    d="M40.5 39a5.13 5.13 0 0 1-3.35-1.19A3.13 3.13 0 0 0 35 37c-2.22 0-2.46 2-5.5 2a5.12 5.12 0 0 1-3.34-1.19A3.13 3.13 0 0 0 24 37c-2.21...0 1-1-1v-6a3 3 0 0 1 3-3h2a3 3 0 0 1 3 3v6a1 1 0 0 1-1 1Zm-5-2h4v-5a1 1 0 0 0-1-1h-2a1 1 0 0 0-1 1Z"></path>
                <path
                    fill="#414141"
                    d="M14 13a1 1 0 0 1-.47-1.88L26 4.4v-1L10.33 8.94a1 1 0 0 1-.66-1.88l17-6A1 1 0 0 1 28 2v3a1 1 0 0 1-.53.88C13.33 13.49 14.36 13 14 13Z"></path>
                <path
                    fill="#414141"
                    d="M27 15c-3 0-3.92-4-2-4a1 1 0 0 1 1 1 1 1 0 1 0 1.47-.88A2.89 2.89 0 0 1 26 8.54V5a1 1 0 0 1 2 0v3.54a.93.93 0 0 0 .42.82A3 3 0 0 1 27 15Z"></path>
                <path
                    fill="#f8f9f9"
                    d="M43 26h-8v-8h8zM35 26h-8v-8h8zM41 18h-8v-8h8z"></path>
                <path
                    fill="#414141"
                    d="M43 27h-8a1 1 0 0 1-1-1v-8a1 1 0 0 1 1-1h8a1 1 0 0 1 1 1v8a1 1 0 0 1-1 1Zm-7-2h6v-6h-6Z"></path>
                <path fill="#6457ff" d="M40 21h-2v-2h2zM38 13h-2v-2h2z"></path>
                <path
                    fill="#414141"
                    d="M35 27h-8a1 1 0 0 1-1-1v-8a1 1 0 0 1 1-1h8a1 1 0 0 1 1 1v8a1 1 0 0 1-1 1Zm-7-2h6v-6h-6Z"></path>
                <path fill="#6457ff" d="M32 21h-2v-2h2z"></path>
                <path
                    fill="#414141"
                    d="M41 19h-8a1 1 0 0 1-1-1v-8a1 1 0 0 1 1-1h8a1 1 0 0 1 1 1v8a1 1 0 0 1-1 1Zm-7-2h6v-6h-6Z"></path>
                </svg>
                <p class="fs-3">shipp</p></a>
        </div>



        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
