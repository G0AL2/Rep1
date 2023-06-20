package r2;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* compiled from: BaseHttpStack.java */
/* loaded from: classes.dex */
public abstract class b implements i {
    @Override // r2.i
    @Deprecated
    public final HttpResponse a(q2.n<?> nVar, Map<String, String> map) throws IOException, q2.a {
        h b10 = b(nVar, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), b10.d(), ""));
        ArrayList arrayList = new ArrayList();
        for (q2.g gVar : b10.c()) {
            arrayList.add(new BasicHeader(gVar.a(), gVar.b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[0]));
        InputStream a10 = b10.a();
        if (a10 != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(a10);
            basicHttpEntity.setContentLength(b10.b());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    public abstract h b(q2.n<?> nVar, Map<String, String> map) throws IOException, q2.a;
}
