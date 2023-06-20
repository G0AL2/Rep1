package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdos {
    private final zzdtp zza;
    private final zzdse zzb;
    private final zzcun zzc;
    private final zzdnp zzd;

    public zzdos(zzdtp zzdtpVar, zzdse zzdseVar, zzcun zzcunVar, zzdnp zzdnpVar) {
        this.zza = zzdtpVar;
        this.zzb = zzdseVar;
        this.zzc = zzcunVar;
        this.zzd = zzdnpVar;
    }

    public final View zza() throws zzclt {
        zzcli zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        ((View) zza).setVisibility(8);
        zza.zzaf("/sendMessageToSdk", new zzbom() { // from class: com.google.android.gms.internal.ads.zzdom
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, Map map) {
                zzdos.this.zzb((zzcli) obj, map);
            }
        });
        zza.zzaf("/adMuted", new zzbom() { // from class: com.google.android.gms.internal.ads.zzdon
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, Map map) {
                zzdos.this.zzc((zzcli) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/loadHtml", new zzbom() { // from class: com.google.android.gms.internal.ads.zzdoo
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, final Map map) {
                final zzdos zzdosVar = zzdos.this;
                zzcli zzcliVar = (zzcli) obj;
                zzcliVar.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzdor
                    @Override // com.google.android.gms.internal.ads.zzcmt
                    public final void zza(boolean z10) {
                        zzdos.this.zzd(map, z10);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcliVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcliVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showOverlay", new zzbom() { // from class: com.google.android.gms.internal.ads.zzdop
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, Map map) {
                zzdos.this.zze((zzcli) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/hideOverlay", new zzbom() { // from class: com.google.android.gms.internal.ads.zzdoq
            @Override // com.google.android.gms.internal.ads.zzbom
            public final void zza(Object obj, Map map) {
                zzdos.this.zzf((zzcli) obj, map);
            }
        });
        return (View) zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcli zzcliVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcli zzcliVar, Map map) {
        this.zzd.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcli zzcliVar, Map map) {
        zzcfi.zzi("Showing native ads overlay.");
        zzcliVar.zzH().setVisibility(0);
        this.zzc.zze(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcli zzcliVar, Map map) {
        zzcfi.zzi("Hiding native ads overlay.");
        zzcliVar.zzH().setVisibility(8);
        this.zzc.zze(false);
    }
}
