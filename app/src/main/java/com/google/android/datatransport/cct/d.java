package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.datatransport.cct.d;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import v7.j;
import v7.k;
import v7.l;
import v7.m;
import v7.n;
import v7.o;
import v7.p;
import w7.h;
import w7.i;
import x7.g;

/* compiled from: CctTransportBackend.java */
/* loaded from: classes2.dex */
public final class d implements g {

    /* renamed from: a */
    private final lc.a f20976a;

    /* renamed from: b */
    private final ConnectivityManager f20977b;

    /* renamed from: c */
    private final Context f20978c;

    /* renamed from: d */
    final URL f20979d;

    /* renamed from: e */
    private final h8.a f20980e;

    /* renamed from: f */
    private final h8.a f20981f;

    /* renamed from: g */
    private final int f20982g;

    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        final URL f20983a;

        /* renamed from: b */
        final j f20984b;

        /* renamed from: c */
        final String f20985c;

        a(URL url, j jVar, String str) {
            this.f20983a = url;
            this.f20984b = jVar;
            this.f20985c = str;
        }

        a a(URL url) {
            return new a(url, this.f20984b, this.f20985c);
        }
    }

    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        final int f20986a;

        /* renamed from: b */
        final URL f20987b;

        /* renamed from: c */
        final long f20988c;

        b(int i10, URL url, long j10) {
            this.f20986a = i10;
            this.f20987b = url;
            this.f20988c = j10;
        }
    }

    d(Context context, h8.a aVar, h8.a aVar2, int i10) {
        this.f20976a = j.b();
        this.f20978c = context;
        this.f20977b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f20979d = n(com.google.android.datatransport.cct.a.f20967c);
        this.f20980e = aVar2;
        this.f20981f = aVar;
        this.f20982g = i10;
    }

    public static /* synthetic */ a c(a aVar, b bVar) {
        return l(aVar, bVar);
    }

    public static /* synthetic */ b d(d dVar, a aVar) {
        return dVar.e(aVar);
    }

    public b e(a aVar) throws IOException {
        b8.a.a("CctTransportBackend", "Making request to: %s", aVar.f20983a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f20983a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f20982g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.3"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f20985c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f20976a.a(aVar.f20984b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                b8.a.e("CctTransportBackend", "Status Code: " + responseCode);
                b8.a.e("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                b8.a.e("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream m10 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                    b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(m10))).c());
                    if (m10 != null) {
                        m10.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (ConnectException e10) {
            e = e10;
            b8.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            b8.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            b8.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(DownloadResource.STATUS_BAD_REQUEST, null, 0L);
        } catch (lc.b e13) {
            e = e13;
            b8.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(DownloadResource.STATUS_BAD_REQUEST, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.f();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.f();
        }
        if (o.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.c.NONE.f();
        }
        return networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            b8.a.c("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    private j i(com.google.android.datatransport.runtime.backends.d dVar) {
        l.a j10;
        HashMap hashMap = new HashMap();
        for (i iVar : dVar.b()) {
            String j11 = iVar.j();
            if (!hashMap.containsKey(j11)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j11, arrayList);
            } else {
                ((List) hashMap.get(j11)).add(iVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a b10 = m.a().f(p.DEFAULT).g(this.f20981f.a()).h(this.f20980e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(v7.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b(AppLovinEventTypes.USER_VIEWED_PRODUCT)).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY)).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b10.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b10.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e10 = iVar3.e();
                u7.b b11 = e10.b();
                if (b11.equals(u7.b.b("proto"))) {
                    j10 = l.j(e10.a());
                } else if (b11.equals(u7.b.b("json"))) {
                    j10 = l.i(new String(e10.a(), Charset.forName("UTF-8")));
                } else {
                    b8.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b11);
                }
                j10.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.a(iVar3.g("net-type"))).b(o.b.a(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    j10.b(iVar3.d());
                }
                arrayList3.add(j10.a());
            }
            b10.c(arrayList3);
            arrayList2.add(b10.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f20987b;
        if (url != null) {
            b8.a.a("CctTransportBackend", "Following redirect to: %s", url);
            return aVar.a(bVar.f20987b);
        }
        return null;
    }

    private static InputStream m(InputStream inputStream, String str) throws IOException {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // x7.g
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f20977b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c(AppLovinEventTypes.USER_VIEWED_PRODUCT, Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f20978c).getSimOperator()).c("application_build", Integer.toString(h(this.f20978c))).d();
    }

    @Override // x7.g
    public com.google.android.datatransport.runtime.backends.e b(com.google.android.datatransport.runtime.backends.d dVar) {
        j i10 = i(dVar);
        URL url = this.f20979d;
        if (dVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a c10 = com.google.android.datatransport.cct.a.c(dVar.c());
                r3 = c10.d() != null ? c10.d() : null;
                if (c10.e() != null) {
                    url = n(c10.e());
                }
            } catch (IllegalArgumentException unused) {
                return com.google.android.datatransport.runtime.backends.e.a();
            }
        }
        try {
            b bVar = (b) c8.b.a(5, new a(url, i10, r3), new c8.a() { // from class: com.google.android.datatransport.cct.b
                @Override // c8.a
                public final Object apply(Object obj) {
                    return d.d(d.this, (d.a) obj);
                }
            }, new c8.c() { // from class: com.google.android.datatransport.cct.c
                @Override // c8.c
                public final Object a(Object obj, Object obj2) {
                    return d.c((d.a) obj, (d.b) obj2);
                }
            });
            int i11 = bVar.f20986a;
            if (i11 == 200) {
                return com.google.android.datatransport.runtime.backends.e.e(bVar.f20988c);
            }
            if (i11 < 500 && i11 != 404) {
                if (i11 == 400) {
                    return com.google.android.datatransport.runtime.backends.e.d();
                }
                return com.google.android.datatransport.runtime.backends.e.a();
            }
            return com.google.android.datatransport.runtime.backends.e.f();
        } catch (IOException e10) {
            b8.a.c("CctTransportBackend", "Could not make request to the backend", e10);
            return com.google.android.datatransport.runtime.backends.e.f();
        }
    }

    public d(Context context, h8.a aVar, h8.a aVar2) {
        this(context, aVar, aVar2, 40000);
    }
}
