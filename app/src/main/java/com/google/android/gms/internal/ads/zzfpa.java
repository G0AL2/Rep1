package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfpa implements zzfpf {
    final /* synthetic */ zzfoh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpa(zzfoh zzfohVar) {
        this.zza = zzfohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpf
    public final /* synthetic */ Iterator zza(zzfpg zzfpgVar, CharSequence charSequence) {
        return new zzfoz(this, zzfpgVar, charSequence);
    }
}
