package main.resume.filter;
import main.resume.util.ControllerUtil;

import javax.naming.ldap.Control;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebFilter(filterName = "JSPFileFilter", urlPatterns = {"*"})
public class SecurityFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void  doFilter(ServletRequest request, ServletResponse response,
                          FilterChain chain){
        try {
            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse res = (HttpServletResponse) response;

            // Eğer URL "/login" değil ve oturum kapalıysa, login sayfasına yönlendir.
            if (!req.getRequestURI().contains("/login") && req.getSession().getAttribute("loggedInUser") == null) {
                res.sendRedirect("login");
            } else {
                chain.doFilter(request, response);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void destroy() {

    }
}
