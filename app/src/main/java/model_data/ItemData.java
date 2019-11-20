package model_data;

import java.util.ArrayList;

public class ItemData {
    public static String[][] data = new String[][]{
            {"Bukit Kaba", "Bukit Kaba merupakan gunung berapi yang masih aktif dan masuk dalam kawasan Taman Wisata Alam tempat konservasi bunga raksasa Rafflesia Arnoldi. Dengan ketinggian 1,937 mdpl, para pendaki pemula bisa dengan mudah mencapai puncak bukit tanpa kendala yang berarti.", "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/07/060607071414/35574424_1958306617794450_1252862378517725184_n-1024x768.jpg", "Tempat Wisata"},
            {"Pantai Linau", "Pantai Linau terletak di sisi jalan lintas Kaur menuju Lampung yang berjarak sekitar 19 kilometer dari pusat kota Bintuhan kabupaten Kaur. Daya tarik wisata pantai Linau berupa teluk dengan pantai berpasir putih, pemandangan bawah laut serta airnya yang begitu asri jernih nan biru.", "https://awsimages.detik.net.id/customthumb/2011/03/01/1026/travel_6.jpg?w=600&q=90", "Tempat Wisata"},
            {"Pantai Panjang", "Pantai Panjang memang memiliki garis pantai yang panjang yaitu sekitar 7 kilometer. Pantai ini merupakan ikon tempat wisata di Bengkulu. Pasir pantainya yang putih dan deretan pohon cemara di area bibir pantai menjadi keunggulan tersendiri.", "https://wisatalengkap.com/wp-content/uploads/2017/02/14288197_545707545614877_5394061422890057728_n.jpg", "Tempat Wisata"},
            {"Batik Besurek", "Batik Besurek menjalani proses peradaban panjang di Provinsi Bengkulu. Besurek dalam bahasa Bengkulu adalah bersurat, kain yang ditulisi dengan huruf kaligrafi arab tanpa makna.", "https://asset.kompas.com/crop/0x0:800x533/750x500/data/photo/2017/11/10/479115416.jpg", "Budaya"},
            {"Dol", "Dol merupakan salah satu kekayaan musik etnik Indonesia itu, juga digunakan dalam upacara tabot setiap tahun. Tepatnya, pada tanggal 1 hingga 10 Muharram, untuk memperingati wafatnya Hasan dan Husein, cucu Nabi Muhammad.", "http://djofrontoneinnbengkulu.com/wp-content/uploads/2018/04/mengenal-lebih-dekat-dengan-dol-alat-musik-tradisional-bengkulu-artikel.jpg", "Budaya"},
            {"Tempoyak", "Tempoyak atau tempuyak adalah masakan yang berasal dari buah durian yang difermentasi. Tempoyak merupakan makanan yang biasanya dikonsumsi sebagai lauk saat menyantap nasi. Tempoyak juga dapat dimakan langsung, tetapi hal ini jarang sekali dilakukan karena banyak yang tidak tahan dengan keasaman dan aroma dari tempoyak itu sendiri. Selain itu, tempoyak dijadikan bumbu masakan.", "https://img-global.cpcdn.com/003_recipes/d88d73bd9e636262/751x532cq70/sambal-tempoyak-khas-bengkulu-foto-resep-utama.jpg", "Kuliner"},
            {"Pendap", "Pendap memang sangat spesial di hati masyarakat Bengkulu. Pendap Bengkulu terbuat dari bumbu-bumbu yang beraneka ragam seperti bawang putih, bawang merah, lengkuas, cabai giling, beserta bumbu dapur lainnya.", "https://phinemo.com/wp-content/uploads/2018/01/pendap-768x512.jpg", "Kuliner"},
            {"Tabot", "Tradisi Tabot dibawa oleh para pekerja Islam Syi’ah dari Madras dan Bengali, India bagian selatan, yang dibawa oleh tentara Inggris untuk membangun Benteng Marlborough (1713—1719).", "https://cdn.akurat.co/images/uploads/akurat_20170921090722_1v5886.jpg", "Budaya"},
            {"Raflesia Arnoldi", "Rafflesia arnoldi atau padma raksasa merupakan tumbuhan parasit obligat yang tumbuh pada batang liana (tumbuhan merambat) dari genus Tetrastigma.", "https://cdn0-production-images-kly.akamaized.net/ooCn9ePLLHBt0kMH6jrCM1qKQsI=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1574395/original/089152700_1492849515-rafflesia__1_.jpg", "Obyek Wisata"},
            {"Air Terjun Kepala Curup", "Dulunya, tenaga dari air terjun ini digunakan sebagai sumber pembangkit listrik tenaga air. Dengan ketinggian kurang lebih 100 meter, air terjun ini terlihat sangat megah dan anggun berdiri di antara tebing batu dan hijaunya hutan belantara.", "https://sgp1.digitaloceanspaces.com/tz-mag-id/wp-content/uploads/2018/07/060607073232/destinasi-wisata-bengkulu-6-1024x730.jpg", "Tempat Wisata"},
    };
    public static ArrayList<Item> getListData(){
        ArrayList<Item> list = new ArrayList<>();
        for (String[] aData : data) {
            Item item= new Item();
            item.setNama(aData[0]);
            item.setKeterangan(aData[1]);
            item.setPhoto(aData[2]);
            item.setKategori(aData[3]);
            list.add(item);
        }
        return list;
    }
}
