package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private final m f8978a;

    /* renamed from: b  reason: collision with root package name */
    private final v f8979b;

    /* renamed from: c  reason: collision with root package name */
    private final View f8980c;

    public z(View view, m mVar) {
        this.f8978a = mVar;
        this.f8979b = mVar.A();
        this.f8980c = view;
    }

    public long a(com.applovin.impl.mediation.a.e eVar) {
        if (v.a()) {
            this.f8979b.b("ViewabilityTracker", "Checking visibility...");
        }
        long j10 = 0;
        if (!this.f8980c.isShown()) {
            if (v.a()) {
                this.f8979b.e("ViewabilityTracker", "View is hidden");
            }
            j10 = 2;
        }
        if (this.f8980c.getAlpha() < eVar.E()) {
            if (v.a()) {
                this.f8979b.e("ViewabilityTracker", "View is transparent");
            }
            j10 |= 4;
        }
        Animation animation = this.f8980c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (v.a()) {
                this.f8979b.e("ViewabilityTracker", "View is animating");
            }
            j10 |= 8;
        }
        if (this.f8980c.getParent() == null) {
            if (v.a()) {
                this.f8979b.e("ViewabilityTracker", "No parent view found");
            }
            j10 |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f8980c.getContext(), this.f8980c.getWidth());
        if (pxToDp < eVar.C()) {
            if (v.a()) {
                v vVar = this.f8979b;
                vVar.e("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            }
            j10 |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f8980c.getContext(), this.f8980c.getHeight());
        if (pxToDp2 < eVar.D()) {
            if (v.a()) {
                v vVar2 = this.f8979b;
                vVar2.e("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            }
            j10 |= 64;
        }
        Point a10 = com.applovin.impl.sdk.utils.g.a(this.f8980c.getContext());
        Rect rect = new Rect(0, 0, a10.x, a10.y);
        int[] iArr = {-1, -1};
        this.f8980c.getLocationOnScreen(iArr);
        Rect rect2 = new Rect(iArr[0], iArr[1], iArr[0] + this.f8980c.getWidth(), iArr[1] + this.f8980c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (v.a()) {
                v vVar3 = this.f8979b;
                vVar3.e("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j10 |= 128;
        }
        Activity a11 = this.f8978a.af().a();
        if (a11 != null && !Utils.isViewInTopActivity(this.f8980c, a11)) {
            if (v.a()) {
                this.f8979b.e("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j10 |= 256;
        }
        if (v.a()) {
            v vVar4 = this.f8979b;
            vVar4.b("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j10));
        }
        return j10;
    }
}
