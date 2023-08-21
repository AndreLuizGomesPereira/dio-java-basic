public class AboutMe {
    public static void main(String[] args) {
        String name = args[0];
        String lastname = args[1];
        int year = Integer.valueOf(args[2]);
        double height = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + name + " " + lastname + ", " + "tenho " + year + );
    }
}
