package la;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes2.dex */
public interface d {

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f34027b = new b();

        /* renamed from: a  reason: collision with root package name */
        private final e f34028a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f34028a.a(sa.a.c(eVar.f34031a, eVar2.f34031a, f10), sa.a.c(eVar.f34032b, eVar2.f34032b, f10), sa.a.c(eVar.f34033c, eVar2.f34033c, f10));
            return this.f34028a;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class c extends Property<d, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, e> f34029a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: la.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0443d extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f34030a = new C0443d("circularRevealScrimColor");

        private C0443d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f34031a;

        /* renamed from: b  reason: collision with root package name */
        public float f34032b;

        /* renamed from: c  reason: collision with root package name */
        public float f34033c;

        public void a(float f10, float f11, float f12) {
            this.f34031a = f10;
            this.f34032b = f11;
            this.f34033c = f12;
        }

        private e() {
        }

        public e(float f10, float f11, float f12) {
            this.f34031a = f10;
            this.f34032b = f11;
            this.f34033c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
