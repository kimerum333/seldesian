package tales.akiba.item.service;

import java.util.List;

import tales.akiba.item.vo.ItemVo;

public interface ItemService {

	List<ItemVo> getItemList();

	ItemVo getItem(ItemVo vo);

	void insertItem(ItemVo vo);

	void deleteItem(ItemVo vo);

	void itemUpdate(ItemVo vo);

	void insertItemMagic(ItemVo vo);

	void insertItemEtc(ItemVo vo);

	void insertItemEtcMagic(ItemVo vo);


}
