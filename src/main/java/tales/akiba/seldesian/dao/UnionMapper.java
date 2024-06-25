package tales.akiba.seldesian.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import tales.akiba.seldesian.entity.Union;

@Mapper
public interface UnionMapper {

	public String selectUnion();
	
	public int insertUnion(Union params);
	
	public Union selectUnionDetail(Long union_no);
	
	public int updateUnion(Union params);
	
	public int confirmUnion(Long union_no);
	
	public int deleteUnion(Long union_no);
	
	public List<Union> selectUnionList();
	
	public int selectUnionTotalCount();
	
}
 