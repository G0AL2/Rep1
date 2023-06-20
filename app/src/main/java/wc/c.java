package wc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.d;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import qc.j;
import wc.d;
import wc.f;

/* compiled from: FirebaseInstallationServiceClient.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f38558d = Pattern.compile("[0-9]+s");

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f38559e = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final Context f38560a;

    /* renamed from: b  reason: collision with root package name */
    private final sc.b<j> f38561b;

    /* renamed from: c  reason: collision with root package name */
    private final e f38562c = new e();

    public c(Context context, sc.b<j> bVar) {
        this.f38560a = context;
        this.f38561b = bVar;
    }

    private static String a(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    private static JSONObject b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private String f() {
        try {
            Context context = this.f38560a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f38560a.getPackageName());
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ContentValues", "No such package: " + this.f38560a.getPackageName(), e10);
            return null;
        }
    }

    private URL g(String str) throws com.google.firebase.installations.d {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new com.google.firebase.installations.d(e10.getMessage(), d.a.UNAVAILABLE);
        }
    }

    private static byte[] h(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean i(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    private static void j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void k(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String o10 = o(httpURLConnection);
        if (TextUtils.isEmpty(o10)) {
            return;
        }
        Log.w("Firebase-Installations", o10);
        Log.w("Firebase-Installations", a(str, str2, str3));
    }

    private HttpURLConnection l(URL url, String str) throws com.google.firebase.installations.d {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f38560a.getPackageName());
            j jVar = this.f38561b.get();
            if (jVar != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(jVar.a()));
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                } catch (ExecutionException e11) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    @VisibleForTesting
    static long m(String str) {
        Preconditions.checkArgument(f38558d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private d n(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f38559e));
        f.a a10 = f.a();
        d.a a11 = d.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                a11.f(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                a11.c(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                a11.d(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals(IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY)) {
                        a10.c(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        a10.d(m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                a11.b(a10.a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a11.e(d.b.OK).a();
    }

    private static String o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f38559e));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb2.append(readLine);
                    sb2.append('\n');
                }
                String format = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return format;
            } catch (IOException unused2) {
                bufferedReader.close();
                return null;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (IOException unused4) {
            return null;
        }
    }

    private f p(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f38559e));
        f.a a10 = f.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY)) {
                a10.c(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                a10.d(m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return a10.b(f.b.OK).a();
    }

    private void q(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        s(httpURLConnection, h(b(str, str2)));
    }

    private void r(HttpURLConnection httpURLConnection) throws IOException {
        s(httpURLConnection, h(c()));
    }

    private static void s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    public d d(String str, String str2, String str3, String str4, String str5) throws com.google.firebase.installations.d {
        int responseCode;
        d n10;
        if (this.f38562c.b()) {
            URL g10 = g(String.format("projects/%s/installations", str3));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection l10 = l(g10, str);
                try {
                    l10.setRequestMethod("POST");
                    l10.setDoOutput(true);
                    if (str5 != null) {
                        l10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    q(l10, str2, str4);
                    responseCode = l10.getResponseCode();
                    this.f38562c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (i(responseCode)) {
                    n10 = n(l10);
                } else {
                    k(l10, str4, str, str3);
                    if (responseCode == 429) {
                        throw new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        j();
                        n10 = d.a().e(d.b.BAD_CONFIG).a();
                    } else {
                        l10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                l10.disconnect();
                TrafficStats.clearThreadStatsTag();
                return n10;
            }
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    public f e(String str, String str2, String str3, String str4) throws com.google.firebase.installations.d {
        int responseCode;
        f p10;
        if (this.f38562c.b()) {
            URL g10 = g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
            for (int i10 = 0; i10 <= 1; i10++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection l10 = l(g10, str);
                try {
                    l10.setRequestMethod("POST");
                    l10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    l10.setDoOutput(true);
                    r(l10);
                    responseCode = l10.getResponseCode();
                    this.f38562c.f(responseCode);
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th) {
                    l10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
                if (i(responseCode)) {
                    p10 = p(l10);
                } else {
                    k(l10, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode == 429) {
                            throw new com.google.firebase.installations.d("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", d.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            j();
                            p10 = f.a().b(f.b.BAD_CONFIG).a();
                        } else {
                            l10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    p10 = f.a().b(f.b.AUTH_ERROR).a();
                }
                l10.disconnect();
                TrafficStats.clearThreadStatsTag();
                return p10;
            }
            throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        throw new com.google.firebase.installations.d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }
}
