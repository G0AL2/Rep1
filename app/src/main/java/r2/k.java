package r2;

import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
import q2.p;

/* compiled from: JsonObjectRequest.java */
/* loaded from: classes.dex */
public class k extends l<JSONObject> {
    public k(int i10, String str, JSONObject jSONObject, p.b<JSONObject> bVar, p.a aVar) {
        super(i10, str, jSONObject == null ? null : jSONObject.toString(), bVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // q2.n
    public q2.p<JSONObject> F(q2.k kVar) {
        try {
            return q2.p.c(new JSONObject(new String(kVar.f35809a, g.g(kVar.f35810b, "utf-8"))), g.e(kVar));
        } catch (UnsupportedEncodingException e10) {
            return q2.p.a(new q2.m(e10));
        } catch (JSONException e11) {
            return q2.p.a(new q2.m(e11));
        }
    }
}
