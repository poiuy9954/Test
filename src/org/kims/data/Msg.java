package org.kims.data;

public class Msg {
	private String from;
	private String to;
	private String content;
	
	
	
	public Msg(String from, String to, String content) {
		super();
		this.from = from;
		this.to = to;
		this.content = content;
	}
	
	
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public String getContent() {
		return content;
	}


	@Override
	public String toString() {
		return "Msg [from=" + from + ", to=" + to + ", content=" + content + "]";
	}
	
	
	
	
}
