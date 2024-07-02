package tales.akiba.seldesian.entity;

import lombok.Data;

@Data
public class User {
    
    private String user_password;
    private String user_coment;
    private String user_editdate;
    private String user_dedate;
    private String email;
    private String user_nickname;
    private String user_indate;
    private int user_grade;
    private int user_char_count;
    private int user_char_maxcount;
    private int user_gmcount;
    private int user_statement;
    
} 
