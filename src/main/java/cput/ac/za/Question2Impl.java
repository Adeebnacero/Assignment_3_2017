package cput.ac.za;

/**
 * Created by Adeebo on 2017/03/25.
 */
public class Question2Impl implements Question2Interface {

    @Override
    public String description(String make, String model){

        return make + " " + model;
    }

    @Override
    public double value (double price, double tax){

        double percent;
        percent = (tax/100) * price ;

        return price + percent;
    }
}
