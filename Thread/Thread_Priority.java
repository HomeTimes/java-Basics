package thread;

public class Thread_Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread thread = new Thread(()->{
        	for(int i = 0;i<10;i++){
        		System.out.println(Thread.currentThread().getName()+"--"+i+"优先级为"+Thread.currentThread().getPriority());
        	}
        });
        Thread thread2 = new Thread(()->{
        	for(int i = 0;i<10;i++){
        		System.out.println(Thread.currentThread().getName()+"--"+i+"优先级为"+Thread.currentThread().getPriority());
        	}
        });
        
            System.out.println("伟大的分割线------------------");
//            thread.setPriority(1);
            thread.start();
            
//            设置优先级，有一定概率提高cup的调度机会
            thread2.setPriority(4);
            thread2.start();
//            main
            System.out.println(Thread.currentThread().getName()+Thread.currentThread().getPriority());
            
        
	}

}
