package tales.akiba.seldesian.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import tales.akiba.seldesian.entity.Prop;

@Mapper
public interface PropMapper {

	List<Prop> getPropList();

	Prop getView(Prop prop);

	void insertProp(Prop prop);

	void deleteProp(Prop prop);

	void updateProp(Prop prop);

}
 