package the.healing.time.dto;

public class HUserInfo {
	private String email;
	private String pass;
	private String nick;
	private int age;
	private int gender;
	private String phone;
	private int question_sel;
	private String question;
	private int levelno;
	
	public HUserInfo() {
		
	}

	public HUserInfo(String email, String pass, String nick, int age, int gender, String phone, int question_sel,
			String question, int levelno) {
		super();
		this.email = email;
		this.pass = pass;
		this.nick = nick;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.question_sel = question_sel;
		this.question = question;
		this.levelno = levelno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getQuestion_sel() {
		return question_sel;
	}

	public void setQuestion_sel(int question_sel) {
		this.question_sel = question_sel;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getLevelno() {
		return levelno;
	}

	public void setLevelno(int levelno) {
		this.levelno = levelno;
	}
	
	
}
