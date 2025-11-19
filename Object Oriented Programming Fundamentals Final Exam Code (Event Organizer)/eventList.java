import java.util.ArrayList;


public class eventList {
	private ArrayList<Event> events = new ArrayList<Event>();
	
	public eventList() {
		
	}
	
	public eventList(ArrayList<Event> events) {
		this.events = events;
	}
	
	public ArrayList<Event> getEventList() {
		return events;
	}

	public void setEventList(ArrayList<Event> events) {
		this.events = events;
	
	}
	public void addEvent(Event event) {
		events.add(event);
	}
	
	public void displayEvents() {
		for (Event e:events) {
			System.out.print(e + "\n");
			System.out.println();
		}
	}
}
