package sb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zznd;
import com.google.android.gms.internal.p002firebaseauthapi.zzwe;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final Context f36963a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36964b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f36965c;

    /* renamed from: d  reason: collision with root package name */
    private final Logger f36966d;

    public t(Context context, String str) {
        Preconditions.checkNotNull(context);
        String checkNotEmpty = Preconditions.checkNotEmpty(str);
        this.f36964b = checkNotEmpty;
        Context applicationContext = context.getApplicationContext();
        this.f36963a = applicationContext;
        this.f36965c = applicationContext.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", checkNotEmpty), 0);
        this.f36966d = new Logger("StorageHelpers", new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce A[Catch: zznd -> 0x0135, IllegalArgumentException -> 0x0137, ArrayIndexOutOfBoundsException -> 0x0139, JSONException -> 0x013b, TRY_ENTER, TryCatch #2 {JSONException -> 0x013b, blocks: (B:3:0x0008, B:6:0x0025, B:10:0x003b, B:12:0x0079, B:14:0x0080, B:15:0x008c, B:16:0x008d, B:18:0x009c, B:20:0x00a5, B:21:0x00a8, B:23:0x00b1, B:28:0x00ce, B:29:0x00d1, B:31:0x00d7, B:33:0x00dd, B:34:0x00e3, B:36:0x00e9, B:38:0x0100, B:40:0x0108, B:44:0x012b, B:41:0x0122, B:42:0x0129, B:45:0x0131), top: B:59:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.google.firebase.auth.internal.zzx f(org.json.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.t.f(org.json.JSONObject):com.google.firebase.auth.internal.zzx");
    }

    public final FirebaseUser a() {
        String string = this.f36965c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return f(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final zzwe b(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        String string = this.f36965c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.e()), null);
        if (string != null) {
            return zzwe.zzd(string);
        }
        return null;
    }

    public final void c(String str) {
        this.f36965c.edit().remove(str).apply();
    }

    public final void d(FirebaseUser firebaseUser) {
        String str;
        Preconditions.checkNotNull(firebaseUser);
        JSONObject jSONObject = new JSONObject();
        if (zzx.class.isAssignableFrom(firebaseUser.getClass())) {
            zzx zzxVar = (zzx) firebaseUser;
            try {
                jSONObject.put("cachedTokenState", zzxVar.zzf());
                jSONObject.put("applicationName", zzxVar.C1().p());
                jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                if (zzxVar.M1() != null) {
                    JSONArray jSONArray = new JSONArray();
                    List M1 = zzxVar.M1();
                    for (int i10 = 0; i10 < M1.size(); i10++) {
                        jSONArray.put(((zzt) M1.get(i10)).zzb());
                    }
                    jSONObject.put("userInfos", jSONArray);
                }
                jSONObject.put("anonymous", zzxVar.p1());
                jSONObject.put(MediationMetaData.KEY_VERSION, "2");
                if (zzxVar.l1() != null) {
                    jSONObject.put("userMetadata", ((zzz) zzxVar.l1()).c());
                }
                List<MultiFactorInfo> a10 = new e(zzxVar).a();
                if (!a10.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i11 = 0; i11 < a10.size(); i11++) {
                        jSONArray2.put(a10.get(i11).toJson());
                    }
                    jSONObject.put("userMultiFactorInfo", jSONArray2);
                }
                str = jSONObject.toString();
            } catch (Exception e10) {
                this.f36966d.wtf("Failed to turn object into JSON", e10, new Object[0]);
                throw new zznd(e10);
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f36965c.edit().putString("com.google.firebase.auth.FIREBASE_USER", str).apply();
    }

    public final void e(FirebaseUser firebaseUser, zzwe zzweVar) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzweVar);
        this.f36965c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.e()), zzweVar.zzh()).apply();
    }
}
