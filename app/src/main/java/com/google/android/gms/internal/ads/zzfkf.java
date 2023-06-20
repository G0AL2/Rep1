package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfkf implements zzfjk {
    private static final zzfkf zza = new zzfkf();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfkb();
    private static final Runnable zze = new zzfkc();
    private int zzg;
    private long zzk;
    private final List zzf = new ArrayList();
    private final zzfjy zzi = new zzfjy();
    private final zzfjm zzh = new zzfjm();
    private final zzfjz zzj = new zzfjz(new zzfki());

    zzfkf() {
    }

    public static zzfkf zzd() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzg(zzfkf zzfkfVar) {
        zzfkfVar.zzg = 0;
        zzfkfVar.zzk = System.nanoTime();
        zzfkfVar.zzi.zzi();
        long nanoTime = System.nanoTime();
        zzfjl zza2 = zzfkfVar.zzh.zza();
        if (zzfkfVar.zzi.zze().size() > 0) {
            Iterator it = zzfkfVar.zzi.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zzfjt.zza(0, 0, 0, 0);
                View zza4 = zzfkfVar.zzi.zza(str);
                zzfjl zzb2 = zzfkfVar.zzh.zzb();
                String zzc2 = zzfkfVar.zzi.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfjt.zzb(zza5, str);
                    zzfjt.zze(zza5, zzc2);
                    zzfjt.zzc(zza3, zza5);
                }
                zzfjt.zzh(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfkfVar.zzj.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfkfVar.zzi.zzf().size() > 0) {
            JSONObject zza6 = zzfjt.zza(0, 0, 0, 0);
            zzfkfVar.zzk(null, zza2, zza6, 1);
            zzfjt.zzh(zza6);
            zzfkfVar.zzj.zzd(zza6, zzfkfVar.zzi.zzf(), nanoTime);
        } else {
            zzfkfVar.zzj.zzb();
        }
        zzfkfVar.zzi.zzg();
        long nanoTime2 = System.nanoTime() - zzfkfVar.zzk;
        if (zzfkfVar.zzf.size() > 0) {
            for (zzfke zzfkeVar : zzfkfVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfkeVar.zzb();
                if (zzfkeVar instanceof zzfkd) {
                    ((zzfkd) zzfkeVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfjl zzfjlVar, JSONObject jSONObject, int i10) {
        zzfjlVar.zzb(view, jSONObject, this, i10 == 1);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjk
    public final void zza(View view, zzfjl zzfjlVar, JSONObject jSONObject) {
        int zzj;
        if (zzfjw.zzb(view) != null || (zzj = this.zzi.zzj(view)) == 3) {
            return;
        }
        JSONObject zza2 = zzfjlVar.zza(view);
        zzfjt.zzc(jSONObject, zza2);
        String zzd2 = this.zzi.zzd(view);
        if (zzd2 != null) {
            zzfjt.zzb(zza2, zzd2);
            this.zzi.zzh();
        } else {
            zzfjx zzb2 = this.zzi.zzb(view);
            if (zzb2 != null) {
                zzfjt.zzd(zza2, zzb2);
            }
            zzk(view, zzfjlVar, zza2, zzj);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfka(this));
    }
}
