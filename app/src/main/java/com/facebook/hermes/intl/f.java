package com.facebook.hermes.intl;

/* compiled from: LocaleIdentifier.java */
/* loaded from: classes.dex */
class f {

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f14716a;

    /* renamed from: b  reason: collision with root package name */
    int f14717b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f14718c = -1;

    /* compiled from: LocaleIdentifier.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f14719a;

        /* renamed from: b  reason: collision with root package name */
        private int f14720b;

        /* renamed from: c  reason: collision with root package name */
        private int f14721c;

        a(f fVar, CharSequence charSequence, int i10, int i11) {
            this.f14719a = "";
            this.f14720b = 0;
            this.f14721c = 0;
            this.f14719a = charSequence;
            this.f14720b = i10;
            this.f14721c = i11;
        }

        public boolean a() {
            return i5.b.h(this.f14719a, this.f14720b, this.f14721c);
        }

        public boolean b() {
            return i5.b.i(this.f14719a, this.f14720b, this.f14721c);
        }

        public boolean c() {
            return i5.b.j(this.f14719a, this.f14720b, this.f14721c);
        }

        public boolean d() {
            return i5.b.k(this.f14719a, this.f14720b, this.f14721c);
        }

        public boolean e() {
            return i5.b.l(this.f14719a, this.f14720b, this.f14721c);
        }

        public boolean f() {
            return i5.b.m(this.f14719a, this.f14720b, this.f14721c);
        }

        public boolean g() {
            return i5.b.n(this.f14719a, this.f14720b, this.f14721c);
        }

        public boolean h() {
            return i5.b.o(this.f14719a, this.f14720b, this.f14721c);
        }

        public boolean i() {
            return i5.b.p(this.f14719a, this.f14720b, this.f14721c);
        }

        public boolean j() {
            return i5.b.q(this.f14719a, this.f14720b, this.f14721c);
        }

        public boolean k() {
            return i5.b.r(this.f14719a, this.f14720b, this.f14721c);
        }

        public boolean l() {
            return i5.b.s(this.f14719a, this.f14720b, this.f14721c);
        }

        public String m() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = this.f14720b; i10 <= this.f14721c; i10++) {
                stringBuffer.append(Character.toLowerCase(this.f14719a.charAt(i10)));
            }
            return stringBuffer.toString();
        }

        public String n() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = this.f14720b; i10 <= this.f14721c; i10++) {
                if (i10 == this.f14720b) {
                    stringBuffer.append(Character.toUpperCase(this.f14719a.charAt(i10)));
                } else {
                    stringBuffer.append(Character.toLowerCase(this.f14719a.charAt(i10)));
                }
            }
            return stringBuffer.toString();
        }

        public String o() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = this.f14720b; i10 <= this.f14721c; i10++) {
                stringBuffer.append(Character.toUpperCase(this.f14719a.charAt(i10)));
            }
            return stringBuffer.toString();
        }

        public String toString() {
            return this.f14719a.subSequence(this.f14720b, this.f14721c + 1).toString();
        }
    }

    /* compiled from: LocaleIdentifier.java */
    /* loaded from: classes.dex */
    public class b extends Exception {
        public b(f fVar) {
        }
    }

    public f(CharSequence charSequence) {
        this.f14716a = charSequence;
    }

    private static boolean b(char c10) {
        return c10 == '-';
    }

    public boolean a() {
        return this.f14716a.length() > 0 && this.f14718c < this.f14716a.length() - 1;
    }

    public a c() throws b {
        if (a()) {
            int i10 = this.f14718c;
            if (i10 >= this.f14717b) {
                if (b(this.f14716a.charAt(i10 + 1))) {
                    if (this.f14718c + 2 != this.f14716a.length()) {
                        this.f14717b = this.f14718c + 2;
                    } else {
                        throw new b(this);
                    }
                } else {
                    throw new b(this);
                }
            }
            this.f14718c = this.f14717b;
            while (this.f14718c < this.f14716a.length() && !b(this.f14716a.charAt(this.f14718c))) {
                this.f14718c++;
            }
            int i11 = this.f14718c;
            int i12 = this.f14717b;
            if (i11 > i12) {
                int i13 = i11 - 1;
                this.f14718c = i13;
                return new a(this, this.f14716a, i12, i13);
            }
            throw new b(this);
        }
        throw new b(this);
    }
}
