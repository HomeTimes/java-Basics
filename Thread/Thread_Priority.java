package thread;

public class Thread_Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread thread = new Thread(()->{
        	for(int i = 0;i<10;i++){
        		System.out.println(Thread.currentThread().getName()+"--"+i+"���ȼ�Ϊ"+Thread.currentThread().getPriority());
        	}
        });
        Thread thread2 = new Thread(()->{
        	for(int i = 0;i<10;i++){
        		System.out.println(Thread.currentThread().getName()+"--"+i+"���ȼ�Ϊ"+Thread.currentThread().getPriority());
        	}
        });
        
            System.out.println("ΰ��ķָ���------------------");
//            thread.setPriority(1);
            thread.start();
            
//            �������ȼ�����һ���������cup�ĵ��Ȼ���
            thread2.setPriority(4);
            thread2.start();
//            main
            System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority());
            
        
	}

}
