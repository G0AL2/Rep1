package f2;

import android.util.Pair;
import com.airbnb.lottie.j0;
import com.airbnb.lottie.p;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* compiled from: NetworkFetcher.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final g f30088a;

    /* renamed from: b  reason: collision with root package name */
    private final f f30089b;

    public h(g gVar, f fVar) {
        this.f30088a = gVar;
        this.f30089b = fVar;
    }

    private com.airbnb.lottie.h a(String str, String str2) {
        Pair<c, InputStream> a10;
        j0<com.airbnb.lottie.h> o10;
        if (str2 == null || (a10 = this.f30088a.a(str)) == null) {
            return null;
        }
        c cVar = (c) a10.first;
        InputStream inputStream = (InputStream) a10.second;
        if (cVar == c.ZIP) {
            o10 = p.y(new ZipInputStream(inputStream), str);
        } else {
            o10 = p.o(inputStream, str);
        }
        if (o10.b() != null) {
            return o10.b();
        }
        return null;
    }

    private j0<com.airbnb.lottie.h> b(String str, String str2) {
        i2.d.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d a10 = this.f30089b.a(str);
                if (a10.c0()) {
                    j0<com.airbnb.lottie.h> d10 = d(str, a10.R(), a10.K(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(d10.b() != null);
                    i2.d.a(sb2.toString());
                    try {
                        a10.close();
                    } catch (IOException e10) {
                        i2.d.d("LottieFetchResult close failed ", e10);
                    }
                    return d10;
                }
                j0<com.airbnb.lottie.h> j0Var = new j0<>(new IllegalArgumentException(a10.G0()));
                try {
                    a10.close();
                } catch (IOException e11) {
                    i2.d.d("LottieFetchResult close failed ", e11);
                }
                return j0Var;
            } catch (Exception e12) {
                j0<com.airbnb.lottie.h> j0Var2 = new j0<>(e12);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e13) {
                        i2.d.d("LottieFetchResult close failed ", e13);
                    }
                }
                return j0Var2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e14) {
                    i2.d.d("LottieFetchResult close failed ", e14);
                }
            }
            throw th;
        }
    }

    private j0<com.airbnb.lottie.h> d(String str, InputStream inputStream, String str2, String str3) throws IOException {
        c cVar;
        j0<com.airbnb.lottie.h> f10;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (!str2.contains("application/zip") && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            i2.d.a("Received json response.");
            cVar = c.JSON;
            f10 = e(str, inputStream, str3);
        } else {
            i2.d.a("Handling zip response.");
            cVar = c.ZIP;
            f10 = f(str, inputStream, str3);
        }
        if (str3 != null && f10.b() != null) {
            this.f30088a.e(str, cVar);
        }
        return f10;
    }

    private j0<com.airbnb.lottie.h> e(String str, InputStream inputStream, String str2) throws IOException {
        if (str2 == null) {
            return p.o(inputStream, null);
        }
        return p.o(new FileInputStream(this.f30088a.f(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    private j0<com.airbnb.lottie.h> f(String str, InputStream inputStream, String str2) throws IOException {
        if (str2 == null) {
            return p.y(new ZipInputStream(inputStream), null);
        }
        return p.y(new ZipInputStream(new FileInputStream(this.f30088a.f(str, inputStream, c.ZIP))), str);
    }

    public j0<com.airbnb.lottie.h> c(String str, String str2) {
        com.airbnb.lottie.h a10 = a(str, str2);
        if (a10 != null) {
            return new j0<>(a10);
        }
        i2.d.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(str, str2);
    }
}
