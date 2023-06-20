package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahi implements zzyr {
    public static final zzyy zza = new zzyy() { // from class: com.google.android.gms.internal.ads.zzahf
        @Override // com.google.android.gms.internal.ads.zzyy
        public final zzyr[] zza() {
            zzyy zzyyVar = zzahi.zza;
            return new zzyr[]{new zzahi(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzyy
        public final /* synthetic */ zzyr[] zzb(Uri uri, Map map) {
            return zzyx.zza(this, uri, map);
        }
    };
    private final List zzb;
    private final zzdy zzc;
    private final SparseIntArray zzd;
    private final zzahl zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzahe zzi;
    private zzahd zzj;
    private zzyu zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzahi() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0194, code lost:
        if (r1 == false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzys r19, com.google.android.gms.internal.ads.zzzr r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahi.zza(com.google.android.gms.internal.ads.zzys, com.google.android.gms.internal.ads.zzzr):int");
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzk = zzyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j10, long j11) {
        zzahd zzahdVar;
        int size = this.zzb.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzee zzeeVar = (zzee) this.zzb.get(i10);
            if (zzeeVar.zze() != -9223372036854775807L) {
                long zzc = zzeeVar.zzc();
                if (zzc != -9223372036854775807L) {
                    if (zzc != 0) {
                        if (zzc == j11) {
                        }
                    }
                }
            }
            zzeeVar.zzf(j11);
        }
        if (j11 != 0 && (zzahdVar = this.zzj) != null) {
            zzahdVar.zzd(j11);
        }
        this.zzc.zzC(0);
        this.zzd.clear();
        for (int i11 = 0; i11 < this.zzf.size(); i11++) {
            ((zzahn) this.zzf.valueAt(i11)).zzc();
        }
        this.zzp = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzys r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzdy r0 = r6.zzc
            byte[] r0 = r0.zzH()
            com.google.android.gms.internal.ads.zzyl r7 = (com.google.android.gms.internal.ads.zzyl) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.zzm(r0, r1, r2, r1)
            r2 = 0
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L2b
            r3 = 0
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r2 = r2 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r2, r1)
            r7 = 1
            return r7
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahi.zzd(com.google.android.gms.internal.ads.zzys):boolean");
    }

    public zzahi(int i10) {
        this(1, 0, 112800);
    }

    public zzahi(int i10, int i11, int i12) {
        zzee zzeeVar = new zzee(0L);
        this.zze = new zzafx(0);
        this.zzb = Collections.singletonList(zzeeVar);
        this.zzc = new zzdy(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzahe(112800);
        this.zzk = zzyu.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.zzf.put(sparseArray2.keyAt(i13), (zzahn) sparseArray2.valueAt(i13));
        }
        this.zzf.put(0, new zzaha(new zzahg(this)));
    }
}
