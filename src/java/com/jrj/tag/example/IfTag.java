package com.jrj.tag.example;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

@SuppressWarnings("serial")
public class IfTag extends TagSupport{

	private boolean condition;

	@Override
	public int doStartTag() throws JspException {
		
		return condition?EVAL_BODY_INCLUDE:SKIP_BODY;
	}
	public boolean isCondition() {
		return condition;
	}

	public void setCondition(boolean condition) {
		this.condition = condition;
	}
	
	
}
