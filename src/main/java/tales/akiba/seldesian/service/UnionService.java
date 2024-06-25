package tales.akiba.seldesian.service;

import java.util.List;

import tales.akiba.seldesian.entity.Union;

public interface UnionService {
	
	public Union registerUnion(Union params);
	
	public Union getUnionDetail(Long union_no);
	
	public Union updateUnion(Long union_no);
	
	public Union confirmUnion(Long union_no);
	
	public Union deleteUnion(Long union_no);
	
	public List<Union> getUnionList();

}
