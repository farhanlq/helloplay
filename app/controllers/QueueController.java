package controllers;

import models.CircularQueue;
import play.mvc.Controller;
import play.mvc.Result;

public class QueueController extends Controller {

	CircularQueue cq = new CircularQueue(6);
	
	public Result insertviews() {
		return ok(views.html.insertqueue.render());
	}
	
	public Result insertQueue(Integer number){
		cq.insertion(number);
		return ok();
			
	}
	
	public Result showQueue(){
		cq.show();
		return ok();
	}
	
	
	public Result deletetviews() {
		return ok(views.html.deletequeue.render());
	}
	
	
	public Result deleteQueue(){
		cq.deletion();
		return ok();
	}
	
	
}
