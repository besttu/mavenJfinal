package com.controller;

import com.jfinal.core.Controller;

public class BehindController extends Controller {
	public void index() {
		render("BehindTest.jsp");
	}

	public void add() {
		renderText("add");
	}

}
