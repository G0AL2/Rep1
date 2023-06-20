package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbrp implements zzbrh, zzbrf {
    private final zzcli zza;

    public zzbrp(Context context, zzcfo zzcfoVar, zzaoc zzaocVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzclt {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcli zza = zzclu.zza(context, zzcmx.zza(), "", false, false, null, null, zzcfoVar, null, null, null, zzbdm.zza(), null, null);
        this.zza = zza;
        ((View) zza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        if (zzcfb.zzt()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final void zza(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrk
            @Override // java.lang.Runnable
            public final void run() {
                zzbrp.this.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbre.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbre.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbre.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzf(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrl
            @Override // java.lang.Runnable
            public final void run() {
                zzbrp.this.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzg(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrn
            @Override // java.lang.Runnable
            public final void run() {
                zzbrp.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzh(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbrm
            @Override // java.lang.Runnable
            public final void run() {
                zzbrp.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final boolean zzi() {
        return this.zza.zzaB();
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final zzbso zzj() {
        return new zzbso(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbrh
    public final void zzk(final zzbrv zzbrvVar) {
        this.zza.zzP().zzF(new zzcmu(null) { // from class: com.google.android.gms.internal.ads.zzbri
            @Override // com.google.android.gms.internal.ads.zzcmu
            public final void zza() {
                zzbrv zzbrvVar2 = zzbrv.this;
                final zzbsm zzbsmVar = zzbrvVar2.zza;
                final zzbsl zzbslVar = zzbrvVar2.zzb;
                final zzbrh zzbrhVar = zzbrvVar2.zzc;
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbru
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbsm.this.zzi(zzbslVar, zzbrhVar);
                    }
                }, 10000L);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrq
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbre.zzd(this, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzq(String str, zzbom zzbomVar) {
        this.zza.zzaf(str, new zzbro(this, zzbomVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzr(String str, final zzbom zzbomVar) {
        this.zza.zzax(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbrj
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbom zzbomVar2;
                zzbom zzbomVar3 = zzbom.this;
                zzbom zzbomVar4 = (zzbom) obj;
                if (zzbomVar4 instanceof zzbro) {
                    zzbomVar2 = ((zzbro) zzbomVar4).zzb;
                    return zzbomVar2.equals(zzbomVar3);
                }
                return false;
            }
        });
    }
}
