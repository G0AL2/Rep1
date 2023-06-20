package vc;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import ob.e;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IidStore.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f38060c = {"*", "FCM", CodePackage.GCM, ""};

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f38061a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38062b;

    public b(e eVar) {
        this.f38061a = eVar.l().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f38062b = b(eVar);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(e eVar) {
        String f10 = eVar.q().f();
        if (f10 != null) {
            return f10;
        }
        String c10 = eVar.q().c();
        if (c10.startsWith("1:") || c10.startsWith("2:")) {
            String[] split = c10.split(":");
            if (split.length != 4) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return c10;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString(IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY);
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.f38061a) {
            string = this.f38061a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.f38061a) {
            String string = this.f38061a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey e10 = e(string);
            if (e10 == null) {
                return null;
            }
            return c(e10);
        }
    }

    public String f() {
        synchronized (this.f38061a) {
            String g10 = g();
            if (g10 != null) {
                return g10;
            }
            return h();
        }
    }

    public String i() {
        synchronized (this.f38061a) {
            for (String str : f38060c) {
                String string = this.f38061a.getString(a(this.f38062b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
