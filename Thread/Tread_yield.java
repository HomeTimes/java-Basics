package thread;

public class Tread_yield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new Thread(new myYeild(),"�߳�a").start();
     new Thread(new myYeild(),"�߳�f").start();
     
	}
     
	
}
class myYeild implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"������");
//		��ס�߳����óɲ��ɹ���cpu������
		Thread.yield();
		System.out.println(Thread.currentThread().getName()+"û����");
	}
	
}