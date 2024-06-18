package tales.akiba.prop.dao;

import java.util.List;

import tales.akiba.prop.vo.PropVo;

public interface PropMapper {

	List<PropVo> getPropList();

	PropVo getProp(PropVo vo);

	void deleteProp(PropVo vo);

	void insertProp(PropVo vo);

	void updateProp(PropVo vo);

}
