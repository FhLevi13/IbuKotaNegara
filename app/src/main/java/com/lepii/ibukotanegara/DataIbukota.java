package com.lepii.ibukotanegara;

import java.util.ArrayList;

public class DataIbukota {
    public static String[][] data = new String[][] {
            {"Jakarta"},
            {"Kuala Lumpur"},
            {"Bangkok"},
            {"Manila"},
            {"Singapura"},
            {"Bandar Seri Begawan"},
            {"Hanoi"},
            {"Vientiane"},
            {"Rangoon (Yangon)"},
            {"Phnom Penh"}
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
