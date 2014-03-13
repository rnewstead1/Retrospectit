package com.powderach;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.io.IOException;

public class Page {
    private final StringTemplateGroup templates;

    public Page() {
        this.templates = new StringTemplateGroup("template group", "../retrospectit/src/main/webapp/templates");
    }

    public String generate() throws IOException {
        StringTemplate page = templates.getInstanceOf("page");
        StringTemplate body = templates.getInstanceOf("body");
        page.setAttribute("body", body);
        page.setAttribute("title", "Retrospectit");

        return page.toString();
    }

}