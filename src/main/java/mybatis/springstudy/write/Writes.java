package mybatis.springstudy.write;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Writes {

    private int writeId;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;
    private LocalDateTime deleteDate;

    public Writes(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.regDate = LocalDateTime.now();
        this.updateDate = LocalDateTime.now();
        this.deleteDate = LocalDateTime.now();
    }
}
