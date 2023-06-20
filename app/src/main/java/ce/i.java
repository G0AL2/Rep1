package ce;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ReactNativeFirebaseJSON.java */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: b  reason: collision with root package name */
    private static i f5496b = new i();

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f5497a;

    private i() {
        try {
            this.f5497a = new JSONObject("{\"admob_android_app_id\":\"ca-app-pub-5074952322718275~4508290991\",\"admob_ios_app_id\":\"ca-app-pub-5074952322718275~4725061223\",\"messaging_android_notification_channel_id\":\"IMPORTANCE_HIGH\",\"analytics_auto_collection_enabled\":true,\"messaging_auto_init_enabled\":true}");
        } catch (JSONException unused) {
        }
    }

    public static i d() {
        return f5496b;
    }

    public WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        JSONArray names = this.f5497a.names();
        for (int i10 = 0; i10 < names.length(); i10++) {
            try {
                String string = names.getString(i10);
                io.invertase.firebase.common.a.f(string, this.f5497a.get(string), createMap);
            } catch (JSONException unused) {
            }
        }
        return createMap;
    }

    public int b(String str, int i10) {
        JSONObject jSONObject = this.f5497a;
        return jSONObject == null ? i10 : jSONObject.optInt(str, i10);
    }

    public String c() {
        return "{\"admob_android_app_id\":\"ca-app-pub-5074952322718275~4508290991\",\"admob_ios_app_id\":\"ca-app-pub-5074952322718275~4725061223\",\"messaging_android_notification_channel_id\":\"IMPORTANCE_HIGH\",\"analytics_auto_collection_enabled\":true,\"messaging_auto_init_enabled\":true}";
    }
}
