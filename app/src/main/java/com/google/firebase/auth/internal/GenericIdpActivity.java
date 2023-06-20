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
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.p002firebaseauthapi.zzd;
import com.google.android.gms.internal.p002firebaseauthapi.zztk;
import com.google.android.gms.internal.p002firebaseauthapi.zztl;
import com.google.android.gms.internal.p002firebaseauthapi.zztm;
import com.google.android.gms.internal.p002firebaseauthapi.zzvf;
import com.google.android.gms.internal.p002firebaseauthapi.zzxe;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import sb.g0;
import sb.h0;
import sb.i0;
import sb.y;
import sb.z;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
@KeepName
/* loaded from: classes3.dex */
public class GenericIdpActivity extends androidx.fragment.app.d implements zztm {

    /* renamed from: c  reason: collision with root package name */
    private static long f23271c;

    /* renamed from: d  reason: collision with root package name */
    private static final z f23272d = z.b();

    /* renamed from: a  reason: collision with root package name */
    private final Executor f23273a = zzd.zza().zza(1);

    /* renamed from: b  reason: collision with root package name */
    private boolean f23274b = false;

    private final void e() {
        f23271c = 0L;
        this.f23274b = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!v0.a.b(this).d(intent)) {
            f23272d.e(this, sb.g.a("WEB_CONTEXT_CANCELED"));
        } else {
            f23272d.c(this);
        }
        finish();
    }

    private final void f(Status status) {
        f23271c = 0L;
        this.f23274b = false;
        Intent intent = new Intent();
        y.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!v0.a.b(this).d(intent)) {
            f23272d.e(getApplicationContext(), status);
        } else {
            f23272d.c(this);
        }
        finish();
    }

    public final Uri.Builder d(Uri.Builder builder, Intent intent, String str, String str2) {
        String jSONObject;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (String str3 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str3);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject2.put(str3, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            jSONObject = jSONObject2.toString();
        }
        String uuid = UUID.randomUUID().toString();
        String zza = zztl.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str4 = jSONObject;
        String str5 = join;
        h0.b().d(getApplicationContext(), str, uuid, zza, action, stringExtra2, stringExtra3, stringExtra4);
        String c10 = i0.a(getApplicationContext(), ob.e.o(stringExtra4).r()).c();
        if (TextUtils.isEmpty(c10)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            f(sb.g.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        } else if (zza == null) {
            return null;
        } else {
            builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X".concat(String.valueOf(stringExtra5))).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c10);
            if (!TextUtils.isEmpty(str5)) {
                builder.appendQueryParameter("scopes", str5);
            }
            if (!TextUtils.isEmpty(str4)) {
                builder.appendQueryParameter("customParameters", str4);
            }
            if (!TextUtils.isEmpty(stringExtra3)) {
                builder.appendQueryParameter("tid", stringExtra3);
            }
            return builder;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            e();
            return;
        }
        long currentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
        if (currentTimeMillis - f23271c < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f23271c = currentTimeMillis;
        if (bundle != null) {
            this.f23274b = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
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
            if (!this.f23274b) {
                String packageName = getPackageName();
                try {
                    String lowerCase = Hex.bytesToStringUppercase(AndroidUtilsLight.getPackageCertificateHashBytes(this, packageName)).toLowerCase(Locale.US);
                    ob.e o10 = ob.e.o(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                    if (!zzvf.zzg(o10)) {
                        new zztk(packageName, lowerCase, getIntent(), o10, this).executeOnExecutor(this.f23273a, new Void[0]);
                    } else {
                        zzf(d(Uri.parse(zzvf.zza(o10.q().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName);
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    String obj = e10.toString();
                    Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + obj);
                    zze(packageName, null);
                }
                this.f23274b = true;
                return;
            }
            e();
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            f(y.b(intent.getStringExtra("firebaseError")));
        } else if (intent.hasExtra("link") && intent.hasExtra("eventId")) {
            String stringExtra = intent.getStringExtra("link");
            String stringExtra2 = intent.getStringExtra("eventId");
            String packageName2 = getPackageName();
            boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
            g0 a10 = h0.b().a(this, packageName2, stringExtra2);
            if (a10 == null) {
                e();
            }
            if (booleanExtra) {
                stringExtra = i0.a(getApplicationContext(), ob.e.o(a10.a()).r()).b(stringExtra);
            }
            zzxe zzxeVar = new zzxe(a10, stringExtra);
            String e11 = a10.e();
            String b10 = a10.b();
            zzxeVar.zzf(e11);
            if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(b10) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(b10) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(b10)) {
                Log.e("GenericIdpActivity", "unsupported operation: ".concat(b10));
                e();
                return;
            }
            f23271c = 0L;
            this.f23274b = false;
            Intent intent2 = new Intent();
            SafeParcelableSerializer.serializeToIntentExtra(zzxeVar, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
            intent2.putExtra("com.google.firebase.auth.internal.OPERATION", b10);
            intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
            if (!v0.a.b(this).d(intent2)) {
                SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
                edit.putString("verifyAssertionRequest", SafeParcelableSerializer.serializeToString(zzxeVar));
                edit.putString("operation", b10);
                edit.putString("tenantId", e11);
                edit.putLong("timestamp", DefaultClock.getInstance().currentTimeMillis());
                edit.commit();
            } else {
                f23272d.c(this);
            }
            finish();
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f23274b);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztm
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztm
    public final Uri.Builder zzb(Intent intent, String str, String str2) {
        return d(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
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
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zztm
    public final void zze(String str, Status status) {
        if (status == null) {
            e();
        } else {
            f(status);
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
        Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
        zze(str, null);
    }
}
