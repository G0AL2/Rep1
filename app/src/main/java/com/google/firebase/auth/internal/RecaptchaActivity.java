package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p002firebaseauthapi.zzd;
import com.google.android.gms.internal.p002firebaseauthapi.zztk;
import com.google.android.gms.internal.p002firebaseauthapi.zztm;
import com.google.android.gms.internal.p002firebaseauthapi.zztx;
import com.google.android.gms.internal.p002firebaseauthapi.zzvf;
import com.google.firebase.auth.FirebaseAuth;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import sb.h0;
import sb.i0;
import sb.y;
import sb.z;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* loaded from: classes3.dex */
public class RecaptchaActivity extends androidx.fragment.app.d implements zztm {

    /* renamed from: b  reason: collision with root package name */
    private static final String f23275b = "RecaptchaActivity";

    /* renamed from: c  reason: collision with root package name */
    private static final ExecutorService f23276c = zzd.zza().zza(2);

    /* renamed from: d  reason: collision with root package name */
    private static long f23277d = 0;

    /* renamed from: e  reason: collision with root package name */
    private static final z f23278e = z.b();

    /* renamed from: a  reason: collision with root package name */
    private boolean f23279a = false;

    private final void d() {
        f23277d = 0L;
        this.f23279a = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        v0.a.b(this).d(intent);
        f23278e.c(this);
        finish();
    }

    private final void e(Status status) {
        f23277d = 0L;
        this.f23279a = false;
        Intent intent = new Intent();
        y.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        v0.a.b(this).d(intent);
        f23278e.c(this);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e(f23275b, "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            d();
            return;
        }
        long currentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
        if (currentTimeMillis - f23277d < 30000) {
            Log.e(f23275b, "Could not start operation - already in progress");
            return;
        }
        f23277d = currentTimeMillis;
        if (bundle != null) {
            this.f23279a = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (!this.f23279a) {
                Intent intent = getIntent();
                String packageName = getPackageName();
                try {
                    new zztk(packageName, Hex.bytesToStringUppercase(AndroidUtilsLight.getPackageCertificateHashBytes(this, packageName)).toLowerCase(Locale.US), intent, ob.e.o(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME")), this).executeOnExecutor(f23276c, new Void[0]);
                } catch (PackageManager.NameNotFoundException e10) {
                    String str = f23275b;
                    String obj = e10.toString();
                    Log.e(str, "Could not get package signature: " + packageName + " " + obj);
                    zze(packageName, null);
                }
                this.f23279a = true;
                return;
            }
            d();
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            e(y.b(intent2.getStringExtra("firebaseError")));
        } else if (intent2.hasExtra("link") && intent2.hasExtra("eventId")) {
            String stringExtra = intent2.getStringExtra("link");
            String c10 = h0.b().c(getApplicationContext(), getPackageName(), intent2.getStringExtra("eventId"));
            if (TextUtils.isEmpty(c10)) {
                Log.e(f23275b, "Failed to find registration for this event - failing to prevent session injection.");
                e(sb.g.a("Failed to find registration for this reCAPTCHA event"));
            }
            if (intent2.getBooleanExtra("encryptionEnabled", true)) {
                stringExtra = i0.a(getApplicationContext(), ob.e.o(c10).r()).b(stringExtra);
            }
            String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
            f23277d = 0L;
            this.f23279a = false;
            Intent intent3 = new Intent();
            intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
            intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
            if (!v0.a.b(this).d(intent3)) {
                SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                edit.putString("recaptchaToken", queryParameter);
                edit.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
                edit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
                edit.commit();
            } else {
                f23278e.c(this);
            }
            finish();
        } else {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f23279a);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztm
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztm
    public final Uri.Builder zzb(Intent intent, String str, String str2) {
        String zza;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        ob.e o10 = ob.e.o(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(o10);
        h0.b().e(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String c10 = i0.a(getApplicationContext(), o10.r()).c();
        if (TextUtils.isEmpty(c10)) {
            Log.e(f23275b, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            e(sb.g.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        if (!TextUtils.isEmpty(firebaseAuth.l())) {
            zza = firebaseAuth.l();
        } else {
            zza = zztx.zza();
        }
        return new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztm
    public final String zzc(String str) {
        return zzvf.zzb(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztm
    public final HttpURLConnection zzd(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            zztm.zza.e("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztm
    public final void zze(String str, Status status) {
        if (status == null) {
            d();
        } else {
            e(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztm
    public final void zzf(Uri uri, String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
            List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                androidx.browser.customtabs.d a10 = new d.a().a();
                a10.f1796a.addFlags(1073741824);
                a10.f1796a.addFlags(268435456);
                a10.a(this, uri);
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.putExtra("com.android.browser.application_id", str);
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            startActivity(intent);
            return;
        }
        Log.e(f23275b, "Device cannot resolve intent for: android.intent.action.VIEW");
        zze(str, null);
    }
}
