package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaf  reason: invalid package */
/* loaded from: classes2.dex */
final class zzaaf extends zzxt implements RandomAccess, zzaax {
    private static final zzaaf zza;
    private long[] zzb;
    private int zzc;

    static {
        zzaaf zzaafVar = new zzaaf(new long[0], 0);
        zza = zzaafVar;
        zzaafVar.zzb();
    }

    zzaaf() {
        this(new long[10], 0);
    }

    private final String zzg(int i10) {
        int i11 = this.zzc;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzh(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        zza();
        if (i10 >= 0 && i10 <= (i11 = this.zzc)) {
            long[] jArr = this.zzb;
            if (i11 < jArr.length) {
                System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
            } else {
                long[] jArr2 = new long[((i11 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i10);
                System.arraycopy(this.zzb, i10, jArr2, i10 + 1, this.zzc - i10);
                this.zzb = jArr2;
            }
            this.zzb[i10] = longValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzg(i10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzzr.zze(collection);
        if (!(collection instanceof zzaaf)) {
            return super.addAll(collection);
        }
        zzaaf zzaafVar = (zzaaf) collection;
        int i10 = zzaafVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.zzb;
            if (i12 > jArr.length) {
                this.zzb = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(zzaafVar.zzb, 0, this.zzb, this.zzc, zzaafVar.zzc);
            this.zzc = i12;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaaf)) {
            return super.equals(obj);
        }
        zzaaf zzaafVar = (zzaaf) obj;
        if (this.zzc != zzaafVar.zzc) {
            return false;
        }
        long[] jArr = zzaafVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzh(i10);
        return Long.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + zzzr.zzc(this.zzb[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i10 = this.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.zzb[i11] == longValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        zza();
        zzh(i10);
        long[] jArr = this.zzb;
        long j10 = jArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            long[] jArr = this.zzb;
            System.arraycopy(jArr, i11, jArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzh(i10);
        long[] jArr = this.zzb;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzq
    public final /* bridge */ /* synthetic */ zzzq zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzaaf(Arrays.copyOf(this.zzb, i10), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i10) {
        zzh(i10);
        return this.zzb[i10];
    }

    public final void zzf(long j10) {
        zza();
        int i10 = this.zzc;
        long[] jArr = this.zzb;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.zzb = jArr2;
        }
        long[] jArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        jArr3[i11] = j10;
    }

    private zzaaf(long[] jArr, int i10) {
        this.zzb = jArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
