package work.lince.commons.rest.provider.filter;

import org.springframework.beans.factory.annotation.Value;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/*")
public class ResponseHeaderFilter implements Filter {

    @Value("${lince.hostname:none}")
    protected String hostName;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("host-name", hostName);
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) {
        //do nothing because no not necessary configs
    }

    @Override
    public void destroy() {
        //do nothing because no not necessary clean
    }

}