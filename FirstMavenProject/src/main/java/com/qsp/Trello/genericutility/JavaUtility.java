package com.qsp.Trello.genericutility;

import java.time.LocalDateTime;

public class JavaUtility {
public String timestamp() {
	
	String timestamp=LocalDateTime.now().toString().replace(':', '-');
	
	return timestamp();
}
}
