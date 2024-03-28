package week8;
import java.util.Scanner;
interface OrderDelivery{
	public void deliverOrder();
}
class Swiggy implements OrderDelivery{
	String cust_name;
	byte orderID;
	Swiggy(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer Name... ");
		cust_name=sc.next();
		System.out.println("Enter the order ID... ");
		orderID=sc.nextByte();
	}
	public void deliverOrder() {
		System.out.println("Delivering food order of Mr. "+cust_name+" with order number "+orderID+" . ");
	}
}
class SwiggyInstamart implements OrderDelivery{
	String cust_name;
	byte orderID;
	int product_qty;
	
	SwiggyInstamart(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer name...");
		cust_name=sc.next();
		System.out.println("Enter the order ID...");
		orderID=sc.nextByte();
		System.out.println("Enter the product quantity...");
		product_qty=sc.nextInt();
	}
	public void deliverOrder() {
		System.out.println("Delivering Grocery order of Mr. "+cust_name+" with order number "+orderID+" . \n The total no. of products delivered are "+product_qty);
	}
}
class Delivery{
	public void deliverToCustomer(OrderDelivery od) {
		od.deliverOrder();
	}
}
public class OCP_orderDelivery{
	public static void main(String args[]) {
		Delivery order = new Delivery();
		Swiggy sw = new Swiggy();
		order.deliverToCustomer(sw);
		SwiggyInstamart insta = new SwiggyInstamart();
		order.deliverToCustomer(insta);
	}
}
