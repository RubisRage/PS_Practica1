<%-- 
    Document   : ShoppingCart
    Created on : Feb 14, 2022, 11:53:17 AM
    Author     : RubisRage (Rubén Santana Lorenzo - ruben.santana120@alu.ulgpc.es)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import="model.Product,model.ShoppingCart"%>

<% ShoppingCart cart = (ShoppingCart) session.getAttribute("ShoppingCart");%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style.css">
    </head>
    <body>
        <jsp:include page="PageHeader.jsp"></jsp:include>
        
        <form action="${pageContext.request.contextPath}/Shop">
            <input type="hidden" name="command" value="MakePurchase" />
            <p style = "font-size: 3">
                Total price: <%= String.format("%.2f", cart.getTotalPrice()) %>
            </p>
            <input  type="submit" value="Make Purchase"/> <br>
        </form>

        
        <table id="productTable">
            <% 
                for(Product p : cart.getProducts()) { 
            %>
            <tr>
                <td style="text-align:center">
                    <img src="<%= p.getImageLink() %>" alt="Picture of product <%= p.getName() %>" width="100" height="150"/>
                </td>
                <td>
                    <ul id="productAttributes">
                        <li>Title: <%= p.getName() %></li>
                        <li>Price: <%= p.getPrice() %> €</li>
                    </ul>
                </td>
                <td style="text-align: center">
                    <form action="${pageContext.request.contextPath}/Shop">
                        <input type="hidden" name="command" value="RemoveFromCart" />
                        <input type="hidden" name="productName" value="<%= p.getName() %>" />
                        <input type="submit" value="Remove from Cart"/>
                    </form>
                </td>
            </tr>
            <% } %>
        </table>
        
    </body>
</html>
