public class PrisonerTest {
    public static void main(String[] args) {
        Prisoner bubba = new Prisoner();
        bubba.name = "Bubba";
        bubba.height = 2.08;
        bubba.sentence = 4;
        bubba.InformasiTahanan();
        bubba.think();
        
        Prisoner twitch = new Prisoner();
        twitch.name = "Twitch";
        twitch.height = 1.73;
        twitch.sentence = 3;
        twitch.InformasiTahanan();
        twitch.think();
        System.out.println("===========================");

        System.out.println("Apakah Bubba == twitch? : "+ (bubba == twitch)); //false
        twitch.name = "Bubba";
        twitch.height = 2.08;
        twitch.sentence = 4;

        System.out.println("Setelah properti disamakan:");
        System.out.println("bubba.name=" + bubba.name + ", twitch.name=" + twitch.name);
        System.out.println("bubba.height=" + bubba.height + ", twitch.height=" + twitch.height);
        System.out.println("bubba.sentence=" + bubba.sentence + ", twitch.sentence=" + twitch.sentence);

         System.out.println("Apakah bubba == twitch sekarang? " + (bubba == twitch)); // tetap false
    }
    
}
