package tales.akiba.item.vo;

public class ItemVo {
	
	public ItemVo(int item_no, String item_name, int item_rank, int item_magic_grade, int item_magic_prise,
			String item_tag_alignment, String item_tag_usage, String item_tag_other, int item_class, int item_trade,
			int equipmen_item_data_no, int equipment_item_offense_power, int equipment_item_mana_power,
			int equipment_item_p_defense, int equipment_item_m_defense, int equipment_item_accuracy,
			int equipment_item_speed, int equipment_item_reach, int equipment_iten_plus_inventory,
			String equipment_item_equipment_effect, int equipment_item_available_locations, int magic_item_data_no,
			String magic_item_timing, String magic_item_target, String magic_item_dice_roll, String magic_item_aoe,
			String magic_item_cost, String magic_item_effect, int magic_item_available_locations, int prop_no,
			int tag_no, int act_no, int prefixed_no) {
		super();
		this.item_no = item_no;
		this.item_name = item_name;
		this.item_rank = item_rank;
		this.item_magic_grade = item_magic_grade;
		this.item_magic_prise = item_magic_prise;
		this.item_tag_alignment = item_tag_alignment;
		this.item_tag_usage = item_tag_usage;
		this.item_tag_other = item_tag_other;
		this.item_class = item_class;
		this.item_trade = item_trade;
		this.equipmen_item_data_no = equipmen_item_data_no;
		this.equipment_item_offense_power = equipment_item_offense_power;
		this.equipment_item_mana_power = equipment_item_mana_power;
		this.equipment_item_p_defense = equipment_item_p_defense;
		this.equipment_item_m_defense = equipment_item_m_defense;
		this.equipment_item_accuracy = equipment_item_accuracy;
		this.equipment_item_speed = equipment_item_speed;
		this.equipment_item_reach = equipment_item_reach;
		this.equipment_iten_plus_inventory = equipment_iten_plus_inventory;
		this.equipment_item_equipment_effect = equipment_item_equipment_effect;
		this.equipment_item_available_locations = equipment_item_available_locations;
		this.magic_item_data_no = magic_item_data_no;
		this.magic_item_timing = magic_item_timing;
		this.magic_item_target = magic_item_target;
		this.magic_item_dice_roll = magic_item_dice_roll;
		this.magic_item_aoe = magic_item_aoe;
		this.magic_item_cost = magic_item_cost;
		this.magic_item_effect = magic_item_effect;
		this.magic_item_available_locations = magic_item_available_locations;
		this.prop_no = prop_no;
		this.tag_no = tag_no;
		this.act_no = act_no;
		this.prefixed_no = prefixed_no;
	}
	@Override
	public String toString() {
		return "ItemDto [item_no=" + item_no + ", item_name=" + item_name + ", item_rank=" + item_rank
				+ ", item_magic_grade=" + item_magic_grade + ", item_magic_prise=" + item_magic_prise
				+ ", item_tag_alignment=" + item_tag_alignment + ", item_tag_usage=" + item_tag_usage
				+ ", item_tag_other=" + item_tag_other + ", item_class=" + item_class + ", item_trade=" + item_trade
				+ ", equipmen_item_data_no=" + equipmen_item_data_no + ", equipment_item_offense_power="
				+ equipment_item_offense_power + ", equipment_item_mana_power=" + equipment_item_mana_power
				+ ", equipment_item_p_defense=" + equipment_item_p_defense + ", equipment_item_m_defense="
				+ equipment_item_m_defense + ", equipment_item_accuracy=" + equipment_item_accuracy
				+ ", equipment_item_speed=" + equipment_item_speed + ", equipment_item_reach=" + equipment_item_reach
				+ ", equipment_iten_plus_inventory=" + equipment_iten_plus_inventory
				+ ", equipment_item_equipment_effect=" + equipment_item_equipment_effect
				+ ", equipment_item_available_locations=" + equipment_item_available_locations + ", magic_item_data_no="
				+ magic_item_data_no + ", magic_item_timing=" + magic_item_timing + ", magic_item_target="
				+ magic_item_target + ", magic_item_dice_roll=" + magic_item_dice_roll + ", magic_item_aoe="
				+ magic_item_aoe + ", magic_item_cost=" + magic_item_cost + ", magic_item_effect=" + magic_item_effect
				+ ", magic_item_available_locations=" + magic_item_available_locations + ", prop_no=" + prop_no
				+ ", tag_no=" + tag_no + ", act_no=" + act_no + ", prefixed_no=" + prefixed_no + "]";
	}
	public int getItem_no() {
		return item_no;
	}
	public void setItem_no(int item_no) {
		this.item_no = item_no;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getItem_rank() {
		return item_rank;
	}
	public void setItem_rank(int item_rank) {
		this.item_rank = item_rank;
	}
	public int getItem_magic_grade() {
		return item_magic_grade;
	}
	public void setItem_magic_grade(int item_magic_grade) {
		this.item_magic_grade = item_magic_grade;
	}
	public int getItem_magic_prise() {
		return item_magic_prise;
	}
	public void setItem_magic_prise(int item_magic_prise) {
		this.item_magic_prise = item_magic_prise;
	}
	public String getItem_tag_alignment() {
		return item_tag_alignment;
	}
	public void setItem_tag_alignment(String item_tag_alignment) {
		this.item_tag_alignment = item_tag_alignment;
	}
	public String getItem_tag_usage() {
		return item_tag_usage;
	}
	public void setItem_tag_usage(String item_tag_usage) {
		this.item_tag_usage = item_tag_usage;
	}
	public String getItem_tag_other() {
		return item_tag_other;
	}
	public void setItem_tag_other(String item_tag_other) {
		this.item_tag_other = item_tag_other;
	}
	public int getItem_class() {
		return item_class;
	}
	public void setItem_class(int item_class) {
		this.item_class = item_class;
	}
	public int getItem_trade() {
		return item_trade;
	}
	public void setItem_trade(int item_trade) {
		this.item_trade = item_trade;
	}
	public int getEquipmen_item_data_no() {
		return equipmen_item_data_no;
	}
	public void setEquipmen_item_data_no(int equipmen_item_data_no) {
		this.equipmen_item_data_no = equipmen_item_data_no;
	}
	public int getEquipment_item_offense_power() {
		return equipment_item_offense_power;
	}
	public void setEquipment_item_offense_power(int equipment_item_offense_power) {
		this.equipment_item_offense_power = equipment_item_offense_power;
	}
	public int getEquipment_item_mana_power() {
		return equipment_item_mana_power;
	}
	public void setEquipment_item_mana_power(int equipment_item_mana_power) {
		this.equipment_item_mana_power = equipment_item_mana_power;
	}
	public int getEquipment_item_p_defense() {
		return equipment_item_p_defense;
	}
	public void setEquipment_item_p_defense(int equipment_item_p_defense) {
		this.equipment_item_p_defense = equipment_item_p_defense;
	}
	public int getEquipment_item_m_defense() {
		return equipment_item_m_defense;
	}
	public void setEquipment_item_m_defense(int equipment_item_m_defense) {
		this.equipment_item_m_defense = equipment_item_m_defense;
	}
	public int getEquipment_item_accuracy() {
		return equipment_item_accuracy;
	}
	public void setEquipment_item_accuracy(int equipment_item_accuracy) {
		this.equipment_item_accuracy = equipment_item_accuracy;
	}
	public int getEquipment_item_speed() {
		return equipment_item_speed;
	}
	public void setEquipment_item_speed(int equipment_item_speed) {
		this.equipment_item_speed = equipment_item_speed;
	}
	public int getEquipment_item_reach() {
		return equipment_item_reach;
	}
	public void setEquipment_item_reach(int equipment_item_reach) {
		this.equipment_item_reach = equipment_item_reach;
	}
	public int getEquipment_iten_plus_inventory() {
		return equipment_iten_plus_inventory;
	}
	public void setEquipment_iten_plus_inventory(int equipment_iten_plus_inventory) {
		this.equipment_iten_plus_inventory = equipment_iten_plus_inventory;
	}
	public String getEquipment_item_equipment_effect() {
		return equipment_item_equipment_effect;
	}
	public void setEquipment_item_equipment_effect(String equipment_item_equipment_effect) {
		this.equipment_item_equipment_effect = equipment_item_equipment_effect;
	}
	public int getEquipment_item_available_locations() {
		return equipment_item_available_locations;
	}
	public void setEquipment_item_available_locations(int equipment_item_available_locations) {
		this.equipment_item_available_locations = equipment_item_available_locations;
	}
	public int getMagic_item_data_no() {
		return magic_item_data_no;
	}
	public void setMagic_item_data_no(int magic_item_data_no) {
		this.magic_item_data_no = magic_item_data_no;
	}
	public String getMagic_item_timing() {
		return magic_item_timing;
	}
	public void setMagic_item_timing(String magic_item_timing) {
		this.magic_item_timing = magic_item_timing;
	}
	public String getMagic_item_target() {
		return magic_item_target;
	}
	public void setMagic_item_target(String magic_item_target) {
		this.magic_item_target = magic_item_target;
	}
	public String getMagic_item_dice_roll() {
		return magic_item_dice_roll;
	}
	public void setMagic_item_dice_roll(String magic_item_dice_roll) {
		this.magic_item_dice_roll = magic_item_dice_roll;
	}
	public String getMagic_item_aoe() {
		return magic_item_aoe;
	}
	public void setMagic_item_aoe(String magic_item_aoe) {
		this.magic_item_aoe = magic_item_aoe;
	}
	public String getMagic_item_cost() {
		return magic_item_cost;
	}
	public void setMagic_item_cost(String magic_item_cost) {
		this.magic_item_cost = magic_item_cost;
	}
	public String getMagic_item_effect() {
		return magic_item_effect;
	}
	public void setMagic_item_effect(String magic_item_effect) {
		this.magic_item_effect = magic_item_effect;
	}
	public int getMagic_item_available_locations() {
		return magic_item_available_locations;
	}
	public void setMagic_item_available_locations(int magic_item_available_locations) {
		this.magic_item_available_locations = magic_item_available_locations;
	}
	public int getProp_no() {
		return prop_no;
	}
	public void setProp_no(int prop_no) {
		this.prop_no = prop_no;
	}
	public int getTag_no() {
		return tag_no;
	}
	public void setTag_no(int tag_no) {
		this.tag_no = tag_no;
	}
	public int getAct_no() {
		return act_no;
	}
	public void setAct_no(int act_no) {
		this.act_no = act_no;
	}
	public int getPrefixed_no() {
		return prefixed_no;
	}
	public void setPrefixed_no(int prefixed_no) {
		this.prefixed_no = prefixed_no;
	}
	private int item_no;
	private String item_name;
	private int item_rank;
	private int item_magic_grade;
	private int item_magic_prise;
	private String item_tag_alignment;
	private String item_tag_usage;
	private String item_tag_other;
	private int item_class;
	private int item_trade; 
	private int equipmen_item_data_no;
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
	private int magic_item_data_no;
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

}
