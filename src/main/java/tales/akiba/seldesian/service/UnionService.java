package tales.akiba.seldesian.service;

import java.util.List;

import tales.akiba.seldesian.entity.Union;

public interface UnionService {
	
	public boolean registerUnion(Union params);
	
	public Union getUnionDetail(Long union_no);
	
	public boolean confirmUnion(Long union_no);
	
	public boolean deleteUnion(Long union_no);
	
	public List<Union> getUnionList();
	
}
