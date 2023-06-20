package com.inmobi.media;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.inmobi.media.ff;

/* compiled from: ScrollableDeckPagesContainer.java */
/* loaded from: classes3.dex */
class fo extends ff implements ViewPager.j {

    /* renamed from: b  reason: collision with root package name */
    private static final String f25472b = fo.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    ff.a f25473a;

    /* renamed from: c  reason: collision with root package name */
    private ViewPager f25474c;

    /* renamed from: d  reason: collision with root package name */
    private Point f25475d;

    /* renamed from: e  reason: collision with root package name */
    private Point f25476e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25477f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f25478g;

    public fo(Context context) {
        super(context, (byte) 0);
        this.f25475d = new Point();
        this.f25476e = new Point();
        this.f25478g = false;
        setClipChildren(false);
        setLayerType(1, null);
        ViewPager viewPager = new ViewPager(getContext());
        this.f25474c = viewPager;
        viewPager.c(this);
        addView(this.f25474c);
    }

    @Override // com.inmobi.media.ff
    public final void a(bv bvVar, fg fgVar, int i10, int i11, ff.a aVar) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fl.a(bvVar.a(0), this);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(20);
            layoutParams.setMarginEnd(20);
        } else {
            layoutParams.setMargins(20, 0, 20, 0);
        }
        layoutParams.gravity = i11;
        this.f25474c.setLayoutParams(layoutParams);
        this.f25474c.setAdapter((fa) fgVar);
        this.f25474c.setOffscreenPageLimit(2);
        this.f25474c.setPageMargin(16);
        this.f25474c.setCurrentItem(i10);
        this.f25473a = aVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrollStateChanged(int i10) {
        this.f25477f = i10 != 0;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageScrolled(int i10, float f10, int i11) {
        if (this.f25477f) {
            invalidate();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void onPageSelected(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25474c.getLayoutParams();
        ff.a aVar = this.f25473a;
        if (aVar != null) {
            layoutParams.gravity = aVar.a(i10);
            this.f25474c.requestLayout();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        Point point = this.f25475d;
        point.x = i10 / 2;
        point.y = i11 / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.fo.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
