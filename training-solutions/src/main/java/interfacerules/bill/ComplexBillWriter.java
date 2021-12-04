package interfacerules.bill;

import java.util.List;

import static java.lang.Integer.parseInt;

public class ComplexBillWriter implements BillWriter{
    @Override
    public String writeBill(List<String> billItems) {


        StringBuilder sb = new StringBuilder();
        for (String actual : billItems) {
            String temp[] = actual.split(";");
            int sum = parseInt(temp[1]) * parseInt(temp[2]);

            sb.append(temp[0]).append("; darabszám: ").append(temp[2]).append(", egységár: ").append(temp[1]).append(", összesen: ").append(sum).append(" Ft\n");
        }
        return sb.toString();
    }
}
