package tales.akiba.seldesian.service;

import java.util.List;

import tales.akiba.seldesian.entity.Prop;

public interface PropService {

	List<Prop> getPropList();

	void insertProp(Prop prop);

	Prop getView(Prop prop);

	void deleteProp(Prop prop);

	void updateProp(Prop prop);

}
 