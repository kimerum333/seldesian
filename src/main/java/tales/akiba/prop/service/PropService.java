package tales.akiba.prop.service;

import java.util.List;

import tales.akiba.prop.vo.PropVo;

public interface PropService {

	List<PropVo> getPropList();

	PropVo getProp(PropVo vo);

	void insertProp(PropVo vo);

	void deleteProp(PropVo vo);

	void propUpdate(PropVo vo);

}
