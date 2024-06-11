package tales.akiba.seldesian.vo;


public class UserVo {
	
	//field
	private String email;
    private String user_password;
	private String user_coment;
    private String user_editdate;
    private String user_dedate;
    private String user_nickname;
    private int user_grade;
    private int user_char_count;
    private int user_char_maxcount;
    private int user_gmcount;
    private String user_indate;
  
	public UserVo() {}
	
	//Constructor
    public UserVo(String email, String user_password, String user_coment, String user_editdate, String user_dedate,
			String user_nickname, int user_grade, int user_char_count, int user_char_maxcount, int user_gmcount,
			String user_indate) {
		super();
		this.email = email;
		this.user_password = user_password;
		this.user_coment = user_coment;
		this.user_editdate = user_editdate;
		this.user_dedate = user_dedate;
		this.user_nickname = user_nickname;
		this.user_grade = user_grade;
		this.user_char_count = user_char_count;
		this.user_char_maxcount = user_char_maxcount;
		this.user_gmcount = user_gmcount;
		this.user_indate = user_indate;
	}
   
    
    // toString
	@Override
	public String toString() {
		return "UserDto [email=" + email + ", user_password=" + user_password + ", user_coment=" + user_coment
				+ ", user_editdate=" + user_editdate + ", user_dedate=" + user_dedate + ", user_nickname="
				+ user_nickname + ", user_grade=" + user_grade + ", user_char_count=" + user_char_count
				+ ", user_char_maxcount=" + user_char_maxcount + ", user_gmcount=" + user_gmcount + ", user_indate="
				+ user_indate + "]";
	}
	//Getter/Setter
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_coment() {
		return user_coment;
	}

	public void setUser_coment(String user_coment) {
		this.user_coment = user_coment;
	}

	public String getUser_editdate() {
		return user_editdate;
	}

	public void setUser_editdate(String user_editdate) {
		this.user_editdate = user_editdate;
	}

	public String getUser_dedate() {
		return user_dedate;
	}

	public void setUser_dedate(String user_dedate) {
		this.user_dedate = user_dedate;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public int getUser_grade() {
		return user_grade;
	}

	public void setUser_grade(int user_grade) {
		this.user_grade = user_grade;
	}

	public int getUser_char_count() {
		return user_char_count;
	}

	public void setUser_char_count(int user_char_count) {
		this.user_char_count = user_char_count;
	}

	public int getUser_char_maxcount() {
		return user_char_maxcount;
	}

	public void setUser_char_maxcount(int user_char_maxcount) {
		this.user_char_maxcount = user_char_maxcount;
	}

	public int getUser_gmcount() {
		return user_gmcount;
	}

	public void setUser_gmcount(int user_gmcount) {
		this.user_gmcount = user_gmcount;
	}

	public String getUser_indate() {
		return user_indate;
	}

	public void setUser_indate(String user_indate) {
		this.user_indate = user_indate;
	}
}
