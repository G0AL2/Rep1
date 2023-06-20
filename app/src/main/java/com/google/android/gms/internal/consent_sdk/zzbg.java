package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzbg extends WebView {
    private final Handler zza;
    private final zzbm zzb;
    private boolean zzc;

    public zzbg(zzbi zzbiVar, Handler handler, zzbm zzbmVar) {
        super(zzbiVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzbmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzc(zzbg zzbgVar, String str) {
        return str != null && str.startsWith("consent://");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zze(zzbg zzbgVar, boolean z10) {
        zzbgVar.zzc = true;
        return true;
    }

    public final void zzb(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append("(");
        sb2.append(str2);
        sb2.append(");");
        final String sb3 = sb2.toString();
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbd
            @Override // java.lang.Runnable
            public final void run() {
                zzce.zza(zzbg.this, sb3);
            }
        });
    }
}
