package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfoz extends zzfpe {
    final /* synthetic */ zzfpa zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfoz(zzfpa zzfpaVar, zzfpg zzfpgVar, CharSequence charSequence) {
        super(zzfpgVar, charSequence);
        this.zza = zzfpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    final int zzd(int i10) {
        zzfoh zzfohVar = this.zza.zza;
        CharSequence charSequence = ((zzfpe) this).zzb;
        int length = charSequence.length();
        zzfou.zzb(i10, length, "index");
        while (i10 < length) {
            if (zzfohVar.zzb(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
