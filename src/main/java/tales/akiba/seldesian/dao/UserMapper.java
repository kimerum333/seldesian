package tales.akiba.seldesian.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	
	//유저체크 
	public String userCheak();

}
