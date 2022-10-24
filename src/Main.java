public class Main {
    public static void main(String[] args) {
        Person maksim = new Person(-1988, "","Минск", " бренд-менеджер");
        Person anya = new Person( 1993, "Аня", null, " методист образовательных программ");
        Person katya = new Person( 1992, "Катя", "Калининград", "");
        Person artem = new Person( 1995, "Артем", "Москва",  " директор по развитию бизнеса");

        System.out.println(maksim.toString());
        System.out.println(anya.toString());
        System.out.println(katya.toString());
        System.out.println(artem.toString());

    }

}