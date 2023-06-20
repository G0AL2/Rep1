package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final long f6821a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6822b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6823c;

    /* renamed from: d  reason: collision with root package name */
    private final ClickRecognitionState f6824d;

    /* renamed from: e  reason: collision with root package name */
    private long f6825e;

    /* renamed from: f  reason: collision with root package name */
    private PointF f6826f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6827g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f6828h;

    /* renamed from: i  reason: collision with root package name */
    private final OnClickListener f6829i;

    /* loaded from: classes.dex */
    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    /* loaded from: classes.dex */
    public interface OnClickListener {
        void onClick(View view, PointF pointF);
    }

    public AppLovinTouchToClickListener(com.applovin.impl.sdk.m mVar, com.applovin.impl.sdk.c.b<Integer> bVar, Context context, OnClickListener onClickListener) {
        this.f6821a = ((Long) mVar.a(com.applovin.impl.sdk.c.b.aK)).longValue();
        this.f6822b = ((Integer) mVar.a(com.applovin.impl.sdk.c.b.aL)).intValue();
        this.f6823c = AppLovinSdkUtils.dpToPx(context, ((Integer) mVar.a(com.applovin.impl.sdk.c.b.aN)).intValue());
        this.f6824d = ClickRecognitionState.values()[((Integer) mVar.a(bVar)).intValue()];
        this.f6828h = context;
        this.f6829i = onClickListener;
    }

    private float a(float f10) {
        return f10 / this.f6828h.getResources().getDisplayMetrics().density;
    }

    private float a(PointF pointF, PointF pointF2) {
        float f10 = pointF.x - pointF2.x;
        float f11 = pointF.y - pointF2.y;
        return a((float) Math.sqrt((f10 * f10) + (f11 * f11)));
    }

    private void a(View view, MotionEvent motionEvent) {
        this.f6829i.onClick(view, new PointF(motionEvent.getRawX(), motionEvent.getRawY()));
        this.f6827g = true;
    }

    private boolean a(MotionEvent motionEvent) {
        if (this.f6823c <= 0) {
            return true;
        }
        Point a10 = com.applovin.impl.sdk.utils.g.a(this.f6828h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i10 = this.f6823c;
        return rawX >= ((float) i10) && rawY >= ((float) i10) && rawX <= ((float) (a10.x - i10)) && rawY <= ((float) (a10.y - i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r9.f6824d != com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_POINTER_UP) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r2 >= r4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
        if (r0 >= r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (a(r11) != false) goto L10;
     */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            int r0 = r11.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L5e
            if (r0 == r1) goto L19
            r2 = 6
            if (r0 == r2) goto Le
            goto L86
        Le:
            boolean r0 = r9.f6827g
            if (r0 != 0) goto L86
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r9.f6824d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_POINTER_UP
            if (r0 != r2) goto L86
            goto L6a
        L19:
            boolean r0 = r9.f6827g
            if (r0 != 0) goto L24
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r9.f6824d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_UP
            if (r0 != r2) goto L24
            goto L6a
        L24:
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r9.f6824d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.DISABLED
            if (r0 != r2) goto L86
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r9.f6825e
            long r2 = r2 - r4
            android.graphics.PointF r0 = r9.f6826f
            android.graphics.PointF r4 = new android.graphics.PointF
            float r5 = r11.getX()
            float r6 = r11.getY()
            r4.<init>(r5, r6)
            float r0 = r9.a(r0, r4)
            boolean r4 = r9.f6827g
            if (r4 != 0) goto L86
            long r4 = r9.f6821a
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L54
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L86
        L54:
            int r2 = r9.f6822b
            if (r2 < 0) goto L6a
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L86
            goto L6a
        L5e:
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r9.f6824d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN
            if (r0 != r2) goto L6e
            boolean r0 = r9.a(r11)
            if (r0 == 0) goto L86
        L6a:
            r9.a(r10, r11)
            goto L86
        L6e:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r9.f6825e = r2
            android.graphics.PointF r10 = new android.graphics.PointF
            float r0 = r11.getX()
            float r11 = r11.getY()
            r10.<init>(r0, r11)
            r9.f6826f = r10
            r10 = 0
            r9.f6827g = r10
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.AppLovinTouchToClickListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
