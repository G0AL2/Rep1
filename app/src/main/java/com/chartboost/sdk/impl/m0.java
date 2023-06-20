package com.chartboost.sdk.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import com.chartboost.sdk.Libraries.CBLogging;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class m0 {

    /* renamed from: c */
    private String f14184c;

    /* renamed from: a */
    private int f14182a = -1;

    /* renamed from: b */
    private String f14183b = null;

    /* renamed from: d */
    private String f14185d = null;

    /* renamed from: e */
    private Integer f14186e = null;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f14187a;

        /* renamed from: b */
        public final String f14188b;

        /* renamed from: c */
        public final String f14189c;

        /* renamed from: d */
        public final String f14190d;

        /* renamed from: e */
        public final String f14191e;

        /* renamed from: f */
        public final Integer f14192f;

        public a(int i10, String str, String str2, String str3, String str4, Integer num) {
            this.f14187a = i10;
            this.f14188b = str;
            this.f14189c = str2;
            this.f14190d = str3;
            this.f14191e = str4;
            this.f14192f = num;
        }

        public synchronized Boolean a() {
            boolean z10;
            z10 = true;
            if (this.f14187a != 1) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    private String a(JSONObject jSONObject) {
        byte[] bytes;
        String encodeToString;
        return (jSONObject == null || (bytes = jSONObject.toString().getBytes()) == null || (encodeToString = Base64.encodeToString(bytes, 0)) == null) ? "" : encodeToString.replace("\n", "").trim();
    }

    public static /* synthetic */ void a(m0 m0Var, l lVar, Context context) {
        m0Var.a(lVar, context);
    }

    private boolean a() {
        return true;
    }

    private static boolean b() {
        return !"Amazon".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public synchronized a c(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper() && !"robolectric".equals(Build.FINGERPRINT)) {
            CBLogging.b("CBIdentity", "I must be called from a background thread");
            return null;
        }
        if (b()) {
            b(context);
        } else {
            a(context);
        }
        String str = this.f14183b;
        boolean z10 = true;
        if (this.f14182a != 1) {
            z10 = false;
        }
        this.f14184c = i1.a(context, z10);
        JSONObject jSONObject = new JSONObject();
        String str2 = this.f14184c;
        if (str2 != null && str == null) {
            n0.a(jSONObject, "uuid", str2);
        }
        if (str != null) {
            n0.a(jSONObject, "gaid", str);
        }
        String str3 = this.f14185d;
        if (str3 != null) {
            n0.a(jSONObject, "appsetid", str3);
        }
        if (m2.f14204a) {
            m2.b(str);
            m2.c(str != null ? "000000000" : this.f14184c);
        }
        return new a(this.f14182a, a(jSONObject), str != null ? "000000000" : this.f14184c, str, this.f14185d, this.f14186e);
    }

    private void b(Context context) {
        k kVar = new k(context);
        this.f14182a = kVar.f14108a;
        this.f14183b = kVar.f14109b;
    }

    private void a(Context context) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (!(Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0)) {
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                if ("00000000-0000-0000-0000-000000000000".equals(string)) {
                    this.f14182a = 1;
                    this.f14183b = null;
                } else {
                    this.f14182a = 0;
                    this.f14183b = string;
                }
            } else {
                this.f14182a = 1;
                this.f14183b = null;
            }
        } catch (Settings.SettingNotFoundException unused) {
            this.f14182a = -1;
            this.f14183b = null;
        }
    }

    public void a(final Context context, final l lVar, ExecutorService executorService) {
        if (lVar != null && context != null) {
            try {
                if (a()) {
                    executorService.execute(new Runnable() { // from class: com.chartboost.sdk.impl.y3
                        @Override // java.lang.Runnable
                        public final void run() {
                            m0.a(m0.this, lVar, context);
                        }
                    });
                }
            } catch (Exception e10) {
                Log.e("AppSet", "Error requesting AppSetId: " + e10);
                return;
            }
        }
        Log.w("AppSet", "AppSetId dependency not present");
    }

    public /* synthetic */ void a(l lVar, Context context) {
        try {
            lVar.b(context).addOnSuccessListener(new OnSuccessListener() { // from class: com.chartboost.sdk.impl.x3
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    m0.this.a((AppSetIdInfo) obj);
                }
            });
        } catch (Exception unused) {
        }
    }

    public void a(AppSetIdInfo appSetIdInfo) {
        if (appSetIdInfo != null) {
            try {
                this.f14185d = appSetIdInfo.getId();
                this.f14186e = Integer.valueOf(appSetIdInfo.getScope());
                m2.a("SetId: " + this.f14185d + " scope:" + this.f14186e);
            } catch (Exception unused) {
            }
        }
    }
}
