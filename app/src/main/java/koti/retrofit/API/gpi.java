package koti.retrofit.API;

import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import koti.retrofit.Inter.Album;

/**
 * Created by User on 10/8/2016.
 */



public interface gpi {
    @GET("/photos/{album}")      //here is the other url part.best way is to start using /
    public void getFeed(@Path("album") String album, Callback<Album> response);
    //response is the response from the server which is now in the POJO
}
