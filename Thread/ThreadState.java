package thread;

import java.lang.Thread.State;

public class ThreadState {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         Thread thread = new  Thread(()->{
        	for(int i =0;i < 10;i++){ 
        		try {
//        			���Ǿ�̬����
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
         }); 
         //״̬ӦΪnew
            State state = thread.getState();
            System.out.println("״̬Ϊ"+state);
             //����
            thread.start();
//            ��Ҫ��new state�˷��ڴ�ռ�
            state = thread.getState();
            System.out.println("״̬Ϊ"+state);
//            ����̲߳��ǽ���״̬
            while(state != Thread.State.TERMINATED){
//            	�������ע�ͣ������Ȥ��������һ��
//            	Thread.sleep(1000);
            	state = thread.getState();
            	System.out.println("״̬Ϊ"+state);
            }
         }
         
	}

