package thread;

public class thread_competition  implements Runnable{
    int meter =10;
    String winner;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			boolean len=gameOver(meter);
			if(len){
				break;
			}
			System.out.println(Thread.currentThread().getName()+meter--);
		}
	}
//	模拟线程赛跑
   boolean  gameOver(int step){
	   if(winner != null){  
		   return true;
	   }{
		   if(step <= 0){
			   winner=Thread.currentThread().getName();
			   System.out.println("winner is"+winner);
			   return true;
		   }
	   }
	   return false;
	   
   }
      public static void main(String [] args){
    	  
//    	  main 线程
    	  System.out.println(Thread.currentThread().getName());
    	  thread_competition  thread3=new  thread_competition();
//    	  夏沫沫 线程
    	  new Thread(thread3,"夏沫沫").start();
//    	  大大 线程
    	  new Thread(thread3,"大大").start();
      }
}
