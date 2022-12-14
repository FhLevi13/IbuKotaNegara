package com.lepii.ibukotanegara;

import java.util.ArrayList;

public class DataIbukota {
    public static String[][] data = new String[][] {
            {"Jakarta","Jakarta - Ibu Kota Negara Indoneisa\n" +
                    "Luas Wilayah : 1.904.569 km2\n" +
                    "Jumlah Penduduk : 277.329.163 jiwa (estimasi Juli 2022)\n" +
                    "Daerah Khusus Ibukota Jakarta (DKI Jakarta) adalah ibu kota negara dan kota terbesar di Indonesia. Jakarta merupakan satu-satunya kota di Indonesia yang memiliki status setingkat provinsi. Jakarta terletak di pesisir bagian barat laut Pulau Jawa. Dahulu pernah dikenal dengan beberapa nama di antaranya Sunda Kelapa, Jayakarta, dan Batavia. Di dunia internasional Jakarta juga mempunyai julukan J-Town, atau lebih populer lagi The Big Durian karena dianggap kota yang sebanding New York City (Big Apple) di Indonesia." +
                    "Jakarta memiliki luas sekitar 661,52 km² (lautan: 6.977,5 km²), dengan penduduk berjumlah 10.187.595 jiwa (2011). Wilayah metropolitan Jakarta (Jabodetabek) yang berpenduduk sekitar 28 juta jiwa, merupakan metropolitan terbesar di Asia Tenggara atau urutan kedua di dunia.\n","Foto"},
            {"Kuala Lumpur","Kuala Lumpur - Ibu Kota Malaysia\n" +
                    "Luas Wilayah : 329.847 km2\n" +
                    "Jumlah Penduduk : 33.871.431 jiwa (estimasi Juli 2022)\n" +
                    "Kuala Lumpur (sering disingkat KL), atau nama lengkapnya Wilayah Persekutuan Kuala Lumpur, adalah ibu kota dan kota terbesar di Malaysia. Kawasan Wilayah Persekutuan mencakup wilayah seluas 244 km2 (94 mil²), dengan penduduk sekitar 1,6 juta jiwa (2010).[2] Wilayah metropolitan Kuala Lumpur atau yang juga dikenal sebagai Lembah Klang.Kuala Lumpur adalah wilayah metropolitan dengan pertumbuhan sangat pesat di Malaysia, baik dalam jumlah penduduk maupun ekonomi.","Foto"},
            {"Bangkok","Bangkok - Ibu Kota Thailand\n" +
                    "Luas Wilayah : 513.120 km2\n" +
                    "Jumlah Penduduk : 69.648.117 jiwa (estimasi Juli 2022)\n" +
                    "Bangkok adalah salah satu kota dengan perkembangan terpesat, dengan ekonomi yang dinamis dan kemasyarakatan yang progresif di Asia Tenggara. Kota ini sedang berkembang menjadi pusat regional yang dapat menyaingi Singapura dan Hong Kong, namun masih mempunyai masalah dalam sektor infrastruktur dan sosial sebagai akibat perkembangannya yang pesat. Bangkok telah lama menjadi pintu masuk bagi penanam modal asing yang ingin mencari pasar baru di Asia. Kota ini juga mencatat sebagai salah satu kota di dunia dengan laju penambahan konstruksi gedung pencakar langit tercepat. Kaya akan situs-situs budaya membuat Bangkok sebagai salah satu tujuan wisata terpopuler di dunia.di Malaysia. Kawasan Wilayah Persekutuan mencakup wilayah seluas 244 km2 (94 mil²), dengan penduduk sekitar 1,6 juta jiwa (2010).[2] Wilayah metropolitan Kuala Lumpur atau yang juga dikenal sebagai Lembah Klang.Kuala Lumpur adalah wilayah metropolitan dengan pertumbuhan sangat pesat di Malaysia, baik dalam jumlah penduduk maupun ekonomi.","Foto"},
            {"Manila","Manila - Ibu Kota Filipina\n" +
                    "Luas Wilayah : 300.000 km2\n" +
                    "Jumlah Penduduk : 114.597.229 jiwa (estimasi Juli 2022)\n" +
                    "Manila (Maynila dalam bahasa Filipino) adalah ibu kota dari Filipina. Kota ini terletak di tepi timur Teluk Manila di pulau terbesar dan terutara Filipina, Luzon. Meskipun ada beberapa tempat kemiskinan, kota ini merupakan salah satu kota kosmopolitan dunia dan daerah metropolitannya merupakan pusat ekonomi, budaya, pendidikan dan industri negara ini. Manila sering disebut Mutiara Orient.Kota ini merupakan kota terpadat kedua di Filipina setelah kota Quezon, bekas ibu kota Filipina.Manila dan daerah sekitarnya dijadikan satu kesatuan sebagai Metro Manila untuk mempermudah pengaturan daerah pertumbuhan super cepat ini. Sekarang ini, kota dan metropolisnya berjaya sebagai pusat budaya dan ekonomi. Tetapi kota ini juga mempunyai masalah over-populasi, kemacetan, polusi.\n" +
                    "\n","Foto"},
            {"Singapura","Tentang","Foto"},
            {"Bandar Seri Begawan","Tentang","Foto"},
            {"Hanoi","Tentang","Foto"},
            {"Vientiane","Tentang","Foto"},
            {"Rangoon (Yangon)","Tentang","Foto"},
            {"Phnom Penh","Tentang","Foto"}
    };
    public static ArrayList<ModelIbukota> ambilDataIbukota() {
        ArrayList<ModelIbukota> dataPahlawan = new ArrayList<>();
        for (String[] varData : data) {
            ModelIbukota model = new ModelIbukota();
            model.setNama(varData[0]);
            model.setTentang(varData[1]);
            model.setFoto(varData[2]);
            dataPahlawan.add(model);
        }
        return dataPahlawan;
    }
}
