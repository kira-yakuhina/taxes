public class Taxes {
    public static void main(String[] args){
        System.out.println("Налоги бывают трёх видов: ");
        for (TypeTaxes value: TypeTaxes.values()){
            System.out.println(descriptionOfTypeTax(value));
        }
    }
    public static String descriptionOfTypeTax (TypeTaxes taxType){
        if(TypeTaxes.FEDERAL == taxType){
            return "Федеральные налоговы сборы";
        }
        if(TypeTaxes.REGIONAL == taxType){
            return "Региональные налоговые сборы";
        }
        if(TypeTaxes.LOCAL == taxType){
            return "Местные налоговые сборы";
        }
        return "Такого вида налогов нет";
    }
}
