package ch03;

public class Code09_1 {

	public static void main(String[] args) {
		int value = 772;
		
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;
		System.out.println("첫번때 바이트 부호 없는 값 : " + int1);
		
		byte byte2 = (byte) (value >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("두번때 바이트 부호 없는 값 : " + int2);
		
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255;
		System.out.println("세번때 바이트 부호 없는 값 : " + int3);
		
		byte byte4 = (byte) value;
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.println("네번때 바이트 부호 없는 값 : " + int4);
	}

}
