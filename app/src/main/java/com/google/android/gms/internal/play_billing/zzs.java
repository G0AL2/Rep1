package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes2.dex */
public final class zzs extends zzo {
    private final zzu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzs(zzu zzuVar, int i10) {
        super(zzuVar.size(), i10);
        this.zza = zzuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzo
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
