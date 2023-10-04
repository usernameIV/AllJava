package StaticKeyword;

public class StaticKeyword {

	public static void main(String[] args) {

		
		Friend friend = new Friend("Spongebob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Squidward");
		
		System.out.println(Friend.numberOfFriends);
		
		Friend.displayFriends();
		
		
	}

}
