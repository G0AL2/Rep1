package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.g;

/* compiled from: CardViewApi17Impl.java */
/* loaded from: classes.dex */
class a extends c {

    /* compiled from: CardViewApi17Impl.java */
    /* renamed from: androidx.cardview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0041a implements g.a {
        C0041a(a aVar) {
        }

        @Override // androidx.cardview.widget.g.a
        public void a(Canvas canvas, RectF rectF, float f10, Paint paint) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    @Override // androidx.cardview.widget.c, androidx.cardview.widget.e
    public void k() {
        g.f1836r = new C0041a(this);
    }
}
