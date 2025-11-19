
public class Event {
	private String eventName;
	private String category;
	private String dateTime;
	private int maxMembers;
	private String location;
	private Review reviews;
	
	public Event() {
		
	}
	
	public Event(String eventName,String category,String dateTime,int maxMembers,String location) {
		this.eventName = eventName;
		this.category = category;
		this.dateTime = dateTime;
		this.maxMembers = maxMembers;
		this.location = location;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public int getMaxMembers() {
		return maxMembers;
	}

	public void setMaxMembers(int maxMembers) {
		this.maxMembers = maxMembers;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void memberJoined() {
		maxMembers -= 1;
	}
	
	public String toString() {
		return String.format("Event Name:%s\nEvent Category:%s\nEvent Date Time:%s\nMax members:%s\nLocation:%s",eventName,category,dateTime,maxMembers,location);
	}
}
