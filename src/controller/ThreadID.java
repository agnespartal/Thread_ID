package controller;

public class ThreadID extends Thread {

	private long id;
	
	public ThreadID(long id) {
		this.id = id;
	}
	
	@Override
	public void run() {
		id(id);
		
	}

	private void id(long id) {
		id = getId();
		System.out.println("#" + id);
	}
	
}
