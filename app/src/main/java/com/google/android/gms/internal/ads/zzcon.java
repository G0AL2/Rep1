package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcon extends zzety {
    private final zzevk zza;
    private final zzcop zzb;
    private final zzcon zzc = this;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;
    private final zzgrh zzj;
    private final zzgrh zzk;
    private final zzgrh zzl;
    private final zzgrh zzm;
    private final zzgrh zzn;
    private final zzgrh zzo;
    private final zzgrh zzp;
    private final zzgrh zzq;
    private final zzgrh zzr;
    private final zzgrh zzs;
    private final zzgrh zzt;
    private final zzgrh zzu;
    private final zzgrh zzv;
    private final zzgrh zzw;
    private final zzgrh zzx;
    private final zzgrh zzy;
    private final zzgrh zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcon(zzcop zzcopVar, zzevk zzevkVar, zzcom zzcomVar) {
        zzgrh zzgrhVar;
        zzcsi zzcsiVar;
        zzgrh zzgrhVar2;
        zzgrh zzgrhVar3;
        zzcnz zzcnzVar;
        zzgrh zzgrhVar4;
        zzcsi zzcsiVar2;
        zzgrh zzgrhVar5;
        zzgrh zzgrhVar6;
        zzgrh zzgrhVar7;
        zzcsc zzcscVar;
        zzgrh zzgrhVar8;
        zzcse zzcseVar;
        zzcsg zzcsgVar;
        zzgrh zzgrhVar9;
        zzgrh zzgrhVar10;
        zzgrh zzgrhVar11;
        zzcsk zzcskVar;
        zzgrh zzgrhVar12;
        zzcsa zzcsaVar;
        zzgrh zzgrhVar13;
        zzgrh zzgrhVar14;
        zzgrh zzgrhVar15;
        zzgrh zzgrhVar16;
        this.zzb = zzcopVar;
        this.zza = zzevkVar;
        zzgrhVar = zzcopVar.zzF;
        this.zzd = zzgqt.zzc(new zzfht(zzgrhVar));
        zzevm zzevmVar = new zzevm(zzevkVar);
        this.zze = zzevmVar;
        zzcsiVar = zzcsh.zza;
        zzgrhVar2 = zzcopVar.zzh;
        zzgrhVar3 = zzcopVar.zzn;
        this.zzf = new zzetx(zzcsiVar, zzgrhVar2, zzgrhVar3, zzffa.zza(), zzevmVar);
        zzevl zzevlVar = new zzevl(zzevkVar);
        this.zzg = zzevlVar;
        zzcnzVar = zzcny.zza;
        zzgrhVar4 = zzcopVar.zzh;
        this.zzh = new zzeug(zzcnzVar, zzgrhVar4, zzevlVar, zzffa.zza());
        zzcsiVar2 = zzcsh.zza;
        zzgrhVar5 = zzcopVar.zzh;
        zzgrhVar6 = zzcopVar.zzac;
        zzgrhVar7 = zzcopVar.zzn;
        this.zzi = new zzeur(zzcsiVar2, zzevmVar, zzgrhVar5, zzgrhVar6, zzgrhVar7, zzffa.zza(), zzevlVar);
        zzcscVar = zzcsb.zza;
        zzffa zza = zzffa.zza();
        zzgrhVar8 = zzcopVar.zzh;
        this.zzj = new zzeuv(zzcscVar, zza, zzgrhVar8);
        zzcseVar = zzcsd.zza;
        this.zzk = new zzevc(zzcseVar, zzffa.zza(), zzevlVar);
        zzcsgVar = zzcsf.zza;
        zzgrhVar9 = zzcopVar.zzn;
        zzgrhVar10 = zzcopVar.zzh;
        this.zzl = new zzevj(zzcsgVar, zzgrhVar9, zzgrhVar10);
        this.zzm = new zzewa(zzffa.zza());
        zzevn zzevnVar = new zzevn(zzevkVar);
        this.zzn = zzevnVar;
        zzgrhVar11 = zzcopVar.zzac;
        zzcskVar = zzcsj.zza;
        zzffa zza2 = zzffa.zza();
        zzgrhVar12 = zzcopVar.zzn;
        this.zzo = new zzevw(zzgrhVar11, zzevnVar, zzcskVar, zza2, zzevlVar, zzgrhVar12);
        zzcsaVar = zzcrz.zza;
        zzgrhVar13 = zzcopVar.zzac;
        zzgrhVar14 = zzcopVar.zzn;
        this.zzp = new zzeul(zzevlVar, zzcsaVar, zzgrhVar13, zzgrhVar14, zzffa.zza());
        zzevo zzevoVar = new zzevo(zzevkVar);
        this.zzq = zzevoVar;
        zzgrh zzc = zzgqt.zzc(zzdvg.zza());
        this.zzr = zzc;
        zzgrh zzc2 = zzgqt.zzc(zzdve.zza());
        this.zzs = zzc2;
        zzgrh zzc3 = zzgqt.zzc(zzdvi.zza());
        this.zzt = zzc3;
        zzgrh zzc4 = zzgqt.zzc(zzdvk.zza());
        this.zzu = zzc4;
        zzgqx zzc5 = zzgqy.zzc(4);
        zzc5.zzb(zzffz.GMS_SIGNALS, zzc);
        zzc5.zzb(zzffz.BUILD_URL, zzc2);
        zzc5.zzb(zzffz.HTTP, zzc3);
        zzc5.zzb(zzffz.PRE_PROCESS, zzc4);
        zzgqy zzc6 = zzc5.zzc();
        this.zzv = zzc6;
        zzgrhVar15 = zzcopVar.zzh;
        zzgrh zzc7 = zzgqt.zzc(new zzdvl(zzevoVar, zzgrhVar15, zzffa.zza(), zzc6));
        this.zzw = zzc7;
        zzgre zza3 = zzgrf.zza(0, 1);
        zza3.zza(zzc7);
        zzgrf zzc8 = zza3.zzc();
        this.zzx = zzc8;
        zzfgi zzfgiVar = new zzfgi(zzc8);
        this.zzy = zzfgiVar;
        zzffa zza4 = zzffa.zza();
        zzgrhVar16 = zzcopVar.zzn;
        this.zzz = zzgqt.zzc(new zzfgh(zza4, zzgrhVar16, zzfgiVar));
    }

    private final zzeub zze() {
        zzcei zzceiVar = new zzcei();
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        String zzd = this.zza.zzd();
        zzgrc.zzb(zzd);
        return new zzeub(zzceiVar, zzfvmVar, zzd, this.zza.zzb(), this.zza.zza(), null);
    }

    private final zzeve zzf() {
        zzbhk zzbhkVar = new zzbhk();
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        List zzf = this.zza.zzf();
        zzgrc.zzb(zzf);
        return new zzeve(zzbhkVar, zzfvmVar, zzf, null);
    }

    @Override // com.google.android.gms.internal.ads.zzety
    public final zzetj zza() {
        zzcni zzcniVar;
        zzgrh zzgrhVar;
        zzgrh zzgrhVar2;
        zzcniVar = this.zzb.zza;
        Context zza = zzcniVar.zza();
        zzgrc.zzb(zza);
        zzcef zzcefVar = new zzcef();
        zzceg zzcegVar = new zzceg();
        zzgrhVar = this.zzb.zzaC;
        Object zzb = zzgrhVar.zzb();
        zzeub zze = zze();
        zzeve zzf = zzf();
        zzgqo zza2 = zzgqt.zza(this.zzf);
        zzgqo zza3 = zzgqt.zza(this.zzh);
        zzgqo zza4 = zzgqt.zza(this.zzi);
        zzgqo zza5 = zzgqt.zza(this.zzj);
        zzgqo zza6 = zzgqt.zza(this.zzk);
        zzgqo zza7 = zzgqt.zza(this.zzl);
        zzgqo zza8 = zzgqt.zza(this.zzm);
        zzgqo zza9 = zzgqt.zza(this.zzo);
        zzgqo zza10 = zzgqt.zza(this.zzp);
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        zzfhs zzfhsVar = (zzfhs) this.zzd.zzb();
        zzgrhVar2 = this.zzb.zzV;
        return zzevr.zza(zza, zzcefVar, zzcegVar, zzb, zze, zzf, zza2, zza3, zza4, zza5, zza6, zza7, zza8, zza9, zza10, zzfvmVar, zzfhsVar, (zzdwh) zzgrhVar2.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzety
    public final zzetj zzb() {
        zzcni zzcniVar;
        zzgrh zzgrhVar;
        zzgrh zzgrhVar2;
        zzcni zzcniVar2;
        zzgrh zzgrhVar3;
        zzcni zzcniVar3;
        zzgrh zzgrhVar4;
        zzgrh zzgrhVar5;
        zzgrh zzgrhVar6;
        zzcni zzcniVar4;
        zzcni zzcniVar5;
        zzcni zzcniVar6;
        zzgrh zzgrhVar7;
        zzgrh zzgrhVar8;
        zzgrh zzgrhVar9;
        zzgrh zzgrhVar10;
        zzgrh zzgrhVar11;
        zzgrh zzgrhVar12;
        zzcniVar = this.zzb.zza;
        Context zza = zzcniVar.zza();
        zzgrc.zzb(zza);
        zzfvm zzfvmVar = zzcfv.zza;
        zzgrc.zzb(zzfvmVar);
        zzcef zzcefVar = new zzcef();
        zzgrc.zzb(zzfvmVar);
        String zzc = this.zza.zzc();
        zzgrc.zzb(zzc);
        zzeva zzevaVar = new zzeva(zzcefVar, zzfvmVar, zzc, null);
        zzgrhVar = this.zzb.zzn;
        zzerr zzerrVar = new zzerr(zzevaVar, 0L, (ScheduledExecutorService) zzgrhVar.zzb());
        zzbxz zzbxzVar = new zzbxz();
        zzgrhVar2 = this.zzb.zzn;
        zzcniVar2 = this.zzb.zza;
        Context zza2 = zzcniVar2.zza();
        zzgrc.zzb(zza2);
        zzevh zzevhVar = new zzevh(zzbxzVar, (ScheduledExecutorService) zzgrhVar2.zzb(), zza2, null);
        zzgrhVar3 = this.zzb.zzn;
        zzerr zzerrVar2 = new zzerr(zzevhVar, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzdf)).longValue(), (ScheduledExecutorService) zzgrhVar3.zzb());
        zzcei zzceiVar = new zzcei();
        zzcniVar3 = this.zzb.zza;
        Context zza3 = zzcniVar3.zza();
        zzgrc.zzb(zza3);
        zzgrhVar4 = this.zzb.zzn;
        zzgrc.zzb(zzfvmVar);
        zzetv zzetvVar = new zzetv(zzceiVar, zza3, (ScheduledExecutorService) zzgrhVar4.zzb(), zzfvmVar, this.zza.zza(), null);
        zzgrhVar5 = this.zzb.zzn;
        zzerr zzerrVar3 = new zzerr(zzetvVar, 0L, (ScheduledExecutorService) zzgrhVar5.zzb());
        zzgrc.zzb(zzfvmVar);
        zzevy zzevyVar = new zzevy(zzfvmVar);
        zzgrhVar6 = this.zzb.zzn;
        zzerr zzerrVar4 = new zzerr(zzevyVar, 0L, (ScheduledExecutorService) zzgrhVar6.zzb());
        zzevp zzevpVar = new zzetg() { // from class: com.google.android.gms.internal.ads.zzevp
            @Override // com.google.android.gms.internal.ads.zzetg
            public final /* synthetic */ int zza() {
                return 0;
            }

            @Override // com.google.android.gms.internal.ads.zzetg
            public final zzfvl zzb() {
                return zzfvc.zzi(new zzetf() { // from class: com.google.android.gms.internal.ads.zzevq
                    @Override // com.google.android.gms.internal.ads.zzetf
                    public final void zzf(Object obj) {
                        try {
                            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                        } catch (JSONException unused) {
                        }
                    }
                });
            }
        };
        zzcniVar4 = this.zzb.zza;
        Context zza4 = zzcniVar4.zza();
        zzgrc.zzb(zza4);
        String zzc2 = this.zza.zzc();
        zzgrc.zzb(zzc2);
        zzgrc.zzb(zzfvmVar);
        zzeue zzeueVar = new zzeue(null, zza4, zzc2, zzfvmVar);
        zzbdb zzbdbVar = new zzbdb();
        zzgrc.zzb(zzfvmVar);
        zzcniVar5 = this.zzb.zza;
        Context zza5 = zzcniVar5.zza();
        zzgrc.zzb(zza5);
        zzcei zzceiVar2 = new zzcei();
        int zza6 = this.zza.zza();
        zzcniVar6 = this.zzb.zza;
        Context zza7 = zzcniVar6.zza();
        zzgrc.zzb(zza7);
        zzgrhVar7 = this.zzb.zzac;
        zzcer zzcerVar = (zzcer) zzgrhVar7.zzb();
        zzgrhVar8 = this.zzb.zzn;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzgrhVar8.zzb();
        zzgrc.zzb(zzfvmVar);
        String zzc3 = this.zza.zzc();
        zzgrc.zzb(zzc3);
        zzgrhVar9 = this.zzb.zzaC;
        String zzc4 = this.zza.zzc();
        zzgrc.zzb(zzc4);
        zzbcp zzbcpVar = new zzbcp();
        zzgrhVar10 = this.zzb.zzac;
        zzgrhVar11 = this.zzb.zzn;
        zzgrc.zzb(zzfvmVar);
        zzfro zzm = zzfro.zzm(zzerrVar, zzerrVar2, zzerrVar3, zzerrVar4, zzevpVar, zzeueVar, new zzeut(zzbdbVar, zzfvmVar, zza5, null), zzf(), zze(), new zzeup(zzceiVar2, zza6, zza7, zzcerVar, scheduledExecutorService, zzfvmVar, zzc3, null), (zzetg) zzgrhVar9.zzb(), zzeul.zza(zzc4, zzbcpVar, (zzcer) zzgrhVar10.zzb(), (ScheduledExecutorService) zzgrhVar11.zzb(), zzfvmVar));
        zzfhs zzfhsVar = (zzfhs) this.zzd.zzb();
        zzgrhVar12 = this.zzb.zzV;
        return new zzetj(zza, zzfvmVar, zzm, zzfhsVar, (zzdwh) zzgrhVar12.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzety
    public final zzfgf zzc() {
        return (zzfgf) this.zzz.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzety
    public final zzfhs zzd() {
        return (zzfhs) this.zzd.zzb();
    }
}
