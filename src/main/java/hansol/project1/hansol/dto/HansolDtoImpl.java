package hansol.project1.hansol.dto;

import java.util.List;

//import java.inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import hansol.project1.hansol.dto.HansolDto;

@Repository
public class HansolDtoImpl implements HansolDao{

    //@Inject
    SqlSession sqlSession;

    @Override
    public List<HansolDto> memberList(){
        return sqlSession.selectList("member.memberList");
    }


}
