package fc;

import com.google.android.gms.common.internal.ImagesContract;
import org.json.JSONException;
import org.json.JSONObject;
import yb.q;

/* compiled from: DefaultSettingsJsonTransform.java */
/* loaded from: classes3.dex */
class b implements g {
    private static gc.a b(JSONObject jSONObject) throws JSONException {
        return new gc.a(jSONObject.getString("status"), jSONObject.getString(ImagesContract.URL), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    private static gc.b c(JSONObject jSONObject) {
        return new gc.b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    private static gc.c d(JSONObject jSONObject) {
        return new gc.c(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gc.d e(q qVar) {
        JSONObject jSONObject = new JSONObject();
        return new gc.e(f(qVar, 3600L, jSONObject), null, d(jSONObject), c(jSONObject), 0, 3600);
    }

    private static long f(q qVar, long j10, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return qVar.a() + (j10 * 1000);
    }

    @Override // fc.g
    public gc.e a(q qVar, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new gc.e(f(qVar, optInt2, jSONObject), b(jSONObject.getJSONObject("app")), d(jSONObject.getJSONObject("session")), c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
