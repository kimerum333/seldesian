package tales.akiba.seldesian.vo;

public class PrefixedVo {
	
	public PrefixedVo(int prefixed_no, String prefixed_name, String prefixed_tag, int prefixed_magic_grade,
			String prefixed_effect, int prefixed_overlapping, int tag_no) {
		super();
		this.prefixed_no = prefixed_no;
		this.prefixed_name = prefixed_name;
		this.prefixed_tag = prefixed_tag;
		this.prefixed_magic_grade = prefixed_magic_grade;
		this.prefixed_effect = prefixed_effect;
		this.prefixed_overlapping = prefixed_overlapping;
		this.tag_no = tag_no;
	}
	@Override
	public String toString() {
		return "PrefixedDto [prefixed_no=" + prefixed_no + ", prefixed_name=" + prefixed_name + ", prefixed_tag="
				+ prefixed_tag + ", prefixed_magic_grade=" + prefixed_magic_grade + ", prefixed_effect="
				+ prefixed_effect + ", prefixed_overlapping=" + prefixed_overlapping + ", tag_no=" + tag_no + "]";
	}
	public int getPrefixed_no() {
		return prefixed_no;
	}
	public void setPrefixed_no(int prefixed_no) {
		this.prefixed_no = prefixed_no;
	}
	public String getPrefixed_name() {
		return prefixed_name;
	}
	public void setPrefixed_name(String prefixed_name) {
		this.prefixed_name = prefixed_name;
	}
	public String getPrefixed_tag() {
		return prefixed_tag;
	}
	public void setPrefixed_tag(String prefixed_tag) {
		this.prefixed_tag = prefixed_tag;
	}
	public int getPrefixed_magic_grade() {
		return prefixed_magic_grade;
	}
	public void setPrefixed_magic_grade(int prefixed_magic_grade) {
		this.prefixed_magic_grade = prefixed_magic_grade;
	}
	public String getPrefixed_effect() {
		return prefixed_effect;
	}
	public void setPrefixed_effect(String prefixed_effect) {
		this.prefixed_effect = prefixed_effect;
	}
	public int getPrefixed_overlapping() {
		return prefixed_overlapping;
	}
	public void setPrefixed_overlapping(int prefixed_overlapping) {
		this.prefixed_overlapping = prefixed_overlapping;
	}
	public int getTag_no() {
		return tag_no;
	}
	public void setTag_no(int tag_no) {
		this.tag_no = tag_no;
	}
	private int prefixed_no;
	private String prefixed_name;
	private String prefixed_tag;
	private int prefixed_magic_grade;
	private String prefixed_effect;
	private int prefixed_overlapping;
	private int tag_no;

}
