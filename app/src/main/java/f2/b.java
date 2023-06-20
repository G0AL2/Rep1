package f2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: DefaultLottieNetworkFetcher.java */
/* loaded from: classes.dex */
public class b implements f {
    @Override // f2.f
    public d a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}
