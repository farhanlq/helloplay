package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class MyController extends Controller {

	public Result index() {
		return ok("Hello Play from Eclipse Latest");
	}

	public Result views() {
		return ok(views.html.palindrome.render());
	}

	public Result result(Integer number) {
		int temp = number;
		int reverse = 0, rem;
		while (number != 0) {
			rem = number % 10;
			reverse = reverse * 10 + rem;
			number /= 10;

		}

		if (temp == reverse)
			return ok(temp + " is a Palindrome Number. ");
		else
			return ok(temp + " is not a Palindrome Number. ");

	}
}
