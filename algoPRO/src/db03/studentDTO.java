package db03;

public class studentDTO {
	private String stdNo;
	private String stdName;
	private int stdYear;
	private String stdAddress;
	private String stdBirthday;
	private String dptNo;
	
	public studentDTO(String stdNo, String stdName, int stdYear, 
			String stdAddress, String stdBirthday, String dptNo) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.stdYear = stdYear;
		this.stdAddress = stdAddress;
		this.stdBirthday = stdBirthday;
		this.dptNo = dptNo;
	}
	
	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdYear() {
		return stdYear;
	}

	public void setStdYear(int stdYear) {
		this.stdYear = stdYear;
	}

	public String getStdAddress() {
		return stdAddress;
	}

	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}

	public String getStdBirthday() {
		return stdBirthday;
	}

	public void setStdBirthday(String stdBirthday) {
		this.stdBirthday = stdBirthday;
	}

	public String getDptNo() {
		return dptNo;
	}

	public void setDptNo(String dptNo) {
		this.dptNo = dptNo;
	}	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(stdNo);
		builder.append("\t");
		builder.append(stdName);
		builder.append("\t\t");
		builder.append(stdYear);
		builder.append("\t");
		builder.append(stdAddress);
		builder.append("\t");
		builder.append(stdBirthday);
		builder.append("\t\t");
		builder.append(dptNo);
		return builder.toString();
	}
}
