package mybatis.springstudy.account;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountDto {

    private Long accountId;
    private String name;
    private String userId;
    private String userPw;

}
