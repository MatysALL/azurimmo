import bts.sio.azurimmo.model.Batiment
import bts.sio.azurimmo.model.Appartement
import retrofit2.http.GET

interface ApiService {
    @GET("/api/batiments/")
    suspend fun getBatiments(): List<Batiment>

    @GET("/api/appartements/")
    suspend fun getAppartements(): List<Appartement>
}