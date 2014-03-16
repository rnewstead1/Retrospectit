package webapp;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.io.IOException;

public abstract class Page {
    protected final StringTemplateGroup templates;

    public Page() {
        this.templates = new StringTemplateGroup("template group", "../retrospectit/src/main/com/powderach/webapp/templates");
    }

    public String generate() throws IOException {
        StringTemplate page = templates.getInstanceOf("page");
        page.setAttribute("title", "Retrospectit");
        page.setAttribute("body", body());
        setOtherAttributes(page);

        return page.toString();
    }

    public abstract StringTemplate body();

    public void setOtherAttributes(StringTemplate page) {};

}