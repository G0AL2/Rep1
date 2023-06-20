package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzesg implements zzetg {
    final String zza;
    private final zzfvm zzb;
    private final ScheduledExecutorService zzc;
    private final zzele zzd;
    private final Context zze;
    private final zzfcd zzf;
    private final zzela zzg;
    private final zzduc zzh;

    public zzesg(zzfvm zzfvmVar, ScheduledExecutorService scheduledExecutorService, String str, zzele zzeleVar, Context context, zzfcd zzfcdVar, zzela zzelaVar, zzduc zzducVar) {
        this.zzb = zzfvmVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzeleVar;
        this.zze = context;
        this.zzf = zzfcdVar;
        this.zzg = zzelaVar;
        this.zzh = zzducVar;
    }

    public static /* synthetic */ zzfvl zzc(zzesg zzesgVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzim)).booleanValue()) {
            str = zzesgVar.zzf.zzf.toLowerCase(Locale.ROOT);
        } else {
            str = zzesgVar.zzf.zzf;
        }
        Map zza = zzesgVar.zzd.zza(zzesgVar.zza, str);
        final ArrayList arrayList = new ArrayList();
        Iterator it = ((zzfrm) zza).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = zzesgVar.zzf.zzd.zzm;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str2);
            }
            arrayList.add(zzesgVar.zze(str2, list, bundle, true, true));
        }
        for (Map.Entry entry2 : ((zzfrm) zzesgVar.zzd.zzb()).entrySet()) {
            zzeli zzeliVar = (zzeli) entry2.getValue();
            String str3 = zzeliVar.zza;
            Bundle bundle3 = zzesgVar.zzf.zzd.zzm;
            arrayList.add(zzesgVar.zze(str3, Collections.singletonList(zzeliVar.zzd), bundle3 != null ? bundle3.getBundle(str3) : null, zzeliVar.zzb, zzeliVar.zzc));
        }
        return zzfvc.zzc(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzesd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfvl> list2 = arrayList;
                JSONArray jSONArray = new JSONArray();
                for (zzfvl zzfvlVar : list2) {
                    if (((JSONObject) zzfvlVar.get()) != null) {
                        jSONArray.put(zzfvlVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzesh(jSONArray.toString());
            }
        }, zzesgVar.zzb);
    }

    private final zzfut zze(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        zzfut zzv = zzfut.zzv(zzfvc.zzl(new zzfui() { // from class: com.google.android.gms.internal.ads.zzese
            @Override // com.google.android.gms.internal.ads.zzfui
            public final zzfvl zza() {
                return zzesg.this.zzd(str, list, bundle, z10, z11);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbs)).booleanValue()) {
            zzv = (zzfut) zzfvc.zzo(zzv, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbl)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfut) zzfvc.zzf(zzv, Throwable.class, new zzfok() { // from class: com.google.android.gms.internal.ads.zzesf
            @Override // com.google.android.gms.internal.ads.zzfok
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzcfi.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return zzfvc.zzl(new zzfui() { // from class: com.google.android.gms.internal.ads.zzesb
            @Override // com.google.android.gms.internal.ads.zzfui
            public final zzfvl zza() {
                return zzesg.zzc(zzesg.this);
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzfvl zzd(String str, List list, Bundle bundle, boolean z10, boolean z11) throws Exception {
        zzbvt zzbvtVar;
        zzbvt zzb;
        zzcga zzcgaVar = new zzcga();
        if (z11) {
            this.zzg.zzb(str);
            zzb = this.zzg.zza(str);
        } else {
            try {
                zzb = this.zzh.zzb(str);
            } catch (RemoteException e10) {
                zzcfi.zzh("Couldn't create RTB adapter : ", e10);
                zzbvtVar = null;
            }
        }
        zzbvtVar = zzb;
        if (zzbvtVar == null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbn)).booleanValue()) {
                zzelh.zzb(str, zzcgaVar);
            } else {
                throw null;
            }
        } else {
            final zzelh zzelhVar = new zzelh(str, zzbvtVar, zzcgaVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbs)).booleanValue()) {
                this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesc
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzelh.this.zzc();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbl)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z10) {
                zzbvtVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzelhVar);
            } else {
                zzelhVar.zzd();
            }
        }
        return zzcgaVar;
    }
}
