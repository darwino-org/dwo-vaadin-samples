package com.darwino.demo.vaddin.hw.app;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("helloworldtheme")
public class HelloWorldVaadinUI extends UI {

	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		Button button = new Button("Click Me, Darwino user");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				layout.addComponent(new Label("Thank you for clicking - you got me!"));
			}
		});
		layout.addComponent(button);
	}

	@WebServlet(urlPatterns = "/*", name = "HelloWorldVaadinUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = HelloWorldVaadinUI.class, productionMode = false)
	public static class HelloWorldVaadinUIServlet extends VaadinServlet {
	}

}