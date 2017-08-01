package newpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class testCase1 {

	public static void main(String[] args) {
		basic myObj = new basic();
		ArrayList<String> aList = new ArrayList<String>();
		
		aList.add("http://ms.scrpower99.com");
		aList.add("openBrowser");
		aList.add("");
		
		aList.add("input[class='btn-h-login']");
		aList.add("tryClick");
		aList.add("");
		
		aList.add("input[id='username']");
		aList.add("tryInput");
		aList.add("0197768799");
		
		aList.add("input[id='Password']");
		aList.add("tryInput");
		aList.add("999999");
		
		aList.add("input[id='btnSubmitLogin']");
		aList.add("tryClick");
		aList.add("");
		
		aList.add("");
		aList.add("tryClose");
		aList.add("");
		

		Iterator<String> iterator = aList.iterator();

		while (iterator.hasNext()) {
			// System.out.println(iterator.next());
			switch (aList.get(1)) {
			case "openBrowser":
				System.out.println("action now: " + aList.get(1));
				myObj.openBrowser(aList.get(0));
				for (int x = 3; x > 0; x--) {
					aList.remove(0);
				}

				System.out.println("Succeeded, next action: " + aList.get(1));
				break;

			case "tryClick":
				System.out.println("action now: " + aList.get(1));
				myObj.tryClick(aList.get(0));
				for (int x = 3; x > 0; x--) {
					aList.remove(0);
				}
				System.out.println("Succeeded, next action: " + aList.get(1));
				break;

			case "tryInput":
				System.out.println("action now: " + aList.get(1));
				myObj.tryInput(aList.get(0), aList.get(2));
				for (int x = 3; x > 0; x--) {
					aList.remove(0);
				}
				System.out.println("Succeeded, next action: " + aList.get(1));
				break;

			case "tryClose":
				System.out.println("action now: " + aList.get(0));
				myObj.tryClose();
				for (int x = 3; x > 0; x--) {
					aList.remove(0);
				}
				System.out.println("Succeeded, next action: " + aList.get(0));
				break;

			default:
				System.out.println("invalid command");
				break;
			}
		}

	}

}
