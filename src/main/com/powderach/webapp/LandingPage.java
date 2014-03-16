package webapp;

import org.antlr.stringtemplate.StringTemplate;

public class LandingPage extends Page {

    @Override
    public StringTemplate body() {
        return templates.getInstanceOf("landing");
    }

}
