package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbc {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzbbr zze;
    private final zzbbz zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzbbc(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = z10;
        this.zze = new zzbbr(i13);
        this.zzf = new zzbbz(i14, i15, i16);
    }

    private final void zzp(String str, boolean z10, float f10, float f11, float f12, float f13) {
        if (str == null || str.length() < this.zzc) {
            return;
        }
        synchronized (this.zzg) {
            this.zzh.add(str);
            this.zzk += str.length();
            if (z10) {
                this.zzi.add(str);
                this.zzj.add(new zzbbn(f10, f11, f12, f13, this.zzi.size() - 1));
            }
        }
    }

    private static final String zzq(ArrayList arrayList, int i10) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            sb2.append((String) arrayList.get(i11));
            sb2.append(' ');
            i11++;
            if (sb2.length() > 100) {
                break;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        String sb3 = sb2.toString();
        return sb3.length() < 100 ? sb3 : sb3.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbbc) {
            if (obj == this) {
                return true;
            }
            String str = ((zzbbc) obj).zzo;
            return str != null && str.equals(this.zzo);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        int i10 = this.zzl;
        int i11 = this.zzn;
        int i12 = this.zzk;
        String zzq = zzq(this.zzh, 100);
        String zzq2 = zzq(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        return "ActivityContent fetchId: " + i10 + " score:" + i11 + " total_length:" + i12 + "\n text: " + zzq + "\n viewableText" + zzq2 + "\n signture: " + str + "\n viewableSignture: " + str2 + "\n viewableSignatureForVertical: " + str3;
    }

    @VisibleForTesting
    final int zza(int i10, int i11) {
        return this.zzd ? this.zzb : (i10 * this.zza) + (i11 * this.zzb);
    }

    public final int zzb() {
        return this.zzn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final int zzc() {
        return this.zzk;
    }

    public final String zzd() {
        return this.zzo;
    }

    public final String zze() {
        return this.zzp;
    }

    public final String zzf() {
        return this.zzq;
    }

    public final void zzg() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzh() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzi() {
        synchronized (this.zzg) {
            this.zzn -= 100;
        }
    }

    public final void zzj(int i10) {
        this.zzl = i10;
    }

    public final void zzk(String str, boolean z10, float f10, float f11, float f12, float f13) {
        zzp(str, z10, f10, f11, f12, f13);
    }

    public final void zzl(String str, boolean z10, float f10, float f11, float f12, float f13) {
        zzp(str, z10, f10, f11, f12, f13);
        synchronized (this.zzg) {
            if (this.zzm < 0) {
                zzcfi.zze("ActivityContent: negative number of WebViews.");
            }
            zzm();
        }
    }

    public final void zzm() {
        synchronized (this.zzg) {
            int zza = zza(this.zzk, this.zzl);
            if (zza > this.zzn) {
                this.zzn = zza;
                if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                    this.zzo = this.zze.zza(this.zzh);
                    this.zzp = this.zze.zza(this.zzi);
                }
                if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN()) {
                    this.zzq = this.zzf.zza(this.zzi, this.zzj);
                }
            }
        }
    }

    public final void zzn() {
        synchronized (this.zzg) {
            int zza = zza(this.zzk, this.zzl);
            if (zza > this.zzn) {
                this.zzn = zza;
            }
        }
    }

    public final boolean zzo() {
        boolean z10;
        synchronized (this.zzg) {
            z10 = this.zzm == 0;
        }
        return z10;
    }
}
