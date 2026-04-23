public class DataTypeDemo {
    public static void main(String[] args) {
        int age = 26;
        double price = 499.99;
        char grade = 'A';
        boolean active = true;
        String name = "Sami";

        System.out.println(name + " is " + age + " years old.");
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Active: " + active);
    }
}

// type castinng 
public class DataTypeDemo {
    public static void main(String[] args) {
        int x = 10;
        double y = x;
        double price = 99.8;
        int p = (int) price;
        System.out.println(y);
        System.out.println(p);
    }
}
//input output 
public class DataTypeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name ");
        String name = sc.nextLine();
        System.out.print("enter your age ");
        int age = sc.nextInt();
        System.out.println("welcome" + name);
        System.out.println("your age " + age);
        sc.close();
    }
}
