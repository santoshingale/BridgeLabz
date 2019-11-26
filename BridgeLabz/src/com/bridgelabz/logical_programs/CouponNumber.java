package com.bridgelabz.logical_programs;

public class CouponNumber {
	
	public StringBuffer getCoupon() {
		char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		
		StringBuffer stringBuffer = new StringBuffer();
		int num = 234210000;
		int random = (int) (Math.random() * num);
		
		while(random > 0) {
			stringBuffer.append(chars[random%chars.length]);
			random /= chars.length;
		}
		return stringBuffer;
	}

	public static void main(String[] args) {
		CouponNumber coupon = new CouponNumber();
		StringBuffer couponCode = coupon.getCoupon();
		System.out.println(couponCode);

	}

}
