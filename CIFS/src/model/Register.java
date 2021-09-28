package model;

public class Register {
		private String user; 
		private String pass; 
		private String first; 
		private String last; 
		private String email; 
		private String mobile; 
		private String degree; 
		private String spcl;
		
		
		public Register(String user, String pass, String first, String last, String email, String mobile, String degree,
				String spcl) {
			super();
			this.user = user;
			this.pass = pass;
			this.first = first;
			this.last = last;
			this.email = email;
			this.mobile = mobile;
			this.degree = degree;
			this.spcl = spcl;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getFirst() {
			return first;
		}
		public void setFirst(String first) {
			this.first = first;
		}
		public String getLast() {
			return last;
		}
		public void setLast(String last) {
			this.last = last;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
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
		public String getSpcl() {
			return spcl;
		}
		public void setSpcl(String spcl) {
			this.spcl = spcl;
		} 
		
		
	}


