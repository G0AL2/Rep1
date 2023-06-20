package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WrappedDrawableState.java */
/* loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    int f2633a;

    /* renamed from: b  reason: collision with root package name */
    Drawable.ConstantState f2634b;

    /* renamed from: c  reason: collision with root package name */
    ColorStateList f2635c;

    /* renamed from: d  reason: collision with root package name */
    PorterDuff.Mode f2636d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(d dVar) {
        this.f2635c = null;
        this.f2636d = b.f2625g;
        if (dVar != null) {
            this.f2633a = dVar.f2633a;
            this.f2634b = dVar.f2634b;
            this.f2635c = dVar.f2635c;
            this.f2636d = dVar.f2636d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f2634b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f2633a;
        Drawable.ConstantState constantState = this.f2634b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new c(this, resources);
        }
        return new b(this, resources);
    }
}
