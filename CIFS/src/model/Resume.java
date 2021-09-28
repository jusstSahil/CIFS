package model;

public class Resume {
	private String title;
	private String name;
	private String address;
	private String email;
	private String phone;
	private String mobile;
	private String degree;
	private String otherdeg;
	private String degper;
	private String pg;
	private String otherpg;
	private String pgper;
	private String skill;
	private String workexp;
	private String pro1;
	private String pro2;
	private String ref;
	
	
	
	public Resume(String title, String name, String address, String email, String phone, String mobile, String degree,
			String otherdeg, String degper, String pg, String otherpg, String pgper, String skill, String workexp,
			String pro1, String pro2, String ref) {
		super();
		this.title = title;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.mobile = mobile;
		this.degree = degree;
		this.otherdeg = otherdeg;
		this.degper = degper;
		this.pg = pg;
		this.otherpg = otherpg;
		this.pgper = pgper;
		this.skill = skill;
		this.workexp = workexp;
		this.pro1 = pro1;
		this.pro2 = pro2;
		this.ref = ref;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getOtherdeg() {
		return otherdeg;
	}
	public void setOtherdeg(String otherdeg) {
		this.otherdeg = otherdeg;
	}
	public String getDegper() {
		return degper;
	}
	public void setDegper(String degper) {
		this.degper = degper;
	}
	public String getPg() {
		return pg;
	}
	public void setPg(String pg) {
		this.pg = pg;
	}
	public String getOtherpg() {
		return otherpg;
	}
	public void setOtherpg(String otherpg) {
		this.otherpg = otherpg;
	}
	public String getPgper() {
		return pgper;
	}
	public void setPgper(String pgper) {
		this.pgper = pgper;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getWorkexp() {
		return workexp;
	}
	public void setWorkexp(String workexp) {
		this.workexp = workexp;
	}
	public String getPro1() {
		return pro1;
	}
	public void setPro1(String pro1) {
		this.pro1 = pro1;
	}
	public String getPro2() {
		return pro2;
	}
	public void setPro2(String pro2) {
		this.pro2 = pro2;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	

}
