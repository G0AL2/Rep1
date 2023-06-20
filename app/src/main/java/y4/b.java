package y4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import y4.a;

/* compiled from: AnimationBackendDelegate.java */
/* loaded from: classes.dex */
public class b<T extends a> implements a {

    /* renamed from: a  reason: collision with root package name */
    private T f39269a;

    public b(T t10) {
        this.f39269a = t10;
    }

    @Override // y4.d
    public int a() {
        T t10 = this.f39269a;
        if (t10 == null) {
            return 0;
        }
        return t10.a();
    }

    @Override // y4.d
    public int b() {
        T t10 = this.f39269a;
        if (t10 == null) {
            return 0;
        }
        return t10.b();
    }

    @Override // y4.a
    public int c() {
        T t10 = this.f39269a;
        if (t10 == null) {
            return -1;
        }
        return t10.c();
    }

    @Override // y4.a
    public void clear() {
        T t10 = this.f39269a;
        if (t10 != null) {
            t10.clear();
        }
    }

    @Override // y4.a
    public void d(Rect rect) {
        T t10 = this.f39269a;
        if (t10 != null) {
            t10.d(rect);
        }
    }

    @Override // y4.a
    public int e() {
        T t10 = this.f39269a;
        if (t10 == null) {
            return -1;
        }
        return t10.e();
    }

    @Override // y4.a
    public void f(ColorFilter colorFilter) {
        T t10 = this.f39269a;
        if (t10 != null) {
            t10.f(colorFilter);
        }
    }

    @Override // y4.a
    public boolean g(Drawable drawable, Canvas canvas, int i10) {
        T t10 = this.f39269a;
        return t10 != null && t10.g(drawable, canvas, i10);
    }

    @Override // y4.d
    public int i(int i10) {
        T t10 = this.f39269a;
        if (t10 == null) {
            return 0;
        }
        return t10.i(i10);
    }

    @Override // y4.a
    public void j(int i10) {
        T t10 = this.f39269a;
        if (t10 != null) {
            t10.j(i10);
        }
    }
}
