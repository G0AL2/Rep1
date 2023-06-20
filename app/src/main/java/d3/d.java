package d3;

import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.m;
import java.io.IOException;
import java.util.Map;

/* compiled from: NetworkSoureVolleyImpl.java */
/* loaded from: classes.dex */
public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private i f29052a;

    public d() {
        this.f29052a = null;
        this.f29052a = i3.b.h();
    }

    @Override // d3.b
    public a a(e eVar) throws IOException {
        k.a aVar = new k.a();
        try {
            Map<String, String> map = eVar.f29054b;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        String value = entry.getValue();
                        if (value == null) {
                            value = "";
                        }
                        aVar.b(key, value);
                    }
                }
            }
            m a10 = this.f29052a.a(aVar.a(eVar.f29053a).a().b()).a();
            o3.c.j("NetworkSoureVolleyImpl", "response code = ", Integer.valueOf(a10.c()));
            return new f(a10, eVar);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
