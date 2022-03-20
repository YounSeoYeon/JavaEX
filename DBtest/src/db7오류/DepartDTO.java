package db7¿À·ù;

public class DepartDTO {
	
	private int dptNo;
	private String dptName; 
	private String dptTel;
	
	public DepartDTO(int dptNo, String dptName, String dptTel) {
		this.dptNo = dptNo;
		this.dptName = dptName;
		this.dptTel = dptTel;
	}

	public int getDptNo() {
		return dptNo;
	}

	public void setDptNo(int dptNo) {
		this.dptNo = dptNo;
	}

	public String getDptName() {
		return dptName;
	}

	public void setDptName(String dptName) {
		this.dptName = dptName;
	}

	public String getDptTel() {
		return dptTel;
	}

	public void setDptTel(String dptTel) {
		this.dptTel = dptTel;
	}
	
	
	
	

}
