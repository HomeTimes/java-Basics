package thread;

public class Tread_yield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new Thread(new myYeild(),"线程a").start();
     new Thread(new myYeild(),"线程f").start();
     
	}
     
	
}
class myYeild implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"礼让了");
//		记住线程礼让成不成功看cpu的心情
		Thread.yield();
		System.out.println(Thread.currentThread().getName()+"没礼让");
	}
	
}