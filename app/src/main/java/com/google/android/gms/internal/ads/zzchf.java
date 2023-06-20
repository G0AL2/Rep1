package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzchf extends FrameLayout implements zzcgw {
    @VisibleForTesting
    final zzcht zza;
    private final zzchr zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbio zze;
    private final long zzf;
    private final zzcgx zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzchf(Context context, zzchr zzchrVar, int i10, boolean z10, zzbio zzbioVar, zzchq zzchqVar) {
        super(context);
        zzcgx zzcgvVar;
        this.zzb = zzchrVar;
        this.zze = zzbioVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzchrVar.zzm());
        zzcgy zzcgyVar = zzchrVar.zzm().zza;
        zzchs zzchsVar = new zzchs(context, zzchrVar.zzp(), zzchrVar.zzu(), zzbioVar, zzchrVar.zzn());
        if (i10 == 2) {
            zzcgvVar = new zzcij(context, zzchsVar, zzchrVar, z10, zzcgy.zza(zzchrVar), zzchqVar);
        } else {
            zzcgvVar = new zzcgv(context, zzchrVar, z10, zzcgy.zza(zzchrVar), zzchqVar, new zzchs(context, zzchrVar.zzp(), zzchrVar.zzu(), zzbioVar, zzchrVar.zzn()));
        }
        this.zzg = zzcgvVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcgvVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzD)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzA)).booleanValue()) {
            zzm();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzF)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzC)).booleanValue();
        this.zzk = booleanValue;
        if (zzbioVar != null) {
            zzbioVar.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zza = new zzcht(this);
        zzcgvVar.zzr(this);
    }

    private final void zzI() {
        if (this.zzb.zzk() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzk().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzJ(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzK() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcgx zzcgxVar = this.zzg;
            if (zzcgxVar != null) {
                zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcgx.this.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcha
            @Override // java.lang.Runnable
            public final void run() {
                zzchf.this.zzp(z10);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgw
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.zza.zzb();
            z10 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z10 = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzche(this, z10));
    }

    public final void zzA(int i10) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzz(i10);
    }

    public final void zzB(int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzD)).booleanValue()) {
            this.zzc.setBackgroundColor(i10);
            this.zzd.setBackgroundColor(i10);
        }
    }

    public final void zzC(int i10) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzA(i10);
    }

    public final void zzD(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzE(int i10, int i11, int i12, int i13) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Set video bounds to x:" + i10 + ";y:" + i11 + ";w:" + i12 + ";h:" + i13);
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzF(float f10) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzb.zze(f10);
        zzcgxVar.zzn();
    }

    public final void zzG(float f10, float f11) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar != null) {
            zzcgxVar.zzu(f10, f11);
        }
    }

    public final void zzH() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzb.zzd(false);
        zzcgxVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbE)).booleanValue()) {
            this.zza.zza();
        }
        zzJ("ended", new String[0]);
        zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzb(String str, String str2) {
        zzJ("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzc(String str, String str2) {
        zzJ("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzd() {
        zzJ("pause", new String[0]);
        zzI();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbE)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzk() != null && !this.zzi) {
            boolean z10 = (this.zzb.zzk().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z10;
            if (!z10) {
                this.zzb.zzk().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzf() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar != null && this.zzm == 0) {
            zzJ("canplaythrough", "duration", String.valueOf(zzcgxVar.zzc() / 1000.0f), "videoWidth", String.valueOf(this.zzg.zze()), "videoHeight", String.valueOf(this.zzg.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchb
            @Override // java.lang.Runnable
            public final void run() {
                zzchf.this.zzo();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzchc(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzK()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzchd(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzj(int i10, int i11) {
        if (this.zzk) {
            zzbhr zzbhrVar = zzbhz.zzE;
            int max = Math.max(i10 / ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).intValue(), 1);
            int max2 = Math.max(i11 / ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhrVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzk() {
        if (this.zzh && zzK()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
        }
        if (elapsedRealtime2 > this.zzf) {
            zzcfi.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbio zzbioVar = this.zze;
            if (zzbioVar != null) {
                zzbioVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    public final void zzm() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        TextView textView = new TextView(zzcgxVar.getContext());
        textView.setText("AdMob - ".concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzn() {
        this.zza.zza();
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar != null) {
            zzcgxVar.zzt();
        }
        zzI();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo() {
        zzJ("firstFrameRendered", new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(boolean z10) {
        zzJ("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    public final void zzq() {
        if (this.zzg == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.zzn)) {
            this.zzg.zzB(this.zzn, this.zzo);
        } else {
            zzJ("no_src", new String[0]);
        }
    }

    public final void zzr() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzb.zzd(true);
        zzcgxVar.zzn();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzs() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        long zza = zzcgxVar.zza();
        if (this.zzl == zza || zza <= 0) {
            return;
        }
        float f10 = ((float) zza) / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue()) {
            zzJ("timeupdate", "time", String.valueOf(f10), DownloadWorker.KEY_OUT_TOTAL_BYTES, String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
        } else {
            zzJ("timeupdate", "time", String.valueOf(f10));
        }
        this.zzl = zza;
    }

    public final void zzt() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzo();
    }

    public final void zzu() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzp();
    }

    public final void zzv(int i10) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzq(i10);
    }

    public final void zzw(MotionEvent motionEvent) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzx(int i10) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzw(i10);
    }

    public final void zzy(int i10) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzx(i10);
    }

    public final void zzz(int i10) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzy(i10);
    }
}
