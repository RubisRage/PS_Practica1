<%-- 
    Document   : Catalogue
    Created on : Feb 12, 2022, 7:31:56 PM
    Author     : RubisRage (Rubén Santana Lorenzo - ruben.santana120@alu.ulgpc.es)
--%>


<%@page contentType="text/html" pageEncoding="UTF-8" session="true"
        import="model.Catalogue,model.Product"
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style.css">
    </head>
    <body>
        <jsp:include page="PageHeader.jsp"></jsp:include>
        
        <table id="productTable">
            <% for(Product p : Catalogue.instance().getAllProducts()) { %>
            <tr>
                <td style="text-align:center">
                    <img src="<%= p.getImageLink() %>" alt="Picture of product <%= p.getName() %>" width="100" height="150"/>
                </td>
                <td>
                    <ul id="productAttributes">
                        <li>Title: <%= p.getName() %></li>
                        <li>Price: <%= p.getPrice() %> €</li>
                        <li>Link: <a href="<%= p.getLink() %>">More information</a></li>
                        <% for(String a : p.getAttributes()) { %>
                            <li><%= a.toString() %></li>
                        <% } %>
                    </ul>
                </td>
            </tr>
            <% } %>
        </table>
    </body>
</html>
