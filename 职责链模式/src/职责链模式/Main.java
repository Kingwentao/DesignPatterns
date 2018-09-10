package 职责链模式;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler h1=new ConcreteHandler1();
		Handler h2=new ConcreteHandler2();
		Handler h3=new ConcreteHandler3();
		//设置责任链的上家与下家
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		int[] requests={2,8,15,20,25,29};
		for (int request : requests) {
			h1.handleRequest(request);
		}
	}
}

/*1.责任链模式
 * 由于一项任务的各部分处理权限不同，所以使用责任链模式可以很好的处理。
 * 某项权限不够把任务给权限更高的来处理
 * 
 */
