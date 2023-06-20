package wb;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* loaded from: classes3.dex */
public class d implements b, xb.b {

    /* renamed from: a  reason: collision with root package name */
    private xb.a f38540a;

    private static String b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // xb.b
    public void a(xb.a aVar) {
        this.f38540a = aVar;
        vb.f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // wb.b
    public void s(String str, Bundle bundle) {
        xb.a aVar = this.f38540a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                vb.f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
