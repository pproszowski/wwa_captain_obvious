package wwa.captainobvious.recommendations.domain.entities;

public final class RecommendedItem {

    public final Item item;
    private final double priceAccuracy;
    private final double alsoBoughtAccuracy;
    private final double similarCategoryAccuracy;
    public final AccuracyMetric accuracyMetric;

    public RecommendedItem(final Item item,
                           final double priceAccuracy,
                           final double alsoBoughtAccuracy,
                           final double similarCategoryAccuracy,
                           final AccuracyMetric accuracyMetric) {
        this.item = item;
        this.priceAccuracy = priceAccuracy;
        this.alsoBoughtAccuracy = alsoBoughtAccuracy;
        this.similarCategoryAccuracy = similarCategoryAccuracy;
        this.accuracyMetric = accuracyMetric;
    }

    double accuracy() {
        return accuracyMetric.totalAccuracy(priceAccuracy, alsoBoughtAccuracy, similarCategoryAccuracy);
    }
}
