package e2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.d0;
import d2.p;
import g2.j;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeLayer.java */
/* loaded from: classes.dex */
public class g extends b {
    private final y1.d D;
    private final c E;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(d0 d0Var, e eVar, c cVar) {
        super(d0Var, eVar);
        this.E = cVar;
        y1.d dVar = new y1.d(d0Var, this, new p("__container", eVar.n(), false));
        this.D = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // e2.b
    protected void H(b2.e eVar, int i10, List<b2.e> list, b2.e eVar2) {
        this.D.d(eVar, i10, list, eVar2);
    }

    @Override // e2.b, y1.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        this.D.f(rectF, this.f29498o, z10);
    }

    @Override // e2.b
    void t(Canvas canvas, Matrix matrix, int i10) {
        this.D.h(canvas, matrix, i10);
    }

    @Override // e2.b
    public d2.a v() {
        d2.a v10 = super.v();
        return v10 != null ? v10 : this.E.v();
    }

    @Override // e2.b
    public j x() {
        j x10 = super.x();
        return x10 != null ? x10 : this.E.x();
    }
}
