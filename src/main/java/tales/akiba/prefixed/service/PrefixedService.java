package tales.akiba.prefixed.service;

import java.util.List;

import tales.akiba.prefixed.vo.PrefixedVo;

public interface PrefixedService {

	List<PrefixedVo> getPrefixedList();

	PrefixedVo getPrefixed(PrefixedVo vo);

	void insertPrefixed(PrefixedVo vo);

	void deletePrefixed(PrefixedVo vo);

	void prefixedUpdate(PrefixedVo vo);


}
