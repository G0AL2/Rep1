package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzegs implements zzefd {
    private final Context zza;
    private final zzdky zzb;
    private final Executor zzc;
    private final zzfbk zzd;

    public zzegs(Context context, Executor executor, zzdky zzdkyVar, zzfbk zzfbkVar) {
        this.zza = context;
        this.zzb = zzdkyVar;
        this.zzc = executor;
        this.zzd = zzfbkVar;
    }

    private static String zzd(zzfbl zzfblVar) {
        try {
            return zzfblVar.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(final zzfbx zzfbxVar, final zzfbl zzfblVar) {
        String zzd = zzd(zzfblVar);
        final Uri parse = zzd != null ? Uri.parse(zzd) : null;
        return zzfvc.zzn(zzfvc.zzi(null), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzegq
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzegs.this.zzc(parse, zzfbxVar, zzfblVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbxVar, zzfbl zzfblVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbix.zzg(context) && !TextUtils.isEmpty(zzd(zzfblVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(Uri uri, zzfbx zzfbxVar, zzfbl zzfblVar, Object obj) throws Exception {
        try {
            d a10 = new d.a().a();
            a10.f1796a.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(a10.f1796a, null);
            final zzcga zzcgaVar = new zzcga();
            zzdka zze = this.zzb.zze(new zzcym(zzfbxVar, zzfblVar, null), new zzdkd(new zzdlg() { // from class: com.google.android.gms.internal.ads.zzegr
                @Override // com.google.android.gms.internal.ads.zzdlg
                public final void zza(boolean z10, Context context, zzdcg zzdcgVar) {
                    zzcga zzcgaVar2 = zzcga.this;
                    try {
                        com.google.android.gms.ads.internal.zzt.zzj();
                        com.google.android.gms.ads.internal.overlay.zzm.zza(context, (AdOverlayInfoParcel) zzcgaVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzcgaVar.zzd(new AdOverlayInfoParcel(zzcVar, null, zze.zza(), null, new zzcfo(0, 0, false, false, false), null, null));
            this.zzd.zza();
            return zzfvc.zzi(zze.zzg());
        } catch (Throwable th) {
            zzcfi.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
