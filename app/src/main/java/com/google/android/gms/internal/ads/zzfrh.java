package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfrh extends zzfpl {
    private final zzfrj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrh(zzfrj zzfrjVar, int i10) {
        super(zzfrjVar.size(), i10);
        this.zza = zzfrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
