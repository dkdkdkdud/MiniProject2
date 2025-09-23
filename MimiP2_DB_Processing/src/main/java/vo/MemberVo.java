package vo;

public class MemberVo {

	int mem_idx;
	String mem_name;
	String mem_id;
	String mem_pwd;
	String mem_email;
	String mem_ip;
	String mem_regdate;
	String mem_grade;
	
	//생성자
	public MemberVo() {
		// TODO Auto-generated constructor stub
	}
	
	//insert 생성자
	public MemberVo(int mem_idx, String mem_name, String mem_id, String mem_pwd, String mem_email, String mem_ip,
			String mem_regdate, String mem_grade) {
		super();
		this.mem_idx = mem_idx;
		this.mem_name = mem_name;
		this.mem_id = mem_id;
		this.mem_pwd = mem_pwd;
		this.mem_email = mem_email;
		this.mem_ip = mem_ip;
		this.mem_regdate = mem_regdate;
		this.mem_grade = mem_grade;
	}
	
	//modify 생성자
	public MemberVo(String mem_name, String mem_id, String mem_pwd, String mem_email, String mem_ip, String mem_grade) {
		super();
		this.mem_name = mem_name;
		this.mem_id = mem_id;
		this.mem_pwd = mem_pwd;
		this.mem_email = mem_email;
		this.mem_ip = mem_ip;
		this.mem_grade = mem_grade;
	}
	
	
	
	
	public int getMem_idx() {
		return mem_idx;
	}


	public void setMem_idx(int mem_idx) {
		this.mem_idx = mem_idx;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_pwd() {
		return mem_pwd;
	}
	public void setMem_pwd(String mem_pwd) {
		this.mem_pwd = mem_pwd;
	}
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
	public String getMem_ip() {
		return mem_ip;
	}
	public void setMem_ip(String mem_ip) {
		this.mem_ip = mem_ip;
	}
	public String getMem_regdate() {
		return mem_regdate;
	}
	public void setMem_regdate(String mem_regdate) {
		this.mem_regdate = mem_regdate;
	}
	public String getMem_grade() {
		return mem_grade;
	}
	public void setMem_grade(String mem_grade) {
		this.mem_grade = mem_grade;
	}
	
	
}
