package tales.akiba.item.vo;

public class TagVo {
	public TagVo(int tag_no, String tag, int tag_code, String tag_categori) {
		super();
		this.tag_no = tag_no;
		this.tag = tag;
		this.tag_code = tag_code;
		this.tag_categori = tag_categori;
	}
	@Override
	public String toString() {
		return "TagDto [tag_no=" + tag_no + ", tag=" + tag + ", tag_code=" + tag_code + ", tag_categori=" + tag_categori
				+ "]";
	}
	public int getTag_no() {
		return tag_no;
	}
	public void setTag_no(int tag_no) {
		this.tag_no = tag_no;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public int getTag_code() {
		return tag_code;
	}
	public void setTag_code(int tag_code) {
		this.tag_code = tag_code;
	}
	public String getTag_categori() {
		return tag_categori;
	}
	public void setTag_categori(String tag_categori) {
		this.tag_categori = tag_categori;
	}
	private int tag_no;
	private String tag; 
	private int tag_code;
	private String tag_categori; 
}
