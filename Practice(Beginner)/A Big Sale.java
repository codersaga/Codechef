import java.util.Scanner;

 class sale {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int q=0;q<t;q++){
            int n=sc.nextInt();
            double []price = new double[n];
            double []quantity= new double[n];
            double []discount= new double[n];
            for(int i=0;i<n;i++){
                price[i]=sc.nextDouble();
                quantity[i]=sc.nextDouble();
                discount[i]=sc.nextDouble();
            }
            double p=0,loss=0;
            double last=0;
            for(int i=0;i<n;i++){
                p=price[i]+((discount[i]/100)*price[i]);
                last=p-((discount[i]/100)*p);
                loss=loss+((price[i]-last)*quantity[i]);
            }
            System.out.println(loss);
        }
    }
}
