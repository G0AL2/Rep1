package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpz  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzpz implements zzum {
    final /* synthetic */ zzwu zza;
    final /* synthetic */ zzvx zzb;
    final /* synthetic */ zztg zzc;
    final /* synthetic */ zzwe zzd;
    final /* synthetic */ zzul zze;
    final /* synthetic */ zzrl zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpz(zzrl zzrlVar, zzwu zzwuVar, zzvx zzvxVar, zztg zztgVar, zzwe zzweVar, zzul zzulVar) {
        this.zzf = zzrlVar;
        this.zza = zzwuVar;
        this.zzb = zzvxVar;
        this.zzc = zztgVar;
        this.zzd = zzweVar;
        this.zze = zzulVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zze.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzwv zzwvVar = (zzwv) obj;
        if (this.zza.zzn("EMAIL")) {
            this.zzb.zzg(null);
        } else {
            zzwu zzwuVar = this.zza;
            if (zzwuVar.zzk() != null) {
                this.zzb.zzg(zzwuVar.zzk());
            }
        }
        if (this.zza.zzn("DISPLAY_NAME")) {
            this.zzb.zzf(null);
        } else {
            zzwu zzwuVar2 = this.zza;
            if (zzwuVar2.zzj() != null) {
                this.zzb.zzf(zzwuVar2.zzj());
            }
        }
        if (this.zza.zzn("PHOTO_URL")) {
            this.zzb.zzj(null);
        } else {
            zzwu zzwuVar3 = this.zza;
            if (zzwuVar3.zzm() != null) {
                this.zzb.zzj(zzwuVar3.zzm());
            }
        }
        if (!TextUtils.isEmpty(this.zza.zzl())) {
            this.zzb.zzi(Base64Utils.encode("redacted".getBytes()));
        }
        List zzf = zzwvVar.zzf();
        if (zzf == null) {
            zzf = new ArrayList();
        }
        this.zzb.zzk(zzf);
        zztg zztgVar = this.zzc;
        zzwe zzweVar = this.zzd;
        Preconditions.checkNotNull(zzweVar);
        Preconditions.checkNotNull(zzwvVar);
        String zzd = zzwvVar.zzd();
        String zze = zzwvVar.zze();
        if (!TextUtils.isEmpty(zzd) && !TextUtils.isEmpty(zze)) {
            zzweVar = new zzwe(zze, zzd, Long.valueOf(zzwvVar.zzb()), zzweVar.zzg());
        }
        zztgVar.zzi(zzweVar, this.zzb);
    }
}
