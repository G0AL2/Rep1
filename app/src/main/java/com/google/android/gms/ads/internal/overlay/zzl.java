package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbno;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcli;
import com.google.android.gms.internal.ads.zzclu;
import com.google.android.gms.internal.ads.zzcmt;
import com.google.android.gms.internal.ads.zzcmv;
import com.google.android.gms.internal.ads.zzcmx;
import com.google.android.gms.internal.ads.zzefa;
import com.google.android.gms.internal.ads.zzfnw;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzl extends zzbxu implements zzaa {
    @VisibleForTesting
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    @VisibleForTesting
    AdOverlayInfoParcel zzc;
    @VisibleForTesting
    zzcli zzd;
    @VisibleForTesting
    zzh zze;
    @VisibleForTesting
    zzr zzf;
    @VisibleForTesting
    FrameLayout zzh;
    @VisibleForTesting
    WebChromeClient.CustomViewCallback zzi;
    @VisibleForTesting
    zzg zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    @VisibleForTesting
    boolean zzg = false;
    @VisibleForTesting
    boolean zzj = false;
    @VisibleForTesting
    boolean zzk = false;
    @VisibleForTesting
    boolean zzm = false;
    @VisibleForTesting
    int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    private final void zzG(Configuration configuration) {
        com.google.android.gms.ads.internal.zzj zzjVar;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = (adOverlayInfoParcel == null || (zzjVar2 = adOverlayInfoParcel.zzo) == null || !zzjVar2.zzb) ? false : true;
        boolean zze = com.google.android.gms.ads.internal.zzt.zzq().zze(this.zzb, configuration);
        if ((!this.zzk || z12) && !zze) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z11 = true;
            }
        } else {
            z10 = false;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzaY)).booleanValue()) {
            window.getDecorView().setSystemUiVisibility(z10 ? z11 ? 5894 : 5380 : 256);
        } else if (z10) {
            window.addFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
            window.clearFlags(2048);
            if (z11) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        } else {
            window.addFlags(2048);
            window.clearFlags(IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES);
        }
    }

    private static final void zzH(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzc(iObjectWrapper, view);
    }

    public final void zzA(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    protected final void zzB(boolean z10) throws zzf {
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window != null) {
            zzcli zzcliVar = this.zzc.zzd;
            zzcmv zzP = zzcliVar != null ? zzcliVar.zzP() : null;
            boolean z11 = zzP != null && zzP.zzJ();
            this.zzm = false;
            if (z11) {
                int i10 = this.zzc.zzj;
                if (i10 == 6) {
                    r4 = this.zzb.getResources().getConfiguration().orientation == 1;
                    this.zzm = r4;
                } else if (i10 == 7) {
                    r4 = this.zzb.getResources().getConfiguration().orientation == 2;
                    this.zzm = r4;
                }
            }
            zzcfi.zze("Delay onShow to next orientation change: " + r4);
            zzy(this.zzc.zzj);
            window.setFlags(16777216, 16777216);
            zzcfi.zze("Hardware acceleration on the AdActivity window enabled.");
            if (!this.zzk) {
                this.zzl.setBackgroundColor(-16777216);
            } else {
                this.zzl.setBackgroundColor(zza);
            }
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            if (z10) {
                try {
                    com.google.android.gms.ads.internal.zzt.zzz();
                    Activity activity = this.zzb;
                    zzcli zzcliVar2 = this.zzc.zzd;
                    zzcmx zzQ = zzcliVar2 != null ? zzcliVar2.zzQ() : null;
                    zzcli zzcliVar3 = this.zzc.zzd;
                    String zzU = zzcliVar3 != null ? zzcliVar3.zzU() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                    zzcfo zzcfoVar = adOverlayInfoParcel.zzm;
                    zzcli zzcliVar4 = adOverlayInfoParcel.zzd;
                    zzcli zza2 = zzclu.zza(activity, zzQ, zzU, true, z11, null, null, zzcfoVar, null, null, zzcliVar4 != null ? zzcliVar4.zzm() : null, zzbdm.zza(), null, null);
                    this.zzd = zza2;
                    zzcmv zzP2 = zza2.zzP();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    zzbnm zzbnmVar = adOverlayInfoParcel2.zzp;
                    zzbno zzbnoVar = adOverlayInfoParcel2.zze;
                    zzw zzwVar = adOverlayInfoParcel2.zzi;
                    zzcli zzcliVar5 = adOverlayInfoParcel2.zzd;
                    zzP2.zzL(null, zzbnmVar, null, zzbnoVar, zzwVar, true, null, zzcliVar5 != null ? zzcliVar5.zzP().zzd() : null, null, null, null, null, null, null, null, null);
                    this.zzd.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                        @Override // com.google.android.gms.internal.ads.zzcmt
                        public final void zza(boolean z12) {
                            zzcli zzcliVar6 = zzl.this.zzd;
                            if (zzcliVar6 != null) {
                                zzcliVar6.zzZ();
                            }
                        }
                    });
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                    String str = adOverlayInfoParcel3.zzl;
                    if (str != null) {
                        this.zzd.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel3.zzh;
                        if (str2 != null) {
                            this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", "UTF-8", null);
                        } else {
                            throw new zzf("No URL or HTML to display in ad overlay.");
                        }
                    }
                    zzcli zzcliVar6 = this.zzc.zzd;
                    if (zzcliVar6 != null) {
                        zzcliVar6.zzat(this);
                    }
                } catch (Exception e10) {
                    zzcfi.zzh("Error obtaining webview.", e10);
                    throw new zzf("Could not obtain webview for the overlay.");
                }
            } else {
                zzcli zzcliVar7 = this.zzc.zzd;
                this.zzd = zzcliVar7;
                zzcliVar7.zzam(this.zzb);
            }
            this.zzd.zzah(this);
            zzcli zzcliVar8 = this.zzc.zzd;
            if (zzcliVar8 != null) {
                zzH(zzcliVar8.zzS(), this.zzl);
            }
            if (this.zzc.zzk != 5) {
                ViewParent parent = this.zzd.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.zzd.zzH());
                }
                if (this.zzk) {
                    this.zzd.zzal();
                }
                this.zzl.addView(this.zzd.zzH(), -1, -1);
            }
            if (!z10 && !this.zzm) {
                zze();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            if (adOverlayInfoParcel4.zzk != 5) {
                zzu(z11);
                if (this.zzd.zzay()) {
                    zzw(z11, true);
                    return;
                }
                return;
            }
            zzefa.zzh(this.zzb, this, adOverlayInfoParcel4.zzu, adOverlayInfoParcel4.zzr, adOverlayInfoParcel4.zzs, adOverlayInfoParcel4.zzt, adOverlayInfoParcel4.zzq, adOverlayInfoParcel4.zzv);
            return;
        }
        throw new zzf("Invalid activity, no window available.");
    }

    public final void zzC() {
        synchronized (this.zzo) {
            this.zzq = true;
            Runnable runnable = this.zzp;
            if (runnable != null) {
                zzfnw zzfnwVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzfnwVar.removeCallbacks(runnable);
                zzfnwVar.post(this.zzp);
            }
        }
    }

    protected final void zzD() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (!this.zzb.isFinishing() || this.zzs) {
            return;
        }
        this.zzs = true;
        zzcli zzcliVar = this.zzd;
        if (zzcliVar != null) {
            zzcliVar.zzY(this.zzn - 1);
            synchronized (this.zzo) {
                if (!this.zzq && this.zzd.zzaz()) {
                    if (((Boolean) zzay.zzc().zzb(zzbhz.zzdQ)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                        zzoVar.zzbC();
                    }
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzl.this.zzc();
                        }
                    };
                    this.zzp = runnable;
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzay.zzc().zzb(zzbhz.zzaR)).longValue());
                    return;
                }
            }
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final boolean zzE() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zzaE = this.zzd.zzaE();
        if (!zzaE) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaE;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzbJ() {
        this.zzn = 2;
        this.zzb.finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzc() {
        zzcli zzcliVar;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zzcli zzcliVar2 = this.zzd;
        if (zzcliVar2 != null) {
            this.zzl.removeView(zzcliVar2.zzH());
            zzh zzhVar = this.zze;
            if (zzhVar != null) {
                this.zzd.zzam(zzhVar.zzd);
                this.zzd.zzap(false);
                ViewGroup viewGroup = this.zze.zzc;
                View zzH = this.zzd.zzH();
                zzh zzhVar2 = this.zze;
                viewGroup.addView(zzH, zzhVar2.zza, zzhVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzam(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzf(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcliVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzH(zzcliVar.zzS(), this.zzc.zzd.zzH());
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    protected final void zze() {
        this.zzd.zzZ();
    }

    public final void zzf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzy(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzg(int i10, int i11, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzh() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzj(IObjectWrapper iObjectWrapper) {
        zzG((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[Catch: zzf -> 0x00f5, TryCatch #0 {zzf -> 0x00f5, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:45:0x0094, B:47:0x009a, B:48:0x009d, B:55:0x00cc, B:57:0x00d0, B:58:0x00d7, B:59:0x00d8, B:61:0x00dc, B:63:0x00e9, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:70:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9 A[Catch: zzf -> 0x00f5, TryCatch #0 {zzf -> 0x00f5, blocks: (B:9:0x0017, B:11:0x0025, B:13:0x002e, B:14:0x0030, B:16:0x0038, B:17:0x0046, B:19:0x004d, B:25:0x005a, B:27:0x005e, B:29:0x0063, B:32:0x0071, B:34:0x0075, B:36:0x007b, B:37:0x007e, B:39:0x0084, B:40:0x0087, B:42:0x008d, B:44:0x0091, B:45:0x0094, B:47:0x009a, B:48:0x009d, B:55:0x00cc, B:57:0x00d0, B:58:0x00d7, B:59:0x00d8, B:61:0x00dc, B:63:0x00e9, B:22:0x0054, B:24:0x0058, B:30:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:70:0x0017 }] */
    @Override // com.google.android.gms.internal.ads.zzbxv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzk(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzk(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzl() {
        zzcli zzcliVar = this.zzd;
        if (zzcliVar != null) {
            try {
                this.zzl.removeView(zzcliVar.zzH());
            } catch (NullPointerException unused) {
            }
        }
        zzD();
    }

    public final void zzm() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzn() {
        zzo zzoVar;
        zzf();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbr();
        }
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzdS)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzp() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbK();
        }
        zzG(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdS)).booleanValue()) {
            return;
        }
        zzcli zzcliVar = this.zzd;
        if (zzcliVar != null && !zzcliVar.zzaB()) {
            this.zzd.onResume();
        } else {
            zzcfi.zzj("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzq(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzr() {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdS)).booleanValue()) {
            zzcli zzcliVar = this.zzd;
            if (zzcliVar != null && !zzcliVar.zzaB()) {
                this.zzd.onResume();
            } else {
                zzcfi.zzj("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzs() {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdS)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzt() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzoVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzoVar.zze();
    }

    public final void zzu(boolean z10) {
        int intValue = ((Integer) zzay.zzc().zzb(zzbhz.zzdU)).intValue();
        boolean z11 = ((Boolean) zzay.zzc().zzb(zzbhz.zzaU)).booleanValue() || z10;
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        zzqVar.zza = true != z11 ? 0 : intValue;
        zzqVar.zzb = true != z11 ? intValue : 0;
        zzqVar.zzc = intValue;
        this.zzf = new zzr(this.zzb, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        zzw(z10, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzv() {
        this.zzr = true;
    }

    public final void zzw(boolean z10, boolean z11) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z12 = true;
        boolean z13 = ((Boolean) zzay.zzc().zzb(zzbhz.zzaS)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh;
        boolean z14 = ((Boolean) zzay.zzc().zzb(zzbhz.zzaT)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi;
        if (z10 && z11 && z13 && !z14) {
            new zzbwv(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.zzf;
        if (zzrVar != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            zzrVar.zzb(z12);
        }
    }

    public final void zzx() {
        this.zzl.removeView(this.zzf);
        zzu(true);
    }

    public final void zzy(int i10) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzay.zzc().zzb(zzbhz.zzeV)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzay.zzc().zzb(zzbhz.zzeW)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) zzay.zzc().zzb(zzbhz.zzeX)).intValue()) {
                    if (i11 <= ((Integer) zzay.zzc().zzb(zzbhz.zzeY)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i10);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzs(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzz(boolean z10) {
        if (z10) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
    }
}
