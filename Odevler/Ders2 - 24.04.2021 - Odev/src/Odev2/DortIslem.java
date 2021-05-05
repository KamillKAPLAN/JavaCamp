package Odev2;

public class DortIslem {
	
	public int topla(int s1, int s2) {
		return s1 + s2;
	}
	
	public int topla(int s1, int s2, int s3) {
		return s1 + s2 + s3;
	}
	
	public int cikar(int s1, int s2) {
		return s1 - s2;
	}
	
	public int carp(int s1, int s2) {
		return s1 * s2;
	}
	
	public int bol(int s1, int s2) {
		if(s2 != 0)
			return s1 / s2;
		return -1;
	}
}
