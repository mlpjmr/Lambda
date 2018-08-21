package com.Lambda7;

public class Greeter {
	
	public void greet(Greeting greeting) {
		System.out.println(" Hello world - Added for first change GIT ");
		greeting.perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter = new Greeter();
		//HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		//MyLambda myLambdaExp = () -> System.out.print(" Lambda Hello World ");
		
		Greeting myLambdaExp = () -> System.out.print(" Lambda Hello World ");
		//myLambdaExp.foo();
		myLambdaExp.perform();
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform( ) {
				System.out.print(" Inner class Hello World ");
			}
		};
		
		greeter.greet(myLambdaExp);
		greeter.greet(innerClassGreeting);

	}
}


/*interface MyLambda {
	void foo();
}*/