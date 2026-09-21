package chapter8.video89;

public enum Level {

	// gán thuộc tính
	HARD("Level kho", 3), MEDIUM("Level trung binh", 2), EASY("Level de", 1);

	// Thuộc tính là 'final' và không dùng Setter để đảm bảo tính bất biến
	// (Immutable) cho Enum
	private final String description;
	private final int count;

	Level(String description, int count) {
		this.description = description;
		this.count = count;
	}

	public void printInfo() {
		System.out.println("hello");
	}

	// Chỉ cấp Getter để đọc thông tin mô tả
	public String getDescription() {
		return description;
	}

	public int getCount() {
		return count;
	}

}
