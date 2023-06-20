package xa;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AdjustedCornerSize.java */
/* loaded from: classes3.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f38771a;

    /* renamed from: b  reason: collision with root package name */
    private final float f38772b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f38771a;
            f10 += ((b) cVar).f38772b;
        }
        this.f38771a = cVar;
        this.f38772b = f10;
    }

    @Override // xa.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f38771a.a(rectF) + this.f38772b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f38771a.equals(bVar.f38771a) && this.f38772b == bVar.f38772b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f38771a, Float.valueOf(this.f38772b)});
    }
}
