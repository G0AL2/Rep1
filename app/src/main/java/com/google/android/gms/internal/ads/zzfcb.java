package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfcb {
    private com.google.android.gms.ads.internal.client.zzl zza;
    private com.google.android.gms.ads.internal.client.zzq zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzff zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbkp zzh;
    private com.google.android.gms.ads.internal.client.zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzbz zzl;
    private zzbqs zzn;
    private zzemh zzq;
    private com.google.android.gms.ads.internal.client.zzcd zzs;
    private int zzm = 1;
    private final zzfbr zzo = new zzfbr();
    private boolean zzp = false;
    private boolean zzr = false;

    public static /* bridge */ /* synthetic */ String zzH(zzfcb zzfcbVar) {
        return zzfcbVar.zzc;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzJ(zzfcb zzfcbVar) {
        return zzfcbVar.zzf;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzK(zzfcb zzfcbVar) {
        return zzfcbVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzL(zzfcb zzfcbVar) {
        return zzfcbVar.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzM(zzfcb zzfcbVar) {
        return zzfcbVar.zzr;
    }

    public static /* bridge */ /* synthetic */ boolean zzN(zzfcb zzfcbVar) {
        return zzfcbVar.zze;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcd zzP(zzfcb zzfcbVar) {
        return zzfcbVar.zzs;
    }

    public static /* bridge */ /* synthetic */ int zza(zzfcb zzfcbVar) {
        return zzfcbVar.zzm;
    }

    public static /* bridge */ /* synthetic */ AdManagerAdViewOptions zzb(zzfcb zzfcbVar) {
        return zzfcbVar.zzj;
    }

    public static /* bridge */ /* synthetic */ PublisherAdViewOptions zzc(zzfcb zzfcbVar) {
        return zzfcbVar.zzk;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzl zzd(zzfcb zzfcbVar) {
        return zzfcbVar.zza;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzq zzf(zzfcb zzfcbVar) {
        return zzfcbVar.zzb;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzw zzh(zzfcb zzfcbVar) {
        return zzfcbVar.zzi;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzbz zzi(zzfcb zzfcbVar) {
        return zzfcbVar.zzl;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzff zzj(zzfcb zzfcbVar) {
        return zzfcbVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbkp zzk(zzfcb zzfcbVar) {
        return zzfcbVar.zzh;
    }

    public static /* bridge */ /* synthetic */ zzbqs zzl(zzfcb zzfcbVar) {
        return zzfcbVar.zzn;
    }

    public static /* bridge */ /* synthetic */ zzemh zzm(zzfcb zzfcbVar) {
        return zzfcbVar.zzq;
    }

    public static /* bridge */ /* synthetic */ zzfbr zzn(zzfcb zzfcbVar) {
        return zzfcbVar.zzo;
    }

    public final zzfcb zzA(zzbkp zzbkpVar) {
        this.zzh = zzbkpVar;
        return this;
    }

    public final zzfcb zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfcb zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfcb zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfcb zzE(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzlVar;
        return this;
    }

    public final zzfcb zzF(com.google.android.gms.ads.internal.client.zzff zzffVar) {
        this.zzd = zzffVar;
        return this;
    }

    public final zzfcd zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfcd(this, null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzfcb zzQ(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
        this.zzs = zzcdVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzl zze() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return this.zzb;
    }

    public final zzfbr zzo() {
        return this.zzo;
    }

    public final zzfcb zzp(zzfcd zzfcdVar) {
        this.zzo.zza(zzfcdVar.zzo.zza);
        this.zza = zzfcdVar.zzd;
        this.zzb = zzfcdVar.zze;
        this.zzs = zzfcdVar.zzr;
        this.zzc = zzfcdVar.zzf;
        this.zzd = zzfcdVar.zza;
        this.zzf = zzfcdVar.zzg;
        this.zzg = zzfcdVar.zzh;
        this.zzh = zzfcdVar.zzi;
        this.zzi = zzfcdVar.zzj;
        zzq(zzfcdVar.zzl);
        zzD(zzfcdVar.zzm);
        this.zzp = zzfcdVar.zzp;
        this.zzq = zzfcdVar.zzc;
        this.zzr = zzfcdVar.zzq;
        return this;
    }

    public final zzfcb zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfcb zzr(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb = zzqVar;
        return this;
    }

    public final zzfcb zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfcb zzt(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi = zzwVar;
        return this;
    }

    public final zzfcb zzu(zzemh zzemhVar) {
        this.zzq = zzemhVar;
        return this;
    }

    public final zzfcb zzv(zzbqs zzbqsVar) {
        this.zzn = zzbqsVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzff(false, true, false);
        return this;
    }

    public final zzfcb zzw(boolean z10) {
        this.zzp = z10;
        return this;
    }

    public final zzfcb zzx(boolean z10) {
        this.zzr = true;
        return this;
    }

    public final zzfcb zzy(boolean z10) {
        this.zze = z10;
        return this;
    }

    public final zzfcb zzz(int i10) {
        this.zzm = i10;
        return this;
    }
}
