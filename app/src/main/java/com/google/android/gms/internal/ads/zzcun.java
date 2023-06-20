package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcun implements zzban {
    private zzcli zza;
    private final Executor zzb;
    private final zzctz zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcuc zzg = new zzcuc();

    public zzcun(Executor executor, zzctz zzctzVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzctzVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject zzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcum
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcun.this.zzd(zzb);
                    }
                });
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e10);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzban
    public final void zzc(zzbam zzbamVar) {
        zzcuc zzcucVar = this.zzg;
        zzcucVar.zza = this.zzf ? false : zzbamVar.zzj;
        zzcucVar.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzbamVar;
        if (this.zze) {
            zzg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    public final void zzf(zzcli zzcliVar) {
        this.zza = zzcliVar;
    }
}
