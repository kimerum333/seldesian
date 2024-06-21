package tales.akiba.seldesian.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Prefixed {

	private String prefixed_tag;
	private int prefixed_magic_grade;
	private int tag_no;
 
	@NonNull
	private int prefixed_no;
	private String prefixed_name;
	private String prefixed_effect;
	private int prefixed_overlapping;
	
}
