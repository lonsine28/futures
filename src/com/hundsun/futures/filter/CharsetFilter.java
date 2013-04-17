package com.hundsun.futures.filter;

import java.io.IOException;


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class CharsetFilter extends HttpServlet implements Filter {

	private String characterEncoding;
	private boolean enabled;
	public void init(FilterConfig config){
		characterEncoding=config.getInitParameter("encoding");
		enabled="true".equalsIgnoreCase(config.getInitParameter("using").trim());
		
	}
	public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)throws IOException,ServletException{
		if(enabled||characterEncoding !=null){
			request.setCharacterEncoding(characterEncoding);
			response.setCharacterEncoding(characterEncoding);
		}
		response.getWriter().println(request.getParameter("column"+"it is a test"));
		chain.doFilter(request, response);		//ִ����һ��Filter
	}
	public void destroy(){
		characterEncoding=null;		//����ʱ�����Դ
	}

}
