package mybatis.springstudy.write;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WriteDto {

    private Long id;
    private String title;
    private String content;
    private String writer;
}
