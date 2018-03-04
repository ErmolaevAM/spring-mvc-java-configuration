package com.spring.mvc.config;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Nullable
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    @Nullable
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
