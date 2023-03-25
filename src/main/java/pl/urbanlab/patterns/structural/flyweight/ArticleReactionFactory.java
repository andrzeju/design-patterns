package pl.urbanlab.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andrzej on 18.06.17.
 */
public class ArticleReactionFactory {

        private static Map<String, ArticleReaction> reactions = new HashMap<String, ArticleReaction>();

        public static ArticleReaction getReaction(String reaction) {
            return reactions.computeIfAbsent(reaction, newReaction -> new ArticleReaction(reaction));
        }

        public static int getObjectsCount() {
            return reactions.size();
        }
}
