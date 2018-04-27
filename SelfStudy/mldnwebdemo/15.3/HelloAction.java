package org.lxh.struts.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.lxh.struts.form.HelloForm;
public class HelloAction extends Action {
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        HelloForm helloForm = (HelloForm) form;
        String info = helloForm.getInfo();
        request.setAttribute("msg", info);
        return mapping.findForward("show");
    }
}