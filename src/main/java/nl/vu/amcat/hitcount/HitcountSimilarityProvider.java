package nl.vu.amcat.hitcount;

import org.apache.lucene.search.similarities.Similarity;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.similarity.AbstractSimilarityProvider;

public class HitcountSimilarityProvider extends AbstractSimilarityProvider {
    private final HitcountSimilarity similarity;

    @Inject
    public HitcountSimilarityProvider(@Assisted String name, @Assisted Settings settings) {
        super(name);
        this.similarity = new HitcountSimilarity();
    }

    protected HitcountSimilarityProvider(String name) {
        super(name);
        this.similarity = new HitcountSimilarity();
    }

    @Override
    public Similarity get() {
        return this.similarity;
    }
}
