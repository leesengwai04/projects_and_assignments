
public class Review {
	private String desc;
	private int rating;
	
	public Review() {
		
	}
	
	public Review(String desc,int rating) {
		this.desc = desc;
		this.rating = rating;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String toString() {
		return String.format("Rating:%s/5\nFeedback:%s\n",rating,desc);
	}
}
