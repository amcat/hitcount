package nl.vu.amcat.hitcount;

import org.elasticsearch.index.IndexModule;
import org.elasticsearch.plugins.Plugin;

public class HitcountSimilarityPlugin extends Plugin{
    @Override
    public void onIndexModule(final IndexModule module) {
        module.addSimilarity("hitcountsimilarity", (name, settings) -> new HitcountSimilarityProvider(name, settings));
    }
}
