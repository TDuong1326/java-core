package chapter8.lap07;

public class Lap07 {
	public static void main(String[] args) {

		Runnable task = new Runnable() {
			@Override
			public void run() {
				OrderStatus myStatus = OrderStatus.PENDING;

				Order or = new Order("123", myStatus);
				or.processOrder();

				Order.CustomerInfo oc = or.new CustomerInfo("tung duong", "092178462");
				oc.printInfo();

				Order.DiscountHelper od = new Order.DiscountHelper();
				System.out.println("Chiết khấu áp dụng: " + od.calculateDiscount(myStatus));
				System.out.println(
						"Đơn hàng " + or.getId() + " đang được xử lý ở trạng thái: " + myStatus.getDescription());
			}
		};
		task.run();
	}
}
