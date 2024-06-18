package tales.akiba.seldesian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import tales.akiba.seldesian.entity.Union;
import tales.akiba.seldesian.service.UnionService;

@RestController
@RequiredArgsConstructor
public class UnionContoller {
	
	@Autowired
	UnionService unionService;

	@PostMapping("/union/write")
	public boolean unionWrite(@RequestParam(value = "union_no", required = false) Long union_no, Union params, Model model) {
		//원래 인수로 Long union만 받음
		
		//유니온 등록 페이지
		if (union_no == null) {
			model.addAttribute(("union"), new Union());
		} else {
			Union union = unionService.getUnionDetail(union_no);
			if (union == null) {
				//return "redirect:/union/list";
			}
			model.addAttribute("union", union);
		}
		boolean unionWrite = unionService.registerUnion(params);
		//return "/union/write";
		return unionWrite;
	}
	
	@GetMapping(value = "/union/list")
	public List<Union> unionList(Model model) {
		// 유니온 리스트
		List<Union> unionList = unionService.getUnionList();
		model.addAttribute("unionList", unionList);
		
		//return "union/list";
		return unionList;
	}
	
	@GetMapping("/union/view")
	public Union unionDetail(@RequestParam(value = "union_no", required = false) Long union_no, Model model) {
		// 유니온 상세 읽기
//		if (union_no == null) {
//			//올바르지 못한 접근
//			return "redirect:/union/list";
//		}
		Union union = unionService.getUnionDetail(union_no);
		
//		if (union == null || "2".equals(union.getUnion_resister_yn())) {
//			//없는 유니온 번호이거나 삭제된 유니온
//			return "redirect:/union/list";
//		}
		
		model.addAttribute("union", union);
		
		//return "/union/view";
		return union;
	}
	
	@PostMapping("/union/confirm")
	public boolean confirmUnion(@RequestParam(value="union_no", required = false) Long union_no) {
		// 유니온 승인

		if (union_no == null) {
			//올바르지 못한 접근
			//return "redirect:/union/list";
		}
		boolean isConfirmed = unionService.confirmUnion(union_no);
		try {
			//boolean isConfirmed = unionService.confirmUnion(union_no);
			if (isConfirmed == false) {
				//게시글 삭제 실패
			}
		} catch(DataAccessException e) {
			//DB 처리 과정에 문제
		} catch(Exception e) {
			//시스템 문제
		}
		
		return isConfirmed;
		//return "redirect:/union/list";
	}
	
	@PostMapping("/union/delete")
	public boolean deleteUnion(@RequestParam(value="union_no", required = false) Long union_no) {
		// 유니온 삭제
		if (union_no == null) {
			//올바르지 못한 접근
			//return "redirect:/union/list";
		}
		boolean isDeleted = unionService.deleteUnion(union_no);
		try {
			//boolean isDeleted = unionService.deleteUnion(union_no);
			if (isDeleted == false) {
				//게시글 삭제 실패
			}
		} catch(DataAccessException e) {
			//DB 처리 과정에 문제
		} catch(Exception e) {
			//시스템 문제
		}
		
		//return "redirect:/union/list";
		return isDeleted;
	}
}
