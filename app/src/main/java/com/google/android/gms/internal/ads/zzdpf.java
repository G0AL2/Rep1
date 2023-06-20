package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdpf implements zzdnp {
    private final zzbup zza;
    private final zzdcl zzb;
    private final zzdbr zzc;
    private final zzdje zzd;
    private final Context zze;
    private final zzfbl zzf;
    private final zzcfo zzg;
    private final zzfcd zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    private final zzbul zzl;
    private final zzbum zzm;

    public zzdpf(zzbul zzbulVar, zzbum zzbumVar, zzbup zzbupVar, zzdcl zzdclVar, zzdbr zzdbrVar, zzdje zzdjeVar, Context context, zzfbl zzfblVar, zzcfo zzcfoVar, zzfcd zzfcdVar, byte[] bArr) {
        this.zzl = zzbulVar;
        this.zzm = zzbumVar;
        this.zza = zzbupVar;
        this.zzb = zzdclVar;
        this.zzc = zzdbrVar;
        this.zzd = zzdjeVar;
        this.zze = context;
        this.zzf = zzfblVar;
        this.zzg = zzcfoVar;
        this.zzh = zzfcdVar;
    }

    private final void zza(View view) {
        try {
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null && !zzbupVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
                    this.zzd.zzq();
                    return;
                }
                return;
            }
            zzbul zzbulVar = this.zzl;
            if (zzbulVar != null && !zzbulVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
                    this.zzd.zzq();
                    return;
                }
                return;
            }
            zzbum zzbumVar = this.zzm;
            if (zzbumVar == null || zzbumVar.zzv()) {
                return;
            }
            this.zzm.zzq(ObjectWrapper.wrap(view));
            this.zzc.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
                this.zzd.zzq();
            }
        } catch (RemoteException e10) {
            zzcfi.zzk("Failed to call handleClick", e10);
        }
    }

    private static final HashMap zzb(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final boolean zzA(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final JSONObject zzd(View view, Map map, Map map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final JSONObject zze(View view, Map map, Map map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzi(com.google.android.gms.ads.internal.client.zzcu zzcuVar) {
        zzcfi.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzj(View view, View view2, Map map, Map map2, boolean z10) {
        if (this.zzj && this.zzf.zzM) {
            return;
        }
        zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzk(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzl(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzn(View view, Map map, Map map2, boolean z10) {
        if (!this.zzj) {
            zzcfi.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzf.zzM) {
            zzcfi.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zza(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzp(View view, Map map, Map map2) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zze, this.zzg.zza, this.zzf.zzD.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbup zzbupVar = this.zza;
                if (zzbupVar != null && !zzbupVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbul zzbulVar = this.zzl;
                if (zzbulVar != null && !zzbulVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbum zzbumVar = this.zzm;
                if (zzbumVar == null || zzbumVar.zzw()) {
                    return;
                }
                this.zzm.zzr();
                this.zzb.zza();
            }
        } catch (RemoteException e10) {
            zzcfi.zzk("Failed to call recordImpression", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzr(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzs(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzt(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzu() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzv(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        zzcfi.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzw(zzbmv zzbmvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzx(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzal;
            boolean z10 = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbq)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbr)).booleanValue() && next.equals("3010")) {
                                zzbup zzbupVar = this.zza;
                                Object obj2 = null;
                                if (zzbupVar != null) {
                                    try {
                                        zzn = zzbupVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbul zzbulVar = this.zzl;
                                    if (zzbulVar != null) {
                                        zzn = zzbulVar.zzk();
                                    } else {
                                        zzbum zzbumVar = this.zzm;
                                        zzn = zzbumVar != null ? zzbumVar.zzj() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = ObjectWrapper.unwrap(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList<String> arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbu.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzt.zzp();
                                ClassLoader classLoader = this.zze.getClassLoader();
                                for (String str : arrayList) {
                                    if (Class.forName(str, false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z10 = false;
                        break;
                    }
                }
            }
            this.zzk = z10;
            HashMap zzb = zzb(map);
            HashMap zzb2 = zzb(map2);
            zzbup zzbupVar2 = this.zza;
            if (zzbupVar2 != null) {
                zzbupVar2.zzy(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                return;
            }
            zzbul zzbulVar2 = this.zzl;
            if (zzbulVar2 != null) {
                zzbulVar2.zzv(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzl.zzu(wrap);
                return;
            }
            zzbum zzbumVar2 = this.zzm;
            if (zzbumVar2 != null) {
                zzbumVar2.zzt(wrap, ObjectWrapper.wrap(zzb), ObjectWrapper.wrap(zzb2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e10) {
            zzcfi.zzk("Failed to call trackView", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final void zzy(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbup zzbupVar = this.zza;
            if (zzbupVar != null) {
                zzbupVar.zzz(wrap);
                return;
            }
            zzbul zzbulVar = this.zzl;
            if (zzbulVar != null) {
                zzbulVar.zzw(wrap);
                return;
            }
            zzbum zzbumVar = this.zzm;
            if (zzbumVar != null) {
                zzbumVar.zzu(wrap);
            }
        } catch (RemoteException e10) {
            zzcfi.zzk("Failed to call untrackView", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnp
    public final boolean zzz() {
        return this.zzf.zzM;
    }
}
