/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author leduc
 */
public class Subject {
	private int maMH;
	private String tenMH;
	private int dvht;
	public int getMaMH() {
		return maMH;
	}
	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}
	public String getTenMH() {
		return tenMH;
	}
	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}
	public int getDvht() {
		return dvht;
	}
	public void setDvht(int dvht) {
		this.dvht = dvht;
	}
	public monhocModel(int maMH, String tenMH, int dvht) {
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.dvht = dvht;
	}
	public monhocModel() {
		
	}
	
}    
}
