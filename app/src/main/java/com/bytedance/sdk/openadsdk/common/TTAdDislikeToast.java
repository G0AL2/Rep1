package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* loaded from: classes.dex */
public class TTAdDislikeToast extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Handler f11244a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f11245b;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public void b() {
        setVisibility(8);
        this.f11244a.removeCallbacksAndMessages(null);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Context context) {
        TextView textView = new TextView(context);
        this.f11245b = textView;
        textView.setClickable(false);
        this.f11245b.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        int b10 = (int) v.b(m.a(), 20.0f);
        int b11 = (int) v.b(m.a(), 12.0f);
        this.f11245b.setPadding(b10, b11, b10, b11);
        this.f11245b.setLayoutParams(layoutParams);
        this.f11245b.setTextColor(-1);
        this.f11245b.setTextSize(16.0f);
        this.f11245b.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#CC000000"));
        gradientDrawable.setCornerRadius(v.b(m.a(), 6.0f));
        this.f11245b.setBackgroundDrawable(gradientDrawable);
        addView(this.f11245b);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11244a = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        a(context);
    }

    public void a(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11244a.removeCallbacksAndMessages(null);
        this.f11244a.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.f11245b != null) {
                    TTAdDislikeToast.this.f11245b.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.f11244a.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, Constants.MIN_PROGRESS_TIME);
    }

    public void a() {
        setVisibility(8);
        this.f11244a.removeCallbacksAndMessages(null);
    }
}
