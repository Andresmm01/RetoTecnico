package com.Sanangel.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Data {

    private static ArrayList<Map<String, String>> data = new ArrayList<>();

    private static ArrayList<Map<String, String>> data2 = new ArrayList<>();

    public static ArrayList<Map<String, String>> extractData() {
        try {
            data = Excel.leerDatosDeHojaDeExcel("src/main/resources/Data/Sanangel.xlsx", "Productos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }

    public static ArrayList<Map<String, String>> extractData2() {
        try {
            data2 = Excel.leerDatosDeHojaDeExcel("src/main/resources/Data/Sanangel.xlsx", "Cantidad");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data2;
    }


}



