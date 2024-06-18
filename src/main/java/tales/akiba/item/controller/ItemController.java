package tales.akiba.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tales.akiba.item.service.ItemService;
import tales.akiba.item.vo.ItemVo;

@Controller
public class ItemController {

	@Autowired
	ItemService itemService;
	
	// 아이템리스트 가져오기
	@RequestMapping("/Item/List")
	public String Item(Model model) {
		
		List<ItemVo> itemList = itemService.getItemList();
		model.addAttribute( "itemList" , itemList);

		return "item/list";
		
	}
	
	// 아이템정보
	@RequestMapping("/Item/View")
	public  String   view( ItemVo vo, Model model ) {
		
		ItemVo item = itemService.getItem( vo );
		model.addAttribute("item", item);
		
		return  "/item/view";    
	}
	
	// 아이템 추가 기본장비
	@RequestMapping("/Item/WriteForm1")
	public  String  writeform(){
	
            return  "/item/write1";

	}
	
	//아이템 추가 -> 저장 
	@RequestMapping("/Item/Write1")
	public  String  write(	ItemVo  vo ) {
		
		// 아이템 데이터추가
		itemService.insertItem(vo);					
		
		return "/item/list";  
	}
	
	// 아이템 추가 매직장비
	@RequestMapping("/Item/WriteForm2")
	public  String  writeform2(){
	
            return  "/item/write2";

	}
	
	//아이템 추가 -> 저장 
	@RequestMapping("/Item/Write2")
	public  String  write2(	ItemVo  vo ) {
		
		// 아이템 데이터추가
		itemService.insertItemMagic(vo);					
		
		return "/item/list";  
	}
	
	// 아이템 추가 그외
	@RequestMapping("/Item/WriteForm3")
	public  String  writeform3(){
	
            return  "/item/write3";

	}
	
	//아이템 추가 -> 저장 
	@RequestMapping("/Item/Write3")
	public  String  write3(	ItemVo  vo ) {
		
		// 아이템 데이터추가
		itemService.insertItemEtc(vo);					
		
		return "/item/list";  
	}
	
	// 아이템 추가 - 그외 매직
	@RequestMapping("/Item/WriteForm4")
	public  String  writeform4(){
	
            return  "/item/write4";

	}
	
	//아이템 추가 -> 저장 
	@RequestMapping("/Item/Write4")
	public  String  write4(	ItemVo  vo ) {
		
		// 아이템 데이터추가
		itemService.insertItemEtcMagic(vo);					
		
		return "/item/list";  
	}
	
	// 아이템삭제
	@RequestMapping("/Item/Delete/{item_no}")
	public   String   delete(  
	    ItemVo vo	
		) {
				
		itemService.deleteItem( vo );
		
		return "redirect:/item/list";
	}
	
	// 아이템정보 수정
	@RequestMapping("/Item/UpdateForm")
	public String updateForm(ItemVo vo, Model model) {
		
		// 수정할 정보를 조회한다.
		ItemVo item  = itemService.getItem(vo);
		model.addAttribute("item", item);
		
		return "/item/update";
	}
	
	// 수정 정보 저장
	@RequestMapping("/Item/Update")
	public String update(ItemVo vo) {
		
		itemService.itemUpdate(vo);
		
		return "redirect:/item/list";
	}

	
}
