package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdoh {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final zzfcd zzb;
    private final zzdnm zzc;
    private final zzdnh zzd;
    private final zzdos zze;
    private final zzdpa zzf;
    private final Executor zzg;
    private final Executor zzh;
    private final zzbkp zzi;
    private final zzdne zzj;

    public zzdoh(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfcd zzfcdVar, zzdnm zzdnmVar, zzdnh zzdnhVar, zzdos zzdosVar, zzdpa zzdpaVar, Executor executor, Executor executor2, zzdne zzdneVar) {
        this.zza = zzgVar;
        this.zzb = zzfcdVar;
        this.zzi = zzfcdVar.zzi;
        this.zzc = zzdnmVar;
        this.zzd = zzdnhVar;
        this.zze = zzdosVar;
        this.zzf = zzdpaVar;
        this.zzg = executor;
        this.zzh = executor2;
        this.zzj = zzdneVar;
    }

    private static void zzg(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzh(ViewGroup viewGroup, boolean z10) {
        View zzg;
        FrameLayout.LayoutParams layoutParams;
        if (z10) {
            zzg = this.zzd.zzf();
        } else {
            zzg = this.zzd.zzg();
        }
        if (zzg == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzg.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzg.getParent()).removeView(zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcT)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzg, layoutParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        boolean z10 = viewGroup != null;
        zzdnh zzdnhVar = this.zzd;
        if (zzdnhVar.zzf() != null) {
            if (zzdnhVar.zzc() != 2 && zzdnhVar.zzc() != 1) {
                if (zzdnhVar.zzc() == 6) {
                    this.zza.zzI(this.zzb.zzf, "2", z10);
                    this.zza.zzI(this.zzb.zzf, "1", z10);
                    return;
                }
                return;
            }
            this.zza.zzI(this.zzb.zzf, String.valueOf(zzdnhVar.zzc()), z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzdpc zzdpcVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbky zza;
        Drawable drawable;
        if (this.zzc.zzf() || this.zzc.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i10 = 0; i10 < 2; i10++) {
                View zzg = zzdpcVar.zzg(strArr[i10]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdpcVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdnh zzdnhVar = this.zzd;
        if (zzdnhVar.zze() != null) {
            view = zzdnhVar.zze();
            zzbkp zzbkpVar = this.zzi;
            if (zzbkpVar != null && viewGroup == null) {
                zzg(layoutParams, zzbkpVar.zze);
                view.setLayoutParams(layoutParams);
            }
        } else if (zzdnhVar.zzl() instanceof zzbkk) {
            zzbkk zzbkkVar = (zzbkk) zzdnhVar.zzl();
            if (viewGroup == null) {
                zzg(layoutParams, zzbkkVar.zzc());
            }
            View zzbklVar = new zzbkl(context, zzbkkVar, layoutParams);
            zzbklVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcR));
            view = zzbklVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdpcVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdpcVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdpcVar.zzq(zzdpcVar.zzk(), view, true);
        }
        zzfrj zzfrjVar = zzdod.zza;
        int size = zzfrjVar.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg2 = zzdpcVar.zzg((String) zzfrjVar.get(i11));
            i11++;
            if (zzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg2;
                break;
            }
        }
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoe
            @Override // java.lang.Runnable
            public final void run() {
                zzdoh.this.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzh(viewGroup2, true)) {
            zzdnh zzdnhVar2 = this.zzd;
            if (zzdnhVar2.zzr() != null) {
                zzdnhVar2.zzr().zzaq(new zzdog(zzdpcVar, viewGroup2));
            }
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhX)).booleanValue() && zzh(viewGroup2, false)) {
            zzdnh zzdnhVar3 = this.zzd;
            if (zzdnhVar3.zzp() != null) {
                zzdnhVar3.zzp().zzaq(new zzdog(zzdpcVar, viewGroup2));
            }
        } else {
            viewGroup2.removeAllViews();
            View zzf = zzdpcVar.zzf();
            Context context2 = zzf != null ? zzf.getContext() : null;
            if (context2 == null || (zza = this.zzj.zza()) == null) {
                return;
            }
            try {
                IObjectWrapper zzi = zza.zzi();
                if (zzi == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzi)) == null) {
                    return;
                }
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                IObjectWrapper zzj = zzdpcVar.zzj();
                if (zzj != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzff)).booleanValue()) {
                        imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzj));
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(imageView);
                    }
                }
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup2.addView(imageView);
            } catch (RemoteException unused) {
                zzcfi.zzj("Could not get main image drawable");
            }
        }
    }

    public final void zzc(zzdpc zzdpcVar) {
        if (zzdpcVar == null || this.zze == null || zzdpcVar.zzh() == null || !this.zzc.zzg()) {
            return;
        }
        try {
            zzdpcVar.zzh().addView(this.zze.zza());
        } catch (zzclt e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e10);
        }
    }

    public final void zzd(zzdpc zzdpcVar) {
        if (zzdpcVar == null) {
            return;
        }
        Context context = zzdpcVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbx.zzh(context, this.zzc.zza)) {
            if (!(context instanceof Activity)) {
                zzcfi.zze("Activity context is needed for policy validator.");
            } else if (this.zzf == null || zzdpcVar.zzh() == null) {
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.zzf.zza(zzdpcVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbx.zzb());
                } catch (zzclt e10) {
                    com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e10);
                }
            }
        }
    }

    public final void zze(final zzdpc zzdpcVar) {
        this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdof
            @Override // java.lang.Runnable
            public final void run() {
                zzdoh.this.zzb(zzdpcVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzh(viewGroup, true);
    }
}
