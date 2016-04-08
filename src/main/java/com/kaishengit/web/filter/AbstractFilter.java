package com.kaishengit.web.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by hp on 2016/4/7.
 */
public abstract class AbstractFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}



    @Override
    public void destroy() {}
}
