package models;

public class CircularQueue {

	private int[] circularQueue;
	private int size = 6;
	private int rear, front;

	public CircularQueue(int size) {
		this.size = size;
		front = 0;
		rear = 0;
		this.circularQueue = new int[size];

	}

	/*
	 * public void insertion(int ele) { if (number == size) {
	 * System.out.println("Circular Queue is OverFlow!!!"); } else {
	 * circularQueue[rear] = ele; System.out.println(+circularQueue[rear]
	 * +" is inserted into the circular queue"); rear = (rear + 1) % size;
	 * number++; } }
	 */

	public void insertion(int item) {
		if (front == 0 && rear == (circularQueue.length - 1) || rear == (front - 1) % (circularQueue.length - 1))
			System.out.println("Circular Queue is Overflow!!!");
		else if (front == -1) {
			front = rear = 0;
			circularQueue[rear] = item;
		} else if (rear == circularQueue.length - 1 && front != 0) {
			rear = 0;
			circularQueue[rear] = item;
		} else {
			rear = rear + 1;
			circularQueue[rear] = item;
		}

		System.out.println(circularQueue[rear] + " is successfully inserted into the circular queue.");

	}

	public void show() {

		if (front == -1)
			System.out.println("Queue is Empty.");

		System.out.println("Elements in Circular Queue are ");
		if (rear >= front) {
			for (int i = 0; i <= rear; i++) {
				System.out.print(circularQueue[i] + " ");
			}
		} else {
			for (int i = front; i < circularQueue.length; i++)
				System.out.print(circularQueue[i] + " ");
			for (int i = 0; i <= rear; i++)
				System.out.print(circularQueue[i] + " ");
		}
	}
	/*
	 * public void deletion() { if (size == 0)
	 * System.out.println("Circular Queue is UnderFlow!!!"); else { int delNum =
	 * circularQueue[front]; circularQueue[front] = 0; front = (front + 1) %
	 * size; size--; System.out.println(delNum +
	 * " is sucessfully deleted from the Circular Queue");
	 * 
	 * } }
	 */

	public void deletion() {
		if (front == -1)
			System.out.println("Circular Queue is Underflow!!!");
		int el = circularQueue[front];
		circularQueue[front] = -1;
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (front == circularQueue.length - 1)
			front = 0;
		else
			front++;
		System.out.println(el + " is successfully deleted from the circular queue.");
	}

	
	
	
}
