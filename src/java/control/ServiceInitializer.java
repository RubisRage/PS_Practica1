package control;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import model.Catalogue;
import persistence.JSONProductLoader;

/**
 *
 * @author RubisRage (Rubén Santana Lorenzo - ruben.santana120@alu.ulgpc.es)
 */
@WebListener(value = "Web application initializer.")
public class ServiceInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Catalogue.createInstance(new JSONProductLoader());
    }
}
