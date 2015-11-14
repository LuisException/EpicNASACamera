package eu.luisortiz.epicnasacamera.fragments;

import com.google.gson.Gson;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

import eu.luisortiz.epicnasacamera.entity.EpicImage;

/**
 * Created by mlortiz on 20/10/2015.
 */
public class HomeFragment extends MyFragment{


    @Override
    protected void initialize() {

        //TODO meter esto en un downloader
        String url = "http://epic.gsfc.nasa.gov/api/images.php?date=2015-10-18";

        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String result = doc.text();

        Gson gson = new Gson();
        EpicImage epicImageJson = gson.fromJson(result, EpicImage.class);

    }


}
