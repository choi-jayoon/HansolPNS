package hansol.project1.hansol.controller;
import java.util.List;


import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import hansol.project1.hansol.dto.HansolDto;
import hansol.project1.hansol.service.HansolService;

@Controller
public class HansolController {
    @Autowired
    private HansolService hansolService;

    //회원 목록
    @RequestMapping("member/list.do")
    public String memberList(Model model){
        List<HansolDto> list = hansolService.memberList();
        model.addAttribute("list",list);
        return "member/member_list";
    }


}
