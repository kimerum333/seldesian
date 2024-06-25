package tales.akiba.seldesian.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {

	public String selectWelcome();
}
 