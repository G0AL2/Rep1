package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzekd implements zzefd {
    private final zzeff zza;
    private final zzefl zzb;
    private final zzfgf zzc;
    private final zzfvm zzd;

    public zzekd(zzfgf zzfgfVar, zzfvm zzfvmVar, zzeff zzeffVar, zzefl zzeflVar) {
        this.zzc = zzfgfVar;
        this.zzd = zzfvmVar;
        this.zzb = zzeflVar;
        this.zza = zzeffVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public static final String zze(String str, int i10) {
        return "Error from: " + str + ", code: " + i10;
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(final zzfbx zzfbxVar, final zzfbl zzfblVar) {
        final zzefg zzefgVar;
        Iterator it = zzfblVar.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzefgVar = null;
                break;
            }
            try {
                zzefgVar = this.zza.zza((String) it.next(), zzfblVar.zzw);
                break;
            } catch (zzfci unused) {
            }
        }
        if (zzefgVar == null) {
            return zzfvc.zzh(new zzeif("Unable to instantiate mediation adapter class."));
        }
        zzcga zzcgaVar = new zzcga();
        zzefgVar.zzc.zza(new zzekc(this, zzefgVar, zzcgaVar));
        if (zzfblVar.zzN) {
            Bundle bundle = zzfbxVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfgf zzfgfVar = this.zzc;
        return zzffp.zzd(new zzffj() { // from class: com.google.android.gms.internal.ads.zzeka
            @Override // com.google.android.gms.internal.ads.zzffj
            public final void zza() {
                zzekd.this.zzd(zzfbxVar, zzfblVar, zzefgVar);
            }
        }, this.zzd, zzffz.ADAPTER_LOAD_AD_SYN, zzfgfVar).zzb(zzffz.ADAPTER_LOAD_AD_ACK).zzd(zzcgaVar).zzb(zzffz.ADAPTER_WRAP_ADAPTER).zze(new zzffi() { // from class: com.google.android.gms.internal.ads.zzekb
            @Override // com.google.android.gms.internal.ads.zzffi
            public final Object zza(Object obj) {
                return zzekd.this.zzc(zzfbxVar, zzfblVar, zzefgVar, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbxVar, zzfbl zzfblVar) {
        return !zzfblVar.zzu.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar, Void r42) throws Exception {
        return this.zzb.zza(zzfbxVar, zzfblVar, zzefgVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzfbx zzfbxVar, zzfbl zzfblVar, zzefg zzefgVar) throws Exception {
        this.zzb.zzb(zzfbxVar, zzfblVar, zzefgVar);
    }
}
