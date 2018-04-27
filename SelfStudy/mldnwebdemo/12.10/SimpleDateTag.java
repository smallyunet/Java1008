package org.lxh.tagdemo;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
public class SimpleDateTag extends SimpleTagSupport {
    private String format;
    @Override
    public void doTag() throws JspException, IOException {
        SimpleDateFormat sdf = new SimpleDateFormat(this.format);
        try {
            super.getJspContext().getOut().write(sdf.format(new Date()));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
}