import java.text.DecimalFormat;
public class Ex18_Vehicle {
    private String name;
    private double value;
    private String type;
    private double CommercialValue;

public Ex18_Vehicle(String name,double value,String type){
    this.name = name;
    this.value = value;
    this.type = type;
    //calculate commercial value//
    //For vehicle with greater then 100,000 charge GST of 20% for other GST is 16%
    double valuePlusGST = this.value > 1000000 ? this.value * 1.2 : this.value*1.16;
    double finalValue;

if (this.type.equals("family")) {
    //with vehicles type 1with value upto 50,000.apply a discount equivalent to 50% of the GST charged
    finalValue = this.value <= 50000 ? this.value * 1.1 : valuePlusGST; //50% discount
}else {
    //for all those type2,type3 with the value higher then 80000 apply 5% additional GST
    finalValue = this.value >= 80000 ? valuePlusGST * 1.5 : valuePlusGST;
}

    //For all vehicles if the final value is less then 80,000 apply an additional cost of 5%

this.CommercialValue = finalValue >= 80000 ? valuePlusGST* 0.95 : finalValue;
}



    @Override
    public String toString(){
    DecimalFormat df = new DecimalFormat("#,###.00");
    return "Ex18_Vehicle{" +
            "name='" + name + '\''+
            ",value=" + value +
            ",type='" + type + '\''+
            ",commercialValue=" + df.format(CommercialValue) +
            '}';



}

}
