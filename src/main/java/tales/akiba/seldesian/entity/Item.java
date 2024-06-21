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
public class Item {

	private String item_tag_alignment;
	private String item_tag_usage;
	private String item_tag_other;
	private int equipment_item_offense_power;
	private int equipment_item_mana_power;
	private int equipment_item_p_defense;
	private int equipment_item_m_defense;
	private int equipment_item_accuracy;
	private int equipment_item_speed;
	private int equipment_item_reach;
	private int equipment_iten_plus_inventory;
	private String equipment_item_equipment_effect;
	private int equipment_item_available_locations;
	private String magic_item_timing;
	private String magic_item_target;
	private String magic_item_dice_roll;
	private String magic_item_aoe;
	private String magic_item_cost;
	private String magic_item_effect;
	private int magic_item_available_locations;
	private int prop_no;
	private int tag_no;
	private int act_no;
	private int prefixed_no;
	 
	@NonNull
	private int item_no;
	private String item_name;
	private int item_rank;
	private int item_magic_grade;
	private int item_magic_prise;
	private int equipmen_item_data_no;
	private int item_class;
	private int item_trade; 
	private int magic_item_data_no;
	
}
