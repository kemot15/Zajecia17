package Zad1;

import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.Bidi;
import java.util.LinkedList;
import java.util.List;

public class ProductTest {
    public static final String PATH = "test.csv";
    public static final String PATH_SAVE = "test_result.csv";
    public static void main(String[] args) {
        try {
            List<Product> productList = setProductList();
            Results results = showInfo(productList);
            System.out.println(results);
            saveResults(results);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Product> setProductList() throws IOException {
        List<Product> productList = new LinkedList<>();
        FileReader fr = new FileReader(new File(PATH));
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while((line = br.readLine()) != null){
            String[] split = line.split(";");
            BigDecimal netto = new BigDecimal(split[1]);
            Product product = new Product(split[0], netto, Double.valueOf(split[2]));
            productList.add(product);
        }
        br.close();
        return productList;
    }

    private static Results showInfo (List<Product> products){
        BigDecimal sumNetto = new BigDecimal("0");
        BigDecimal sumValueNetto = new BigDecimal("0");
        for (Product product : products) {
            sumNetto = sumNetto.add(product.getNetto());
            sumValueNetto = sumValueNetto.add(product.getNetto().multiply(BigDecimal.valueOf(product.getVat()/100), new MathContext(2)));
        }
        BigDecimal sumBrutto = sumNetto.add(sumValueNetto);
        Results results = new Results(sumNetto, sumBrutto, sumValueNetto);
        return results;
    }

    private static void saveResults (Results results) throws IOException {
        FileWriter fw = new FileWriter(new File(PATH_SAVE));
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(results.toString());
        bw.close();

    }
}
//    Napisz program który będzie przechowywał w liście zestawienie sprzedaży z obiektami zawierającymi:
//    nazwę sprzedanego towaru/usługi, cenę netto, stawkę VAT (np. "telewizor LG", 3.2, 23) i wypisuje:
//
//        Sumę sprzedaży netto.
//        Sumę podatku VAT.
//        Sumę sprzedaży brutto.
//        Do obliczeń i przechowywania kwot wykorzystaj klasę BigDecimal.