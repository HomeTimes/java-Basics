package thread;

import java.lang.Thread.State;

public class ThreadState {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         Thread thread = new  Thread(()->{
        	for(int i =0;i < 10;i++){ 
        		try {
//        			这是静态方法
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
         }); 
         //状态应为new
            State state = thread.getState();
            System.out.println("状态为"+state);
             //就绪
            thread.start();
//            不要在new state浪费内存空间
            state = thread.getState();
            System.out.println("状态为"+state);
//            如果线程不是结束状态
            while(state != Thread.State.TERMINATED){
//            	如果不加注释，会很有趣，可以试一下
//            	Thread.sleep(1000);
            	state = thread.getState();
            	System.out.println("状态为"+state);
            }
         }
         
	}

