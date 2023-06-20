package com.applovin.impl.adview;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.i;
import com.applovin.sdk.AppLovinSdkUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends Dialog implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f7067a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.m f7068b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.sdk.v f7069c;

    /* renamed from: d  reason: collision with root package name */
    private final d f7070d;

    /* renamed from: e  reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f7071e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f7072f;

    /* renamed from: g  reason: collision with root package name */
    private i f7073g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(com.applovin.impl.sdk.ad.a aVar, d dVar, Activity activity, com.applovin.impl.sdk.m mVar) {
        super(activity, 16973840);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (dVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f7068b = mVar;
        this.f7069c = mVar.A();
        this.f7067a = activity;
        this.f7070d = dVar;
        this.f7071e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    private int a(int i10) {
        return AppLovinSdkUtils.dpToPx(this.f7067a, i10);
    }

    private void a(i.a aVar) {
        if (this.f7073g != null) {
            if (com.applovin.impl.sdk.v.a()) {
                this.f7069c.d("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        i a10 = i.a(aVar, this.f7067a);
        this.f7073g = a10;
        a10.setVisibility(8);
        this.f7073g.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.l.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                l.this.d();
            }
        });
        this.f7073g.setClickable(false);
        int a11 = a(((Integer) this.f7068b.a(com.applovin.impl.sdk.c.b.bU)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a11, a11);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.m mVar = this.f7068b;
        com.applovin.impl.sdk.c.b<Boolean> bVar = com.applovin.impl.sdk.c.b.bX;
        layoutParams.addRule(((Boolean) mVar.a(bVar)).booleanValue() ? 9 : 11);
        this.f7073g.a(a11);
        int a12 = a(((Integer) this.f7068b.a(com.applovin.impl.sdk.c.b.bW)).intValue());
        int a13 = a(((Integer) this.f7068b.a(com.applovin.impl.sdk.c.b.bV)).intValue());
        layoutParams.setMargins(a13, a12, a13, 0);
        this.f7072f.addView(this.f7073g, layoutParams);
        this.f7073g.bringToFront();
        int a14 = a(((Integer) this.f7068b.a(com.applovin.impl.sdk.c.b.bY)).intValue());
        View view = new View(this.f7067a);
        view.setBackgroundColor(0);
        int i10 = a11 + a14;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.f7068b.a(bVar)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(a13 - a(5), a12 - a(5), a13 - a(5), 0);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.adview.l.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (l.this.f7073g.isClickable()) {
                    l.this.f7073g.performClick();
                }
            }
        });
        this.f7072f.addView(view, layoutParams2);
        view.bringToFront();
    }

    private void c() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f7070d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.f7067a);
        this.f7072f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f7072f.setBackgroundColor(-1157627904);
        this.f7072f.addView(this.f7070d);
        if (!this.f7071e.m()) {
            a(this.f7071e.n());
            e();
        }
        setContentView(this.f7072f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f7070d.a("javascript:al_onCloseTapped();", new Runnable() { // from class: com.applovin.impl.adview.l.1
            @Override // java.lang.Runnable
            public void run() {
                l.this.dismiss();
            }
        });
    }

    private void e() {
        this.f7067a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.l.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (l.this.f7073g == null) {
                        l.this.d();
                    }
                    l.this.f7073g.setVisibility(0);
                    l.this.f7073g.bringToFront();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300L);
                    alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.applovin.impl.adview.l.6.1
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation) {
                            l.this.f7073g.setClickable(true);
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation) {
                        }
                    });
                    l.this.f7073g.startAnimation(alphaAnimation);
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.v.a()) {
                        l.this.f7069c.b("ExpandedAdDialog", "Unable to fade in close button", th);
                    }
                    l.this.d();
                }
            }
        });
    }

    public com.applovin.impl.sdk.ad.a a() {
        return this.f7071e;
    }

    public d b() {
        return this.f7070d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, com.applovin.impl.adview.k
    public void dismiss() {
        com.applovin.impl.sdk.d.d statsManagerHelper = this.f7070d.getStatsManagerHelper();
        if (statsManagerHelper != null) {
            statsManagerHelper.e();
        }
        this.f7067a.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.l.3
            @Override // java.lang.Runnable
            public void run() {
                l.this.f7072f.removeView(l.this.f7070d);
                l.super.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f7070d.a("javascript:al_onBackPressed();", new Runnable() { // from class: com.applovin.impl.adview.l.2
            @Override // java.lang.Runnable
            public void run() {
                l.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c();
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.f7067a.getWindow().getAttributes().flags, this.f7067a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (com.applovin.impl.sdk.v.a()) {
                this.f7069c.e("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.v.a()) {
                this.f7069c.b("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }
}
