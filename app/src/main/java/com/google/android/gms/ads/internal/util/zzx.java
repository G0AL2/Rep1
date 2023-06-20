package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbhz;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(28)
/* loaded from: classes2.dex */
public class zzx extends zzv {
    public static final /* synthetic */ WindowInsets zzk(Activity activity, View view, WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzm() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzg zzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(String.valueOf(format));
                }
                zzh.zzC(str);
            } else {
                com.google.android.gms.ads.internal.zzt.zzo().zzh().zzC("");
            }
        }
        zzn(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzn(boolean z10, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i10 = attributes.layoutInDisplayCutoutMode;
        int i11 = true != z10 ? 2 : 1;
        if (i11 != i10) {
            attributes.layoutInDisplayCutoutMode = i11;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zzi(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void zzj(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaZ)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzo().zzh().zzm() == null && !activity.isInMultiWindowMode()) {
            zzn(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzx.zzk(activity, view, windowInsets);
                }
            });
        }
    }
}
