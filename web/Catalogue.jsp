<%-- 
    Document   : Catalogue
    Created on : Feb 12, 2022, 7:31:56 PM
    Author     : RubisRage (Rubén Santana Lorenzo - ruben.santana120@alu.ulgpc.es)
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"
        import="model.Catalogue,model.Product,java.util.Arrays"
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
        <%= Arrays.toString(Catalogue.instance().getAllProducts().stream().map(Product::getName).toArray(String[]::new)) %>
        <br>
        <%= Catalogue.instance().getAllProducts().size() %>
    </body>
</html>
