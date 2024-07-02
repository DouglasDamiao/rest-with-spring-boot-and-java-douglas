package br.com.douglas;

public class Greeting {

	private final long id;
	private final String content ;
	
	public Greeting(long id, String content) {	
		this.id = id;
		this.content = content;
	}

	/**
	 * @return o id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return o content
	 */
	public String getContent() {
		return content;
	} 
	
	
}
