package pl.urbanlab.patterns.structural.flyweight;

/**
 * Created by andrzej on 18.06.17.
 */
public class FlyweightClient {

    public static void main(String[] args) {

        ArticleRepository articleRepository = new ArticleRepository();

        articleRepository.addReaction(1, ArticleReactionFactory.getReaction("like"));
        articleRepository.addReaction(2, ArticleReactionFactory.getReaction("like"));
        articleRepository.addReaction(3, ArticleReactionFactory.getReaction("like"));
        articleRepository.addReaction(4, ArticleReactionFactory.getReaction("like"));
        articleRepository.addReaction(5, ArticleReactionFactory.getReaction("dislike"));
        articleRepository.addReaction(6, ArticleReactionFactory.getReaction("like"));
        articleRepository.addReaction(7, ArticleReactionFactory.getReaction("dislike"));
        articleRepository.addReaction(8, ArticleReactionFactory.getReaction("dislike"));
        articleRepository.addReaction(9, ArticleReactionFactory.getReaction("like"));
        articleRepository.addReaction(10, ArticleReactionFactory.getReaction("like"));

        System.out.println("Created objects: " + ArticleReactionFactory.getObjectsCount());


    }


}
