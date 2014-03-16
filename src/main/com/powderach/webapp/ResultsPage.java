package webapp;

import core.ActivityPicker;
import org.antlr.stringtemplate.StringTemplate;

public class ResultsPage extends Page {
    private final ActivityPicker activityPicker;

    public ResultsPage() {
        this.activityPicker = new ActivityPicker();
    }

    @Override
    public void setOtherAttributes(StringTemplate page) {
        page.setAttribute("activities", activityPicker.activities());
    }

    @Override
    public StringTemplate body() {
        return templates.getInstanceOf("results");
    }
}
