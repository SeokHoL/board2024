package kr.ac.kopo.board2.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class BoardDTO {

    private Long bno;
    private String title;
    private String content;
    private String writerEmail;
    private String writer;
    private String writerName;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
    private int replyCount;
}
