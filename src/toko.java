public class toko {

    //atribute
    String pemilik;
    String alamat;
    int pegawai;
    String telpon ;
    String Email;

    //constructor
    toko (int pegawai){
        System.out.println("mengutamakan kenyamanan pelanggan dengan jumlah pegawai " + pegawai + "orang");
    }
    toko(String pemilik){
        System.out.println("Atas Nama " + pemilik + "sebagai pemilik Toko mengucapkan selamat berbelanja");
    }
    toko(String pemilik, String alamat){
        System.out.println("Atas Nama " + pemilik + "sebagai pemilik Toko mengucapkan selamat berbelanja");
        System.out.println("Jika Anda berminat Langsung datang ke toko kami " + alamat);
    }
    toko(){
    }

    //method
    void pengenalan (){
        System.out.println("pemilik "+ pemilik);
        System.out.println("alamat "+ alamat);
        System.out.println("jumlah pegawai : " + pegawai + "orang");
        System.out.println("kalian bisa hubungi ke" + telpon + " atau " + Email);
        System.out.println(" ");
    }
    void kipasAngin(){
        System.out.println("Ditoko kami menjual kipas angin dengan berbagai macam merk");
    }
    void kulkas(){
        System.out.println("Kulkas juga ada berbagai macam merk dan tipe...");
    }
    void telivisi(){
        System.out.println("disini kami cuman menjual telivisi bentuk led aja seperti sony, samsung, sharp, dll...");
    }
    void setrika(){
        System.out.println("Kami juga menjual Setrika jikka kalian berminat langsung saja hubungi " + telpon + "Atas nama " +pemilik);
    }

    //method overloading
    void mesincuci(String pemilik){
        System.out.println("Ini toko milik" + pemilik + "menjual mesin cuci dengan berbagai merek");
    }
    void mesincuci(int pegawai){
        System.out.println("Dengan jumlah pegawai " + pegawai + " orang ");
    }
    void mesincuci(String telpon, String email){
        System.out.println("Langsung saja hubungi " + telpon + "Atau melalui " + email);
    }
}

