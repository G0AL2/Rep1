package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgiq;
import com.google.android.gms.internal.ads.zzgir;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgiq<MessageType extends zzgir<MessageType, BuilderType>, BuilderType extends zzgiq<MessageType, BuilderType>> implements zzglz {
    @Override // 
    /* renamed from: zzaf */
    public abstract zzgiq clone();

    protected abstract zzgiq zzag(zzgir zzgirVar);

    @Override // com.google.android.gms.internal.ads.zzglz
    public final /* bridge */ /* synthetic */ zzglz zzah(zzgma zzgmaVar) {
        if (zzbh().getClass().isInstance(zzgmaVar)) {
            return zzag((zzgir) zzgmaVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
