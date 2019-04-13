package wwa.captainobvious.recommendations.persistence.repos;

import wwa.captainobvious.recommendations.web.dtos.ItemDto;

public class Evaluator {

    private static final double HIGH_PRIORITY_PRICE_WEIGHT = 0.6;
    private static final double LOW_PRIORITY_PRICE_WEIGHT = 0.2;

    private Evaluator() {
    }

    public static double evaluate(double cartValue, ItemDto product) {

        double priceParam;
        double priceWeight;

        priceParam = (cartValue < product.price) ? cartValue / product.price : product.price / cartValue;
        priceWeight = (cartValue < 40) ? HIGH_PRIORITY_PRICE_WEIGHT : LOW_PRIORITY_PRICE_WEIGHT;

        double similarityWeight = (1 - priceWeight) / 2;
        double otherBoughtWeight = (1 - priceWeight) / 2;

        return priceWeight * priceParam + similarityWeight + otherBoughtWeight;
    }
}
