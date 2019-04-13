package wwa.captainobvious.recommendations.domain.entities;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class Recommendation {

    public final Item item;
    public final List<RecommendedItem> recommendedItems;

    public Recommendation(final Item item, final List<RecommendedItem> recommendedItems) {
        this.item = item;
        this.recommendedItems = recommendedItems;
    }

    public void orderReccomendations() {
        recommendedItems.sort(Comparator.comparingDouble(RecommendedItem::accuracy));
        Collections.reverse(recommendedItems);
    }
}
