package controllers;

import java.util.Set;

import models.Lift;
import play.*;
import play.mvc.*;
import views.html.list;

public class Lifts extends Controller {
	public static Result list() {
		Set<Lift> lifts = Lift.findAll();
		return ok(list.render(lifts));
	}

	public static Result showBlank() {
		return TODO;
	}

	public static Result show(Integer id) {
		return TODO;
	}

	public static Result save() {
		return TODO;
	}
}
