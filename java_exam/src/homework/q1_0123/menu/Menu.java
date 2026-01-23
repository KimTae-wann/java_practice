package homework.q1_0123.menu;

import java.util.*;

public class Menu {

	List<Object> menuList;
	
	public Menu() {
		menuList = new ArrayList<> ();
	}
	
	public void addMenu(Object obj) {
		menuList.add(obj);
	}
}
