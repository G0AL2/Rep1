package z1;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BaseKeyframeAnimation.java */
/* loaded from: classes.dex */
public abstract class a<K, A> {

    /* renamed from: c  reason: collision with root package name */
    private final d<K> f39897c;

    /* renamed from: e  reason: collision with root package name */
    protected j2.c<A> f39899e;

    /* renamed from: a  reason: collision with root package name */
    final List<b> f39895a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    private boolean f39896b = false;

    /* renamed from: d  reason: collision with root package name */
    protected float f39898d = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    private A f39900f = null;

    /* renamed from: g  reason: collision with root package name */
    private float f39901g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    private float f39902h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class c<T> implements d<T> {
        private c() {
        }

        @Override // z1.a.d
        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // z1.a.d
        public j2.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // z1.a.d
        public boolean c(float f10) {
            return false;
        }

        @Override // z1.a.d
        public float d() {
            return 0.0f;
        }

        @Override // z1.a.d
        public float e() {
            return 1.0f;
        }

        @Override // z1.a.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public interface d<T> {
        boolean a(float f10);

        j2.a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class e<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final List<? extends j2.a<T>> f39903a;

        /* renamed from: c  reason: collision with root package name */
        private j2.a<T> f39905c = null;

        /* renamed from: d  reason: collision with root package name */
        private float f39906d = -1.0f;

        /* renamed from: b  reason: collision with root package name */
        private j2.a<T> f39904b = f(0.0f);

        e(List<? extends j2.a<T>> list) {
            this.f39903a = list;
        }

        private j2.a<T> f(float f10) {
            List<? extends j2.a<T>> list = this.f39903a;
            j2.a<T> aVar = list.get(list.size() - 1);
            if (f10 >= aVar.e()) {
                return aVar;
            }
            for (int size = this.f39903a.size() - 2; size >= 1; size--) {
                j2.a<T> aVar2 = this.f39903a.get(size);
                if (this.f39904b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return this.f39903a.get(0);
        }

        @Override // z1.a.d
        public boolean a(float f10) {
            j2.a<T> aVar = this.f39905c;
            j2.a<T> aVar2 = this.f39904b;
            if (aVar == aVar2 && this.f39906d == f10) {
                return true;
            }
            this.f39905c = aVar2;
            this.f39906d = f10;
            return false;
        }

        @Override // z1.a.d
        public j2.a<T> b() {
            return this.f39904b;
        }

        @Override // z1.a.d
        public boolean c(float f10) {
            if (this.f39904b.a(f10)) {
                return !this.f39904b.h();
            }
            this.f39904b = f(f10);
            return true;
        }

        @Override // z1.a.d
        public float d() {
            return this.f39903a.get(0).e();
        }

        @Override // z1.a.d
        public float e() {
            List<? extends j2.a<T>> list = this.f39903a;
            return list.get(list.size() - 1).b();
        }

        @Override // z1.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* loaded from: classes.dex */
    public static final class f<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        private final j2.a<T> f39907a;

        /* renamed from: b  reason: collision with root package name */
        private float f39908b = -1.0f;

        f(List<? extends j2.a<T>> list) {
            this.f39907a = list.get(0);
        }

        @Override // z1.a.d
        public boolean a(float f10) {
            if (this.f39908b == f10) {
                return true;
            }
            this.f39908b = f10;
            return false;
        }

        @Override // z1.a.d
        public j2.a<T> b() {
            return this.f39907a;
        }

        @Override // z1.a.d
        public boolean c(float f10) {
            return !this.f39907a.h();
        }

        @Override // z1.a.d
        public float d() {
            return this.f39907a.e();
        }

        @Override // z1.a.d
        public float e() {
            return this.f39907a.b();
        }

        @Override // z1.a.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(List<? extends j2.a<K>> list) {
        this.f39897c = o(list);
    }

    private float g() {
        if (this.f39901g == -1.0f) {
            this.f39901g = this.f39897c.d();
        }
        return this.f39901g;
    }

    private static <T> d<T> o(List<? extends j2.a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    public void a(b bVar) {
        this.f39895a.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j2.a<K> b() {
        com.airbnb.lottie.c.a("BaseKeyframeAnimation#getCurrentKeyframe");
        j2.a<K> b10 = this.f39897c.b();
        com.airbnb.lottie.c.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b10;
    }

    float c() {
        if (this.f39902h == -1.0f) {
            this.f39902h = this.f39897c.e();
        }
        return this.f39902h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float d() {
        j2.a<K> b10 = b();
        if (b10 == null || b10.h()) {
            return 0.0f;
        }
        return b10.f32183d.getInterpolation(e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        if (this.f39896b) {
            return 0.0f;
        }
        j2.a<K> b10 = b();
        if (b10.h()) {
            return 0.0f;
        }
        return (this.f39898d - b10.e()) / (b10.b() - b10.e());
    }

    public float f() {
        return this.f39898d;
    }

    public A h() {
        A i10;
        float e10 = e();
        if (this.f39899e == null && this.f39897c.a(e10)) {
            return this.f39900f;
        }
        j2.a<K> b10 = b();
        Interpolator interpolator = b10.f32184e;
        if (interpolator != null && b10.f32185f != null) {
            i10 = j(b10, e10, interpolator.getInterpolation(e10), b10.f32185f.getInterpolation(e10));
        } else {
            i10 = i(b10, d());
        }
        this.f39900f = i10;
        return i10;
    }

    abstract A i(j2.a<K> aVar, float f10);

    protected A j(j2.a<K> aVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i10 = 0; i10 < this.f39895a.size(); i10++) {
            this.f39895a.get(i10).a();
        }
    }

    public void l() {
        this.f39896b = true;
    }

    public void m(float f10) {
        if (this.f39897c.isEmpty()) {
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f39898d) {
            return;
        }
        this.f39898d = f10;
        if (this.f39897c.c(f10)) {
            k();
        }
    }

    public void n(j2.c<A> cVar) {
        j2.c<A> cVar2 = this.f39899e;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f39899e = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
