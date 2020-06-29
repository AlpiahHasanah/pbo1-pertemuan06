public class main {
    public static void main(String[] args) {

        //panggil constructor
        toko Toko1 = new toko(20);
        toko Toko2 = new toko("Alpiah Hasanah");
        toko Toko3 = new toko("Alpiah Hasanah", "Jl. Sungai Tuan Ulu");
        System.out.println("=====================================================================================================================");

        toko Toko4 = new toko();
        Toko4.pemilik = "Alpiah Hasanah";
        Toko4.alamat = "Jl. Sungai Tuan Ulu";
        Toko4.pegawai = 20;
        Toko4.telpon = "0831514556720";
        Toko4.Email = "alpiahhasanah@gmail.com";

        //panggil method
        Toko4.pengenalan();
        Toko4.kipasAngin();
        Toko4.kulkas();
        Toko4.setrika();
        Toko4.telivisi();
        System.out.println("=====================================================================================================================");

        //method overloading
        Toko4.mesincuci("Alpiah Hasanah");
        Toko4.mesincuci(20);
        Toko4.mesincuci("0831514556720", "alpiahhasanah@gmail.com");
        System.out.println("=====================================================================================================================");

        //override
        elektronik Elektronik = new elektronik();
        Toko4.kulkas();
        Elektronik.kulkas();

        Toko4.mesincuci("Alpiah Hasanah");
        Elektronik.mesincuci("Alpiah Hasanah");
    }


}

