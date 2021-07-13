package io.lamda;

public class HelloWorld {

	static Greeter helloGreeter;
	public static void main(String[] args) {
		helloGreeter = new HelloGreeter();		
		Sample sample = new Sample();		
		helloGreeter = ()-> System.out.println("Hello world from lambda");
		helloGreeter = (int a, int b)-> a+b;
		sample.greet();
	}
	
	public void greet() {
		helloGreeter.perform();
	}
}
