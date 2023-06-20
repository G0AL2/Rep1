package sb;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    static final Map f36973a;

    static {
        HashMap hashMap = new HashMap();
        f36973a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        hashMap.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        hashMap.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        hashMap.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        hashMap.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(Intent intent) {
        Preconditions.checkNotNull(intent);
        Preconditions.checkArgument(d(intent));
        return (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    public static Status b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(Analytics.Param.CODE);
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map map = f36973a;
                if (map.containsKey(string)) {
                    return g.a(((String) map.get(string)) + ":" + string2);
                }
            }
            return g.a("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e10) {
            String localizedMessage = e10.getLocalizedMessage();
            return g.a("WEB_INTERNAL_ERROR:" + str + "[ " + localizedMessage + " ]");
        }
    }

    public static void c(Intent intent, Status status) {
        SafeParcelableSerializer.serializeToIntentExtra(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean d(Intent intent) {
        Preconditions.checkNotNull(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }
}
