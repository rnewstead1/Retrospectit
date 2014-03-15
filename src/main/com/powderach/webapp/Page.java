package webapp;

import core.*;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Page {
    private final StringTemplateGroup templates;

    public Page() {
        this.templates = new StringTemplateGroup("template group", "../retrospectit/src/main/com/powderach/webapp/templates");
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
        return asList(
                activityFor(SetTheScene.values()),
                activityFor(GatherData.values()),
                activityFor(GenerateInsights.values()),
                activityFor(DecideWhatToDo.values()),
                activityFor(CloseRetrospective.values())
                );
    }

    private Activity activityFor(Activity[] activies) {
        return activies[new Random().nextInt(activies.length)];
    }

}