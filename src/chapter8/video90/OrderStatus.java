package chapter8.video90;

public enum OrderStatus {

	PENDING("Chờ xác nhận"), SHIPPED("Đang giao hàng"), DELIVERED("Đã giao"), CANCELLED("Đã huỷ");

	private final String description;

	OrderStatus(String description) {
		this.description = description;
	}

	public boolean hasFinal() {
		if (this == DELIVERED || this == CANCELLED) {
			return true;
		}
		return false;
	}

	public String getStatus() {
		return this.description;
	}

}
