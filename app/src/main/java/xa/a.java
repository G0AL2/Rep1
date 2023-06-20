package xa;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: AbsoluteCornerSize.java */
/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f38770a;

    public a(float f10) {
        this.f38770a = f10;
    }

    @Override // xa.c
    public float a(RectF rectF) {
        return this.f38770a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f38770a == ((a) obj).f38770a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f38770a)});
    }
}
