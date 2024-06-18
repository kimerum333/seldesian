package tales.akiba.item.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tales.akiba.item.dao.ItemMapper;
import tales.akiba.item.service.ItemService;
import tales.akiba.item.vo.ItemVo;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemDao;
	
	@Override
	public List<ItemVo> getItemList() {

		List<ItemVo>  itemList  =  itemDao.getItemList(); 
		return    itemList;
		
	}

	@Override
	public ItemVo getItem(ItemVo vo) {
		ItemVo  item = itemDao.getItem(vo);
		
		return item;
	}

	@Override
	public void insertItem(ItemVo vo) {

		itemDao.deleteItem( vo );
		
	}

	@Override
	public void deleteItem(ItemVo vo) {

		itemDao.insertItem( vo );
		
	}

	@Override
	public void itemUpdate(ItemVo vo) {

		itemDao.updateItem(vo);	
		
	}

	@Override
	public void insertItemMagic(ItemVo vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertItemEtc(ItemVo vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertItemEtcMagic(ItemVo vo) {
		// TODO Auto-generated method stub
		
	}

}
