package xa;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: RelativeCornerSize.java */
/* loaded from: classes3.dex */
public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f38820a;

    public i(float f10) {
        this.f38820a = f10;
    }

    @Override // xa.c
    public float a(RectF rectF) {
        return this.f38820a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f38820a == ((i) obj).f38820a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f38820a)});
    }
}
