package chapter8.lap07;

public class Order {
	private String id;
	private OrderStatus status;

	public Order(String id, OrderStatus status) {
		this.status = status;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void processOrder() {
		class Logger {
			public void printLogger() {
				System.out.println("[LOG] Xử lý đơn hàng ID: " + getId() + " - Trạng thái: " + status.getDescription());
			}
		}
		Logger test = new Logger();
		test.printLogger();
	}

	class CustomerInfo {

		private String name;
		private String phone;

		public CustomerInfo(String name, String phone) {
			this.name = name;
			this.phone = phone;
		}

		public void printInfo() {
			System.out.println("Khách hàng: " + this.name + " - " + this.phone);
			System.out.println("Trạng thái đơn hàng: " + status.getDescription());
		}
	}

	static class DiscountHelper {

		public String calculateDiscount(OrderStatus status) {
			if (status.name().equals("SHIPPED")) {
				return "10%";
			} else if (status.name().equals("DELIVERED") || status.name().equals("CANCELLED")) {
				return "0%";
			}
			return "5%";
		}
	}

}
