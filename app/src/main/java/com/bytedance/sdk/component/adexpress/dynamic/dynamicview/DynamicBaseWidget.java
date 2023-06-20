package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.b.e;
import com.bytedance.sdk.component.adexpress.dynamic.b.f;
import com.bytedance.sdk.component.adexpress.dynamic.b.g;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.utils.t;
import java.util.List;

/* loaded from: classes.dex */
public abstract class DynamicBaseWidget extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.animation.view.b, b, c {

    /* renamed from: a  reason: collision with root package name */
    private float f9683a;

    /* renamed from: b  reason: collision with root package name */
    private float f9684b;

    /* renamed from: c  reason: collision with root package name */
    protected float f9685c;

    /* renamed from: d  reason: collision with root package name */
    protected float f9686d;

    /* renamed from: e  reason: collision with root package name */
    protected float f9687e;

    /* renamed from: f  reason: collision with root package name */
    protected float f9688f;

    /* renamed from: g  reason: collision with root package name */
    protected int f9689g;

    /* renamed from: h  reason: collision with root package name */
    protected int f9690h;

    /* renamed from: i  reason: collision with root package name */
    protected int f9691i;

    /* renamed from: j  reason: collision with root package name */
    protected int f9692j;

    /* renamed from: k  reason: collision with root package name */
    protected Context f9693k;

    /* renamed from: l  reason: collision with root package name */
    protected g f9694l;

    /* renamed from: m  reason: collision with root package name */
    protected h f9695m;

    /* renamed from: n  reason: collision with root package name */
    protected DynamicRootView f9696n;

    /* renamed from: o  reason: collision with root package name */
    protected View f9697o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f9698p;

    /* renamed from: q  reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.a.b f9699q;

    /* renamed from: r  reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.a f9700r;

    /* renamed from: s  reason: collision with root package name */
    private float f9701s;

    public DynamicBaseWidget(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context);
        this.f9693k = context;
        this.f9696n = dynamicRootView;
        this.f9695m = hVar;
        this.f9685c = hVar.e();
        this.f9686d = hVar.f();
        this.f9687e = hVar.g();
        this.f9688f = hVar.h();
        this.f9691i = (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9685c);
        this.f9692j = (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9686d);
        this.f9689g = (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9687e);
        this.f9690h = (int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9688f);
        g gVar = new g(hVar.i());
        this.f9694l = gVar;
        if (gVar.r() > 0) {
            this.f9689g += this.f9694l.r() * 2;
            this.f9690h += this.f9694l.r() * 2;
            this.f9691i -= this.f9694l.r();
            this.f9692j -= this.f9694l.r();
            List<h> j10 = hVar.j();
            if (j10 != null) {
                for (h hVar2 : j10) {
                    hVar2.c(hVar2.e() + com.bytedance.sdk.component.adexpress.c.b.b(this.f9693k, this.f9694l.r()));
                    hVar2.d(hVar2.f() + com.bytedance.sdk.component.adexpress.c.b.b(this.f9693k, this.f9694l.r()));
                    hVar2.a(com.bytedance.sdk.component.adexpress.c.b.b(this.f9693k, this.f9694l.r()));
                    hVar2.b(com.bytedance.sdk.component.adexpress.c.b.b(this.f9693k, this.f9694l.r()));
                }
            }
        }
        this.f9698p = this.f9694l.n() > 0.0d;
        this.f9700r = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.a();
    }

    public void a(int i10) {
        g gVar = this.f9694l;
        if (gVar != null && gVar.a(i10)) {
            h();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != null && (getChildAt(i11) instanceof DynamicBaseWidget)) {
                    ((DynamicBaseWidget) childAt).a(i10);
                }
            }
        }
    }

    public void b() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.a.b bVar = this.f9699q;
        if (bVar != null) {
            bVar.b();
        }
    }

    public boolean c() {
        h();
        f();
        d();
        return true;
    }

    protected boolean d() {
        if (e()) {
            View view = this.f9697o;
            if (view == null) {
                view = this;
            }
            view.setOnTouchListener((View.OnTouchListener) getDynamicClickListener());
            view.setOnClickListener((View.OnClickListener) getDynamicClickListener());
            view.setTag(t.e(getContext(), "tt_id_click_tag"), this.f9694l.z());
            view.setTag(t.e(getContext(), "tt_id_click_area_type"), this.f9695m.i().b());
            a(view);
            return true;
        }
        return true;
    }

    public boolean e() {
        g gVar = this.f9694l;
        return (gVar == null || gVar.v() == 0) ? false : true;
    }

    public void f() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f9689g, this.f9690h);
        layoutParams.topMargin = this.f9692j;
        layoutParams.leftMargin = this.f9691i;
        setLayoutParams(layoutParams);
    }

    public void g() {
        if (a()) {
            return;
        }
        View view = this.f9697o;
        if (view == null) {
            view = this;
        }
        com.bytedance.sdk.component.adexpress.dynamic.animation.a.b bVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.a.b(view, this.f9695m.i().e().ac());
        this.f9699q = bVar;
        bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Drawable getBackgroundDrawable() {
        return a(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.f9698p;
    }

    public int getClickArea() {
        return this.f9694l.v();
    }

    protected GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.d.a getDynamicClickListener() {
        return this.f9696n.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.f9690h;
    }

    public f getDynamicLayoutBrickValue() {
        e i10;
        h hVar = this.f9695m;
        if (hVar == null || (i10 = hVar.i()) == null) {
            return null;
        }
        return i10.e();
    }

    public int getDynamicWidth() {
        return this.f9689g;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.b
    public float getMarqueeValue() {
        return this.f9701s;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.b
    public float getRippleValue() {
        return this.f9683a;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.b
    public float getShineValue() {
        return this.f9684b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f9700r.a(canvas, this, this);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.a aVar = this.f9700r;
        View view = this.f9697o;
        if (view == null) {
            view = this;
        }
        aVar.a(view, i10, i11);
    }

    public void setMarqueeValue(float f10) {
        this.f9701s = f10;
        postInvalidate();
    }

    public void setRippleValue(float f10) {
        this.f9683a = f10;
        postInvalidate();
    }

    public void setShineValue(float f10) {
        this.f9684b = f10;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z10) {
        this.f9698p = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(View view) {
        f e10;
        h hVar = this.f9695m;
        if (hVar == null || (e10 = hVar.i().e()) == null) {
            return;
        }
        view.setTag(t.e(getContext(), "tt_id_open_landing_page"), Boolean.valueOf(e10.ak()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Drawable a(boolean z10, String str) {
        int w10;
        if (!TextUtils.isEmpty(this.f9694l.y())) {
            try {
                String y10 = this.f9694l.y();
                String[] split = y10.substring(y10.indexOf("(") + 1, y10.length() - 1).split(", ");
                GradientDrawable a10 = a(a(split[0]), new int[]{g.a(split[1].substring(0, 7)), g.a(split[2].substring(0, 7))});
                a10.setShape(0);
                a10.setCornerRadius(com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9694l.o()));
                return a10;
            } catch (Exception unused) {
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        drawable.setCornerRadius(com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9694l.o()));
        if (z10) {
            w10 = Color.parseColor(str);
        } else {
            w10 = this.f9694l.w();
        }
        drawable.setColor(w10);
        if (this.f9694l.q() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.c.b.a(this.f9693k, this.f9694l.q()), this.f9694l.p());
        } else if (this.f9694l.r() > 0) {
            drawable.setStroke(this.f9694l.r(), this.f9694l.p());
            drawable.setAlpha(50);
        }
        return drawable;
    }

    protected GradientDrawable a(GradientDrawable.Orientation orientation, int[] iArr) {
        return new GradientDrawable(orientation, iArr);
    }

    protected GradientDrawable.Orientation a(String str) {
        try {
            int parseInt = Integer.parseInt(str.substring(0, str.length() - 3));
            if (parseInt <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseInt <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseInt <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private boolean a() {
        h hVar = this.f9695m;
        return hVar == null || hVar.i() == null || this.f9695m.i().e() == null || this.f9695m.i().e().ac() == null;
    }
}
