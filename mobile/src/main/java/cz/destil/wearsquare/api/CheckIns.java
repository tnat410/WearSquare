package cz.destil.wearsquare.api;

import retrofit.Callback;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * Processor for 4sq checkings/add API.
 *
 * @author David 'Destil' Vavra (david@vavra.me)
 */
public interface CheckIns {

    @POST("/checkins/add")
    void add(@Query("venueId") String venueId, @Query("ll") String ll, @Query("llAcc") int accuracy, @Query("alt") int altitude,
             Callback<CheckInResponse> callback);

    public static class CheckInResponse extends Api.FoursquareResponse {
    }
}