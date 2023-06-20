package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public class h extends View {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2220a;

    public h(Context context) {
        super(context);
        this.f2220a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f2220a = z10;
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f2220a && bVar.f2009a == i10) {
            return;
        }
        bVar.f2009a = i10;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f2220a && bVar.f2011b == i10) {
            return;
        }
        bVar.f2011b = i10;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f2220a && bVar.f2013c == f10) {
            return;
        }
        bVar.f2013c = f10;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
