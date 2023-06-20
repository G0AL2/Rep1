package r2;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* compiled from: AdaptedHttpStack.java */
/* loaded from: classes.dex */
class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private final i f36124a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(i iVar) {
        this.f36124a = iVar;
    }

    @Override // r2.b
    public h b(q2.n<?> nVar, Map<String, String> map) throws IOException, q2.a {
        try {
            HttpResponse a10 = this.f36124a.a(nVar, map);
            int statusCode = a10.getStatusLine().getStatusCode();
            Header[] allHeaders = a10.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new q2.g(header.getName(), header.getValue()));
            }
            if (a10.getEntity() == null) {
                return new h(statusCode, arrayList);
            }
            long contentLength = a10.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new h(statusCode, arrayList, (int) a10.getEntity().getContentLength(), a10.getEntity().getContent());
            }
            throw new IOException("Response too large: " + contentLength);
        } catch (ConnectTimeoutException e10) {
            throw new SocketTimeoutException(e10.getMessage());
        }
    }
}
