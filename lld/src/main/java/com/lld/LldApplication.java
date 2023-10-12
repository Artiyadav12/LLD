package com.lld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class LldApplication {


    public static void main(String[] args) {
        SpringApplication.run(LldApplication.class, args);


//		Controller main=new Controller();
//		Scanner scanner=new Scanner(System.in);
//
//		Board board=new Board(100);
//		main.playGame();
//		System.out.println("Enter no of players");
//		int noOfPlayers= scanner.nextInt();
//		List<Player> players=new ArrayList<>();
//		for (int i=0;i<noOfPlayers;i++){
//			System.out.println("Enter Player "+i+" name");
//			String playerName=scanner.next();
//			Player player=new Player(playerName,0,0);
//			players.add(player);
//		}
//		main.setPlayers(players);
//		while (true){
//
//			for (Player player:players) {
//				System.out.println(player.getPlayerName()+" Chance");
//
//				int roll=player.rollDice();
//				System.out.println(player.getPlayerName()+" Rolled "+roll);
//				board.movePlayers(player,roll);
//				if(board.winner(player))
//				{
//					System.out.println(player.getPlayerName()+" Won");
//					return;
//				}
//			}
//
//		}

//        Scanner sc = new Scanner(System.in);
//
//        int t=sc.nextInt();
//        for(int i=0;i<t;i++){
//            System.out.println("enter");
//            int x=sc.nextInt();
//        }

        int[] a1 = new int[6];
        int[] a2 = new int[3];

        a1[0] = -1;
        a1[1] = -3;
        a1[2] = -5;
        a1[3] = -15;
        a1[4] = -4;
        a1[5] = -2;


        a2[0] = 2;
        a2[1] = 4;
        a2[2] = 6;


        //merge(a1,a2,6,3);

//		for (int i=0;i<6;i++) {
//			System.out.println(a1[i]);
//		}

//		int ans=multiPly(a1);
//		System.out.println(validPalindrome("ebcbbececabbacecbbcbe"));
//		System.out.println(find("pwwkekwio"));

        //System.out.println(paranthese("(a(b(c)d)"));

        //System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

//		List<Integer> op = new ArrayList<>();
//
//		// Populate the list with some data for demonstration
//op.add(1);
//op.add(2);

//		int [ ] op={1,2,3};
        //subsets(op);

        //List<String> ans=new ArrayList<>();
//		helperString("abc",ans,"",0);
//
//		for (String s:ans
//			 ) {
//			System.out.println(s);
//		}


        String[] words1 = {"The", "day", "began", "as", "still", "as", "the", "night", "abruptly", "lighted", "with", "brilliant", "flame"};
        String[] words2 = {"Hello"};
        String[] words3 = {"Hello", "Hello"};
        String[] words4 = {"Well", "Hello", "world"};
        String[] words5 = {"Hello", "HelloWorld", "Hello", "Hello"};
        String[] words6 = {"a", "b", "c", "d"};

//		String[] ans = wrapLines(words1, 13);
//
//		for(int i=0;i<ans.length;i++){
//			System.out.println(ans[i]);
//		}


        //QUES: firstNegativeNumber
//        int[] op = {1, -2, 3, -5, 6, -8,6};
//        List<Integer> ans = firstNegativeNumber(op, 3);
//        for (int i = 0; i < ans.size(); i++) {
//            System.out.println(ans.get(i));
//        }

        int [] a={2,3,1};
        nextPermutation(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static int multiPly(int[] a1) {

        Arrays.sort(a1);
        int n = a1.length;
        int positive = a1[n - 3] * a1[n - 2] * a1[n - 1];
        int neg = a1[0] * a1[1] * a1[n - 1];
        return Math.max(positive, neg);
    }

    public static boolean validPalindrome(String s) {

        int i = 0, j = s.length() - 1;


        int k = 0;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else if (k == 0 && s.charAt(i + 1) == s.charAt(j)) {
                i += 2;
                j--;
                k++;
            } else if (k == 0 && s.charAt(i) == s.charAt(j - 1)) {
                i++;
                j -= 2;
                k++;
            } else {
                break;
            }
        }

        if (i == j || i > j)
            return true;

        return false;
    }

    public static void merge(int[] a1, int[] a2, int n1, int n2) {

        int j = n1 - n2 - 1;

        int k = n1 - 1;


        for (int i = n2 - 1; i >= 0; ) {


            if (a2[i] > a1[j]) {
                a1[k] = a2[i];
                i--;
            } else {
                a1[k] = a1[j];
                j--;
            }

            k--;

        }


    }


    static int find(String s) {

        int i = 0, j = 0, ans = 0, max = 0;
        //String[] st=new String[s.length()];
        List<String> ss = new ArrayList<>();
        while (j < s.length()) {

            if (!ss.contains(String.valueOf(s.charAt(j)))) {
                ss.add(String.valueOf(s.charAt(j)));
                j++;
                ans++;
            } else {
                while (ss.contains(String.valueOf(s.charAt(j)))) {
                    ss.remove(i);
                }
                max = Math.max(max, ans);
                ans = ss.size();
            }
        }

        return Math.max(max, ans);
    }


    static String paranthese(String s) {
        String newString = "";

        int i = 0, open = 0, close = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {

                newString += "(";
                open++;

            } else if (s.charAt(i) == ')') {
                if (open != 0) {
                    open--;
                    newString += ")";
                }
            } else {

                newString += s.charAt(i);
            }
            i++;
        }

        if (open != close) {
            newString = "";
        }


        return newString;


    }

    static String reverse(String s) {
        if (s.length() <= 0)
            return s;

//		System.out.print(s.charAt(s.length()-1));
        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));

    }

    public static boolean isPalindrome(String s) {
        String rs = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                rs += Character.toLowerCase(s.charAt(i));

        }
        String ee = reverse(rs);
        if (rs.equalsIgnoreCase(ee))
            return true;

        return false;
    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> op = new ArrayList<>();
        helper(nums, op, new ArrayList<>(), 0);

        op.stream()
                .forEach(innerList -> innerList.stream()
                        .forEach(value -> System.out.print(value + " ")));

        return op;
    }

    private static void helper(int[] nums, List<List<Integer>> ans, List<Integer> pp, int i) {

        if (nums.length == i) {
            ans.add(pp);
            return;
        }

        List<Integer> op1 = new ArrayList<>();
        op1.addAll(pp);
        List<Integer> op2 = new ArrayList<>();
        op2.addAll(pp);
        op2.add(nums[i]);

        //nums.remove(0);
        helper(nums, ans, op1, i + 1);


        helper(nums, ans, op2, i + 1);
    }

    private static void helperString(String nums, List<String> ans, String pp, int i) {

        if (nums.length() == i) {
            ans.add(pp);
            return;
        }

        String op1 = pp;
        String op2 = pp;
        op2 += (nums.charAt(i));


        helperString(nums, ans, op1, i + 1);


        helperString(nums, ans, op2, i + 1);
    }


    public static String[] wrapLines(String[] words1, Integer n) {

        String[] ans = new String[words1.length];

        int j = 0;
        if (words1[0].length() < n) {
            ans[0] = words1[0];

        }
        for (int i = 1; i < words1.length; i++) {

            if (words1[i].length() + ans[j].length() + 1 <= n) {
                ans[j] += "-" + words1[i];


            } else {
                j++;
                ans[j] = words1[i];
            }

        }

        return ans;


    }

    public static List<Integer> firstNegativeNumber(int[] nums, int k) {

        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;

        while (j < nums.length) {
            if (nums[j] < 0)
                q.add(nums[j]);
            if (j - i + 1 == k) {
                if (!q.isEmpty()) {
                    ans.add(q.peek());
                    if (q.peek() == nums[i]) {
                        q.remove();
                    }
                } else {
                    ans.add(0);
                }

                i++;
            }
            j++;
        }
        return ans;

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){

            int t=-nums[i];
            int a= nums[i];
            int s=i+1,e=nums.length-1;
            while(s<e){

                if(nums[s]+nums[e]==t){
                    List<Integer> ans1=new ArrayList();
                    ans1.add(a);
                    ans1.add(nums[s]);
                    ans1.add(nums[e]);

                    ans.add(ans1);
                }else if(nums[s]+nums[e]>t){
                    e--;
                }else {
                    s++;
                }

            }

        }
        return ans;

    }

    public static void nextPermutation(int[] nums) {


        if(nums.length-1==0){
            return;
        }
        int i=0,j=nums.length-1;

        while(j>0){

            if(nums[j]>nums[j-1]){
                if(j-1==0) {
                    swap(nums, nums.length - 1, j - 1);
                    if(nums[nums.length - 1]>nums[nums.length - 2])
                        swap(nums, nums.length - 1, nums.length - 2);
                }
                else
                    swap(nums,j,j-1);
                break;
            }else{
                j--;
            }

        }

        if(j==0){
            reverseArray(nums);
        }

// if(nums[2]>nums[1]){

// swap(nums,1,2);
// }else{
//     swap(nums,0,2);
// }

    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards each other
            start++;
            end--;
        }
    }

    private static void reverseN(int[] nums) {
    }

    static void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}


