public class elektronik extends toko {
    public void kulkas(){
        String objek = "kulkas juga ada dengan berbagai merk dan tipe...(Override)";
        System.out.println(objek);
    }

    @Override
    void mesincuci(String pemilik) {
        super.mesincuci(pemilik);
    }
}
