package com.ensah.config;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import com.ensah.core.bo.BlockIP;
import com.ensah.core.services.IBlockIPService;

public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {

	@Autowired
	IBlockIPService bipser;
	
	
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {

		// write your custom code here
		
		System.out.println(exception.getLocalizedMessage());
		
		if (exception instanceof DisabledException) {
			response.sendRedirect("login?error=disabled");
			return;

		} 
		
		else if (exception instanceof LockedException) {
			response.sendRedirect("login?error=locked");
			return;

		} 
		else if (exception instanceof CredentialsExpiredException) {
			response.sendRedirect("showMyLoginPage?error=expired");
			return;

		} 
		else if(exception instanceof BadCredentialsException) {
			bipser.blockip(request);
			response.sendRedirect("login?error");
		}
		else {
			
			
			response.sendRedirect("login?error");

		}
	}

}