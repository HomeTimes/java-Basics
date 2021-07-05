package thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread_sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try {
        	  updateTime();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void delayed() throws InterruptedException{
		int i=0;
		System.out.println(Thread.currentThread().getName());
		while(true){
			Thread.sleep(1000);
			System.out.println(i++);
			if(i==10){
				break;
			}
		}
	}
public static void updateTime() throws InterruptedException{
		
//	获取当前系统的时间
		Date date=new Date(System.currentTimeMillis());
		System.out.println(Thread.currentThread().getName());
		while(true){
			Thread.sleep(1000);
		    String formatTime=	new SimpleDateFormat("HH:mm:ss").format(date);
			System.out.println(formatTime);
//			重新赋值，要不然date值获取的是31行的值
			date=new Date(System.currentTimeMillis());
		}
	}
}
