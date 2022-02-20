<%-- 
    Document   : PurchaseFinished
    Created on : Feb 15, 2022, 6:26:41 PM
    Author     : RubisRage (Rubén Santana Lorenzo - ruben.santana120@alu.ulgpc.es)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style.css">
    </head>
    <body>
        <jsp:include page="PageHeader.jsp"></jsp:include>
        
        <p style="font-size: 40px; text-align: center">Thank you for your purchase!</p>
        <form style="text-align: center;" action="${pageContext.request.contextPath}/Shop">
            <input type="hidden" name="command" value="GoToCatalogue" />
            <input type="submit" value="Return to Catalog" />
        </form>
    </body>
</html>
