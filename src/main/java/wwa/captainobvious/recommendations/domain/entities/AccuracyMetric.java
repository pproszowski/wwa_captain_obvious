package wwa.captainobvious.recommendations.domain.entities;

public final class AccuracyMetric {

    private double priceWeight;
    private double alsoBoughtWeight;
    private double similarCategoryWeight;

    public AccuracyMetric(final double priceWeight, final double alsoBoughtWeight, final double similarCategoryWeight) {
        this.priceWeight = priceWeight;
        this.alsoBoughtWeight = alsoBoughtWeight;
        this.similarCategoryWeight = similarCategoryWeight;
    }

    double totalAccuracy(final double priceAccuracy, final double alsoBoughtAccuracy, final double similarCategoryAccuracy) {
        return priceAccuracy * priceWeight + alsoBoughtAccuracy * alsoBoughtWeight
               + similarCategoryAccuracy * similarCategoryWeight;
    }
}
