package com.spring.cafemoa.noticeboard;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NoticeBoardVO {
	
	private int notice_board_seq;
	private String notice_board_member_id;
	private String notice_board_title;
	private String notice_board_content;
	private Date notice_board_regdate;

}
