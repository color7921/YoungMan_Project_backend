package edu.pnu.domain;

import java.time.ZonedDateTime;
import java.util.Date;

import org.springframework.data.annotation.Id;

import edu.pnu.domain.enums.IsLooked;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatLog {

	@Id
	private String chatLogId;
	private String content;
	private String Sender;
	private String Receiver;
	private Date timeStamp;
	private String chatRoomId;
	private IsLooked isLooked;
}
