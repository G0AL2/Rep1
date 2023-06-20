package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxx  reason: invalid package */
/* loaded from: classes2.dex */
final class zzxx extends zzxt implements RandomAccess, zzaax {
    private static final zzxx zza;
    private boolean[] zzb;
    private int zzc;

    static {
        zzxx zzxxVar = new zzxx(new boolean[0], 0);
        zza = zzxxVar;
        zzxxVar.zzb();
    }

    zzxx() {
        this(new boolean[10], 0);
    }

    private final String zzf(int i10) {
        int i11 = this.zzc;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzg(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzf(i10));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i10 >= 0 && i10 <= (i11 = this.zzc)) {
            boolean[] zArr = this.zzb;
            if (i11 < zArr.length) {
                System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
            } else {
                boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i10);
                System.arraycopy(this.zzb, i10, zArr2, i10 + 1, this.zzc - i10);
                this.zzb = zArr2;
            }
            this.zzb[i10] = booleanValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzf(i10));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        zzzr.zze(collection);
        if (!(collection instanceof zzxx)) {
            return super.addAll(collection);
        }
        zzxx zzxxVar = (zzxx) collection;
        int i10 = zzxxVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.zzb;
            if (i12 > zArr.length) {
                this.zzb = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(zzxxVar.zzb, 0, this.zzb, this.zzc, zzxxVar.zzc);
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
        if (!(obj instanceof zzxx)) {
            return super.equals(obj);
        }
        zzxx zzxxVar = (zzxx) obj;
        if (this.zzc != zzxxVar.zzc) {
            return false;
        }
        boolean[] zArr = zzxxVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzg(i10);
        return Boolean.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + zzzr.zza(this.zzb[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i10 = this.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.zzb[i11] == booleanValue) {
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
        zzg(i10);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            boolean[] zArr = this.zzb;
            System.arraycopy(zArr, i11, zArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzg(i10);
        boolean[] zArr = this.zzb;
        boolean z10 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzq
    public final /* bridge */ /* synthetic */ zzzq zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzxx(Arrays.copyOf(this.zzb, i10), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z10) {
        zza();
        int i10 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        zArr3[i11] = z10;
    }

    private zzxx(boolean[] zArr, int i10) {
        this.zzb = zArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
