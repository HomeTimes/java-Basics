package thread;

public class Thread_join implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 for(int i = 0;i<1000;i++){
			 System.out.println("线程"+Thread.currentThread().getName()+"----"+i);
		 }
	}
	 
	
	public static void main(String [] args) throws InterruptedException{
//		无论如何都是main线程第一个执行
		 Thread_join first =new Thread_join();
		 Thread thread=new Thread(first,"a");
         thread.start();
		 System.out.println("main");
		         
		for(int i = 0;i<1000;i++){
//			当main线程运行到200的时候，
//			线程a插入运行
			if(i == 200){
				thread.join();
			}
			System.out.println("main"+i);
		 }
	}

}
