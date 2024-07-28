package mybatis.springstudy.write;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WriteDto {

    private int writeId;
    private String title;
    private String content;
    private String writer;
    private String regDate;

    public WriteDto(Writes writes) {
        this.title = writes.getTitle();
        this.content = writes.getContent();
        this.writer = writes.getWriter();
        this.regDate = writes.getRegDate().toString();
    }
    
}
