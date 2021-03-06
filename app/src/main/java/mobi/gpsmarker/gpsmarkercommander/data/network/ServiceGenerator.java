package mobi.gpsmarker.gpsmarkercommander.data.network;

import java.util.concurrent.TimeUnit;

import mobi.gpsmarker.gpsmarkercommander.data.network.interceptors.HeaderInterceptor;
import mobi.gpsmarker.gpsmarkercommander.utils.AppConfig;
import mobi.gpsmarker.gpsmarkercommander.utils.GPSMarkerCommanderApp;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static Retrofit.Builder sBuilder =
            new Retrofit.Builder()
                    .baseUrl(AppConfig.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass){

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        httpClient.addInterceptor(new HeaderInterceptor());
        httpClient.addInterceptor(logging);
 //       httpClient.connectTimeout(AppConfig.MAX_CONNECT_TIMEOUT, TimeUnit.MILLISECONDS);
 //       httpClient.readTimeout(AppConfig.MAX_READ_TIMEOUT, TimeUnit.MILLISECONDS);
 //       httpClient.cache (new Cache(GPSMarkerCommanderApp.getContext().getCacheDir(), Integer.MAX_VALUE));
 //       httpClient.addNetworkInterceptor(new StethoInterceptor());

        Retrofit retrofit = sBuilder
                .client(httpClient.build())
                .build();
        return retrofit.create(serviceClass);
    }
}