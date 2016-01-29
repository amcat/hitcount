package nl.vu.amcat.hitcount;

import org.elasticsearch.index.similarity.SimilarityModule;
import org.elasticsearch.plugins.Plugin;

public class HitcountSimilarityPlugin extends Plugin{
    @Override
    public String name() {
        return "hitcount";
    }

    @Override
    public String description() {
        return "Hitcount Similarity Plugin";
    }

    public void onModule(final SimilarityModule module) {
        module.addSimilarity("hitcountsimilarity", HitcountSimilarityProvider.class);
    }
}
