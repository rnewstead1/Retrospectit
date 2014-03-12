package com.powderach.web;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.io.IOException;

public class Page {
    private final StringTemplateGroup templates;

    public Page() {
        this.templates = new StringTemplateGroup("template group", "../retrospectit/src/main/java/com/powderach/web/templates");
    }

    public String generate() throws IOException {
        StringTemplate page = templates.getInstanceOf("page");
        StringTemplate body = templates.getInstanceOf("body");
        page.setAttribute("body", body);
        page.setAttribute("title", "Retrospectit");

        return page.toString();
    }

}