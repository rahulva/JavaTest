package com.test.core.string;

public class StringTest {
	public static void main(String[] args) {
		String strLit = "A";
		String strObj = new String("A");

		System.out.println("hashCode trLit " + strLit.hashCode());
		System.out.println("hashCode strObj " + strObj.hashCode());

		System.out.println("identity hashCode trLit " + System.identityHashCode(strLit));
		System.out.println("identity hashCode strObj " + System.identityHashCode(strObj));

		System.out.println("Equal > " + strLit.equals(strObj));
		System.out.println("== > not the same reference " + (strLit == strObj));
		System.out.println("== > Calling intern");
		String strObjNew = strObj.intern();
		System.out.println("== > is same reference? " + (strLit == strObjNew));
		System.out.println("identity hashCode strObjNew " + System.identityHashCode(strObjNew));

		// Once you call intern it returns the same cannonical string available in
		// String pool
	}
}
