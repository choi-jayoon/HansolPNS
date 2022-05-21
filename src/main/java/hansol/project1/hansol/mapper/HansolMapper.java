package hansol.project1.hansol.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import hansol.project1.hansol.dto.HansolDto;

@Mapper
public interface HansolMapper {

    public int insertMember(HansolDto memberList);
    List<HansolDto> MemberList() throws Exception;

}

