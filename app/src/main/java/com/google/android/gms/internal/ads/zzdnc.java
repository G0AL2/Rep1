package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.collection.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import fm.castbox.mediation.model.NetworkName;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdnc extends zzcxx {
    public static final zzfrj zzc = zzfrj.zzt("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzbap zzA;
    private final Executor zzd;
    private final zzdnh zze;
    private final zzdnp zzf;
    private final zzdoh zzg;
    private final zzdnm zzh;
    private final zzdns zzi;
    private final zzgqo zzj;
    private final zzgqo zzk;
    private final zzgqo zzl;
    private final zzgqo zzm;
    private final zzgqo zzn;
    private zzdpc zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzccv zzs;
    private final zzaoc zzt;
    private final zzcfo zzu;
    private final Context zzv;
    private final zzdne zzw;
    private final zzemk zzx;
    private final Map zzy;
    private final List zzz;

    public zzdnc(zzcxw zzcxwVar, Executor executor, zzdnh zzdnhVar, zzdnp zzdnpVar, zzdoh zzdohVar, zzdnm zzdnmVar, zzdns zzdnsVar, zzgqo zzgqoVar, zzgqo zzgqoVar2, zzgqo zzgqoVar3, zzgqo zzgqoVar4, zzgqo zzgqoVar5, zzccv zzccvVar, zzaoc zzaocVar, zzcfo zzcfoVar, Context context, zzdne zzdneVar, zzemk zzemkVar, zzbap zzbapVar) {
        super(zzcxwVar);
        this.zzd = executor;
        this.zze = zzdnhVar;
        this.zzf = zzdnpVar;
        this.zzg = zzdohVar;
        this.zzh = zzdnmVar;
        this.zzi = zzdnsVar;
        this.zzj = zzgqoVar;
        this.zzk = zzgqoVar2;
        this.zzl = zzgqoVar3;
        this.zzm = zzgqoVar4;
        this.zzn = zzgqoVar5;
        this.zzs = zzccvVar;
        this.zzt = zzaocVar;
        this.zzu = zzcfoVar;
        this.zzv = context;
        this.zzw = zzdneVar;
        this.zzx = zzemkVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzbapVar;
    }

    public static boolean zzP(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzib)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        long zzt = com.google.android.gms.ads.internal.util.zzs.zzt(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzic)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzR(Map map) {
        if (map == null) {
            return null;
        }
        zzfrj zzfrjVar = zzc;
        int size = zzfrjVar.size();
        int i10 = 0;
        while (i10 < size) {
            WeakReference weakReference = (WeakReference) map.get((String) zzfrjVar.get(i10));
            i10++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    private final synchronized void zzS(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzp(view, map, map2);
        this.zzq = true;
    }

    /* renamed from: zzT */
    public final synchronized void zzt(zzdpc zzdpcVar) {
        Iterator<String> keys;
        View view;
        zzany zzc2;
        if (this.zzp) {
            return;
        }
        this.zzo = zzdpcVar;
        this.zzg.zze(zzdpcVar);
        this.zzf.zzx(zzdpcVar.zzf(), zzdpcVar.zzm(), zzdpcVar.zzn(), zzdpcVar, zzdpcVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcf)).booleanValue() && (zzc2 = this.zzt.zzc()) != null) {
            zzc2.zzn(zzdpcVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbw)).booleanValue()) {
            zzfbl zzfblVar = this.zzb;
            if (zzfblVar.zzam && (keys = zzfblVar.zzal.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                    this.zzy.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        zzbao zzbaoVar = new zzbao(this.zzv, view);
                        this.zzz.add(zzbaoVar);
                        zzbaoVar.zzc(new zzdnb(this, next));
                    }
                }
            }
        }
        if (zzdpcVar.zzi() != null) {
            zzdpcVar.zzi().zzc(this.zzs);
        }
    }

    /* renamed from: zzU */
    public final void zzu(zzdpc zzdpcVar) {
        this.zzf.zzy(zzdpcVar.zzf(), zzdpcVar.zzl());
        if (zzdpcVar.zzh() != null) {
            zzdpcVar.zzh().setClickable(false);
            zzdpcVar.zzh().removeAllViews();
        }
        if (zzdpcVar.zzi() != null) {
            zzdpcVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzh(zzdnc zzdncVar) {
        try {
            zzdnh zzdnhVar = zzdncVar.zze;
            int zzc2 = zzdnhVar.zzc();
            if (zzc2 == 1) {
                if (zzdncVar.zzi.zzb() != null) {
                    zzdncVar.zzq("Google", true);
                    zzdncVar.zzi.zzb().zze((zzbls) zzdncVar.zzj.zzb());
                }
            } else if (zzc2 == 2) {
                if (zzdncVar.zzi.zza() != null) {
                    zzdncVar.zzq("Google", true);
                    zzdncVar.zzi.zza().zze((zzblq) zzdncVar.zzk.zzb());
                }
            } else if (zzc2 == 3) {
                if (zzdncVar.zzi.zzd(zzdnhVar.zzy()) != null) {
                    if (zzdncVar.zze.zzr() != null) {
                        zzdncVar.zzq("Google", true);
                    }
                    zzdncVar.zzi.zzd(zzdncVar.zze.zzy()).zze((zzblv) zzdncVar.zzn.zzb());
                }
            } else if (zzc2 == 6) {
                if (zzdncVar.zzi.zzf() != null) {
                    zzdncVar.zzq("Google", true);
                    zzdncVar.zzi.zzf().zze((zzbmy) zzdncVar.zzl.zzb());
                }
            } else if (zzc2 != 7) {
                zzcfi.zzg("Wrong native template id!");
            } else {
                zzdns zzdnsVar = zzdncVar.zzi;
                if (zzdnsVar.zzg() != null) {
                    zzdnsVar.zzg().zzg((zzbqv) zzdncVar.zzm.zzb());
                }
            }
        } catch (RemoteException e10) {
            zzcfi.zzh("RemoteException when notifyAdLoad is called", e10);
        }
    }

    public final synchronized void zzA() {
        zzdpc zzdpcVar = this.zzo;
        if (zzdpcVar == null) {
            zzcfi.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z10 = zzdpcVar instanceof zzdob;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmy
            @Override // java.lang.Runnable
            public final void run() {
                zzdnc.this.zzs(z10);
            }
        });
    }

    public final synchronized void zzB() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzq();
    }

    public final void zzC(View view) {
        zzdnh zzdnhVar = this.zze;
        IObjectWrapper zzu = zzdnhVar.zzu();
        zzcli zzq = zzdnhVar.zzq();
        if (!this.zzh.zzd() || zzu == null || zzq == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzc(zzu, view);
    }

    public final synchronized void zzD(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzr(view, motionEvent, view2);
    }

    public final synchronized void zzE(Bundle bundle) {
        this.zzf.zzs(bundle);
    }

    public final synchronized void zzF(View view) {
        this.zzf.zzt(view);
    }

    public final synchronized void zzG() {
        this.zzf.zzu();
    }

    public final synchronized void zzH(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.zzf.zzv(zzcqVar);
    }

    public final synchronized void zzI(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.zzx.zza(zzdeVar);
    }

    public final synchronized void zzJ(zzbmv zzbmvVar) {
        this.zzf.zzw(zzbmvVar);
    }

    public final synchronized void zzK(final zzdpc zzdpcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbu)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmz
                @Override // java.lang.Runnable
                public final void run() {
                    zzdnc.this.zzt(zzdpcVar);
                }
            });
        } else {
            zzt(zzdpcVar);
        }
    }

    public final synchronized void zzL(final zzdpc zzdpcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbu)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmv
                @Override // java.lang.Runnable
                public final void run() {
                    zzdnc.this.zzu(zzdpcVar);
                }
            });
        } else {
            zzu(zzdpcVar);
        }
    }

    public final boolean zzM() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzN() {
        return this.zzf.zzz();
    }

    public final boolean zzO() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzQ(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzA = this.zzf.zzA(bundle);
        this.zzq = zzA;
        return zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcxx
    public final synchronized void zzV() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdna
            @Override // java.lang.Runnable
            public final void run() {
                zzdnc.this.zzr();
            }
        });
        super.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcxx
    public final void zzW() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmw
            @Override // java.lang.Runnable
            public final void run() {
                zzdnc.zzh(zzdnc.this);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdnp zzdnpVar = this.zzf;
            zzdnpVar.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmx
                @Override // java.lang.Runnable
                public final void run() {
                    zzdnp.this.zzo();
                }
            });
        }
        super.zzW();
    }

    public final zzdne zza() {
        return this.zzw;
    }

    public final String zzd() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzf(View view, Map map, Map map2) {
        return this.zzf.zzd(view, map, map2);
    }

    public final synchronized JSONObject zzg(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2);
    }

    public final void zzi(View view) {
        IObjectWrapper zzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeb)).booleanValue() && zzfil.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(zzu);
            if (unwrap instanceof zzfin) {
                ((zzfin) unwrap).zzb(view, zzfit.NOT_VISIBLE, "Ad overlay");
            }
        }
    }

    public final synchronized void zzk() {
        this.zzf.zzg();
    }

    public final void zzq(String str, boolean z10) {
        String str2;
        zzbxq zzbxqVar;
        zzbxr zzbxrVar;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return;
        }
        zzdnh zzdnhVar = this.zze;
        zzcli zzq = zzdnhVar.zzq();
        zzcli zzr = zzdnhVar.zzr();
        if (zzq == null && zzr == null) {
            zzcfi.zzj("Omid display and video webview are null. Skipping initialization.");
            return;
        }
        boolean z11 = false;
        boolean z12 = zzq != null;
        boolean z13 = zzr != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzef)).booleanValue()) {
            this.zzh.zza();
            int zzb = this.zzh.zza().zzb();
            int i10 = zzb - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    zzcfi.zzj("Unknown omid media type: " + (zzb != 1 ? zzb != 2 ? NetworkName.UNKNOWN : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return;
                } else if (zzq == null) {
                    zzcfi.zzj("Omid media type was display but there was no display webview.");
                    return;
                } else {
                    z11 = true;
                    z13 = false;
                }
            } else if (zzr == null) {
                zzcfi.zzj("Omid media type was video but there was no video webview.");
                return;
            } else {
                z13 = true;
            }
        } else {
            z11 = z12;
        }
        if (z11) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzq = zzr;
        }
        String str3 = str2;
        zzq.zzI();
        if (!com.google.android.gms.ads.internal.zzt.zzh().zze(this.zzv)) {
            zzcfi.zzj("Failed to initialize omid in InternalNativeAd");
            return;
        }
        zzcfo zzcfoVar = this.zzu;
        String str4 = zzcfoVar.zzb + "." + zzcfoVar.zzc;
        if (z13) {
            zzbxqVar = zzbxq.VIDEO;
            zzbxrVar = zzbxr.DEFINED_BY_JAVASCRIPT;
        } else {
            zzbxqVar = zzbxq.NATIVE_DISPLAY;
            if (this.zze.zzc() == 3) {
                zzbxrVar = zzbxr.UNSPECIFIED;
            } else {
                zzbxrVar = zzbxr.ONE_PIXEL;
            }
        }
        IObjectWrapper zzb2 = com.google.android.gms.ads.internal.zzt.zzh().zzb(str4, zzq.zzI(), "", "javascript", str3, str, zzbxrVar, zzbxqVar, this.zzb.zzan);
        if (zzb2 == null) {
            zzcfi.zzj("Failed to create omid session in InternalNativeAd");
            return;
        }
        this.zze.zzaa(zzb2);
        zzq.zzar(zzb2);
        if (z13) {
            com.google.android.gms.ads.internal.zzt.zzh().zzc(zzb2, zzr.zzH());
            this.zzr = true;
        }
        if (z10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzd(zzb2);
            zzq.zzd("onSdkLoaded", new a());
        }
    }

    public final /* synthetic */ void zzr() {
        this.zzf.zzh();
        this.zze.zzG();
    }

    public final /* synthetic */ void zzs(boolean z10) {
        this.zzf.zzn(this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z10);
    }

    public final synchronized void zzv(View view, Map map, Map map2, boolean z10) {
        if (this.zzq) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbw)).booleanValue() && this.zzb.zzam) {
            for (String str : this.zzy.keySet()) {
                if (!((Boolean) this.zzy.get(str)).booleanValue()) {
                    return;
                }
            }
        }
        if (!z10) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcV)).booleanValue() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    View view2 = (View) ((WeakReference) entry.getValue()).get();
                    if (view2 != null && zzP(view2)) {
                        zzS(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View zzR = zzR(map);
        if (zzR == null) {
            zzS(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcW)).booleanValue()) {
            if (zzP(zzR)) {
                zzS(view, map, map2);
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcX)).booleanValue()) {
            Rect rect = new Rect();
            if (zzR.getGlobalVisibleRect(rect, null) && zzR.getHeight() == rect.height() && zzR.getWidth() == rect.width()) {
                zzS(view, map, map2);
                return;
            }
            return;
        }
        zzS(view, map, map2);
    }

    public final synchronized void zzw(com.google.android.gms.ads.internal.client.zzcu zzcuVar) {
        this.zzf.zzi(zzcuVar);
    }

    public final synchronized void zzx(View view, View view2, Map map, Map map2, boolean z10) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzj(view, view2, map, map2, z10);
        if (this.zzr) {
            zzdnh zzdnhVar = this.zze;
            if (zzdnhVar.zzr() != null) {
                zzdnhVar.zzr().zzd("onSdkAdUserInteractionClick", new a());
            }
        }
    }

    public final synchronized void zzy(String str) {
        this.zzf.zzk(str);
    }

    public final synchronized void zzz(Bundle bundle) {
        this.zzf.zzl(bundle);
    }
}
