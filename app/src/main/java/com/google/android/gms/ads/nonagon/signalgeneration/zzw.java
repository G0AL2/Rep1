package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzcdw;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwm;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfuy;
import com.google.android.gms.internal.ads.zzfvl;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzw implements zzfuy {
    final /* synthetic */ zzfvl zza;
    final /* synthetic */ zzced zzb;
    final /* synthetic */ zzcdw zzc;
    final /* synthetic */ zzfhh zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzaa zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzw(zzaa zzaaVar, zzfvl zzfvlVar, zzced zzcedVar, zzcdw zzcdwVar, zzfhh zzfhhVar, long j10) {
        this.zzf = zzaaVar;
        this.zza = zzfvlVar;
        this.zzb = zzcedVar;
        this.zzc = zzcdwVar;
        this.zzd = zzfhhVar;
        this.zze = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzdwm zzdwmVar;
        zzdwc zzdwcVar;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        long j10 = this.zze;
        String message = th.getMessage();
        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "SignalGeneratorImpl.generateSignals");
        zzaa zzaaVar = this.zzf;
        zzdwmVar = zzaaVar.zzr;
        zzdwcVar = zzaaVar.zzj;
        zzf.zzc(zzdwmVar, zzdwcVar, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(currentTimeMillis - j10)));
        zzfhs zzr = zzaa.zzr(this.zza, this.zzb);
        if (((Boolean) zzbji.zze.zze()).booleanValue() && zzr != null) {
            zzfhh zzfhhVar = this.zzd;
            zzfhhVar.zze(false);
            zzr.zza(zzfhhVar);
            zzr.zzg();
        }
        try {
            zzcdw zzcdwVar = this.zzc;
            zzcdwVar.zzb("Internal error. " + message);
        } catch (RemoteException e10) {
            zzcfi.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdwm zzdwmVar;
        zzdwc zzdwcVar;
        zzdwc zzdwcVar2;
        boolean z10;
        boolean z11;
        zzdwm zzdwmVar2;
        zzdwc zzdwcVar3;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        zzcfo zzcfoVar;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzdwm zzdwmVar3;
        zzdwc zzdwcVar4;
        zzdwm zzdwmVar4;
        zzdwc zzdwcVar5;
        zzam zzamVar = (zzam) obj;
        zzfhs zzr = zzaa.zzr(this.zza, this.zzb);
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgx)).booleanValue()) {
            try {
                this.zzc.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e10) {
                zzcfi.zzg("QueryInfo generation has been disabled.".concat(e10.toString()));
            }
            if (!((Boolean) zzbji.zze.zze()).booleanValue() || zzr == null) {
                return;
            }
            zzfhh zzfhhVar = this.zzd;
            zzfhhVar.zze(false);
            zzr.zza(zzfhhVar);
            zzr.zzg();
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - this.zze;
        try {
            try {
                if (zzamVar == null) {
                    this.zzc.zzc(null, null, null);
                    zzaa zzaaVar = this.zzf;
                    zzdwmVar4 = zzaaVar.zzr;
                    zzdwcVar5 = zzaaVar.zzj;
                    zzf.zzc(zzdwmVar4, zzdwcVar5, "sgs", new Pair("rid", "-1"));
                    this.zzd.zze(true);
                    if (!((Boolean) zzbji.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzg();
                    return;
                }
                try {
                    String optString = new JSONObject(zzamVar.zzb).optString("request_id", "");
                    if (TextUtils.isEmpty(optString)) {
                        zzcfi.zzj("The request ID is empty in request JSON.");
                        this.zzc.zzb("Internal error: request ID is empty in request JSON.");
                        zzaa zzaaVar2 = this.zzf;
                        zzdwmVar3 = zzaaVar2.zzr;
                        zzdwcVar4 = zzaaVar2.zzj;
                        zzf.zzc(zzdwmVar3, zzdwcVar4, "sgf", new Pair("sgf_reason", "rid_missing"));
                        this.zzd.zze(false);
                        if (!((Boolean) zzbji.zze.zze()).booleanValue() || zzr == null) {
                            return;
                        }
                        zzr.zza(this.zzd);
                        zzr.zzg();
                        return;
                    }
                    zzaa zzaaVar3 = this.zzf;
                    String str7 = zzamVar.zzb;
                    zzdwcVar2 = zzaaVar3.zzj;
                    zzaa.zzG(zzaaVar3, optString, str7, zzdwcVar2);
                    Bundle bundle = zzamVar.zzc;
                    zzaa zzaaVar4 = this.zzf;
                    z10 = zzaaVar4.zzw;
                    if (z10 && bundle != null) {
                        str5 = zzaaVar4.zzy;
                        if (bundle.getInt(str5, -1) == -1) {
                            zzaa zzaaVar5 = this.zzf;
                            str6 = zzaaVar5.zzy;
                            atomicInteger = zzaaVar5.zzz;
                            bundle.putInt(str6, atomicInteger.get());
                        }
                    }
                    zzaa zzaaVar6 = this.zzf;
                    z11 = zzaaVar6.zzv;
                    if (z11 && bundle != null) {
                        str = zzaaVar6.zzx;
                        if (TextUtils.isEmpty(bundle.getString(str))) {
                            str2 = this.zzf.zzB;
                            if (TextUtils.isEmpty(str2)) {
                                zzaa zzaaVar7 = this.zzf;
                                com.google.android.gms.ads.internal.util.zzs zzp = com.google.android.gms.ads.internal.zzt.zzp();
                                zzaa zzaaVar8 = this.zzf;
                                context = zzaaVar8.zzg;
                                zzcfoVar = zzaaVar8.zzA;
                                zzaaVar7.zzB = zzp.zzc(context, zzcfoVar.zza);
                            }
                            zzaa zzaaVar9 = this.zzf;
                            str3 = zzaaVar9.zzx;
                            str4 = zzaaVar9.zzB;
                            bundle.putString(str3, str4);
                        }
                    }
                    this.zzc.zzc(zzamVar.zza, zzamVar.zzb, bundle);
                    zzaa zzaaVar10 = this.zzf;
                    zzdwmVar2 = zzaaVar10.zzr;
                    zzdwcVar3 = zzaaVar10.zzj;
                    zzf.zzc(zzdwmVar2, zzdwcVar3, "sgs", new Pair("tqgt", String.valueOf(currentTimeMillis)));
                    this.zzd.zze(true);
                    if (!((Boolean) zzbji.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzg();
                } catch (JSONException e11) {
                    zzcfi.zzj("Failed to create JSON object from the request string.");
                    zzcdw zzcdwVar = this.zzc;
                    String obj2 = e11.toString();
                    zzcdwVar.zzb("Internal error for request JSON: " + obj2);
                    zzaa zzaaVar11 = this.zzf;
                    zzdwmVar = zzaaVar11.zzr;
                    zzdwcVar = zzaaVar11.zzj;
                    zzf.zzc(zzdwmVar, zzdwcVar, "sgf", new Pair("sgf_reason", "request_invalid"));
                    this.zzd.zze(false);
                    if (!((Boolean) zzbji.zze.zze()).booleanValue() || zzr == null) {
                        return;
                    }
                    zzr.zza(this.zzd);
                    zzr.zzg();
                }
            } catch (RemoteException e12) {
                this.zzd.zze(false);
                zzcfi.zzh("", e12);
                if (!((Boolean) zzbji.zze.zze()).booleanValue() || zzr == null) {
                    return;
                }
                zzr.zza(this.zzd);
                zzr.zzg();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbji.zze.zze()).booleanValue() && zzr != null) {
                zzr.zza(this.zzd);
                zzr.zzg();
            }
            throw th;
        }
    }
}
