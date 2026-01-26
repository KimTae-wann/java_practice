package homework.q1_0126;

public class Q1_0126 {

	public static void main(String[] args) {
		/* BOJ 27866
		import java.util.*;

		public class Main
		{
			public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    String str = sc.nextLine();
			    int strNum = sc.nextInt();
			    System.out.println(str.charAt(strNum - 1));
			}
		}

		*/
		
		/* BOJ 2743
		import java.util.*;

		public class Main
		{
			public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    String str = sc.nextLine();
			    System.out.println(str.length());
			}
		}

		*/
		
		/* BOJ 11654
		import java.util.*;

		public class Main
		{
			public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    String str = sc.nextLine();
			    char c = str.charAt(0);
			    int ans = c;
			    System.out.println(ans);
			}
		}

		*/
		
		/* BOJ 11720
		import java.util.*;

		public class Main
		{
			public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    int num = sc.nextInt();
			    int sum = 0;
			    sc.nextLine();
			    String str = sc.nextLine();
			    for (int i = 0; i < num; i++) {
			        sum += Integer.valueOf(str.charAt(i) - '0');  
			    }
			    System.out.println(sum);
			}
		}

		import java.util.*;

		public class Main
		{
			public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    int num = sc.nextInt();
			    int sum = 0;
			    sc.nextLine();
			    String str = sc.nextLine();
			    for (int i = 0; i < num; i++) {
			        sum += Integer.parseInt(String.valueOf(str.charAt(i)));  
			    }
			    System.out.println(sum);
			}
		}
 
		import java.util.*;
		
		public class Main
		{
			public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    int num = sc.nextInt();
			    int sum = 0;
			    sc.nextLine();
			    String str = sc.nextLine();
			    for (int i = 0; i < num; i++) {
			        sum += str.charAt(i) - '0';  
			    }
			    System.out.println(sum);
			}
		}

		*/
		
		/* BOJ 10809
		import java.util.*;

		public class Main
		{
			public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    int[] alphabetCnt = new int[26];
			    for (int i = 0; i < 26; i++) {
			        alphabetCnt[i] = -1;
			    }
			    String str = sc.nextLine();
			    for (int i = 0; i < str.length(); i++) {
			        if (alphabetCnt[str.charAt(i) - 'a'] != -1) continue; 
			        alphabetCnt[str.charAt(i) - 'a'] = i;
			    }
			    for (int i = 0; i < 26; i++) {
			        System.out.print(alphabetCnt[i] + " ");
			    }
			}
		}

		import java.util.*;

		public class Main
		{
			public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    int[] alphabetCnt = new int[26];
			    for (int i = 0; i < alphabetCnt.length; i++) {
			        alphabetCnt[i] = -1;
			    }
			    String str = sc.nextLine();
			    for (int i = 0; i < str.length(); i++) {
			        if (alphabetCnt[str.charAt(i) - 'a'] != -1) continue; 
			        alphabetCnt[str.charAt(i) - 'a'] = str.indexOf(str.charAt(i));
			    }
			    for (int i = 0; i < alphabetCnt.length; i++) {
			        System.out.print(alphabetCnt[i] + " ");
			    }
			}
		}
	
		*/

		/* BOJ 1152
		import java.util.*;

		public class Main
		{
			public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    String str = sc.nextLine();
			    str = str.trim();
			    String[] ans = str.split(" ");
			    if (str.length() == 0) {
			        System.out.println(0);
			    }
			    else {
			        System.out.println(ans.length);
			    }
			}
		}

		*/
		
		/* BOJ 2908
		import java.util.*;

		public class Main
		{
			public static void main(String[] args) {
			    Scanner sc = new Scanner(System.in);
			    String str = sc.nextLine();
			    String[] nums = str.split(" ");
			    String ans = "";
			    
			    String str1 = nums[0];
			    String str2 = nums[1];
			    for (int i = 2; i >= 0; i--) {
			        if (str1.charAt(i) < str2.charAt(i)) {
			            ans = str2;
			            break;
			        } else if (str1.charAt(i) > str2.charAt(i)) {
			            ans = str1;
			            break;
			        }
			    }
			    
			    for (int i = 2; i >= 0; i--) {
			        System.out.print(ans.charAt(i));
			    }
			    
			}
		}

		 */
		
		/* Pro 181842
		class Solution {
		    public int solution(String str1, String str2) {
				int answer = 0;
				if (str2.contains(str1)) answer = 1;
				else answer = 0;
				return answer;
			}
		}
		 */
		
		/* Pro 181843
		class Solution {
		    public int solution(String my_string, String target) {
		        return my_string.contains(target) ? 1 : 0;
		    }
		}
		 */
		
		/* Pro 181845
		class Solution {
		    public String solution(int n) {
		        return String.valueOf(n);
		    }
		}
		 */
		
		/* Pro 181848
		class Solution {
		    public int solution(String n_str) {
		        return Integer.parseInt(n_str);
		    }
		}
		 */
		
		/* Pro 181847
		class Solution {
		    public String solution(String n_str) {
		        return String.valueOf(Integer.parseInt(n_str));
		    }
		}
		 */
		
		/* Pro 181849
		class Solution {
		    public int solution(String num_str) {
		        int answer = 0;
		        for (int i = 0; i < num_str.length(); i++) {
		            answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));
		        }
		        return answer;
		    }
		}
		 */ 
		
		/* Pro 181876
		class Solution {
		    public String solution(String myString) {
		        return myString.toLowerCase();
		    }
		}
		 */
		
		/* Pro 181878
		class Solution {
		    public int solution(String myString, String pat) {
		        String str1 = myString.toLowerCase();
		        String str2 = pat.toLowerCase();
		        if (str1.contains(str2)) return 1;
		        else return 0;
		    }
		}
		 */
		
		/* Pro 181875
		class Solution {
		    public String[] solution(String[] strArr) {
		        String[] answer = new String[strArr.length];
		        for (int i = 0; i < strArr.length; i++) {
		            if (i % 2 == 0) {
		                answer[i] = strArr[i].toLowerCase();
		            }
		            else {
		                answer[i] = strArr[i].toUpperCase();
		            }
		        }
		        return answer;
		    }
		}
		 */
	}

}
