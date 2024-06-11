package tales.akiba.seldesian.vo;

public class PropVo {
	public PropVo(int prop_no, String prop_name, int prop_rank, String prop_tag_area, String prop_tag_type,
			String prop_tag_elment, String prop_detection_dc, String prop_analysis_dc, String prop_release_dc,
			String prop_effect, int tag_no) {
		super();
		this.prop_no = prop_no;
		this.prop_name = prop_name;
		this.prop_rank = prop_rank;
		this.prop_tag_area = prop_tag_area;
		this.prop_tag_type = prop_tag_type;
		this.prop_tag_elment = prop_tag_elment;
		this.prop_detection_dc = prop_detection_dc;
		this.prop_analysis_dc = prop_analysis_dc;
		this.prop_release_dc = prop_release_dc;
		this.prop_effect = prop_effect;
		this.tag_no = tag_no;
	}
	@Override
	public String toString() {
		return "PropDto [prop_no=" + prop_no + ", prop_name=" + prop_name + ", prop_rank=" + prop_rank
				+ ", prop_tag_area=" + prop_tag_area + ", prop_tag_type=" + prop_tag_type + ", prop_tag_elment="
				+ prop_tag_elment + ", prop_detection_dc=" + prop_detection_dc + ", prop_analysis_dc="
				+ prop_analysis_dc + ", prop_release_dc=" + prop_release_dc + ", prop_effect=" + prop_effect
				+ ", tag_no=" + tag_no + "]";
	}
	public int getProp_no() {
		return prop_no;
	}
	public void setProp_no(int prop_no) {
		this.prop_no = prop_no;
	}
	public String getProp_name() {
		return prop_name;
	}
	public void setProp_name(String prop_name) {
		this.prop_name = prop_name;
	}
	public int getProp_rank() {
		return prop_rank;
	}
	public void setProp_rank(int prop_rank) {
		this.prop_rank = prop_rank;
	}
	public String getProp_tag_area() {
		return prop_tag_area;
	}
	public void setProp_tag_area(String prop_tag_area) {
		this.prop_tag_area = prop_tag_area;
	}
	public String getProp_tag_type() {
		return prop_tag_type;
	}
	public void setProp_tag_type(String prop_tag_type) {
		this.prop_tag_type = prop_tag_type;
	}
	public String getProp_tag_elment() {
		return prop_tag_elment;
	}
	public void setProp_tag_elment(String prop_tag_elment) {
		this.prop_tag_elment = prop_tag_elment;
	}
	public String getProp_detection_dc() {
		return prop_detection_dc;
	}
	public void setProp_detection_dc(String prop_detection_dc) {
		this.prop_detection_dc = prop_detection_dc;
	}
	public String getProp_analysis_dc() {
		return prop_analysis_dc;
	}
	public void setProp_analysis_dc(String prop_analysis_dc) {
		this.prop_analysis_dc = prop_analysis_dc;
	}
	public String getProp_release_dc() {
		return prop_release_dc;
	}
	public void setProp_release_dc(String prop_release_dc) {
		this.prop_release_dc = prop_release_dc;
	}
	public String getProp_effect() {
		return prop_effect;
	}
	public void setProp_effect(String prop_effect) {
		this.prop_effect = prop_effect;
	}
	public int getTag_no() {
		return tag_no;
	}
	public void setTag_no(int tag_no) {
		this.tag_no = tag_no;
	}
	private int prop_no;
	private String prop_name;
	private int prop_rank;
	private String prop_tag_area;
	private String prop_tag_type;
	private String prop_tag_elment;
    private String prop_detection_dc;
	private String prop_analysis_dc;
	private String prop_release_dc;
	private String prop_effect;
	private int tag_no;

}
