

	import java.util.ArrayList;
	import java.util.List;


	public class Application {

  public static void main(String[] args) {

	        List<User> registUser = new ArrayList<>();

	        registUser.add(new User("Saptesate", "Ion", 21,"ion.saptesate@ee.utm.md"
	                ,Status.New,"5 7 2020"));
	        registUser.add(new User("Ceban", "Vasile", 22,"ceban.vasile@fet.utm.md"
	                ,Status.New,"6 10 2020"));

	        for (User user: registUser) {
	            user.changeStatus();
	            System.out.println(user);

	        }

	    }



	}





