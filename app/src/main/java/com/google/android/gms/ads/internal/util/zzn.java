package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzgri;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzn implements zzbiv {
    final /* synthetic */ zzbix zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzs zzsVar, zzbix zzbixVar, Context context, Uri uri) {
        this.zza = zzbixVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final void zza() {
        d a10 = new d.a(this.zza.zza()).a();
        a10.f1796a.setPackage(zzgri.zza(this.zzb));
        a10.a(this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}
