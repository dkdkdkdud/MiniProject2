package vo;

public class PetVo {

	int pet_idx;
	String pet_name;
	String pet_type;
	String pet_birth;
	int mem_idx;
	
	//insert constructor
	public PetVo(int pet_idx, String pet_name, String pet_type, String pet_birth, int mem_idx) {
		super();
		this.pet_idx = pet_idx;
		this.pet_name = pet_name;
		this.pet_type = pet_type;
		this.pet_birth = pet_birth;
		this.mem_idx = mem_idx;
	}
	
	
	//update constructor 일련번호,주인번호는 안 바뀜
	public PetVo(String pet_name, String pet_type, String pet_birth) {
		super();
		this.pet_name = pet_name;
		this.pet_type = pet_type;
		this.pet_birth = pet_birth;
	}


	public int getPet_idx() {
		return pet_idx;
	}
	public void setPet_idx(int pet_idx) {
		this.pet_idx = pet_idx;
	}
	public String getPet_name() {
		return pet_name;
	}
	public void setPet_name(String pet_name) {
		this.pet_name = pet_name;
	}
	public String getPet_type() {
		return pet_type;
	}
	public void setPet_type(String pet_type) {
		this.pet_type = pet_type;
	}
	public String getPet_birth() {
		return pet_birth;
	}
	public void setPet_birth(String pet_birth) {
		this.pet_birth = pet_birth;
	}
	public int getMem_idx() {
		return mem_idx;
	}
	public void setMem_idx(int mem_idx) {
		this.mem_idx = mem_idx;
	}
	
	
	
}
