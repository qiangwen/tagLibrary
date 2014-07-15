package com.jrj.tag.example;

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

@SuppressWarnings("serial")
public class ForEachTag extends BodyTagSupport {

	@SuppressWarnings("rawtypes")
	private Collection items;
	private String var;
	@SuppressWarnings("rawtypes")
	private Iterator it;
	
	@Override
	public int doStartTag() throws JspException {
		if(items==null||items.size()==0)
			return SKIP_BODY;
		it = items.iterator();
		if(it.hasNext()){
			pageContext.setAttribute(var, it.next());
			
		}
		return EVAL_BODY_INCLUDE;
		
	}
	
	@Override
	public int doAfterBody() throws JspException {
		
		if(it.hasNext()){
			pageContext.setAttribute(var, it.next());
			return EVAL_BODY_AGAIN;
			
		}
		return SKIP_BODY;	
	}
	
	@Override
	public int doEndTag() throws JspException {
		
		return EVAL_PAGE;
	}

	@SuppressWarnings("rawtypes")
	public Collection getItems() {
		return items;
	}

	@SuppressWarnings("rawtypes")
	public void setItems(Collection items) {
		this.items = items;
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}
	
}
