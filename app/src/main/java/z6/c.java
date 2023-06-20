package z6;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* compiled from: BaseLayoutAnimation.java */
/* loaded from: classes.dex */
abstract class c extends z6.a {

    /* compiled from: BaseLayoutAnimation.java */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40070a;

        static {
            int[] iArr = new int[b.values().length];
            f40070a = iArr;
            try {
                iArr[b.OPACITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40070a[b.SCALE_XY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40070a[b.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40070a[b.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // z6.a
    Animation b(View view, int i10, int i11, int i12, int i13) {
        b bVar = this.f40063c;
        if (bVar != null) {
            int i14 = a.f40070a[bVar.ordinal()];
            if (i14 == 1) {
                return new l(view, g() ? view.getAlpha() : 0.0f, g() ? 0.0f : view.getAlpha());
            } else if (i14 == 2) {
                float f10 = g() ? 1.0f : 0.0f;
                float f11 = g() ? 0.0f : 1.0f;
                return new ScaleAnimation(f10, f11, f10, f11, 1, 0.5f, 1, 0.5f);
            } else if (i14 == 3) {
                return new ScaleAnimation(g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
            } else if (i14 == 4) {
                return new ScaleAnimation(1.0f, 1.0f, g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
            } else {
                throw new com.facebook.react.uimanager.h("Missing animation for property : " + this.f40063c);
            }
        }
        throw new com.facebook.react.uimanager.h("Missing animated property from animation config");
    }

    @Override // z6.a
    boolean e() {
        return this.f40064d > 0 && this.f40063c != null;
    }

    abstract boolean g();
}
