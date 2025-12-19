class itemsprices{
public static void main(String[] args) {
 int[] prices={120,80,150,60,200,90};
 int sum=0;
 System.out.println("item prices");
  for(int i=0; i<prices.length; i++){
  System.out.println(prices[i]);
  sum+=prices[i];
  }
  System.out.println("TOTAL PRICE:" +sum);
  }
}
