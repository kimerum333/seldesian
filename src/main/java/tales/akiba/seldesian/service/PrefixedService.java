package tales.akiba.seldesian.service;

import java.util.List;

import tales.akiba.seldesian.entity.Prefixed;

public interface PrefixedService {

	List<Prefixed> getPrefixedList();

	void insertPrefixed(Prefixed prefixed);

	Prefixed getView(Prefixed prefixed);

	void deletePrefixed(Prefixed prefixed);

	void updatePrefixed(Prefixed prefixed);


}
