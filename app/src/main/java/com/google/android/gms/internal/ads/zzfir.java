package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfir extends zzfin {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzfip zzb;
    private final zzfio zzc;
    private zzfkm zze;
    private zzfjp zzf;
    private final List zzd = new ArrayList();
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi = UUID.randomUUID().toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfir(zzfio zzfioVar, zzfip zzfipVar) {
        this.zzc = zzfioVar;
        this.zzb = zzfipVar;
        zzk(null);
        if (zzfipVar.zzd() != zzfiq.HTML && zzfipVar.zzd() != zzfiq.JAVASCRIPT) {
            this.zzf = new zzfjs(zzfipVar.zzi(), null);
        } else {
            this.zzf = new zzfjq(zzfipVar.zza());
        }
        this.zzf.zzj();
        zzfjc.zza().zzd(this);
        zzfji.zza().zzd(this.zzf.zza(), zzfioVar.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfkm(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfin
    public final void zzb(View view, zzfit zzfitVar, String str) {
        zzfjf zzfjfVar;
        if (this.zzh) {
            return;
        }
        if (zza.matcher("Ad overlay").matches()) {
            Iterator it = this.zzd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zzfjfVar = null;
                    break;
                }
                zzfjfVar = (zzfjf) it.next();
                if (zzfjfVar.zzb().get() == view) {
                    break;
                }
            }
            if (zzfjfVar == null) {
                this.zzd.add(new zzfjf(view, zzfitVar, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
    }

    @Override // com.google.android.gms.internal.ads.zzfin
    public final void zzc() {
        if (this.zzh) {
            return;
        }
        this.zze.clear();
        if (!this.zzh) {
            this.zzd.clear();
        }
        this.zzh = true;
        zzfji.zza().zzc(this.zzf.zza());
        zzfjc.zza().zze(this);
        this.zzf.zzc();
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfin
    public final void zzd(View view) {
        if (this.zzh || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzf.zzb();
        Collection<zzfir> zzc = zzfjc.zza().zzc();
        if (zzc == null || zzc.size() <= 0) {
            return;
        }
        for (zzfir zzfirVar : zzc) {
            if (zzfirVar != this && zzfirVar.zzf() == view) {
                zzfirVar.zze.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfin
    public final void zze() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        zzfjc.zza().zzf(this);
        this.zzf.zzh(zzfjj.zzb().zza());
        this.zzf.zzf(this, this.zzb);
    }

    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzfjp zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }
}
