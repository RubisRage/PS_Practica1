/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import model.Catalogue;
import model.Product;
import model.ShoppingCart;

/**
 *
 * @author RubisRage (Rubén Santana Lorenzo - ruben.santana120@alu.ulgpc.es)
 */
public class RemoveFromCart implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        ShoppingCart cart = (ShoppingCart) session.getAttribute("ShoppingCart");
        
        String productName = new String(request.getParameter("productName").getBytes("ISO-8859-1"), "UTF-8");
        Product toBeRemoved = Catalogue.instance().getProduct(productName);
     
        cart.removeProduct(toBeRemoved);
        
        forward(request, response, "ShoppingCart.jsp");
    }
    
}
