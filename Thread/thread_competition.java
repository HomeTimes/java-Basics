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
//	ģ���߳�����
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
    	  
//    	  main �߳�
    	  System.out.println(Thread.currentThread().getName());
    	  thread_competition  thread3=new  thread_competition();
//    	  ��ĭĭ �߳�
    	  new Thread(thread3,"��ĭĭ").start();
//    	  ��� �߳�
    	  new Thread(thread3,"���").start();
      }
}
