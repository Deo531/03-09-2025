public class Prisoner {
    String name;
    double height;
    int sentence;

    public void InformasiTahanan (){
        System.out.println("=====Informasi Tahanan=====");
        System.out.println("Nama: " + name);
        System.out.println("Tinggi Badan: " + height);
        System.out.println("Sanksi: " + sentence);
    }
    public void think(){
        System.out.println("I'll have my revenge");
    }
}
