package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.drawee.view.a;
import x4.b;
import y3.j;

/* compiled from: DraweeView.java */
/* loaded from: classes.dex */
public class c<DH extends x4.b> extends ImageView {

    /* renamed from: f  reason: collision with root package name */
    private static boolean f14515f = false;

    /* renamed from: a  reason: collision with root package name */
    private final a.C0193a f14516a;

    /* renamed from: b  reason: collision with root package name */
    private float f14517b;

    /* renamed from: c  reason: collision with root package name */
    private b<DH> f14518c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14519d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14520e;

    public c(Context context) {
        super(context);
        this.f14516a = new a.C0193a();
        this.f14517b = 0.0f;
        this.f14519d = false;
        this.f14520e = false;
        c(context);
    }

    private void c(Context context) {
        boolean d10;
        try {
            if (c6.b.d()) {
                c6.b.a("DraweeView#init");
            }
            if (this.f14519d) {
                if (d10) {
                    return;
                }
                return;
            }
            boolean z10 = true;
            this.f14519d = true;
            this.f14518c = b.e(null, context);
            if (Build.VERSION.SDK_INT >= 21) {
                ColorStateList imageTintList = getImageTintList();
                if (imageTintList == null) {
                    if (c6.b.d()) {
                        c6.b.b();
                        return;
                    }
                    return;
                }
                setColorFilter(imageTintList.getDefaultColor());
            }
            if (!f14515f || context.getApplicationInfo().targetSdkVersion < 24) {
                z10 = false;
            }
            this.f14520e = z10;
            if (c6.b.d()) {
                c6.b.b();
            }
        } finally {
            if (c6.b.d()) {
                c6.b.b();
            }
        }
    }

    private void d() {
        Drawable drawable;
        if (!this.f14520e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z10) {
        f14515f = z10;
    }

    protected void a() {
        this.f14518c.k();
    }

    protected void b() {
        this.f14518c.l();
    }

    protected void e() {
        a();
    }

    protected void f() {
        b();
    }

    public float getAspectRatio() {
        return this.f14517b;
    }

    public x4.a getController() {
        return this.f14518c.g();
    }

    public DH getHierarchy() {
        return this.f14518c.h();
    }

    public Drawable getTopLevelDrawable() {
        return this.f14518c.i();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        a.C0193a c0193a = this.f14516a;
        c0193a.f14507a = i10;
        c0193a.f14508b = i11;
        a.b(c0193a, this.f14517b, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        a.C0193a c0193a2 = this.f14516a;
        super.onMeasure(c0193a2.f14507a, c0193a2.f14508b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
        f();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f14518c.m(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        d();
    }

    public void setAspectRatio(float f10) {
        if (f10 == this.f14517b) {
            return;
        }
        this.f14517b = f10;
        requestLayout();
    }

    public void setController(x4.a aVar) {
        this.f14518c.o(aVar);
        super.setImageDrawable(this.f14518c.i());
    }

    public void setHierarchy(DH dh) {
        this.f14518c.p(dh);
        super.setImageDrawable(this.f14518c.i());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        c(getContext());
        this.f14518c.o(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        c(getContext());
        this.f14518c.o(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i10) {
        c(getContext());
        this.f14518c.o(null);
        super.setImageResource(i10);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        c(getContext());
        this.f14518c.o(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z10) {
        this.f14520e = z10;
    }

    @Override // android.view.View
    public String toString() {
        j.b c10 = j.c(this);
        b<DH> bVar = this.f14518c;
        return c10.b("holder", bVar != null ? bVar.toString() : "<no holder set>").toString();
    }
}
