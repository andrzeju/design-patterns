package pl.urbanlab.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andrzej on 18.06.17.
 */
public class ArticleReactionFactory {

        private static Map<String, ArticleReaction> reactions = new HashMap<String, ArticleReaction>();

        public static ArticleReaction getReaction(String reaction) {
            ArticleReaction result = reactions.get(reaction);
            if (result == null) {
                result = new ArticleReaction(reaction);
                reactions.put(reaction, result);
            }
            return result;
        }

        public static int getObjectsCount() {
            return reactions.size();
        }
}
