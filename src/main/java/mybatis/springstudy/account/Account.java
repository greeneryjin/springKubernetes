package mybatis.springstudy.account;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private Long accountId;
    private String name;
    private String userId;
    private String userPw;

    public Account(String name, String userId, String userPw) {
        this.name = name;
        this.userId = userId;
        this.userPw = userPw;
    }
}
