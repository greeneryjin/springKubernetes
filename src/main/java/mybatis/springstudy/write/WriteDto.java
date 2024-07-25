package mybatis.springstudy.write;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WriteDto {

    private int writeId;
    private String title;
    private String content;
    private String writer;

    public WriteDto(Writes writes) {
        this.title = writes.getTitle();
        this.content = writes.getContent();
        this.writer = writes.getWriter();
    }
}
