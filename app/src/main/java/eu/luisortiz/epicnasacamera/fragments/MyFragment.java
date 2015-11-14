package eu.luisortiz.epicnasacamera.fragments;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mlortiz on 20/10/2015.
 */
public abstract class MyFragment extends Fragment {

    public static final String LAYOUT_PARAM = "layoutParam";

    protected int resourceLayout;
    //private boolean showAds = true;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle args = getArguments();
        resourceLayout = args.getInt(LAYOUT_PARAM, 0);
        return inflater.inflate(resourceLayout, container, false);
    }


    /**
     * Inicializamos los textos e imágenes personalizados de cada clase
     * @param view
     * @param bundle
     */
    public void onViewCreated(View view, Bundle bundle){
        super.onViewCreated(view, bundle);
        initialize();
        //initializeAds();
    }

    /**private void initializeAds(){
        //Creando el banner
        mAdView = (AdView) getView().findViewById(R.id.adView);
        if (showAds) {
            // Creando interstitial.
            interstitial = new InterstitialAd(this.getView().getContext());
            interstitial.setAdUnitId(getString(R.string.interstitial));
            AdRequest adRequestInterstitial = new AdRequest.Builder().build();
            interstitial.loadAd(adRequestInterstitial);

            //creando el banner
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);
        } else {
            //es premium y no se muestra la publicidad
            mAdView.setVisibility(AdView.GONE);
        }

    }

    public void displayInterstitial() {
        //Mostramos  interstitial en el 50% de las ocasiones
        //TODO decidir cuándo mostrar la publicidad interstitial.
        //TODO controlar cuando es premium o no en la variable showAds
        Random r = new Random();
        int num = r.nextInt(2);

        if ((num == 1) && (interstitial != null) && (interstitial.isLoaded())) {
            interstitial.show();
        }
    }**/

    abstract protected void initialize();

}