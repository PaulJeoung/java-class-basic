package ch07.extend_s;

public class SmartPhone extends Phone{
	public SmartPhone(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}