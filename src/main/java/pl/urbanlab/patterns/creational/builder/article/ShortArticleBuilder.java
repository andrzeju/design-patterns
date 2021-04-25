package pl.urbanlab.patterns.creational.builder.article;

/**
 * Created by andrzej on 29.06.17.
 */
public class ShortArticleBuilder implements ArticleBuilder {

    private String article = "";

    @Override
    public void buildHeader(String header) {
        article += header;
    }

    @Override
    public void buildContent(String content) {
        article+= content;
    }

    @Override
    public void buildFooter(String footer) {
        article+= footer;
    }

    @Override
    public String build() {
        return article;
    }
}
