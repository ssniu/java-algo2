package com.multithreads;

public class DemoMultiThreads {

	public static void main(String[] args) {
		Pig p = new Pig(10);
		Bird b = new Bird(10);
      
		Thread p1 = new Thread(p);
		Thread b1 = new Thread(b);
		
		p1.start();
		b1.start();
		
	}

}

class Bird implements Runnable{
	
	int n = 0;
	int result = 0;
	int times = 0;
	
	public Bird(int n){
		this.n = n;
	}
	
	public void run(){
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			result +=(++times);
			if(times == n){
				System.out.println("The result is " + result);
			}
		}
	}
}

class Pig implements Runnable{
	int n = 0;
	int times = 0;
	
	public Pig(int n){
		this.n = n;
	}
	public void run(){
		while(true){
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
			
			times++;
			System.out.println("pig is working" + times);
			if(times == 10)
				 break;
		}
	}
}