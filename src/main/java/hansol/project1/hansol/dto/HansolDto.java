package hansol.project1.hansol.dto;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
@Getter
@Setter
public class HansolDto {
    private String id_code;
    private String business_name;
    private String company;
    private String id_name;
    private String id_position;
    private String id_kind;
    private String phone_num;

    public String getIdcode(){
        return id_code;
    }
    public String getBusinessname(){
        return business_name;
    }
    public String getCompany(){
        return company;
    }
    public String getIdname(){
        return id_name;
    }
    public String getIdposition(){
        return id_position;
    }
    public String getIdkind(){
        return id_kind;
    }
    public String getPhonenuber(){
        return phone_num;
    }

    @Override
    public String toString(){
        return "DTO" + id_code + business_name+ id_name + id_position + id_kind + phone_num;
    }
}
