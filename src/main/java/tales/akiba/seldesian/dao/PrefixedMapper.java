package tales.akiba.seldesian.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import tales.akiba.seldesian.entity.Prefixed;

@Mapper
public interface PrefixedMapper {

	List<Prefixed> getPrefixedList();

	Prefixed getView(Prefixed prefixed);

	void insertPrefixed(Prefixed prefixed);

	void deletePrefixed(Prefixed prefixed);

	void updatePrefixed(Prefixed prefixed);

 

}
