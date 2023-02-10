public class FactorialOfaLargerNumber {
    static ArrayList<Integer> factorial(int N){
        //code here
    ArrayList<Integer> result = new ArrayList<>();
    result.add(1);

    for (int i = 1; i <= N; i++) {
      int carry = 0;
      for (int j = result.size()-1; j >=0; j--) {
        int product = result.get(j) * i + carry;
        result.set(j, product % 10);
        carry = product / 10;
      }

      while (carry > 0) {
        result.add(0,carry % 10);
        carry /= 10;
      }
    }

    return result;
  }
}
