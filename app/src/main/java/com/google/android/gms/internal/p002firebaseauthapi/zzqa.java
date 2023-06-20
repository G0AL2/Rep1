package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zze;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqa  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzqa implements zzum {
    final /* synthetic */ zzul zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Boolean zzd;
    final /* synthetic */ zze zze;
    final /* synthetic */ zztg zzf;
    final /* synthetic */ zzwe zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqa(zzrl zzrlVar, zzul zzulVar, String str, String str2, Boolean bool, zze zzeVar, zztg zztgVar, zzwe zzweVar) {
        this.zza = zzulVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = zzeVar;
        this.zzf = zztgVar;
        this.zzg = zzweVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzul
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzum
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb = ((zzvv) obj).zzb();
        if (zzb != null && !zzb.isEmpty()) {
            int i10 = 0;
            zzvx zzvxVar = (zzvx) zzb.get(0);
            zzwm zzl = zzvxVar.zzl();
            List zzc = zzl != null ? zzl.zzc() : null;
            if (zzc != null && !zzc.isEmpty()) {
                if (TextUtils.isEmpty(this.zzb)) {
                    ((zzwk) zzc.get(0)).zzh(this.zzc);
                } else {
                    while (true) {
                        if (i10 >= zzc.size()) {
                            break;
                        } else if (((zzwk) zzc.get(i10)).zzf().equals(this.zzb)) {
                            ((zzwk) zzc.get(i10)).zzh(this.zzc);
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            zzvxVar.zzh(this.zzd.booleanValue());
            zzvxVar.zze(this.zze);
            this.zzf.zzi(this.zzg, zzvxVar);
            return;
        }
        this.zza.zza("No users.");
    }
}
