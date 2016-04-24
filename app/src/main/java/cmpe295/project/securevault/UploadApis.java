package cmpe295.project.securevault;



import okhttp3.RequestBody;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by Robin on 4/21/2016.
 */
public interface UploadApis  {

    @Multipart
    @POST("/uploadapk")
    Call<Response> uploadApk(@Part("desription") String description, @Part("apk")RequestBody apk);

    /*@GET
    Call<Response> testapi(/test)*/
}
