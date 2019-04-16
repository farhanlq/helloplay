package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class ArmstrongController extends Controller{

	public Result views() {
		return ok(views.html.armstrong.render());
	}

	public Result armstrongResult(Integer number) {
		int temp = number;
		int reverse = 0, rem;
		while (number != 0) {
			rem = number % 10;
			reverse = reverse * 10  + rem * rem * rem;
			number /= 10;

		}

		if (temp == reverse)
			return ok(temp + " is an Armstrong Number. ");
		else
			return ok(temp + " is not an Armstrong Number. ");

	}
	
}
