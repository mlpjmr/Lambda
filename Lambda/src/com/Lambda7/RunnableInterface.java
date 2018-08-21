/**
 * 
 */
package com.Lambda7;

/**
 * @author madhavi.sandinti
 *
 */
public class RunnableInterface {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(" Printed from a Thread");
 
			}
		});
		
		myThread.run();
		
		
		Thread myLambdaThread = new Thread(() -> System.out.print(" Lambda From thread "));
		myLambdaThread.run();
		// TODO Auto-generated method stub

	}

}
