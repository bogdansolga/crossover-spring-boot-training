package com.crossover.springboot.training.d03.s01.config;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ProductController {

    @PreAuthorize("isFullyAuthenticated() AND hasAnyRole('ROLE_ADMIN', 'ROLE_MANAGER')")
    public void addProduct(@AuthenticationPrincipal UserDetails userDetails) {
        final Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
    }

    public void processInternalRequest(@RequestHeader(value = "SECURITY_TOKEN") final String securityToken) {
        if (securityToken.isEmpty()) {
            throw new AccessDeniedException("Nope");
        }
    }
}
