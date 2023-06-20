package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzr extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzaa zzb;

    public zzr(Context context, zzq zzqVar, zzaa zzaaVar) {
        super(context);
        this.zzb = zzaaVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzaw.zzb();
        int zzw = zzcfb.zzw(context, zzqVar.zza);
        zzaw.zzb();
        int zzw2 = zzcfb.zzw(context, 0);
        zzaw.zzb();
        int zzw3 = zzcfb.zzw(context, zzqVar.zzb);
        zzaw.zzb();
        imageButton.setPadding(zzw, zzw2, zzw3, zzcfb.zzw(context, zzqVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzaw.zzb();
        int zzw4 = zzcfb.zzw(context, zzqVar.zzd + zzqVar.zza + zzqVar.zzb);
        zzaw.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(zzw4, zzcfb.zzw(context, zzqVar.zzd + zzqVar.zzc), 17));
        long longValue = ((Long) zzay.zzc().zzb(zzbhz.zzaW)).longValue();
        if (longValue <= 0) {
            return;
        }
        zzp zzpVar = ((Boolean) zzay.zzc().zzb(zzbhz.zzaX)).booleanValue() ? new zzp(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzpVar);
    }

    private final void zzc() {
        String str = (String) zzay.zzc().zzb(zzbhz.zzaV);
        if (PlatformVersion.isAtLeastLollipop() && !TextUtils.isEmpty(str) && !"default".equals(str)) {
            Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
            if (zzd != null) {
                Drawable drawable = null;
                try {
                    if ("white".equals(str)) {
                        drawable = zzd.getDrawable(R.drawable.admob_close_button_white_circle_black_cross);
                    } else if ("black".equals(str)) {
                        drawable = zzd.getDrawable(R.drawable.admob_close_button_black_circle_white_cross);
                    }
                } catch (Resources.NotFoundException unused) {
                    zzcfi.zze("Close button resource not found, falling back to default.");
                }
                if (drawable == null) {
                    this.zza.setImageResource(17301527);
                    return;
                }
                this.zza.setImageDrawable(drawable);
                this.zza.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            this.zza.setImageResource(17301527);
            return;
        }
        this.zza.setImageResource(17301527);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzaa zzaaVar = this.zzb;
        if (zzaaVar != null) {
            zzaaVar.zzbJ();
        }
    }

    public final void zzb(boolean z10) {
        if (z10) {
            this.zza.setVisibility(8);
            if (((Long) zzay.zzc().zzb(zzbhz.zzaW)).longValue() > 0) {
                this.zza.animate().cancel();
                this.zza.clearAnimation();
                return;
            }
            return;
        }
        this.zza.setVisibility(0);
    }
}
