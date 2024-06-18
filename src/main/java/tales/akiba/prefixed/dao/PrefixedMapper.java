package tales.akiba.prefixed.dao;

import java.util.List;

import tales.akiba.prefixed.vo.PrefixedVo;

public interface PrefixedMapper {

	List<PrefixedVo> getPrefixedList();

	PrefixedVo getPrefixed(PrefixedVo vo);

	void deletePrefixed(PrefixedVo vo);

	void insertPrefixed(PrefixedVo vo);

	void updatePrefixed(PrefixedVo vo);

}
