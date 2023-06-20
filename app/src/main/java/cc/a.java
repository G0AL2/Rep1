package cc;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import vb.f;

/* compiled from: HttpGetRequest.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f5466a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f5467b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f5468c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.f5466a = str;
        this.f5467b = map;
    }

    private String a(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry<String, String> next = it.next();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(next.getKey());
        sb3.append("=");
        sb3.append(next.getValue() != null ? next.getValue() : "");
        sb2.append(sb3.toString());
        while (it.hasNext()) {
            Map.Entry<String, String> next2 = it.next();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("&");
            sb4.append(next2.getKey());
            sb4.append("=");
            sb4.append(next2.getValue() != null ? next2.getValue() : "");
            sb2.append(sb4.toString());
        }
        return sb2.toString();
    }

    private String b(String str, Map<String, String> map) {
        String a10 = a(map);
        if (a10.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                a10 = "&" + a10;
            }
            return str + a10;
        }
        return str + "?" + a10;
    }

    private String e(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        char[] cArr = new char[Constants.BUFFER_SIZE];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb2.append(cArr, 0, read);
            } else {
                return sb2.toString();
            }
        }
    }

    public c c() throws IOException {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String e10 = null;
        inputStream = null;
        try {
            String b10 = b(this.f5466a, this.f5467b);
            f.f().i("GET Request URL: " + b10);
            httpsURLConnection = (HttpsURLConnection) new URL(b10).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f5468c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        e10 = e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, e10);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public a d(String str, String str2) {
        this.f5468c.put(str, str2);
        return this;
    }
}
