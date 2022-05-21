package hansol.project1.hansol.service;
import java.util.List;

//import java.util.inject;
import hansol.project1.hansol.dto.HansolDtoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hansol.project1.hansol.dto.HansolDto;
import hansol.project1.hansol.dto.HansolDtoImpl;

@Service
public class HansolServiceImpl implements HansolService{
 //   @Inject
    HansolDtoImpl hansolDao;

    @Override
    public List<HansolDto> memberList(){
        return hansolDao.memberList();
    }

}
