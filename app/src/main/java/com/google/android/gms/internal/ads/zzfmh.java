package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import l6.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfmh implements zzfkx {
    private final Object zza;
    private final zzfmi zzb;
    private final zzfmt zzc;
    private final zzfku zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmh(Object obj, zzfmi zzfmiVar, zzfmt zzfmtVar, zzfku zzfkuVar) {
        this.zza = obj;
        this.zzb = zzfmiVar;
        this.zzc = zzfmtVar;
        this.zzd = zzfkuVar;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzamk zza = zzaml.zza();
        zza.zzc(5);
        zza.zza(zzgji.zzv(bArr));
        return Base64.encodeToString(((zzaml) zza.zzal()).zzaw(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e10) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e10);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfkx
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.zzc.zza();
        zza.put(InneractiveMediationDefs.GENDER_FEMALE, c.f33710i);
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put("view", view);
        zza.put("act", activity);
        return zzi(zzj(null, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfkx
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.zzc.zzc();
        zzc.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", activity);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfkx
    public final synchronized String zzc(Context context, String str) {
        Map zzb;
        zzb = this.zzc.zzb();
        zzb.put(InneractiveMediationDefs.GENDER_FEMALE, "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfkx
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfmr {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzd(AuthApiStatusCodes.AUTH_API_SERVER_ERROR, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e10) {
            throw new zzfmr((int) IronSourceConstants.IS_INSTANCE_OPENED, e10);
        }
    }

    public final synchronized int zze() throws zzfmr {
        try {
        } catch (Exception e10) {
            throw new zzfmr(2006, e10);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfmi zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzfmr {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzd(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e10) {
            throw new zzfmr(2003, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzh() throws zzfmr {
        try {
        } catch (Exception e10) {
            throw new zzfmr(2001, e10);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }
}
