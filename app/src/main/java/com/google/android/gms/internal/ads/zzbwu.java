package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbwu extends zzbwv implements zzbom {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcli zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbhj zzk;
    private float zzl;
    private int zzm;

    public zzbwu(zzcli zzcliVar, Context context, zzbhj zzbhjVar) {
        super(zzcliVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcliVar;
        this.zzi = context;
        this.zzk = zzbhjVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        JSONObject jSONObject;
        zzcli zzcliVar = (zzcli) obj;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzcfb.zzu(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzcfb.zzu(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzk = this.zzh.zzk();
        if (zzk != null && zzk.getWindow() != null) {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] zzM = com.google.android.gms.ads.internal.util.zzs.zzM(zzk);
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            this.zzd = zzcfb.zzu(this.zza, zzM[0]);
            com.google.android.gms.ads.internal.client.zzaw.zzb();
            this.zze = zzcfb.zzu(this.zza, zzM[1]);
        } else {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        }
        if (this.zzh.zzQ().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbwt zzbwtVar = new zzbwt();
        zzbhj zzbhjVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbwtVar.zze(zzbhjVar.zza(intent));
        zzbhj zzbhjVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbwtVar.zzc(zzbhjVar2.zza(intent2));
        zzbwtVar.zza(this.zzk.zzb());
        zzbwtVar.zzd(this.zzk.zzc());
        zzbwtVar.zzb(true);
        z10 = zzbwtVar.zza;
        z11 = zzbwtVar.zzb;
        z12 = zzbwtVar.zzc;
        z13 = zzbwtVar.zzd;
        z14 = zzbwtVar.zze;
        zzcli zzcliVar2 = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z10).put("tel", z11).put("calendar", z12).put("storePicture", z13).put("inlineVideo", z14);
        } catch (JSONException e10) {
            zzcfi.zzh("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObject = null;
        }
        zzcliVar2.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, iArr[1]));
        if (zzcfi.zzm(2)) {
            zzcfi.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzp().zza);
    }

    public final void zzb(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.zzi instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzp();
            i12 = com.google.android.gms.ads.internal.util.zzs.zzN((Activity) this.zzi)[0];
        } else {
            i12 = 0;
        }
        if (this.zzh.zzQ() == null || !this.zzh.zzQ().zzi()) {
            int width = this.zzh.getWidth();
            int height = this.zzh.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzP)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzQ() != null ? this.zzh.zzQ().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzQ() != null) {
                        i13 = this.zzh.zzQ().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, i13);
                }
            }
            i13 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzaw.zzb().zzb(this.zzi, i13);
        }
        zzf(i10, i11 - i12, this.zzf, this.zzg);
        this.zzh.zzP().zzA(i10, i11);
    }
}
