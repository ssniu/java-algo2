package ssn.sort;

public class DemoThread {

	public static void main(String[] args) {
		Demo1 de = new Demo1();
		de.start();
		
		Demo2 de2 = new Demo2();
		Thread t = new Thread(de2);
		
		t.start();
	}

}

class Demo1 extends Thread{
	int times = 0;
	public void run(){
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			times++;
			System.out.println("Hello World");
			if(times == 10) break;
		}
		
	}
}

class Demo2 implements Runnable {
	int times2 = 0;

	@Override
	public void run() {
		
		while(true){
			try{
				Thread.sleep(2000);
			}catch(Exception ex){
				ex.printStackTrace();
			}
			times2++;
			System.out.println("Interface works");
			if(times2 == 10)
				break;
		}
		
	}
	
}


