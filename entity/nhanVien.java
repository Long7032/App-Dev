package entity;
public class nhanVien {
	public nhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String maNV, hoNV, tenNV;
	private int tuoi;
	private boolean phai;
	private double luong;
	private phongBan phong;
	
	public phongBan getPhong() {
		return phong;
	}
	public void setPhong(phongBan phong) {
		this.phong = phong;
	}
	
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoNV() {
		return hoNV;
	}
	public void setHoNV(String hoNV) {
		this.hoNV = hoNV;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public boolean isPhai() {
		return phai;
	}
	public void setPhai(boolean phai) {
		this.phai = phai;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = luong;
	}
	public nhanVien(String maNV, String hoNV, String tenNV, int tuoi, boolean phai, double luong, phongBan phong) {
		super();
		this.maNV = maNV;
		this.hoNV = hoNV;
		this.tenNV = tenNV;
		this.tuoi = tuoi;
		this.phai = phai;
		this.luong = luong;
		this.phong = phong;
	}
}
