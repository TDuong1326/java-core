package chapter10.lap09;

import java.util.Objects;

public class Member implements Comparable<Member> {
	private int id;
	private String name;
	private int age;

	public Member(int id, String name, int age) {
		this.age = age;
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Member o) {
		if (this.age > o.getAge())
			return this.age - o.getAge();
		else
			return this.name.compareTo(o.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return id == other.id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
