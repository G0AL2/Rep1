package se;

import fe.c0;
import qe.g;

/* compiled from: Progressions.kt */
/* loaded from: classes3.dex */
public class a implements Iterable<Integer>, re.a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0501a f36984d = new C0501a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f36985a;

    /* renamed from: b  reason: collision with root package name */
    private final int f36986b;

    /* renamed from: c  reason: collision with root package name */
    private final int f36987c;

    /* compiled from: Progressions.kt */
    /* renamed from: se.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0501a {
        private C0501a() {
        }

        public /* synthetic */ C0501a(g gVar) {
            this();
        }

        public final a a(int i10, int i11, int i12) {
            return new a(i10, i11, i12);
        }
    }

    public a(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 != Integer.MIN_VALUE) {
            this.f36985a = i10;
            this.f36986b = ke.c.b(i10, i11, i12);
            this.f36987c = i12;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    public final int e() {
        return this.f36985a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f36985a != aVar.f36985a || this.f36986b != aVar.f36986b || this.f36987c != aVar.f36987c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f36986b;
    }

    public final int g() {
        return this.f36987c;
    }

    @Override // java.lang.Iterable
    /* renamed from: h */
    public c0 iterator() {
        return new b(this.f36985a, this.f36986b, this.f36987c);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f36985a * 31) + this.f36986b) * 31) + this.f36987c;
    }

    public boolean isEmpty() {
        if (this.f36987c > 0) {
            if (this.f36985a > this.f36986b) {
                return true;
            }
        } else if (this.f36985a < this.f36986b) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f36987c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f36985a);
            sb2.append("..");
            sb2.append(this.f36986b);
            sb2.append(" step ");
            i10 = this.f36987c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f36985a);
            sb2.append(" downTo ");
            sb2.append(this.f36986b);
            sb2.append(" step ");
            i10 = -this.f36987c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
