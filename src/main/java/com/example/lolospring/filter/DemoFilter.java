package com.example.lolospring.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "demoFilter",urlPatterns = {"/*"})
public class DemoFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(" ----------- > ٩( ᐛ )و This is demo filter; Now start~ < -----------");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println(" ----------- > ٩( ᐛ )و This is demo filter; Now end~  < -----------");
    }
}
