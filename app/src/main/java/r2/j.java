package r2;

import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: HurlStack.java */
/* loaded from: classes.dex */
public class j extends r2.b {

    /* renamed from: a  reason: collision with root package name */
    private final b f36152a;

    /* renamed from: b  reason: collision with root package name */
    private final SSLSocketFactory f36153b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HurlStack.java */
    /* loaded from: classes.dex */
    public static class a extends FilterInputStream {

        /* renamed from: a  reason: collision with root package name */
        private final HttpURLConnection f36154a;

        a(HttpURLConnection httpURLConnection) {
            super(j.k(httpURLConnection));
            this.f36154a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f36154a.disconnect();
        }
    }

    /* compiled from: HurlStack.java */
    /* loaded from: classes.dex */
    public interface b extends p {
    }

    public j() {
        this(null);
    }

    private void d(HttpURLConnection httpURLConnection, q2.n<?> nVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", nVar.j());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(i(nVar, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private void e(HttpURLConnection httpURLConnection, q2.n<?> nVar) throws IOException, q2.a {
        byte[] i10 = nVar.i();
        if (i10 != null) {
            d(httpURLConnection, nVar, i10);
        }
    }

    static List<q2.g> f(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : entry.getValue()) {
                    arrayList.add(new q2.g(entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }

    private static boolean j(int i10, int i11) {
        return (i10 == 4 || (100 <= i11 && i11 < 200) || i11 == 204 || i11 == 304) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream k(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private HttpURLConnection l(URL url, q2.n<?> nVar) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection g10 = g(url);
        int w10 = nVar.w();
        g10.setConnectTimeout(w10);
        g10.setReadTimeout(w10);
        g10.setUseCaches(false);
        g10.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f36153b) != null) {
            ((HttpsURLConnection) g10).setSSLSocketFactory(sSLSocketFactory);
        }
        return g10;
    }

    @Override // r2.b
    public h b(q2.n<?> nVar, Map<String, String> map) throws IOException, q2.a {
        String y10 = nVar.y();
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(nVar.m());
        b bVar = this.f36152a;
        if (bVar != null) {
            String a10 = bVar.a(y10);
            if (a10 == null) {
                throw new IOException("URL blocked by rewriter: " + y10);
            }
            y10 = a10;
        }
        HttpURLConnection l10 = l(new URL(y10), nVar);
        try {
            for (String str : hashMap.keySet()) {
                l10.setRequestProperty(str, (String) hashMap.get(str));
            }
            m(l10, nVar);
            int responseCode = l10.getResponseCode();
            if (responseCode != -1) {
                if (!j(nVar.n(), responseCode)) {
                    h hVar = new h(responseCode, f(l10.getHeaderFields()));
                    l10.disconnect();
                    return hVar;
                }
                return new h(responseCode, f(l10.getHeaderFields()), l10.getContentLength(), h(nVar, l10));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th) {
            if (0 == 0) {
                l10.disconnect();
            }
            throw th;
        }
    }

    protected HttpURLConnection g(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }

    protected InputStream h(q2.n<?> nVar, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    protected OutputStream i(q2.n<?> nVar, HttpURLConnection httpURLConnection, int i10) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    void m(HttpURLConnection httpURLConnection, q2.n<?> nVar) throws IOException, q2.a {
        switch (nVar.n()) {
            case -1:
                byte[] q10 = nVar.q();
                if (q10 != null) {
                    httpURLConnection.setRequestMethod("POST");
                    d(httpURLConnection, nVar, q10);
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                e(httpURLConnection, nVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                e(httpURLConnection, nVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod(VersionInfo.GIT_BRANCH);
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                e(httpURLConnection, nVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public j(b bVar) {
        this(bVar, null);
    }

    public j(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f36152a = bVar;
        this.f36153b = sSLSocketFactory;
    }
}
