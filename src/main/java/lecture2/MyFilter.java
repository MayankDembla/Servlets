package lecture2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.LogRecord;

@WebFilter("/first")
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        PrintWriter out=resp.getWriter();
        out.print("filter is invoked before");
        out.println("");
        chain.doFilter(req, resp);//sends request to next resource
        out.print("filter is invoked after");
    }

    @Override
    public void destroy() {

    }
}
