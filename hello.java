import java.util.*;

// class Fish {
//     int size;
//     int eatingFactor;

//     public Fish(int size, int eatingFactor) {
//         this.size = size;
//         this.eatingFactor = eatingFactor;
//     }
// }

// public class hello{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Fish[] fishArray = new Fish[n];

//         for (int i = 0; i < n; i++) {
//             int size = sc.nextInt();
//             int eatingFactor = sc.nextInt();
//             fishArray[i] = new Fish(size, eatingFactor);
//         }

//         int count = 0;
//         Stack<Fish> stack = new Stack<>();
//         for (int i = 0; i < n; i++) {
//             while (!stack.empty() && stack.peek().eatingFactor < fishArray[i].size) {
//                 stack.pop();
//             }
//             if (stack.empty() || stack.peek().eatingFactor > fishArray[i].eatingFactor) {
//                 stack.push(fishArray[i]);
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }


public class hello {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    List<Integer> femaleTalents = new ArrayList<>();
    List<Integer> maleTalents = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int gender = sc.nextInt();
      int talent = sc.nextInt();
      if (gender == 0) {
        femaleTalents.add(talent);
      } else {
        maleTalents.add(talent);
      }
    }

    Collections.sort(femaleTalents, Collections.reverseOrder());
    Collections.sort(maleTalents, Collections.reverseOrder());

    for (int talent : femaleTalents) {
      System.out.println("0 " + talent);
    }
    for (int talent : maleTalents) {
      System.out.println("1 " + talent);
    }
  }
}



