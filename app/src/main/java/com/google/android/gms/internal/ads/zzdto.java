package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdto {
    private final zzdbr zza;
    private final zzdje zzb;
    private final zzdda zzc;
    private final zzddn zzd;
    private final zzddz zze;
    private final zzdgm zzf;
    private final Executor zzg;
    private final zzdjb zzh;
    private final zzcud zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzccj zzk;
    private final zzaoc zzl;
    private final zzdgd zzm;
    private final zzees zzn;
    private final zzfii zzo;
    private final zzdwh zzp;
    private final zzfgp zzq;

    public zzdto(zzdbr zzdbrVar, zzdda zzddaVar, zzddn zzddnVar, zzddz zzddzVar, zzdgm zzdgmVar, Executor executor, zzdjb zzdjbVar, zzcud zzcudVar, com.google.android.gms.ads.internal.zzb zzbVar, zzccj zzccjVar, zzaoc zzaocVar, zzdgd zzdgdVar, zzees zzeesVar, zzfii zzfiiVar, zzdwh zzdwhVar, zzfgp zzfgpVar, zzdje zzdjeVar) {
        this.zza = zzdbrVar;
        this.zzc = zzddaVar;
        this.zzd = zzddnVar;
        this.zze = zzddzVar;
        this.zzf = zzdgmVar;
        this.zzg = executor;
        this.zzh = zzdjbVar;
        this.zzi = zzcudVar;
        this.zzj = zzbVar;
        this.zzk = zzccjVar;
        this.zzl = zzaocVar;
        this.zzm = zzdgdVar;
        this.zzn = zzeesVar;
        this.zzo = zzfiiVar;
        this.zzp = zzdwhVar;
        this.zzq = zzfgpVar;
        this.zzb = zzdjeVar;
    }

    public static final zzfvl zzj(zzcli zzcliVar, String str, String str2) {
        final zzcga zzcgaVar = new zzcga();
        zzcliVar.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzdtm
            @Override // com.google.android.gms.internal.ads.zzcmt
            public final void zza(boolean z10) {
                zzcga zzcgaVar2 = zzcga.this;
                if (z10) {
                    zzcgaVar2.zzd(null);
                } else {
                    zzcgaVar2.zze(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zzcliVar.zzad(str, str2, null);
        return zzcgaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzbD(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcli zzcliVar, zzcli zzcliVar2, Map map) {
        this.zzi.zzh(zzcliVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        this.zzj.zza();
        return false;
    }

    public final void zzi(final zzcli zzcliVar, boolean z10, zzbop zzbopVar) {
        zzany zzc;
        zzcliVar.zzP().zzL(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdtf
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                zzdto.this.zzc();
            }
        }, this.zzd, this.zze, new zzbno() { // from class: com.google.android.gms.internal.ads.zzdtg
            @Override // com.google.android.gms.internal.ads.zzbno
            public final void zzbD(String str, String str2) {
                zzdto.this.zzd(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzw() { // from class: com.google.android.gms.internal.ads.zzdth
            @Override // com.google.android.gms.ads.internal.overlay.zzw
            public final void zzg() {
                zzdto.this.zze();
            }
        }, z10, zzbopVar, this.zzj, new zzdtn(this), this.zzk, this.zzn, this.zzo, this.zzp, this.zzq, null, this.zzb);
        zzcliVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdti
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdto.this.zzh(view, motionEvent);
                return false;
            }
        });
        zzcliVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdtj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdto.this.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcf)).booleanValue() && (zzc = this.zzl.zzc()) != null) {
            zzc.zzn((View) zzcliVar);
        }
        this.zzh.zzj(zzcliVar, this.zzg);
        this.zzh.zzj(new zzban() { // from class: com.google.android.gms.internal.ads.zzdtk
            @Override // com.google.android.gms.internal.ads.zzban
            public final void zzc(zzbam zzbamVar) {
                zzcmv zzP = zzcli.this.zzP();
                Rect rect = zzbamVar.zzd;
                zzP.zzo(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza((View) zzcliVar);
        zzcliVar.zzaf("/trackActiveViewUnit", new zzbom() { // from class: com.google.android.gms.internal.ads.zzdtl
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, Map map) {
                zzdto.this.zzg(zzcliVar, (zzcli) obj, map);
            }
        });
        this.zzi.zzi(zzcliVar);
    }
}
