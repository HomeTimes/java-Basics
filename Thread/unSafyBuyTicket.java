package thread;

public class unSafyBuyTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     buyTickey buyTickey = new buyTickey();
             Thread thread = new Thread(buyTickey,"�ϰ�");
             Thread thread2 = new Thread(buyTickey,"ѧ��");
             Thread thread3 = new Thread(buyTickey,"��Ů");
             Thread thread4 = new Thread(buyTickey,"����");
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
//		��Ʊ
			while(flag){
				buy();
			}
		
	}
//	��Ʊ�Ĳ���
	public  void buy(){
//		�ж��Ƿ���Ʊ
		 if(ticketCount <= 0){ 
			 flag=false;
			return; 
		 }
//		 ˭��Ʊ����
		 System.out.println(Thread.currentThread()
				 .getName()+"����"+ticketCount--);
		
	}
}