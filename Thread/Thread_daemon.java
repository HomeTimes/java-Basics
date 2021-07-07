package thread;

public class Thread_daemon {
   
	public static void main  (String [] args){
		superman superman = new superman();
		you you = new you();
		Thread thread=new Thread(superman,"上帝线程");
		Thread thread2=new Thread(you,"you线程");
//		只要是正常的线程都是用户线程
//		jvm必须等待用户线程执行完毕
//		jvm不用等待守护线程执行完毕
//		还有线程的必须要设置才能是守护线程
		thread.setDaemon(true);
		thread.start();
		thread2.start();
		
	}
}

class superman implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("超人一直守护着你");
		}
	}
	
}
class you implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for(int i =0;i < 365;i++){
	    	System.out.println(Thread.currentThread().getName()+"活了"+i+"天");
	    }
	}
	
}