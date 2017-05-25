package the.healing.time.dto;

public class HBoard {
	private int b_no;
	private String b_nick;
	private String b_contents;
	private String b_img;
	private String b_hash;
	private int b_key;

	public HBoard() {

	}

	public HBoard(String b_nick, String b_contents, String b_img, String b_hash, int b_key) {

		this.b_nick = b_nick;
		this.b_contents = b_contents;
		this.b_img = b_img;
		this.b_hash = b_hash;
		this.b_key = b_key;
	}

	public String getB_nick() {
		return b_nick;
	}

	public void setB_nick(String b_nick) {
		this.b_nick = b_nick;
	}

	public String getB_contents() {
		return b_contents;
	}

	public void setB_contents(String b_contents) {
		this.b_contents = b_contents;
	}

	public String getB_img() {
		return b_img;
	}

	public void setB_img(String b_img) {
		this.b_img = b_img;
	}

	public String getB_hash() {
		return b_hash;
	}

	public void setB_hash(String b_hash) {
		this.b_hash = b_hash;
	}

	public int getB_key() {
		return b_key;
	}

	public void setB_key(int b_key) {
		this.b_key = b_key;
	}

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

}
