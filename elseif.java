public class elseif {
    public static void main(String[] args) {
        int age=12;
        if (age>=18) {
            System.out.println("He is an adult");
        }
        else if(age>13 &&age<18) {
            System.out.println("He is a teenager");
        }
        else {
            System.out.println("He is a child");
        }
    }
}
