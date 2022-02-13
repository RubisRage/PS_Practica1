package control;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class GoToCatalogue implements Command {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException  {
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("Catalogue.jsp");
        
        if(dispatcher != null){
            dispatcher.forward(request, response);
        }
    }
    
}
