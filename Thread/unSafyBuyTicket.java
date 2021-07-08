package thread;

public class unSafyBuyTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     buyTickey buyTickey = new buyTickey();
             Thread thread = new Thread(buyTickey,"老板");
             Thread thread2 = new Thread(buyTickey,"学生");
             Thread thread3 = new Thread(buyTickey,"美女");
             Thread thread4 = new Thread(buyTickey,"歌星");
             thread.start();
             thread2.start();
             thread3.start();
             thread4.start();
             
	}
	

}
class buyTickey implements Runnable{
	 boolean flag=true;
     int ticketCount=10;
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		买票
			while(flag){
				buy();
			}
		
	}
//	买票的操作
	public  void buy(){
//		判断是否有票
		 if(ticketCount <= 0){ 
			 flag=false;
			return; 
		 }
//		 谁买票操作
		 System.out.println(Thread.currentThread()
				 .getName()+"买了"+ticketCount--);
		
	}
}