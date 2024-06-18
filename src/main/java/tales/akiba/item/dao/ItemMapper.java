package tales.akiba.item.dao;

import java.util.List;

import tales.akiba.item.vo.ItemVo;

public  interface  ItemMapper {

	List<ItemVo> getItemList();

	ItemVo getItem(ItemVo vo);

	void deleteItem(ItemVo vo);

	void insertItem(ItemVo vo);

	void updateItem(ItemVo vo);

}
