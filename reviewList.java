import java.util.ArrayList;

public class reviewList {
	ArrayList<Review> reviews = new ArrayList<Review>();
	
	public reviewList() {
		
	}

	public reviewList(ArrayList<Review> reviews) {
		this.reviews = reviews;
	}
	
	public ArrayList<Review> getReviews() {
		return reviews;
	}

	public void setFeedbacks(ArrayList<Review> reviews) {
		this.reviews = reviews;
	}
	
	public void addReview(Review review) {
		reviews.add(review);
	}
	public void displayReviews() {
		for (Review r:reviews) {
			System.out.println(r);
		}
	}
}