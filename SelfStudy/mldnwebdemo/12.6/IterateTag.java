package org.lxh.tagdemo;
import java.util.Iterator;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;
public class IterateTag extends TagSupport {
    private String name;
    private String scope;
    private String id;
    private Iterator<?> iter;
    public int doStartTag() throws JspException {
        Object value = null;
        if("page".equals(this.scope)) {
            value = super.pageContext.getAttribute(name, PageContext.PAGE_SCOPE);
        } else if("request".equals(this.scope)) {
            value = super.pageContext.getAttribute(name, PageContext.REQUEST_SCOPE);
        } else if("session".equals(this.scope)) {
            value = super.pageContext.getAttribute(name, PageContext.SESSION_SCOPE);
        } else {
            value = super.pageContext.getAttribute(name, PageContext.APPLICATION_SCOPE);
        }
        if (value != null && value instanceof List<?>) {
            this.iter = ((List<?>) value).iterator() ;
            if(iter.hasNext()) {
                super.pageContext.setAttribute(id, iter.next());
                return TagSupport.EVAL_BODY_INCLUDE;
            } else {
                return TagSupport.SKIP_BODY;
            }
        } else {
            return TagSupport.SKIP_BODY;
        }
    }
    public int doAfterBody() throws JspException {
        if (iter.hasNext()) {
            super.pageContext.setAttribute(id, iter.next());
            return TagSupport.EVAL_BODY_AGAIN;
        } else {
            return TagSupport.SKIP_BODY;
        }
    }
    public String getName() {
        return name;
    }
     public void setName(String name) {
         this.name = name;
     }
    public String getScope() {
        return scope;
    }
    public void setScope(String scope) {
        this.scope = scope;
    } 
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}