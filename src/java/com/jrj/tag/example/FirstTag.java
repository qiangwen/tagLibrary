package com.jrj.tag.example;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

@SuppressWarnings("serial")
public class FirstTag extends TagSupport{

	@Override
	public int doEndTag() throws JspException {
		try {
			pageContext.getOut().write("hello world");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
}
