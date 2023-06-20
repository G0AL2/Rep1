package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgkr extends zzgis implements RandomAccess, zzgkv, zzgmh {
    private static final zzgkr zza;
    private int[] zzb;
    private int zzc;

    static {
        zzgkr zzgkrVar = new zzgkr(new int[0], 0);
        zza = zzgkrVar;
        zzgkrVar.zzb();
    }

    zzgkr() {
        this(new int[10], 0);
    }

    public static zzgkr zzf() {
        return zza;
    }

    private final String zzi(int i10) {
        int i11 = this.zzc;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzj(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzi(i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgis, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        zzbM();
        if (i10 >= 0 && i10 <= (i11 = this.zzc)) {
            int[] iArr = this.zzb;
            if (i11 < iArr.length) {
                System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
            } else {
                int[] iArr2 = new int[((i11 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i10);
                System.arraycopy(this.zzb, i10, iArr2, i10 + 1, this.zzc - i10);
                this.zzb = iArr2;
            }
            this.zzb[i10] = intValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzi(i10));
    }

    @Override // com.google.android.gms.internal.ads.zzgis, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzbM();
        zzgla.zze(collection);
        if (!(collection instanceof zzgkr)) {
            return super.addAll(collection);
        }
        zzgkr zzgkrVar = (zzgkr) collection;
        int i10 = zzgkrVar.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.zzb;
            if (i12 > iArr.length) {
                this.zzb = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(zzgkrVar.zzb, 0, this.zzb, this.zzc, zzgkrVar.zzc);
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

    @Override // com.google.android.gms.internal.ads.zzgis, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgkr)) {
            return super.equals(obj);
        }
        zzgkr zzgkrVar = (zzgkr) obj;
        if (this.zzc != zzgkrVar.zzc) {
            return false;
        }
        int[] iArr = zzgkrVar.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzj(i10);
        return Integer.valueOf(this.zzb[i10]);
    }

    @Override // com.google.android.gms.internal.ads.zzgis, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + this.zzb[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i10 = this.zzc;
            for (int i11 = 0; i11 < i10; i11++) {
                if (this.zzb[i11] == intValue) {
                    return i11;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgis, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        int i11;
        zzbM();
        zzj(i10);
        int[] iArr = this.zzb;
        int i12 = iArr[i10];
        if (i10 < this.zzc - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i11 - i10) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        zzbM();
        if (i11 >= i10) {
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i11, iArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.ads.zzgis, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zzbM();
        zzj(i10);
        int[] iArr = this.zzb;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final int zze(int i10) {
        zzj(i10);
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzgkz
    /* renamed from: zzg */
    public final zzgkv zzd(int i10) {
        if (i10 >= this.zzc) {
            return new zzgkr(Arrays.copyOf(this.zzb, i10), this.zzc);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgkv
    public final void zzh(int i10) {
        zzbM();
        int i11 = this.zzc;
        int[] iArr = this.zzb;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i12 = this.zzc;
        this.zzc = i12 + 1;
        iArr3[i12] = i10;
    }

    private zzgkr(int[] iArr, int i10) {
        this.zzb = iArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgis, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Integer) obj).intValue());
        return true;
    }
}
