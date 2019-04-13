package wwa.captainobvious.recommendations.persistence.repos;

import wwa.captainobvious.recommendations.common.dtos.ItemDto;

public class Evaluator {

    public double evaluate(double cartValue, ItemDto product){

        double highPriorityPriceWeight = 0.6;
        double lowPriorityPriceWeight = 0.2;
        double priceParam;
        double priceWeight;

        priceParam = (cartValue < product.price) ? cartValue / product.price : product.price /cartValue;
        priceWeight = (cartValue < 40) ?  highPriorityPriceWeight :  lowPriorityPriceWeight;


        double similarityWeight = (1 - priceWeight) / 2;
        double otherBoughtWeight = (1 - priceWeight) / 2;

        return priceWeight*priceParam + similarityWeight + otherBoughtWeight;
    }
}
