package webapp;

import core.*;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.io.IOException;

public class Page {
    private final StringTemplateGroup templates;
    private final ActivityPicker activityPicker;

    public Page() {
        this.templates = new StringTemplateGroup("template group", "../retrospectit/src/main/com/powderach/webapp/templates");
        activityPicker = new ActivityPicker();
    }

    public String generate() throws IOException {
        StringTemplate page = templates.getInstanceOf("page");
        StringTemplate body = templates.getInstanceOf("body");
        page.setAttribute("body", body);
        page.setAttribute("activities", activityPicker.activities());
        page.setAttribute("title", "Retrospectit");

        return page.toString();
    }

}