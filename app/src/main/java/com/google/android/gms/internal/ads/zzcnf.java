package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzcnf implements zzcsm {
    private static zzcnf zza;

    private static synchronized zzcnf zzC(Context context, zzbua zzbuaVar, int i10, boolean z10, int i11, zzcoh zzcohVar) {
        synchronized (zzcnf.class) {
            zzcnf zzcnfVar = zza;
            if (zzcnfVar != null) {
                return zzcnfVar;
            }
            zzbhz.zzc(context);
            zzfcw zzd = zzfcw.zzd(context);
            zzcfo zzc = zzd.zzc(221908000, false, i11);
            zzd.zze(zzbuaVar);
            zzcpr zzcprVar = new zzcpr(null);
            zzcng zzcngVar = new zzcng();
            zzcngVar.zzd(zzc);
            zzcngVar.zzc(context);
            zzcprVar.zzb(new zzcni(zzcngVar, null));
            zzcprVar.zzc(new zzcre(zzcohVar, null));
            zzcnf zza2 = zzcprVar.zza();
            com.google.android.gms.ads.internal.zzt.zzo().zzr(context, zzc);
            com.google.android.gms.ads.internal.zzt.zzc().zzi(context);
            com.google.android.gms.ads.internal.zzt.zzp().zzj(context);
            com.google.android.gms.ads.internal.zzt.zzp().zzi(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzb().zzd(context);
            com.google.android.gms.ads.internal.zzt.zzv().zzb(context);
            zzcdo.zzd(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfg)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzas)).booleanValue()) {
                    zzbdm zzbdmVar = new zzbdm(new zzbds(context));
                    zzedo zzedoVar = new zzedo(new zzedk(context), zza2.zzz());
                    com.google.android.gms.ads.internal.zzt.zzp();
                    new zzeek(context, zzc, zzbdmVar, zzedoVar, UUID.randomUUID().toString(), zza2.zzx()).zzb(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzcnf zza(Context context, zzbua zzbuaVar, int i10) {
        return zzC(context, zzbuaVar, 221908000, false, i10, new zzcoh());
    }

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzcrp zzb();

    public abstract zzcux zzc();

    public abstract zzcvi zzd();

    public abstract zzcwr zze();

    public abstract zzdei zzf();

    public abstract zzdkx zzg();

    public abstract zzdlt zzh();

    public abstract zzdsx zzi();

    public abstract zzdxp zzj();

    public abstract zzdzb zzk();

    public abstract zzefa zzl();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzc zzm();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzg zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzaa zzo();

    @Override // com.google.android.gms.internal.ads.zzcsm
    public final zzety zzp(zzbzv zzbzvVar, int i10) {
        return zzq(new zzevk(zzbzvVar, i10));
    }

    protected abstract zzety zzq(zzevk zzevkVar);

    public abstract zzewj zzr();

    public abstract zzexx zzs();

    public abstract zzezq zzt();

    public abstract zzfbe zzu();

    public abstract zzfcp zzv();

    public abstract zzfcz zzw();

    public abstract zzfgp zzx();

    public abstract zzfhu zzy();

    public abstract zzfvm zzz();
}
