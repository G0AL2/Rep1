package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.remoteconfig.internal.e;
import com.google.firebase.remoteconfig.internal.j;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f23623h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    private final Context f23624a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23625b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23626c;

    /* renamed from: d  reason: collision with root package name */
    private final String f23627d;

    /* renamed from: e  reason: collision with root package name */
    private final String f23628e;

    /* renamed from: f  reason: collision with root package name */
    private final long f23629f;

    /* renamed from: g  reason: collision with root package name */
    private final long f23630g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j10, long j11) {
        this.f23624a = context;
        this.f23625b = str;
        this.f23626c = str2;
        this.f23627d = e(str);
        this.f23628e = str3;
        this.f23629f = j10;
        this.f23630g = j11;
    }

    private boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private JSONObject b(String str, String str2, Map<String, String> map) throws dd.k {
        String locale;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f23625b);
            Locale locale2 = this.f23624a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale2.getCountry());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                locale = locale2.toLanguageTag();
            } else {
                locale = locale2.toString();
            }
            hashMap.put("languageCode", locale);
            hashMap.put("platformVersion", Integer.toString(i10));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f23624a.getPackageManager().getPackageInfo(this.f23624a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put("appBuild", Long.toString(x.a.a(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f23624a.getPackageName());
            hashMap.put("sdkVersion", "21.0.2");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            return new JSONObject(hashMap);
        }
        throw new dd.k("Fetch failed: Firebase installation id is null.");
    }

    private static e d(JSONObject jSONObject, Date date) throws dd.k {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        try {
            e.b e10 = e.g().e(date);
            JSONObject jSONObject3 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                e10.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                e10.d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
            }
            if (jSONObject3 != null) {
                e10.f(jSONObject3);
            }
            return e10.a();
        } catch (JSONException e11) {
            throw new dd.k("Fetch failed: fetch response could not be parsed.", e11);
        }
    }

    private static String e(String str) {
        Matcher matcher = f23623h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private JSONObject f(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb2.append((char) read);
            } else {
                return new JSONObject(sb2.toString());
            }
        }
    }

    private String g(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", str, str2);
    }

    private String h() {
        try {
            Context context = this.f23624a;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f23624a.getPackageName());
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("FirebaseRemoteConfig", "No such package: " + this.f23624a.getPackageName(), e10);
            return null;
        }
    }

    private void i(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f23626c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f23624a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", h());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private void j(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private void k(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private void l(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f23629f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.f23630g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        i(httpURLConnection, str2);
        j(httpURLConnection, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HttpURLConnection c() throws dd.l {
        try {
            return (HttpURLConnection) new URL(g(this.f23627d, this.f23628e)).openConnection();
        } catch (IOException e10) {
            throw new dd.l(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Keep
    public j.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Date date) throws dd.l {
        l(httpURLConnection, str3, str2, map2);
        try {
            try {
                k(httpURLConnection, b(str, str2, map).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    String headerField = httpURLConnection.getHeaderField("ETag");
                    JSONObject f10 = f(httpURLConnection);
                    try {
                        httpURLConnection.getInputStream().close();
                    } catch (IOException unused) {
                    }
                    if (!a(f10)) {
                        return j.a.a(date);
                    }
                    return j.a.b(d(f10, date), headerField);
                }
                throw new dd.o(responseCode, httpURLConnection.getResponseMessage());
            } catch (IOException | JSONException e10) {
                throw new dd.k("The client had an error while calling the backend!", e10);
            }
        } finally {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
        }
    }
}
