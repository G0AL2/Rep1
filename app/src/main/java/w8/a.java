package w8;

import ea.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Atom.java */
/* loaded from: classes2.dex */
abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f38320a;

    /* compiled from: Atom.java */
    /* renamed from: w8.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0529a extends a {

        /* renamed from: b  reason: collision with root package name */
        public final long f38321b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f38322c;

        /* renamed from: d  reason: collision with root package name */
        public final List<C0529a> f38323d;

        public C0529a(int i10, long j10) {
            super(i10);
            this.f38321b = j10;
            this.f38322c = new ArrayList();
            this.f38323d = new ArrayList();
        }

        public void d(C0529a c0529a) {
            this.f38323d.add(c0529a);
        }

        public void e(b bVar) {
            this.f38322c.add(bVar);
        }

        public C0529a f(int i10) {
            int size = this.f38323d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0529a c0529a = this.f38323d.get(i11);
                if (c0529a.f38320a == i10) {
                    return c0529a;
                }
            }
            return null;
        }

        public b g(int i10) {
            int size = this.f38322c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f38322c.get(i11);
                if (bVar.f38320a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // w8.a
        public String toString() {
            String a10 = a.a(this.f38320a);
            String arrays = Arrays.toString(this.f38322c.toArray());
            String arrays2 = Arrays.toString(this.f38323d.toArray());
            StringBuilder sb2 = new StringBuilder(String.valueOf(a10).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
            sb2.append(a10);
            sb2.append(" leaves: ");
            sb2.append(arrays);
            sb2.append(" containers: ");
            sb2.append(arrays2);
            return sb2.toString();
        }
    }

    /* compiled from: Atom.java */
    /* loaded from: classes2.dex */
    static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public final a0 f38324b;

        public b(int i10, a0 a0Var) {
            super(i10);
            this.f38324b = a0Var;
        }
    }

    public a(int i10) {
        this.f38320a = i10;
    }

    public static String a(int i10) {
        StringBuilder sb2 = new StringBuilder(4);
        sb2.append((char) ((i10 >> 24) & 255));
        sb2.append((char) ((i10 >> 16) & 255));
        sb2.append((char) ((i10 >> 8) & 255));
        sb2.append((char) (i10 & 255));
        return sb2.toString();
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static int c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f38320a);
    }
}
