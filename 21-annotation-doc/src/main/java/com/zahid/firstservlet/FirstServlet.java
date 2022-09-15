
package com.zahid.firstservlet;

import jakarta.servlet.*;
import java.io.IOException;
//import javax.servlet.*;

public class FirstServlet implements Servlet {
    
    ServletConfig conf;
    
    // life cyle methods
    @Override 
    public void init(ServletConfig conf) {
        this.conf = conf;
        System.out.println("Creating servlet object..");
    }
    
    @Override 
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Servicing..");
        
        // set the content type of the response
        resp.setContentType("text/html");
    }
    
    @Override
    public void destroy() {
        System.out.println("Destroying servlet object");
    }
    
    // no life cyle method
    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }
    
    @Override
    public String getServletInfo() {
        return "this servlet is created by Zahid";
    }
}
