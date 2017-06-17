package pl.urbanlab.patterns.structural.adapter;

/**
 * Created by andrzej on 17.06.17.
 */
public class AdapterClient {

    public static void main(String ... args) {
        DaewooMatiz matiz = new DaewooMatiz();
        NissanSkyline skyline = new NissanSkyline();
        RaceCarAdapter adaptedMatiz = new RaceCarAdapter(matiz);

        adaptedMatiz.race();
        adaptedMatiz.drift();

        skyline.race();
        skyline.drift();
    }
}
