package com.github.mkopylec.errorest.handling.errordata.security;

import com.github.mkopylec.errorest.configuration.ErrorestProperties;
import org.springframework.security.access.AccessDeniedException;

public class AccessDeniedErrorDataProvider extends SecurityErrorDataProvider<AccessDeniedException> {

    public AccessDeniedErrorDataProvider(ErrorestProperties errorestProperties) {
        super(errorestProperties);
    }
}