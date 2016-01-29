package nl.vu.amcat.hitcount;

import org.apache.lucene.index.FieldInvertState;
import org.apache.lucene.index.LeafReaderContext;
import org.apache.lucene.search.CollectionStatistics;
import org.apache.lucene.search.TermStatistics;
import org.apache.lucene.search.similarities.Similarity;
import org.apache.lucene.util.BytesRef;

import java.io.IOException;

public class HitcountSimilarity extends Similarity {
    @Override
    public long computeNorm(FieldInvertState fieldInvertState) {
        return 1;
    }

    @Override
    public SimWeight computeWeight(float v, CollectionStatistics collectionStatistics, TermStatistics... termStatisticses) {
        return new Similarity.SimWeight(){
            public float getValueForNormalization(){
                return 1.0f;
            }

            public void normalize(float queryNorm, float topLevelBoost){

            }
        };
    }

    @Override
    public SimScorer simScorer(SimWeight simWeight, LeafReaderContext leafReaderContext) throws IOException {
        return new Similarity.SimScorer() {
            public float score(int doc, float freq){
                return freq;
            }

            public float computeSlopFactor(int distance){
                return 1.0f;
            }

            public float computePayloadFactor(int doc, int start, int end, BytesRef payload) {
                return 99999f;
            }
        };
    }
}
