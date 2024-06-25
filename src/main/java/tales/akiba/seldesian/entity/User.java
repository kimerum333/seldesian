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
public class User {

    private String user_password;
    private String user_coment;
    private String user_editdate;
    private String user_dedate;
	
    @NonNull
    private String email;
    private String user_nickname;
    private int user_grade;
    private int user_char_count;
    private int user_char_maxcount;
    private int user_gmcount;
    private String user_indate;

}
