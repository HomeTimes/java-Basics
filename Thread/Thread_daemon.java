package thread;

public class Thread_daemon {
   
	public static void main  (String [] args){
		superman superman = new superman();
		you you = new you();
		Thread thread=new Thread(superman,"�ϵ��߳�");
		Thread thread2=new Thread(you,"you�߳�");
//		ֻҪ���������̶߳����û��߳�
//		jvm����ȴ��û��߳�ִ�����
//		jvm���õȴ��ػ��߳�ִ�����
//		�����̵߳ı���Ҫ���ò������ػ��߳�
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
			System.out.println("����һֱ�ػ�����");
		}
	}
	
}
class you implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	    for(int i =0;i < 365;i++){
	    	System.out.println(Thread.currentThread().getName()+"����"+i+"��");
	    }
	}
	
}