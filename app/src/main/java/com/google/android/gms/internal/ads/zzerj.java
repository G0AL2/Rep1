package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzerj implements zzetg {
    private final zzfvm zza;
    private final zzfcd zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzerj(zzfvm zzfvmVar, zzfcd zzfcdVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfvmVar;
        this.zzb = zzfcdVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzerk zzc(zzerj zzerjVar) {
        final ArrayList arrayList = zzerjVar.zzb.zzg;
        return arrayList == null ? new zzerk() { // from class: com.google.android.gms.internal.ads.zzerf
            @Override // com.google.android.gms.internal.ads.zzetf
            public final void zzf(Object obj) {
                Bundle bundle = (Bundle) obj;
            }
        } : arrayList.isEmpty() ? new zzerk() { // from class: com.google.android.gms.internal.ads.zzerg
            @Override // com.google.android.gms.internal.ads.zzetf
            public final void zzf(Object obj) {
                ((Bundle) obj).putInt("native_version", 0);
            }
        } : new zzerk() { // from class: com.google.android.gms.internal.ads.zzerh
            @Override // com.google.android.gms.internal.ads.zzetf
            public final void zzf(Object obj) {
                zzerj.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeri
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerj.zzc(zzerj.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x00e2, code lost:
        if (r9 == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void zzd(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzerj.zzd(java.util.ArrayList, android.os.Bundle):void");
    }
}
