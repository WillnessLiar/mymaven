package com.ssm.filter;

import javax.servlet.*;
import java.io.IOException;

public class SecongFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter second");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("filter out2 ");
    }

    @Override
    public void destroy() {

    }
}
