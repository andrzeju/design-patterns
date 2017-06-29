package pl.urbanlab.patterns.creational.builder;

/**
 * Created by andrzej on 29.06.17.
 */
public class BuilderClient {
    public static void main(String[] args) {
        ArticleBuilder builder = new ShortArticleBuilder();
        builder.buildHeader("Some title");
        builder.buildContent("Some content");
        builder.buildFooter("Some footer");
        System.out.println(builder.build());
    }
}
