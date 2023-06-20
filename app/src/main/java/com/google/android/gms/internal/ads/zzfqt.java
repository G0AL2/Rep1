package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfqt extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    zzfqt() {
        zzo(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzA() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzb(zzfqt zzfqtVar) {
        int i10 = zzfqtVar.zzg;
        zzfqtVar.zzg = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzg(zzfqt zzfqtVar, int i10) {
        return zzfqtVar.zzA()[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzj(zzfqt zzfqtVar, int i10) {
        return zzfqtVar.zzB()[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzk(zzfqt zzfqtVar) {
        Object obj = zzfqtVar.zze;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzfqt zzfqtVar, int i10, Object obj) {
        zzfqtVar.zzB()[i10] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzu() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv(Object obj) {
        if (zzq()) {
            return -1;
        }
        int zzb = zzfrb.zzb(obj);
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzc = zzfqu.zzc(obj2, zzb & zzu);
        if (zzc != 0) {
            int i10 = ~zzu;
            int i11 = zzb & i10;
            do {
                int i12 = zzc - 1;
                int i13 = zzz()[i12];
                if ((i13 & i10) == i11 && zzfoq.zza(obj, zzA()[i12])) {
                    return i12;
                }
                zzc = i13 & zzu;
            } while (zzc != 0);
            return -1;
        }
        return -1;
    }

    private final int zzw(int i10, int i11, int i12, int i13) {
        Object zzd2 = zzfqu.zzd(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            zzfqu.zze(zzd2, i12 & i14, i13 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        for (int i15 = 0; i15 <= i10; i15++) {
            int zzc = zzfqu.zzc(obj, i15);
            while (zzc != 0) {
                int i16 = zzc - 1;
                int i17 = zzz[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int zzc2 = zzfqu.zzc(zzd2, i19);
                zzfqu.zze(zzd2, i19, zzc);
                zzz[i16] = ((~i14) & i18) | (zzc2 & i14);
                zzc = i17 & i10;
            }
        }
        this.zze = zzd2;
        zzy(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzx(Object obj) {
        if (zzq()) {
            return zzd;
        }
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzb = zzfqu.zzb(obj, null, zzu, obj2, zzz(), zzA(), null);
        if (zzb == -1) {
            return zzd;
        }
        Object obj3 = zzB()[zzb];
        zzp(zzb, zzu);
        this.zzg--;
        zzn();
        return obj3;
    }

    private final void zzy(int i10) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzz() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzq()) {
            return;
        }
        zzn();
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzfto.zzb(size(), 3, 1073741823);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzA(), 0, this.zzg, (Object) null);
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzz(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsKey(obj);
        }
        return zzv(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl == null) {
            for (int i10 = 0; i10 < this.zzg; i10++) {
                if (zzfoq.zza(obj, zzB()[i10])) {
                    return true;
                }
            }
            return false;
        }
        return zzl.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set == null) {
            zzfqo zzfqoVar = new zzfqo(this);
            this.zzi = zzfqoVar;
            return zzfqoVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzv = zzv(obj);
        if (zzv == -1) {
            return null;
        }
        return zzB()[zzv];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set == null) {
            zzfqq zzfqqVar = new zzfqq(this);
            this.zzh = zzfqqVar;
            return zzfqqVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzq()) {
            zzfou.zzi(zzq(), "Arrays already allocated");
            int i10 = this.zzf;
            int max = Math.max(i10 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzfqu.zzd(max2);
            zzy(max2 - 1);
            this.zza = new int[i10];
            this.zzb = new Object[i10];
            this.zzc = new Object[i10];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int i11 = this.zzg;
        int i12 = i11 + 1;
        int zzb = zzfrb.zzb(obj);
        int zzu = zzu();
        int i13 = zzb & zzu;
        Object obj3 = this.zze;
        obj3.getClass();
        int zzc = zzfqu.zzc(obj3, i13);
        if (zzc != 0) {
            int i14 = ~zzu;
            int i15 = zzb & i14;
            int i16 = 0;
            while (true) {
                int i17 = zzc - 1;
                int i18 = zzz[i17];
                int i19 = i18 & i14;
                if (i19 == i15 && zzfoq.zza(obj, zzA[i17])) {
                    Object obj4 = zzB[i17];
                    zzB[i17] = obj2;
                    return obj4;
                }
                int i20 = i18 & zzu;
                i16++;
                if (i20 != 0) {
                    zzc = i20;
                } else if (i16 >= 9) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                    int zze = zze();
                    while (zze >= 0) {
                        linkedHashMap.put(zzA()[zze], zzB()[zze]);
                        zze = zzf(zze);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzn();
                    return linkedHashMap.put(obj, obj2);
                } else if (i12 > zzu) {
                    zzu = zzw(zzu, zzfqu.zza(zzu), zzb, i11);
                } else {
                    zzz[i17] = (i12 & zzu) | i19;
                }
            }
        } else if (i12 > zzu) {
            zzu = zzw(zzu, zzfqu.zza(zzu), zzb, i11);
        } else {
            Object obj5 = this.zze;
            obj5.getClass();
            zzfqu.zze(obj5, i13, i12);
        }
        int length = zzz().length;
        if (i12 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzz(), min);
            this.zzb = Arrays.copyOf(zzA(), min);
            this.zzc = Arrays.copyOf(zzB(), min);
        }
        zzz()[i11] = (~zzu) & zzb;
        zzA()[i11] = obj;
        zzB()[i11] = obj2;
        this.zzg = i12;
        zzn();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzx = zzx(obj);
        if (zzx == zzd) {
            return null;
        }
        return zzx;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        return zzl != null ? zzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection == null) {
            zzfqs zzfqsVar = new zzfqs(this);
            this.zzj = zzfqsVar;
            return zzfqsVar;
        }
        return collection;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zze() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzf(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.zzg) {
            return i11;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzn() {
        this.zzf += 32;
    }

    final void zzo(int i10) {
        this.zzf = zzfto.zzb(8, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzp(int i10, int i11) {
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int size = size() - 1;
        if (i10 < size) {
            Object obj2 = zzA[size];
            zzA[i10] = obj2;
            zzB[i10] = zzB[size];
            zzA[size] = null;
            zzB[size] = null;
            zzz[i10] = zzz[size];
            zzz[size] = 0;
            int zzb = zzfrb.zzb(obj2) & i11;
            int zzc = zzfqu.zzc(obj, zzb);
            int i12 = size + 1;
            if (zzc == i12) {
                zzfqu.zze(obj, zzb, i10 + 1);
                return;
            }
            while (true) {
                int i13 = zzc - 1;
                int i14 = zzz[i13];
                int i15 = i14 & i11;
                if (i15 == i12) {
                    zzz[i13] = ((i10 + 1) & i11) | (i14 & (~i11));
                    return;
                }
                zzc = i15;
            }
        } else {
            zzA[i10] = null;
            zzB[i10] = null;
            zzz[i10] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzq() {
        return this.zze == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqt(int i10) {
        zzo(8);
    }
}
