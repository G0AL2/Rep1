package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import hb.b;
import hb.f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzay implements b {
    private final Application zza;
    private final zzac zzb;
    private final zzbi zzc;
    private final zzam zzd;
    private final zzbc zze;
    private final zzcl<zzbg> zzf;
    private Dialog zzg;
    private zzbg zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference<zzax> zzj = new AtomicReference<>();
    private final AtomicReference<b.a> zzk = new AtomicReference<>();
    private final AtomicReference<zzaw> zzl = new AtomicReference<>();

    public zzay(Application application, zzac zzacVar, zzbi zzbiVar, zzam zzamVar, zzbc zzbcVar, zzcl<zzbg> zzclVar) {
        this.zza = application;
        this.zzb = zzacVar;
        this.zzc = zzbiVar;
        this.zzd = zzamVar;
        this.zze = zzbcVar;
        this.zzf = zzclVar;
    }

    private final void zzg() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzaw andSet = this.zzl.getAndSet(null);
        if (andSet != null) {
            andSet.zza.zza.unregisterActivityLifecycleCallbacks(andSet);
        }
    }

    @Override // hb.b
    public final void show(Activity activity, b.a aVar) {
        zzcd.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            aVar.a(new zzj(3, "ConsentForm#show can only be invoked once.").zza());
            return;
        }
        zzaw zzawVar = new zzaw(this, activity);
        this.zza.registerActivityLifecycleCallbacks(zzawVar);
        this.zzl.set(zzawVar);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, 16973840);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.a(new zzj(3, "Activity with null windows is passed in.").zza());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        this.zzk.set(aVar);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzb("UMP_messagePresented", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzbg zza() {
        return this.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(f.b bVar, f.a aVar) {
        zzbg zzb = ((zzbh) this.zzf).zzb();
        this.zzh = zzb;
        zzb.setBackgroundColor(0);
        zzb.getSettings().setJavaScriptEnabled(true);
        zzb.setWebViewClient(new zzbf(zzb, null));
        this.zzj.set(new zzax(bVar, aVar, null));
        this.zzh.loadDataWithBaseURL(this.zze.zza(), this.zze.zzb(), "text/html", "UTF-8", null);
        zzcd.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzau
            @Override // java.lang.Runnable
            public final void run() {
                zzay.this.zzf(new zzj(4, "Web view timed out."));
            }
        }, 10000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(int i10) {
        zzg();
        b.a andSet = this.zzk.getAndSet(null);
        if (andSet == null) {
            return;
        }
        this.zzd.zzf(3);
        andSet.a(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(zzj zzjVar) {
        zzg();
        b.a andSet = this.zzk.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.a(zzjVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze() {
        zzax andSet = this.zzj.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.onConsentFormLoadSuccess(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzf(zzj zzjVar) {
        zzax andSet = this.zzj.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.onConsentFormLoadFailure(zzjVar.zza());
    }
}
