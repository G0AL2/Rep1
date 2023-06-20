package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import s.e;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public class i extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f2221a;

    /* renamed from: b  reason: collision with root package name */
    private View f2222b;

    /* renamed from: c  reason: collision with root package name */
    private int f2223c;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f2222b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f2222b.getLayoutParams();
        bVar2.f2044r0.g1(0);
        e.b y10 = bVar.f2044r0.y();
        e.b bVar3 = e.b.FIXED;
        if (y10 != bVar3) {
            bVar.f2044r0.h1(bVar2.f2044r0.U());
        }
        if (bVar.f2044r0.R() != bVar3) {
            bVar.f2044r0.I0(bVar2.f2044r0.v());
        }
        bVar2.f2044r0.g1(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f2221a == -1 && !isInEditMode()) {
            setVisibility(this.f2223c);
        }
        View findViewById = constraintLayout.findViewById(this.f2221a);
        this.f2222b = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f2020f0 = true;
            this.f2222b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2222b;
    }

    public int getEmptyVisibility() {
        return this.f2223c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.f2221a == i10) {
            return;
        }
        View view = this.f2222b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f2222b.getLayoutParams()).f2020f0 = false;
            this.f2222b = null;
        }
        this.f2221a = i10;
        if (i10 == -1 || (findViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f2223c = i10;
    }
}
