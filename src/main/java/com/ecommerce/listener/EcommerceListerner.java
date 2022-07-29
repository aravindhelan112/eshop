package com.ecommerce.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.ecommerce.products.Product;

/**
 * Application Lifecycle Listener implementation class EcommerceListerner
 *
 */
@WebListener
public class EcommerceListerner implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public EcommerceListerner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub 
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	List<Product> products = new ArrayList<Product>();
    	ServletContext ctx = sce.getServletContext();
    	ctx.setAttribute("products", products);
    	
    }
	
}
