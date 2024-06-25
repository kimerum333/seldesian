package tales.akiba.seldesian.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Prop {
	
	private int prop_rank;
	private String prop_tag_area;
	private String prop_tag_type;
	private String prop_tag_elment;
    private String prop_detection_dc;
	private String prop_analysis_dc;
	private String prop_release_dc;
	private String prop_effect;
	private int tag_no;

	private int prop_no;
	private String prop_name;
	public void setProp_No(String prop_no2) {}
}
