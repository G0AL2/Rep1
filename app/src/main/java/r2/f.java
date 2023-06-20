package r2;

import com.inmobi.media.jh;
import java.io.IOException;
import java.net.URI;
import java.util.Map;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/* compiled from: HttpClientStack.java */
@Deprecated
/* loaded from: classes.dex */
public class f implements i {

    /* renamed from: a  reason: collision with root package name */
    protected final HttpClient f36146a;

    /* compiled from: HttpClientStack.java */
    /* loaded from: classes.dex */
    public static final class a extends HttpEntityEnclosingRequestBase {
        public a(String str) {
            setURI(URI.create(str));
        }

        public String getMethod() {
            return "PATCH";
        }
    }

    public f(HttpClient httpClient) {
        this.f36146a = httpClient;
    }

    static HttpUriRequest b(q2.n<?> nVar, Map<String, String> map) throws q2.a {
        switch (nVar.n()) {
            case -1:
                byte[] q10 = nVar.q();
                if (q10 != null) {
                    HttpPost httpPost = new HttpPost(nVar.y());
                    httpPost.addHeader("Content-Type", nVar.r());
                    httpPost.setEntity(new ByteArrayEntity(q10));
                    return httpPost;
                }
                return new HttpGet(nVar.y());
            case 0:
                return new HttpGet(nVar.y());
            case 1:
                HttpPost httpPost2 = new HttpPost(nVar.y());
                httpPost2.addHeader("Content-Type", nVar.j());
                d(httpPost2, nVar);
                return httpPost2;
            case 2:
                HttpPut httpPut = new HttpPut(nVar.y());
                httpPut.addHeader("Content-Type", nVar.j());
                d(httpPut, nVar);
                return httpPut;
            case 3:
                return new HttpDelete(nVar.y());
            case 4:
                return new HttpHead(nVar.y());
            case 5:
                return new HttpOptions(nVar.y());
            case 6:
                return new HttpTrace(nVar.y());
            case 7:
                a aVar = new a(nVar.y());
                aVar.addHeader("Content-Type", nVar.j());
                d(aVar, nVar);
                return aVar;
            default:
                throw new IllegalStateException("Unknown request method.");
        }
    }

    private static void d(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, q2.n<?> nVar) throws q2.a {
        byte[] i10 = nVar.i();
        if (i10 != null) {
            httpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(i10));
        }
    }

    private static void e(HttpUriRequest httpUriRequest, Map<String, String> map) {
        for (String str : map.keySet()) {
            httpUriRequest.setHeader(str, map.get(str));
        }
    }

    @Override // r2.i
    public HttpResponse a(q2.n<?> nVar, Map<String, String> map) throws IOException, q2.a {
        HttpUriRequest b10 = b(nVar, map);
        e(b10, map);
        e(b10, nVar.m());
        c(b10);
        HttpParams params = b10.getParams();
        int w10 = nVar.w();
        HttpConnectionParams.setConnectionTimeout(params, jh.DEFAULT_BITMAP_TIMEOUT);
        HttpConnectionParams.setSoTimeout(params, w10);
        return this.f36146a.execute(b10);
    }

    protected void c(HttpUriRequest httpUriRequest) throws IOException {
    }
}
