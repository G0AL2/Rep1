package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
final class zzae<E> extends zzz<E> {
    private final zzag<E> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(zzag<E> zzagVar, int i10) {
        super(zzagVar.size(), i10);
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.common.zzz
    protected final E zza(int i10) {
        return this.zza.get(i10);
    }
}
