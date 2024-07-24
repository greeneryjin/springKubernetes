package mybatis.springstudy.write;



public class Writes {

    private Long id;
    private String title;
    private String content;
    private String writer;

    public Writes(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
}
