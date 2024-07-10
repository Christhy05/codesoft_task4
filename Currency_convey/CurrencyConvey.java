import java .util.Scanner;
class CurrencyConvey{
    Scanner sc =  new Scanner(System.in);
    public void Euro(){
        final double euro = 324.01;
        double rupee;
        System.out.print("Euro Rupee : ");
        rupee=sc.nextDouble();
        System.out.println("Srilankan rupee : "+rupee*euro);
    }
    public void USD(){
        final double usd = 300.02;
        double rupee;
        System.out.print("USD Rupee : ");
        rupee=sc.nextDouble();
        System.out.println("Srilankan rupee : "+rupee*usd);

    }
    public void IR(){
        final double ir = 3.60;
        double rupee;
        System.out.print("Indian Rupee : ");
        rupee=sc.nextDouble();
        System.out.println("Srilankan rupee : "+rupee*ir);


    }
    public void JY(){
        final double jy = 1.98;
        double rupee;
        System.out.print("Japanese Yen : ");
        rupee=sc.nextDouble();
        System.out.println("Srilankan rupee : "+rupee*jy);


    }
    void menu(){
        System.out.println("Welcome");
        System.out.println(" 1 - Indian to LKR");
        System.out.println(" 2 - japanes to LKR");
        System.out.println(" 3 - Euro to LKR");
        System.out.println(" 4 - USD to LKR\n");
        System.out.print(" Enter you choice : ");
    }
}
    class Main{
        public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

            CurrencyConvey cc = new CurrencyConvey();
            int choice;
            char wish ;
            do{
                cc.menu();
                choice=sc.nextInt();
                
                switch (choice) {
                    case 1:
                        cc.IR();
                        break;
                    case 2:
                        cc.JY();
                        break;
                    case 3:
                        cc.Euro();
                        break;
                    case 4:
                        cc.USD();
                        break;
                    default:
                    System.out.println("Invalid Input");
                        break;
                }
                System.out.println("Do you want tHis Service Again : ");
                choice=sc.next().charAt(0);
            }
            while(choice=='y'||choice=='Y');
            System.out.println("Thanks For using our services");

        }
    }

