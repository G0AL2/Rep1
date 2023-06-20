package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import ob.e;
import qc.j;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztw  reason: invalid package */
/* loaded from: classes2.dex */
public final class zztw {
    private final Context zza;
    private zzuq zzb;
    private final String zzc;
    private final e zzd;
    private boolean zze = false;
    private String zzf;

    public zztw(Context context, e eVar, String str) {
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzd = (e) Preconditions.checkNotNull(eVar);
        this.zzc = String.format("Android/%s/%s", "Fallback", str);
    }

    public final void zza(URLConnection uRLConnection) {
        String str;
        String concat = this.zze ? String.valueOf(this.zzc).concat("/FirebaseUI-Android") : String.valueOf(this.zzc).concat("/FirebaseCore-Android");
        if (this.zzb == null) {
            Context context = this.zza;
            this.zzb = new zzuq(context, context.getPackageName());
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zztx.zza());
        uRLConnection.setRequestProperty("X-Client-Version", concat);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.zzd.q().c());
        j jVar = (j) FirebaseAuth.getInstance(this.zzd).h0().get();
        if (jVar != null) {
            try {
                str = (String) Tasks.await(jVar.a());
            } catch (InterruptedException | ExecutionException e10) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: ".concat(String.valueOf(e10.getMessage())));
            }
            uRLConnection.setRequestProperty("X-Firebase-Client", str);
            this.zzf = null;
        }
        str = null;
        uRLConnection.setRequestProperty("X-Firebase-Client", str);
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }

    public final void zzc(String str) {
        this.zzf = str;
    }
}
