package QI;

import java.util.*;
public class T1_2 {
		public int hashCode() {
			return 1;
		}
		public boolean equals(Object b) {
			return true;
		}
		public static void main(String args[]) {
			Set set = new HashSet();
			set.add(new T1_2());
			set.add(new String("ABC"));
			set.add(new T1_2());
			System.out.println(set.size());
		}
}
