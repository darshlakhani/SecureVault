package cmpe295.project.securevault;



import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * Created by Robin on 4/21/2016.
 */
public interface UploadApis  {

    @Multipart
    @POST("/uploadApk")
    Call<ResponseBody> uploadApk(@Part MultipartBody.Part upload, @Part("preference") String preference);


    @GET("/v2/571d6016110000f53229107a")
    Call<ResponseBody> checkApi(@Query("test") String st);

}
