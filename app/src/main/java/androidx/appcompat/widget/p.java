package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: AppCompatImageButton.java */
/* loaded from: classes.dex */
public class p extends ImageButton implements androidx.core.view.x, androidx.core.widget.o {

    /* renamed from: a  reason: collision with root package name */
    private final e f1640a;

    /* renamed from: b  reason: collision with root package name */
    private final q f1641b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1642c;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.C);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1640a;
        if (eVar != null) {
            eVar.b();
        }
        q qVar = this.f1641b;
        if (qVar != null) {
            qVar.c();
        }
    }

    @Override // androidx.core.view.x
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1640a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.x
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1640a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.o
    public ColorStateList getSupportImageTintList() {
        q qVar = this.f1641b;
        if (qVar != null) {
            return qVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.o
    public PorterDuff.Mode getSupportImageTintMode() {
        q qVar = this.f1641b;
        if (qVar != null) {
            return qVar.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1641b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1640a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f1640a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        q qVar = this.f1641b;
        if (qVar != null) {
            qVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        q qVar = this.f1641b;
        if (qVar != null && drawable != null && !this.f1642c) {
            qVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        q qVar2 = this.f1641b;
        if (qVar2 != null) {
            qVar2.c();
            if (this.f1642c) {
                return;
            }
            this.f1641b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f1642c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f1641b.i(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        q qVar = this.f1641b;
        if (qVar != null) {
            qVar.c();
        }
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1640a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.x
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1640a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.o
    public void setSupportImageTintList(ColorStateList colorStateList) {
        q qVar = this.f1641b;
        if (qVar != null) {
            qVar.j(colorStateList);
        }
    }

    @Override // androidx.core.widget.o
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1641b;
        if (qVar != null) {
            qVar.k(mode);
        }
    }

    public p(Context context, AttributeSet attributeSet, int i10) {
        super(w0.b(context), attributeSet, i10);
        this.f1642c = false;
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f1640a = eVar;
        eVar.e(attributeSet, i10);
        q qVar = new q(this);
        this.f1641b = qVar;
        qVar.g(attributeSet, i10);
    }
}
