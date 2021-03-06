package org.lxh.struts.form;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
public class HelloForm extends ActionForm {
    private String info;
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (this.info == null || "".equals(this.info)) {
            errors.add("info",new ActionMessage("error.info"));
        }
        return errors;
    }
    public void reset(ActionMapping mapping, HttpServletRequest request){

    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info){
        this.info = info;
    }
}