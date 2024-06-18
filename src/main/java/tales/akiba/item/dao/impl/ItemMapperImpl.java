package tales.akiba.item.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tales.akiba.item.dao.ItemMapper;
import tales.akiba.item.vo.ItemVo;


@Repository("itemMapper")
public class ItemMapperImpl implements ItemMapper {

	@Autowired
	private  SqlSession sqlSession;
	
	@Override
	public List<ItemVo> getItemList() {
		
		List<ItemVo>  itemList =  sqlSession.selectList("Item.getItemList");
		
		return itemList;
		
	}

	@Override
	public ItemVo getItem(ItemVo vo) {
		
		ItemVo  item  =  sqlSession.selectOne("Item.getItem", vo);
		
		return  item;
		
	}

	@Override
	public void deleteItem(ItemVo vo) {

		sqlSession.delete( "Item.ItemDelete", vo );
		
	}

	@Override
	public void insertItem(ItemVo vo) {

		sqlSession.insert("Item.ItemInsert", vo);
		
	}

	@Override
	public void updateItem(ItemVo vo) {

		sqlSession.update("Item.ItemUpdate", vo);
		
	}

}
