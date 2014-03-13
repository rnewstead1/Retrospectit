package com.powderach;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.io.IOException;
import java.util.List;

import static java.util.Arrays.asList;

public class Page {
    private final StringTemplateGroup templates;

    public Page() {
        this.templates = new StringTemplateGroup("template group", "../retrospectit/src/main/webapp/templates");
    }

    public String generate() throws IOException {
        StringTemplate page = templates.getInstanceOf("page");
        StringTemplate body = templates.getInstanceOf("body");
        page.setAttribute("body", body);
        page.setAttribute("activities", activities());
        page.setAttribute("title", "Retrospectit");

        return page.toString();
    }

    private List<Activity> activities() {
        return asList(Activity.values());
    }

}