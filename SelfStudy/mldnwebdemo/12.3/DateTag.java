package org.lxh.tagdemo;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
public class DateTag extends TagSupport {
    private String format;
    public int doStartTag() throws JspException {
        SimpleDateFormat sdf = new SimpleDateFormat(this.format);
        try {
            super.pageContext.getOut().write(sdf.format(new Date()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return TagSupport.SKIP_BODY;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format){
        this.format = format;
    }
}