package homework.q1_0127;

import java.util.*;

public class Q1_0127 {

		/* BOJ 10807
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int[] nums = new int[num];
			for (int i = 0; i < num; i++) {
			    nums[i] = sc.nextInt();
			}
			int target = sc.nextInt();
			int ans = 0;
			for (int i = 0; i < num; i++) {
			    if (nums[i] == target) {
			        ans++;
			    }
			}
			System.out.println(ans);
		}
		*/
		
		/* BOJ 10871
		 * Case1
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int x = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
			    int num = sc.nextInt();
			    if (num < x) {
			        System.out.print(num + " ");
			    }
			}
		} 
		 * Case2
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] num = new int[n];
			
			for (int i = 0; i < n; i++) {
			    num[i] = sc.nextInt();
			}
			
			for (int i = 0; i < n; i++) {
			    if (num[i] < x) {
			        System.out.print(num[i] + " ");
			    }
			}
		} 
		
		*/
		
		/* BOJ 10818
		 * Case1
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int max = -1_000_000;
			int min = 1_000_000;
			
			for (int i = 0; i < n; i++) {
			    int num = sc.nextInt();
			    if (num < min) {
			        min = num;
			    }
			    if (num > max) {
			        max = num;
			    }
			}
			System.out.print(min + " " + max);
		}
		 * Case2
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
		    int[] num = new int[n];
			int max = -1_000_000;
			int min = 1_000_000;
			
			for (int i = 0; i < n; i++) {
			    num[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
			    if (num[i] < min) {
			        min = num[i];
			    }
			    if (num[i] > max) {
			        max = num[i];
			    }
			}
			System.out.print(min + " " + max);
		}
		*/
		
		/* BOJ 2562
		 * Case 1
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int max = 0;
			int at = 0;
			
			for (int i = 0; i < 9; i++) {
			    int num = sc.nextInt();
			    if (num > max) {
			        max = num;
			        at = i;
			    }
			}
			System.out.print(max + "\n" + (at + 1));
		}
		 	*Case 2
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		    int[] num = new int[9];
			int max = 0;
			
			for (int i = 0; i < 9; i++) {
			    num[i] = sc.nextInt();
			    if (num[i] > max) {
			        max = num[i];
			    }
			}
			for (int i = 0; i < 9; i++) {
			    if (num[i] == max) {
			        System.out.println(num[i] + "\n" + (i + 1));
			    }
			}
	    }
		
		*/
		
		/* BOJ 5597
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			boolean[] student = new boolean[30];
			for (int i = 0; i < 28; i++) {
			    int studentNum = sc.nextInt();
			    student[studentNum - 1] = true; 
			}
			for (int i = 0; i < student.length; i++) {
			    if (!student[i]) {
			        System.out.println(i + 1);
			    }
			}
		} 
		*/
		
		/* Pro 181941
		class Solution {
		    public String solution(String[] arr) {
		        String answer = "";
		        for (int i = 0; i < arr.length; i++) {
		            answer += arr[i];
		        }
		        return answer;
		    }
		}
		*/
		
		/* Pro 181852
		public int[] solution(int[] num_list) {
	        int[] answer = new int[num_list.length - 5];
	        Arrays.sort(num_list);
	        for (int i = 5; i < num_list.length; i++) {
	            answer[i - 5] = num_list[i];
	        }
	        
	        return answer;
	    }
		*/
		
		/* Pro 181853
		public int[] solution(int[] num_list) {
	        int[] answer = new int[5];
	        for (int i = 0; i < num_list.length; i++) {
	            for (int j = i + 1; j < num_list.length; j++) {
	                if (num_list[i] > num_list[j]) {
	                    int temp = num_list[i];
	                    num_list[i] = num_list[j];
	                    num_list[j] = temp;
	                }
	            }
	        }
	        for (int i = 0; i < 5; i++) {
	            answer[i] = num_list[i];
	        }
	        return answer;
	    }
		*/
		
		/* Pro 181854
			public int[] solution(int[] arr, int n) {
	        int[] answer = new int[arr.length];
	        if (arr.length % 2 == 1) {
	            for (int i = 0; i < arr.length; i++) {
	                if (i % 2 == 0) {
	                    arr[i] += n;
	                }
	            }
	        }
	        else {
	            for (int i = 0; i < arr.length; i++) {
	                if (i % 2 == 1) {
	                    arr[i] += n;
	                }
	            }
	        }
	        for (int i = 0; i < arr.length; i++) {
	            answer[i] = arr[i];
	        }
	        return answer;
	    }
		*/
		
		/* Pro 181856
		public int solution(int[] arr1, int[] arr2) {
	        if (arr1.length < arr2.length) {
	            return -1;
	        }
	        else if (arr1.length > arr2.length) {
	            return 1;
	        }
	        else {
	            int sum1 = 0;
	            int sum2 = 0;
	            for (int i = 0; i < arr1.length; i++) {
	                sum1 += arr1[i];
	                sum2 += arr2[i];
	            }
	            if (sum1 < sum2) {
	                return -1;
	            }
	            else if (sum1 > sum2) {
	                return 1;
	            }
	            else {
	                return 0;    
	            }
	        }
	    }
		*/
		
		/* Pro 181861
		public static int[] addList(int[] arr) {
	        int[] returnArr = new int[arr.length + 1];
	        for (int i = 0; i < arr.length; i++) {
	            returnArr[i] = arr[i];
	        }
	        return returnArr;
	    }
	    
	    public int[] solution(int[] arr) {
	        int[] answer = {};
	        for (int i = 0; i < arr.length; i++) {
	            int num = arr[i];
	            for (int j = 0; j < num; j++) {
	                answer = addList(answer);
	                answer[answer.length - 1] = num; 
	            }
	        }
	        return answer;
	    } 
		*/
		
		/* Pro 181867
		public static int[] addList(int[] arr) {
		    int[] returnArr = new int[arr.length + 1];
		    for (int i = 0; i < arr.length; i++) {
		        returnArr[i] = arr[i];
		    }
		    return returnArr;
		}
	    public int[] solution(String myString) {
	        int[] answer = {};
	        String[] tempArr = myString.split("x");
	        for (int i = 0; i < tempArr.length; i++) {
	            answer = addList(answer);
	            answer[answer.length - 1] = tempArr[i].length();
	        }
	        if (myString.charAt(myString.length() - 1) == 'x') {
	            answer = addList(answer);
	            answer[answer.length - 1] = 0;
	        }
	        return answer;
	    }
		*/
		
		/* Pro 181868
		public String[] solution(String my_string) {
		    String temp = my_string.trim();
		    String[] answer = temp.split("\\s+");
		    return answer;
		 }
		*/
		
		/* 181869
		public String[] solution(String my_string) {
	        String[] answer = {};
	        answer = my_string.split(" ");
	        return answer;
	    }
		*/
		
		/* BOJ 2566
		 * Case 1
		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
			int max = 0, x = 0, y = 0;
			for (int i = 0; i < 9; i++) {
			    for (int j = 0; j < 9; j++) {
			        int temp = sc.nextInt(); 
			        if (max < temp) {
			            max = temp;
			            x = j;
			            y = i;
			        }
			    }
			}
			System.out.println(max + "\n" + (y + 1) + " " + (x + 1));
		}
		* Case 2
		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
			int max = 0, x = 0, y = 0;
			int[][] num = new int[9][9];
			for (int i = 0; i < 9; i++) {
			    for (int j = 0; j < 9; j++) {
			        num[i][j] = sc.nextInt();
			    }
			}
			for (int i = 0; i < 9; i++) {
			    for (int j = 0; j < 9; j++) {
			        if (max < num[i][j]) {
			            max = num[i][j];
			            x = j;
			            y = i;
			        }
			    }
			}
			System.out.println(max + "\n" + (y + 1) + " " + (x + 1));
		}
		*/
		
		/* BOJ 10798
		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int maxLine = 0;
		    char[][] arr = new char[5][15];
		    for (int i = 0; i < 5; i++) {
	    	    String str = sc.nextLine();
	    	    if (maxLine < str.length()) {
	    	        maxLine = str.length();
	    	    }
	    	    for (int j = 0; j < str.length(); j++) {
	    	        arr[i][j] = str.charAt(j);
	    	    }
		    }
		    
		    for (int i = 0; i < maxLine; i++) {
		        for (int j = 0; j < 5; j++) {
		            System.out.print(arr[j][i]);
		        }
		    }
		}
		 */
	}

