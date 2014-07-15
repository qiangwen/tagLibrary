package com.jrj.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example")
public class FirstTagAction {

	private HttpServletRequest request;
	private HttpServletResponse response;
	
	@ModelAttribute
	private void setRequestAndResponse(HttpServletRequest request,HttpServletResponse response){
		this.request = request;
		this.response = response;
	}
	
	@RequestMapping(value="/firstTag",method=RequestMethod.GET)
	public ModelAndView firstTag(){
		
		return new ModelAndView("FirstTag");
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	
}
