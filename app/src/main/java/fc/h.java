package fc;

import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import yb.q;

/* compiled from: SettingsV3JsonTransform.java */
/* loaded from: classes3.dex */
class h implements g {
    private static gc.a b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String string = jSONObject2.getString("status");
        boolean equals = "new".equals(string);
        String string2 = jSONObject.getString("bundle_id");
        String string3 = jSONObject.getString("org_id");
        String format = equals ? "https://update.crashlytics.com/spi/v1/platforms/android/apps" : String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", string2);
        Locale locale = Locale.US;
        return new gc.a(string, format, String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", string2), String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", string2), string2, string3, jSONObject2.optBoolean("update_required", false), jSONObject2.optInt("report_upload_variant", 0), jSONObject2.optInt("native_report_upload_variant", 0));
    }

    private static gc.b c(JSONObject jSONObject) {
        return new gc.b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    private static gc.c d() {
        return new gc.c(8, 4);
    }

    private static long e(q qVar, long j10, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return qVar.a() + (j10 * 1000);
    }

    @Override // fc.g
    public gc.e a(q qVar, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        return new gc.e(e(qVar, optInt2, jSONObject), b(jSONObject.getJSONObject("fabric"), jSONObject.getJSONObject("app")), d(), c(jSONObject.getJSONObject("features")), optInt, optInt2);
    }
}
