package org.vaadin.bpexampleapp.forms;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.RouterLayout;

import org.vaadin.bpexampleapp.lists.*;

public class FormContentHome extends VerticalLayout {
	
	
	public static VerticalLayout  FormContent() {
		VerticalLayout FormContent = new VerticalLayout();
		DatePicker dateOfAction = new DatePicker("Date");
		TextField nameOfAction = new TextField("Name");
		Select<String> actionType = new Select<String>("Action");
		actionType.setItems("Control", "Visit");
		FormContent.add(new Text("Home"));
		FormContent.add(dateOfAction,nameOfAction,actionType);
		return FormContent;
}
}
