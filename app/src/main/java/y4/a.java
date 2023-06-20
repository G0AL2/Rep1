package y4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: AnimationBackend.java */
/* loaded from: classes.dex */
public interface a extends d {
    int c();

    void clear();

    void d(Rect rect);

    int e();

    void f(ColorFilter colorFilter);

    boolean g(Drawable drawable, Canvas canvas, int i10);

    void j(int i10);
}
