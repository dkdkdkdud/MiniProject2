package vo;

public class NoteVo {

	int n_idx;
	String n_regdate;
	int n_vomit;
	int n_lethargy;
	int n_defecation;
	int n_appetite;
	int n_breath;
	int n_sleep;
	int n_walk;
	int n_memo;
	int pet_idx;
	
	
	public NoteVo(int n_idx, String n_regdate, int n_vomit, int n_lethargy, int n_defecation, int n_appetite,
			int n_breath, int n_sleep, int n_walk, int n_memo, int pet_idx) {
		super();
		this.n_idx = n_idx;
		this.n_regdate = n_regdate;
		this.n_vomit = n_vomit;
		this.n_lethargy = n_lethargy;
		this.n_defecation = n_defecation;
		this.n_appetite = n_appetite;
		this.n_breath = n_breath;
		this.n_sleep = n_sleep;
		this.n_walk = n_walk;
		this.n_memo = n_memo;
		this.pet_idx = pet_idx;
	}
	
	
	
	
	public int getN_idx() {
		return n_idx;
	}
	public void setN_idx(int n_idx) {
		this.n_idx = n_idx;
	}
	public String getN_regdate() {
		return n_regdate;
	}
	public void setN_regdate(String n_regdate) {
		this.n_regdate = n_regdate;
	}
	public int getN_vomit() {
		return n_vomit;
	}
	public void setN_vomit(int n_vomit) {
		this.n_vomit = n_vomit;
	}
	public int getN_lethargy() {
		return n_lethargy;
	}
	public void setN_lethargy(int n_lethargy) {
		this.n_lethargy = n_lethargy;
	}
	public int getN_defecation() {
		return n_defecation;
	}
	public void setN_defecation(int n_defecation) {
		this.n_defecation = n_defecation;
	}
	public int getN_appetite() {
		return n_appetite;
	}
	public void setN_appetite(int n_appetite) {
		this.n_appetite = n_appetite;
	}
	public int getN_breath() {
		return n_breath;
	}
	public void setN_breath(int n_breath) {
		this.n_breath = n_breath;
	}
	public int getN_sleep() {
		return n_sleep;
	}
	public void setN_sleep(int n_sleep) {
		this.n_sleep = n_sleep;
	}
	public int getN_walk() {
		return n_walk;
	}
	public void setN_walk(int n_walk) {
		this.n_walk = n_walk;
	}
	public int getN_memo() {
		return n_memo;
	}
	public void setN_memo(int n_memo) {
		this.n_memo = n_memo;
	}
	public int getPet_idx() {
		return pet_idx;
	}
	public void setPet_idx(int pet_idx) {
		this.pet_idx = pet_idx;
	}
	
	
	
}
