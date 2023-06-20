package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdapterHelper.java */
/* loaded from: classes.dex */
public final class a implements i.a {

    /* renamed from: a  reason: collision with root package name */
    private h0.e<b> f3664a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<b> f3665b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<b> f3666c;

    /* renamed from: d  reason: collision with root package name */
    final InterfaceC0067a f3667d;

    /* renamed from: e  reason: collision with root package name */
    Runnable f3668e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f3669f;

    /* renamed from: g  reason: collision with root package name */
    final i f3670g;

    /* renamed from: h  reason: collision with root package name */
    private int f3671h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0067a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.d0 f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdapterHelper.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        int f3672a;

        /* renamed from: b  reason: collision with root package name */
        int f3673b;

        /* renamed from: c  reason: collision with root package name */
        Object f3674c;

        /* renamed from: d  reason: collision with root package name */
        int f3675d;

        b(int i10, int i11, int i12, Object obj) {
            this.f3672a = i10;
            this.f3673b = i11;
            this.f3675d = i12;
            this.f3674c = obj;
        }

        String a() {
            int i10 = this.f3672a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                int i10 = this.f3672a;
                if (i10 != bVar.f3672a) {
                    return false;
                }
                if (i10 == 8 && Math.abs(this.f3675d - this.f3673b) == 1 && this.f3675d == bVar.f3673b && this.f3673b == bVar.f3675d) {
                    return true;
                }
                if (this.f3675d == bVar.f3675d && this.f3673b == bVar.f3673b) {
                    Object obj2 = this.f3674c;
                    if (obj2 != null) {
                        if (!obj2.equals(bVar.f3674c)) {
                            return false;
                        }
                    } else if (bVar.f3674c != null) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f3672a * 31) + this.f3673b) * 31) + this.f3675d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f3673b + "c:" + this.f3675d + ",p:" + this.f3674c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InterfaceC0067a interfaceC0067a) {
        this(interfaceC0067a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f3673b;
        int i11 = bVar.f3675d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f3667d.f(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    v(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f3675d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f3673b;
        int i11 = bVar.f3675d + i10;
        int i12 = i10;
        char c10 = 65535;
        int i13 = 0;
        while (i10 < i11) {
            if (this.f3667d.f(i10) != null || h(i10)) {
                if (c10 == 0) {
                    k(a(4, i12, i13, bVar.f3674c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 1;
            } else {
                if (c10 == 1) {
                    v(a(4, i12, i13, bVar.f3674c));
                    i12 = i10;
                    i13 = 0;
                }
                c10 = 0;
            }
            i13++;
            i10++;
        }
        if (i13 != bVar.f3675d) {
            Object obj = bVar.f3674c;
            b(bVar);
            bVar = a(4, i12, i13, obj);
        }
        if (c10 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f3666c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f3666c.get(i11);
            int i12 = bVar.f3672a;
            if (i12 == 8) {
                if (n(bVar.f3675d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f3673b;
                int i14 = bVar.f3675d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f3672a;
        if (i11 != 1 && i11 != 8) {
            int z10 = z(bVar.f3673b, i11);
            int i12 = bVar.f3673b;
            int i13 = bVar.f3672a;
            if (i13 == 2) {
                i10 = 0;
            } else if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            } else {
                i10 = 1;
            }
            int i14 = 1;
            for (int i15 = 1; i15 < bVar.f3675d; i15++) {
                int z11 = z(bVar.f3673b + (i10 * i15), bVar.f3672a);
                int i16 = bVar.f3672a;
                if (i16 == 2 ? z11 == z10 : i16 == 4 && z11 == z10 + 1) {
                    i14++;
                } else {
                    b a10 = a(i16, z10, i14, bVar.f3674c);
                    l(a10, i12);
                    b(a10);
                    if (bVar.f3672a == 4) {
                        i12 += i14;
                    }
                    z10 = z11;
                    i14 = 1;
                }
            }
            Object obj = bVar.f3674c;
            b(bVar);
            if (i14 > 0) {
                b a11 = a(bVar.f3672a, z10, i14, obj);
                l(a11, i12);
                b(a11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    private void v(b bVar) {
        this.f3666c.add(bVar);
        int i10 = bVar.f3672a;
        if (i10 == 1) {
            this.f3667d.g(bVar.f3673b, bVar.f3675d);
        } else if (i10 == 2) {
            this.f3667d.d(bVar.f3673b, bVar.f3675d);
        } else if (i10 == 4) {
            this.f3667d.e(bVar.f3673b, bVar.f3675d, bVar.f3674c);
        } else if (i10 == 8) {
            this.f3667d.a(bVar.f3673b, bVar.f3675d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f3666c.size() - 1; size >= 0; size--) {
            b bVar = this.f3666c.get(size);
            int i14 = bVar.f3672a;
            if (i14 == 8) {
                int i15 = bVar.f3673b;
                int i16 = bVar.f3675d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f3673b = i15 + 1;
                            bVar.f3675d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f3673b = i15 - 1;
                            bVar.f3675d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f3675d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f3675d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f3673b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f3673b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f3673b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f3675d;
                    } else if (i14 == 2) {
                        i10 += bVar.f3675d;
                    }
                } else if (i11 == 1) {
                    bVar.f3673b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f3673b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f3666c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f3666c.get(size2);
            if (bVar2.f3672a == 8) {
                int i18 = bVar2.f3675d;
                if (i18 == bVar2.f3673b || i18 < 0) {
                    this.f3666c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f3675d <= 0) {
                this.f3666c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.i.a
    public b a(int i10, int i11, int i12, Object obj) {
        b b10 = this.f3664a.b();
        if (b10 == null) {
            return new b(i10, i11, i12, obj);
        }
        b10.f3672a = i10;
        b10.f3673b = i11;
        b10.f3675d = i12;
        b10.f3674c = obj;
        return b10;
    }

    @Override // androidx.recyclerview.widget.i.a
    public void b(b bVar) {
        if (this.f3669f) {
            return;
        }
        bVar.f3674c = null;
        this.f3664a.a(bVar);
    }

    public int e(int i10) {
        int size = this.f3665b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f3665b.get(i11);
            int i12 = bVar.f3672a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f3673b;
                    if (i13 <= i10) {
                        int i14 = bVar.f3675d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f3673b;
                    if (i15 == i10) {
                        i10 = bVar.f3675d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f3675d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f3673b <= i10) {
                i10 += bVar.f3675d;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        int size = this.f3666c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3667d.c(this.f3666c.get(i10));
        }
        x(this.f3666c);
        this.f3671h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f3665b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f3665b.get(i10);
            int i11 = bVar.f3672a;
            if (i11 == 1) {
                this.f3667d.c(bVar);
                this.f3667d.g(bVar.f3673b, bVar.f3675d);
            } else if (i11 == 2) {
                this.f3667d.c(bVar);
                this.f3667d.h(bVar.f3673b, bVar.f3675d);
            } else if (i11 == 4) {
                this.f3667d.c(bVar);
                this.f3667d.e(bVar.f3673b, bVar.f3675d, bVar.f3674c);
            } else if (i11 == 8) {
                this.f3667d.c(bVar);
                this.f3667d.a(bVar.f3673b, bVar.f3675d);
            }
            Runnable runnable = this.f3668e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f3665b);
        this.f3671h = 0;
    }

    void l(b bVar, int i10) {
        this.f3667d.b(bVar);
        int i11 = bVar.f3672a;
        if (i11 == 2) {
            this.f3667d.h(i10, bVar.f3675d);
        } else if (i11 == 4) {
            this.f3667d.e(i10, bVar.f3675d, bVar.f3674c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f3666c.size();
        while (i11 < size) {
            b bVar = this.f3666c.get(i11);
            int i12 = bVar.f3672a;
            if (i12 == 8) {
                int i13 = bVar.f3673b;
                if (i13 == i10) {
                    i10 = bVar.f3675d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f3675d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f3673b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f3675d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f3675d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o(int i10) {
        return (i10 & this.f3671h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f3665b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return (this.f3666c.isEmpty() || this.f3665b.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f3665b.add(a(4, i10, i11, obj));
        this.f3671h |= 4;
        return this.f3665b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f3665b.add(a(1, i10, i11, null));
        this.f3671h |= 1;
        return this.f3665b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 == 1) {
            this.f3665b.add(a(8, i10, i11, null));
            this.f3671h |= 8;
            return this.f3665b.size() == 1;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f3665b.add(a(2, i10, i11, null));
        this.f3671h |= 2;
        return this.f3665b.size() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        this.f3670g.b(this.f3665b);
        int size = this.f3665b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f3665b.get(i10);
            int i11 = bVar.f3672a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f3668e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3665b.clear();
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(list.get(i10));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        x(this.f3665b);
        x(this.f3666c);
        this.f3671h = 0;
    }

    a(InterfaceC0067a interfaceC0067a, boolean z10) {
        this.f3664a = new Pools$SimplePool(30);
        this.f3665b = new ArrayList<>();
        this.f3666c = new ArrayList<>();
        this.f3671h = 0;
        this.f3667d = interfaceC0067a;
        this.f3669f = z10;
        this.f3670g = new i(this);
    }
}
