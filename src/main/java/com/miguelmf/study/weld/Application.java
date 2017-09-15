package com.miguelmf.study.weld;

import com.miguelmf.study.weld.app.Controller;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Application {

    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        Controller controller = container.select(Controller.class).get();
        controller.greet();

        container.shutdown();
    }
}
