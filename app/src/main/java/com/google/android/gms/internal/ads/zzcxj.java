package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcxj extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcxj(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcxj zza(Context context, View view, zzfbl zzfblVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcxj zzcxjVar = new zzcxj(context);
        if (!zzfblVar.zzv.isEmpty() && (resources = zzcxjVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfbm zzfbmVar = (zzfbm) zzfblVar.zzv.get(0);
            float f10 = displayMetrics.density;
            zzcxjVar.setLayoutParams(new FrameLayout.LayoutParams((int) (zzfbmVar.zza * f10), (int) (zzfbmVar.zzb * f10)));
        }
        zzcxjVar.zzb = view;
        zzcxjVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcgi.zzb(zzcxjVar, zzcxjVar);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcgi.zza(zzcxjVar, zzcxjVar);
        JSONObject jSONObject = zzfblVar.zzaj;
        RelativeLayout relativeLayout = new RelativeLayout(zzcxjVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcxjVar.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcxjVar.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcxjVar.addView(relativeLayout);
        return zzcxjVar;
    }

    private final int zzb(double d10) {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        return zzcfb.zzw(this.zza, (int) d10);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
