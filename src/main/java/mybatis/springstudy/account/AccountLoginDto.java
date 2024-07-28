package mybatis.springstudy.account;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AccountLoginDto {

    private String userId;
    private String userPw;
    
}
