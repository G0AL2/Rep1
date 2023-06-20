package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzmo implements zzms {
    public static final zzfpj zza = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzmm
        @Override // com.google.android.gms.internal.ads.zzfpj
        public final Object zza() {
            return zzmo.zzc();
        }
    };
    private static final Random zzb = new Random();
    private final zzch zzc;
    private final zzcf zzd;
    private final HashMap zze;
    private final zzfpj zzf;
    private zzmr zzg;
    private zzci zzh;
    private String zzi;

    public zzmo() {
        throw null;
    }

    public static /* synthetic */ String zzc() {
        return zzl();
    }

    private final zzmn zzk(int i10, zzsa zzsaVar) {
        long j10;
        int i11;
        zzsa zzsaVar2;
        zzsa zzsaVar3;
        zzmn zzmnVar = null;
        long j11 = Long.MAX_VALUE;
        for (zzmn zzmnVar2 : this.zze.values()) {
            zzmnVar2.zzg(i10, zzsaVar);
            if (zzmnVar2.zzj(i10, zzsaVar)) {
                j10 = zzmnVar2.zzd;
                if (j10 == -1 || j10 < j11) {
                    zzmnVar = zzmnVar2;
                    j11 = j10;
                } else if (i11 == 0) {
                    int i12 = zzeg.zza;
                    zzsaVar2 = zzmnVar.zze;
                    if (zzsaVar2 != null) {
                        zzsaVar3 = zzmnVar2.zze;
                        if (zzsaVar3 != null) {
                            zzmnVar = zzmnVar2;
                        }
                    }
                }
            }
        }
        if (zzmnVar == null) {
            String zzl = zzl();
            zzmn zzmnVar3 = new zzmn(this, zzl, i10, zzsaVar);
            this.zze.put(zzl, zzmnVar3);
            return zzmnVar3;
        }
        return zzmnVar;
    }

    public static String zzl() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzm(zzki zzkiVar) {
        String str;
        long j10;
        zzsa zzsaVar;
        zzsa zzsaVar2;
        zzsa zzsaVar3;
        String unused;
        String unused2;
        if (zzkiVar.zzb.zzo()) {
            this.zzi = null;
            return;
        }
        zzmn zzmnVar = (zzmn) this.zze.get(this.zzi);
        zzmn zzk = zzk(zzkiVar.zzc, zzkiVar.zzd);
        str = zzk.zzb;
        this.zzi = str;
        zzh(zzkiVar);
        zzsa zzsaVar4 = zzkiVar.zzd;
        if (zzsaVar4 == null || !zzsaVar4.zzb()) {
            return;
        }
        if (zzmnVar != null) {
            j10 = zzmnVar.zzd;
            if (j10 == zzkiVar.zzd.zzd) {
                zzsaVar = zzmnVar.zze;
                if (zzsaVar != null) {
                    zzsaVar2 = zzmnVar.zze;
                    if (zzsaVar2.zzb == zzkiVar.zzd.zzb) {
                        zzsaVar3 = zzmnVar.zze;
                        if (zzsaVar3.zzc == zzkiVar.zzd.zzc) {
                            return;
                        }
                    }
                }
            }
        }
        zzsa zzsaVar5 = zzkiVar.zzd;
        unused = zzk(zzkiVar.zzc, new zzsa(zzsaVar5.zza, zzsaVar5.zzd)).zzb;
        unused2 = zzk.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final synchronized String zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final synchronized String zze(zzci zzciVar, zzsa zzsaVar) {
        String str;
        str = zzk(zzciVar.zzn(zzsaVar.zza, this.zzd).zzd, zzsaVar).zzb;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final synchronized void zzf(zzki zzkiVar) {
        boolean z10;
        zzmr zzmrVar;
        String str;
        this.zzi = null;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmn zzmnVar = (zzmn) it.next();
            it.remove();
            z10 = zzmnVar.zzf;
            if (z10 && (zzmrVar = this.zzg) != null) {
                str = zzmnVar.zzb;
                zzmrVar.zzd(zzkiVar, str, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzg(zzmr zzmrVar) {
        this.zzg = zzmrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x003d, code lost:
        if (r1 < r3) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzh(com.google.android.gms.internal.ads.zzki r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzmr r0 = r9.zzg     // Catch: java.lang.Throwable -> Lcb
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzci r0 = r10.zzb     // Catch: java.lang.Throwable -> Lcb
            boolean r0 = r0.zzo()     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto L10
            monitor-exit(r9)
            return
        L10:
            java.util.HashMap r0 = r9.zze     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r9.zzi     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzmn r0 = (com.google.android.gms.internal.ads.zzmn) r0     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzsa r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto L41
            if (r0 == 0) goto L41
            long r1 = com.google.android.gms.internal.ads.zzmn.zzb(r0)     // Catch: java.lang.Throwable -> Lcb
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L33
            int r0 = com.google.android.gms.internal.ads.zzmn.zza(r0)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lcb
            if (r0 != r1) goto L3f
            goto L41
        L33:
            com.google.android.gms.internal.ads.zzsa r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            long r1 = r1.zzd     // Catch: java.lang.Throwable -> Lcb
            long r3 = com.google.android.gms.internal.ads.zzmn.zzb(r0)     // Catch: java.lang.Throwable -> Lcb
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L41
        L3f:
            monitor-exit(r9)
            return
        L41:
            int r0 = r10.zzc     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzsa r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzmn r0 = r9.zzk(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r9.zzi     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto L53
            java.lang.String r1 = com.google.android.gms.internal.ads.zzmn.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
            r9.zzi = r1     // Catch: java.lang.Throwable -> Lcb
        L53:
            com.google.android.gms.internal.ads.zzsa r1 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            r2 = 1
            if (r1 == 0) goto L9d
            boolean r3 = r1.zzb()     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto L9d
            com.google.android.gms.internal.ads.zzsa r3 = new com.google.android.gms.internal.ads.zzsa     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r1.zza     // Catch: java.lang.Throwable -> Lcb
            long r5 = r1.zzd     // Catch: java.lang.Throwable -> Lcb
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> Lcb
            r3.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> Lcb
            int r1 = r10.zzc     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzmn r1 = r9.zzk(r1, r3)     // Catch: java.lang.Throwable -> Lcb
            boolean r3 = com.google.android.gms.internal.ads.zzmn.zzi(r1)     // Catch: java.lang.Throwable -> Lcb
            if (r3 != 0) goto L9d
            com.google.android.gms.internal.ads.zzmn.zzf(r1, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzci r3 = r10.zzb     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzsa r4 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r4.zza     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzcf r5 = r9.zzd     // Catch: java.lang.Throwable -> Lcb
            r3.zzn(r4, r5)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzcf r3 = r9.zzd     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzsa r4 = r10.zzd     // Catch: java.lang.Throwable -> Lcb
            int r4 = r4.zzb     // Catch: java.lang.Throwable -> Lcb
            r3.zzh(r4)     // Catch: java.lang.Throwable -> Lcb
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzeg.zzz(r3)     // Catch: java.lang.Throwable -> Lcb
            long r7 = com.google.android.gms.internal.ads.zzeg.zzz(r3)     // Catch: java.lang.Throwable -> Lcb
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzmn.zzd(r1)     // Catch: java.lang.Throwable -> Lcb
        L9d:
            boolean r1 = com.google.android.gms.internal.ads.zzmn.zzi(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto La9
            com.google.android.gms.internal.ads.zzmn.zzf(r0, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzmn.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
        La9:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzmn.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = r9.zzi     // Catch: java.lang.Throwable -> Lcb
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto Lc9
            boolean r1 = com.google.android.gms.internal.ads.zzmn.zzh(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto Lc9
            com.google.android.gms.internal.ads.zzmn.zze(r0, r2)     // Catch: java.lang.Throwable -> Lcb
            com.google.android.gms.internal.ads.zzmr r1 = r9.zzg     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = com.google.android.gms.internal.ads.zzmn.zzd(r0)     // Catch: java.lang.Throwable -> Lcb
            r1.zzc(r10, r0)     // Catch: java.lang.Throwable -> Lcb
            monitor-exit(r9)
            return
        Lc9:
            monitor-exit(r9)
            return
        Lcb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmo.zzh(com.google.android.gms.internal.ads.zzki):void");
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final synchronized void zzi(zzki zzkiVar, int i10) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        Objects.requireNonNull(this.zzg);
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmn zzmnVar = (zzmn) it.next();
            if (zzmnVar.zzk(zzkiVar)) {
                it.remove();
                z10 = zzmnVar.zzf;
                if (z10) {
                    str = zzmnVar.zzb;
                    boolean equals = str.equals(this.zzi);
                    boolean z12 = false;
                    if (i10 == 0 && equals) {
                        z11 = zzmnVar.zzg;
                        if (z11) {
                            z12 = true;
                        }
                    }
                    if (equals) {
                        this.zzi = null;
                    }
                    zzmr zzmrVar = this.zzg;
                    str2 = zzmnVar.zzb;
                    zzmrVar.zzd(zzkiVar, str2, z12);
                }
            }
        }
        zzm(zzkiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final synchronized void zzj(zzki zzkiVar) {
        boolean z10;
        String str;
        String str2;
        Objects.requireNonNull(this.zzg);
        zzci zzciVar = this.zzh;
        this.zzh = zzkiVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmn zzmnVar = (zzmn) it.next();
            if (!zzmnVar.zzl(zzciVar, this.zzh) || zzmnVar.zzk(zzkiVar)) {
                it.remove();
                z10 = zzmnVar.zzf;
                if (z10) {
                    str = zzmnVar.zzb;
                    if (str.equals(this.zzi)) {
                        this.zzi = null;
                    }
                    zzmr zzmrVar = this.zzg;
                    str2 = zzmnVar.zzb;
                    zzmrVar.zzd(zzkiVar, str2, false);
                }
            }
        }
        zzm(zzkiVar);
    }

    public zzmo(zzfpj zzfpjVar) {
        this.zzf = zzfpjVar;
        this.zzc = new zzch();
        this.zzd = new zzcf();
        this.zze = new HashMap();
        this.zzh = zzci.zza;
    }
}
