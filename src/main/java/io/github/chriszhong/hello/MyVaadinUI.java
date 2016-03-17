package io.github.chriszhong.hello;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
public class MyVaadinUI extends UI {

    private static final long serialVersionUID = -5026493348790977491L;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("Hello! I'm the root UI!"));
    }

}
