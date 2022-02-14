<%-- 
    Document   : PageHeader
    Created on : Feb 13, 2022, 2:45:38 PM
    Author     : RubisRage (Rubén Santana Lorenzo - ruben.santana120@alu.ulgpc.es)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="true"
        import="model.ShoppingCart"%>

<ul id="navbar">
    <li><a href="${pageContext.request.contextPath}/Shop">CATALOGUE</a></li>
    <li>
        <form id="cartForm" action="${pageContext.request.contextPath}/Shop">
            <input type="hidden" name="command" value="GoToCart" />
            <a  href="javascript:{}" onclick="document.getElementById('cartForm').submit();">
                CART <%= ((ShoppingCart)session.getAttribute("ShoppingCart")).size()%>
            </a>
        </form>
    </li>
</ul>