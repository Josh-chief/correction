package com.company;

public class commodity {

    public int buying_price;
    public int transport_cost;
    public int selling_price ;

    public commodity()
    {
       //
    }

    public int get_data(int buying_price)
    {
        return buying_price;
    }


    public int get_out(int profit)
    {
        return profit;
    }
    public int calculate (int profit )
    {

        profit=buying_price-selling_price-transport_cost;
        return profit;
    }


}
