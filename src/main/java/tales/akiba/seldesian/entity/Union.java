package tales.akiba.seldesian.entity;

import java.util.Date;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/*CREATE TABLE tbl_union (	
	union_no INT NOT NULL AUTO_INCREMENT,
	union_name VARCHAR(20) NOT NULL,
	union_lv INT,
	union_profile VARCHAR(500),
	union_lv_battle INT,
	union_lv_trade INT,
	union_lv_reputation INT,
	union_lv_life INT,
	union_expower INT,
	union_ticket INT,
	union_status INT,
	union_indate TIMESTAMP,
	union_editdate TIMESTAMP NULL,
	union_deletedate TIMESTAMP NULL,
	PRIMARY KEY(union_no)
);	**/

@Data
public class Union {
	
	private Long union_no;
	private String union_name;
	private int union_lv;
	private String union_profile;
	private int union_lv_battle;
	private int union_lv_trade;
	private int union_lv_reputation;
	private int union_lv_life;
	private Long union_expower;
	private int union_ticket;
	private int union_resister_yn;
	private Date union_indate;
	private Date union_editdate;
	private Date union_deletedate;
}
