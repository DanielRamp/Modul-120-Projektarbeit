package application;

import java.time.Instant;

/**
 * @author daniel<daniel.ramp@gibmit.ch>
 *
 */
public class Post {

	private String icon;
	private String title;
	private String categories;
	private String content;
	private Boolean isRead;
	private Instant createdAt;
	
	/**
	 * @param icon
	 * @param title
	 * @param categories
	 * @param content
	 * @param isRead
	 * @param createdAt
	 */
	public Post(String icon, String title, String categories, String content) {
		this.icon = icon;
		this.title = title;
		this.categories = categories;
		this.content = content;
		this.isRead = false;
		this.createdAt = Instant.now();
	}

}
