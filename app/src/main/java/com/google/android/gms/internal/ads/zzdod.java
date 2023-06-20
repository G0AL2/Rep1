package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdod extends zzble implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdpc {
    public static final zzfrj zza = zzfrj.zzr("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzfvm zzf;
    private View zzg;
    private zzdnc zzi;
    private zzbao zzj;
    private zzbky zzl;
    private boolean zzm;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = 221908000;

    public zzdod(FrameLayout frameLayout, FrameLayout frameLayout2, int i10) {
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcgi.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcgi.zzb(frameLayout, this);
        this.zzf = zzcfv.zze;
        this.zzj = new zzbao(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzs(String str) {
        DisplayMetrics displayMetrics;
        FrameLayout frameLayout = new FrameLayout(this.zze.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = this.zze.getContext();
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        if (!TextUtils.isEmpty(str)) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            Resources resources = context.getResources();
            if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                    bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    frameLayout.setBackground(bitmapDrawable);
                } catch (IllegalArgumentException e10) {
                    zzcfi.zzk("Encountered invalid base64 watermark.", e10);
                }
            }
        }
        this.zze.addView(frameLayout);
    }

    private final synchronized void zzt() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoc
            @Override // java.lang.Runnable
            public final void run() {
                zzdod.this.zzr();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdnc zzdncVar = this.zzi;
        if (zzdncVar != null) {
            zzdncVar.zzk();
            this.zzi.zzx(view, this.zzd, zzl(), zzm(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdnc zzdncVar = this.zzi;
        if (zzdncVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdncVar.zzv(frameLayout, zzl(), zzm(), zzdnc.zzP(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdnc zzdncVar = this.zzi;
        if (zzdncVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdncVar.zzv(frameLayout, zzl(), zzm(), zzdnc.zzP(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdnc zzdncVar = this.zzi;
        if (zzdncVar != null) {
            zzdncVar.zzD(view, motionEvent, this.zzd);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final synchronized IObjectWrapper zzb(String str) {
        return ObjectWrapper.wrap(zzg(str));
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final synchronized void zzbA(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzdnc)) {
            zzcfi.zzj("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdnc zzdncVar = this.zzi;
        if (zzdncVar != null) {
            zzdncVar.zzL(this);
        }
        zzt();
        zzdnc zzdncVar2 = (zzdnc) unwrap;
        this.zzi = zzdncVar2;
        zzdncVar2.zzK(this);
        this.zzi.zzC(this.zzd);
        this.zzi.zzi(this.zze);
        if (this.zzm) {
            this.zzi.zza().zzb(this.zzl);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcY)).booleanValue() || TextUtils.isEmpty(this.zzi.zzd())) {
            return;
        }
        zzs(this.zzi.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final synchronized void zzbw(String str, IObjectWrapper iObjectWrapper) {
        zzq(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final synchronized void zzbx(IObjectWrapper iObjectWrapper) {
        this.zzi.zzF((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final synchronized void zzby(zzbky zzbkyVar) {
        if (this.zzn) {
            return;
        }
        this.zzm = true;
        this.zzl = zzbkyVar;
        zzdnc zzdncVar = this.zzi;
        if (zzdncVar != null) {
            zzdncVar.zza().zzb(zzbkyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final synchronized void zzbz(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final synchronized void zzc() {
        if (this.zzn) {
            return;
        }
        zzdnc zzdncVar = this.zzi;
        if (zzdncVar != null) {
            zzdncVar.zzL(this);
            this.zzi = null;
        }
        this.zzc.clear();
        this.zzd.removeAllViews();
        this.zze.removeAllViews();
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = null;
        this.zzj = null;
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final void zzd(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzblf
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpc
    public final /* synthetic */ View zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdpc
    public final synchronized View zzg(String str) {
        if (this.zzn) {
            return null;
        }
        WeakReference weakReference = (WeakReference) this.zzc.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdpc
    public final FrameLayout zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzdpc
    public final zzbao zzi() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdpc
    public final IObjectWrapper zzj() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdpc
    public final synchronized String zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdpc
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdpc
    public final synchronized Map zzm() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdpc
    public final synchronized Map zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpc
    public final synchronized JSONObject zzo() {
        zzdnc zzdncVar = this.zzi;
        if (zzdncVar != null) {
            return zzdncVar.zzf(this.zzd, zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpc
    public final synchronized JSONObject zzp() {
        zzdnc zzdncVar = this.zzi;
        if (zzdncVar != null) {
            return zzdncVar.zzg(this.zzd, zzl(), zzm());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdpc
    public final synchronized void zzq(String str, View view, boolean z10) {
        if (this.zzn) {
            return;
        }
        if (view == null) {
            this.zzc.remove(str);
            return;
        }
        this.zzc.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            if (com.google.android.gms.ads.internal.util.zzbx.zzi(this.zzh)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzr() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}
