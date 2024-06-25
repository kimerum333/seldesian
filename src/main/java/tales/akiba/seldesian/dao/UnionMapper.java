package tales.akiba.seldesian.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import tales.akiba.seldesian.entity.Union;

@Mapper
public interface UnionMapper {

	public String selectUnion();
	
	public Union insertUnion(Union params);
	
	public Union selectUnionDetail(Long union_no);
	
	public Union updateUnion(Long union_no);
	
	public Union confirmUnion(Long union_no);
	
	public Union deleteUnion(Long union_no);
	
	public List<Union> selectUnionList();
	
	public int selectUnionTotalCount();
	
}
