package thread;

public class Thread_join implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 for(int i = 0;i<1000;i++){
			 System.out.println("�߳�"+Thread.currentThread().getName()+"----"+i);
		 }
	}
	 
	
	public static void main(String [] args) throws InterruptedException{
//		������ζ���main�̵߳�һ��ִ��
		 Thread_join first =new Thread_join();
		 Thread thread=new Thread(first,"a");
         thread.start();
		 System.out.println("main");
		         
		for(int i = 0;i<1000;i++){
//			��main�߳����е�200��ʱ��
//			�߳�a��������
			if(i == 200){
				thread.join();
			}
			System.out.println("main"+i);
		 }
	}

}
