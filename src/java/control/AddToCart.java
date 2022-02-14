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
public class AddToCart implements Command{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        ShoppingCart cart = (ShoppingCart) session.getAttribute("ShoppingCart");

        Catalogue c = Catalogue.instance();
        Product addedProduct = c.getProduct(request.getParameter("productName"));
        
        cart.addProduct(addedProduct);
        
        forward(request, response, "Catalogue.jsp");
    }
    
}
