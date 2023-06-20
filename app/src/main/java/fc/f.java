package fc;

import org.json.JSONException;
import org.json.JSONObject;
import yb.q;

/* compiled from: SettingsJsonParser.java */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final q f30313a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(q qVar) {
        this.f30313a = qVar;
    }

    private static g a(int i10) {
        if (i10 != 3) {
            return new b();
        }
        return new h();
    }

    public gc.e b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt("settings_version")).a(this.f30313a, jSONObject);
    }
}
