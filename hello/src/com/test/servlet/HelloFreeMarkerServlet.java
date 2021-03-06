package com.test.servlet;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.data.ExampleData;
import com.test.BookService;
import com.test.book.ProductBook;

import freemarker.template.Configuration;  
import freemarker.template.Template;  
import freemarker.template.TemplateException;  


@WebServlet("/Management")
public class HelloFreeMarkerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Configuration cfg = null;
	
	@SuppressWarnings("deprecation")
	public void init() throws ServletException{
		cfg = new Configuration();
		
		cfg.setServletContextForTemplateLoading(getServletContext(),
				"/WEB-INF/templates");
	}
       
    
    public HelloFreeMarkerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        
        Map root = new HashMap();    
        root.put("name", "Kylin");
        
        
        
        BookService bookservice = new BookService();
        List list = new ArrayList();
        list = bookservice.getBookExample();
        root.put("bookdata",list);
        
        Template t = cfg.getTemplate("test.ftl");  
       
        response.setContentType("text/html; charset=" + t.getEncoding());  
        Writer out = response.getWriter();  
        
        try {  
            t.process(root, out);
        } catch (TemplateException e) {  
            e.printStackTrace();  
        }  
    }  
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        doPost(request, response);  
    }  
    public void destroy() {  
        super.destroy();  
    }

	

}
