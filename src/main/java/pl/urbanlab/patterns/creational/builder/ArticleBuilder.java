package pl.urbanlab.patterns.creational.builder;

/**
 * Created by andrzej on 29.06.17.
 */
public interface ArticleBuilder {
    void buildHeader(String header);
    void buildContent(String content);
    void buildFooter(String footer);
    String build();
}
