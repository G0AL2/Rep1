package com.google.android.gms.internal.common;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes2.dex */
public final class zzai<E> extends zzag<E> {
    static final zzag<Object> zza = new zzai(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final E get(int i10) {
        zzs.zza(i10, this.zzc, "index");
        E e10 = (E) this.zzb[i10];
        e10.getClass();
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzag, com.google.android.gms.internal.common.zzac
    final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int zzb() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.common.zzac
    public final int zzc() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] zzg() {
        return this.zzb;
    }
}
