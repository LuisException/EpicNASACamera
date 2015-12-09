package eu.luisortiz.epicnasacamera.downloader;

import android.os.AsyncTask;
import android.util.Log;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.net.URL;

import eu.luisortiz.epicnasacamera.R;

/**
 * Created by luis on 15/11/15.
 */
public class EpicImageDownloader extends AsyncTask<String, String, String> {

    public AsyncResponse delegate = null;

    @Override
    protected String doInBackground(String... urls) {
        String html = null;
        try {
            Log.d("JSON URL",urls[0]);
            Document doc = Jsoup.connect(urls[0])
                    .ignoreContentType(true)
                    .timeout(10000)
                    .get();
            Log.d("JSON CONTENT:",doc.text());
            html = doc.text();

        } catch (Exception e) {
            Log.e("ERROR DOWNLOADING JSON", e.getMessage());
        }
        return html;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        delegate.processDownloadEpicImage(result);
    }
}
