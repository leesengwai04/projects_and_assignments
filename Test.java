import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userChoice; 
		String name;
		String password;
		String name1;
		String password1;
		String event1;
		String event2;
		Member m1 = new Member("Ben",20,"Male","ben@nomail.com","01232244224","ilikeevents");
		Member m2 = new Member("John",23,"Male","john@mail.com","0131119822","iamjohn");
		Organizer o1 = new Organizer("Max",30,"Male","max@maxmail.com","0145678883","password","1011");
		Organizer o2 = new Organizer("Sally",26,"Female","sally@samail.com","0121114443","sally123","2311");
		Event e1 = new Event("Party at My House","Party","26/1/2025 4pm-10pm",30,"31,Jalan Rayo,Kepong,Kuala Lumpur");
		Event e2 = new Event("Shooting Star Watching","Hanging out","1/2/2025 11pm-1pm",50,"Football Field,Big Stadium,Penang");
		eventList el = new eventList();
		reviewList rl = new reviewList();
		reviewList rl2 = new reviewList();
		Review r1 = new Review("Amazing spot",4);
		Review r2 = new Review("Great Event!",5);
		Review r3 = new Review("Nice spot you've chosen",4);
		Review r4 = new Review("The organizer is a nice person. Had a great time!",5);
		rl.addReview(r1);
		rl.addReview(r2);
		rl2.addReview(r3);
		rl2.addReview(r4);
		el.addEvent(e1);
		el.addEvent(e2);
		
				
				
		
		
		System.out.println("Welcome to HNGOUT! Please login to see events available. Are you a member or organizer?");
		while(true) {
			userChoice = input.nextLine();
			if (userChoice.toLowerCase().equals("member")) {
				break;
			}
			else if(userChoice.toLowerCase().equals("organizer")) {
				break;
			}
			else {
				System.out.println("Invalid input.Please try again.");
			}
		}
		
		if (userChoice.equals("member")) {
			System.out.println("Please enter member details.\nName:");
			while(true) {
				name = input.nextLine();
				if(name.equals(m1.getName())) {
					System.out.println("Password:");
					while(true) {
						password = input.nextLine();
						if (password.equals(m1.getPassword())) {
							System.out.println(m1);
							System.out.println();
							System.out.println("Events available:");
							el.displayEvents();
							System.out.printf("Reviews for %s:\n",e1.getEventName());
							rl.displayReviews();
							System.out.println();
							System.out.printf("Reviews for %s:\n",e2.getEventName());
							rl2.displayReviews();
							System.out.println();
							System.out.println("Would you like to join any events?(Enter event name to join)");
							while(true) {
								event1 = input.nextLine();
								if(event1.equals(e1.getEventName())) {
									System.out.println("Event joined!");
									System.out.println();
									e1.memberJoined();
									System.out.println("Updated event details:");
									System.out.print(e1);
									break;
								}
								else if (event1.equals(e2.getEventName())) {
									System.out.println("Event joined!");
									System.out.println();
									e2.memberJoined();
									System.out.println("Updated event details:");
									System.out.print(e2);
									break;
								}
							}
							break;
						}
						else {
							System.out.println("Wrong password.Try again");
						}
					}
				}
				else if (name.equals(m2.getName())) {
					System.out.println("Password:");
					while(true) {
						password = input.nextLine();
						if (password.equals(m2.getPassword())) {
							System.out.println(m2);
							System.out.println();
							System.out.println("Events available:");
							System.out.println();
							el.displayEvents();
							System.out.printf("Reviews for %s:\n",e1.getEventName());
							rl.displayReviews();
							System.out.println();
							System.out.printf("Reviews for %s:\n",e2.getEventName());
							rl2.displayReviews();
							System.out.println();
							while(true) {
								event1 = input.nextLine();
								if(event1.equals(e1.getEventName())) {
									System.out.println("Event joined!");
									System.out.println();
									e1.memberJoined();
									System.out.println("Updated event details:");
									System.out.print(e1);
									break;
								}
								else if (event1.equals(e2.getEventName())) {
									System.out.println("Event joined!");
									System.out.println();
									e2.memberJoined();
									System.out.println("Updated event details:");
									System.out.print(e2);
									break;
								}
							}
							break;
						}
						else {
							System.out.println("Wrong password.Try again");
						}
					}
				}
				
				else {
					System.out.println("Invalid name.Please try again.");
				}
			
			}
		}	
		else if (userChoice.equals("organizer")){
			System.out.println("Please enter organizer details.\nName:");
			while(true) {
				name = input.nextLine();
				if(name.equals(o1.getName())) {
					System.out.println("Password:");
					while(true) {
						password = input.nextLine();
						if (password.equals(o1.getPassword())) {
							System.out.println(o1);
							System.out.println("Current held events:");
							System.out.println(e1.getEventName());
							break;
						}
						else {
							System.out.println("Wrong password.Try again");
						}
					}
				}
				else if (name.equals(o2.getName())) {
					System.out.println("Password:");
					while(true) {
						password = input.nextLine();
						if (password.equals(o2.getPassword())) {
							System.out.println(o2);
							System.out.println("Current held events:");
							System.out.println(e2.getEventName());
							break;
							
						}
						else {
							System.out.println("Wrong password.Try again");
						}
					}
				}
				
				else {
					System.out.println("Invalid name.Please try again.");
				}
			
			}
			
			
		
		
	

	}

		
}
}