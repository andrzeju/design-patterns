package pl.urbanlab.patterns.structural.composite;

/**
 * Created by andrzej on 08.07.17.
 */
public class CompositeClient {
    public static void main(String[] args) {

        File index = new File("index.html");
        File scripts = new File("app.js");
        File styles = new File("styles.less");
        File stylesCompiled = new File("styles.css");
        Directory resources = new Directory("resources");
        Directory css = new Directory("css");
        Directory js = new Directory("js");
        Directory main = new Directory("main");

        main.add(index);
        main.add(resources);
        resources.add(css);
        resources.add(js);
        css.add(styles);
        css.add(stylesCompiled);
        js.add(scripts);

        main.showContent();

    }
}
