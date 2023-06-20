package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaac  reason: invalid package */
/* loaded from: classes2.dex */
final class zzaac extends zzaae {
    private zzaac() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaac(zzaab zzaabVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaae
    public final List zza(Object obj, long j10) {
        zzzq zzzqVar = (zzzq) zzacd.zzf(obj, j10);
        if (zzzqVar.zzc()) {
            return zzzqVar;
        }
        int size = zzzqVar.size();
        zzzq zzd = zzzqVar.zzd(size == 0 ? 10 : size + size);
        zzacd.zzs(obj, j10, zzd);
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaae
    public final void zzb(Object obj, long j10) {
        ((zzzq) zzacd.zzf(obj, j10)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaae
    public final void zzc(Object obj, Object obj2, long j10) {
        zzzq zzzqVar = (zzzq) zzacd.zzf(obj, j10);
        zzzq zzzqVar2 = (zzzq) zzacd.zzf(obj2, j10);
        int size = zzzqVar.size();
        int size2 = zzzqVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzzqVar.zzc()) {
                zzzqVar = zzzqVar.zzd(size2 + size);
            }
            zzzqVar.addAll(zzzqVar2);
        }
        if (size > 0) {
            zzzqVar2 = zzzqVar;
        }
        zzacd.zzs(obj, j10, zzzqVar2);
    }
}
