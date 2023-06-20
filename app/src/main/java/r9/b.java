package r9;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import j8.g;

/* compiled from: Cue.java */
/* loaded from: classes2.dex */
public final class b implements j8.g {

    /* renamed from: r */
    public static final b f36481r = new C0490b().o("").a();

    /* renamed from: s */
    public static final g.a<b> f36482s = new g.a() { // from class: r9.a
        @Override // j8.g.a
        public final j8.g a(Bundle bundle) {
            return b.a(bundle);
        }
    };

    /* renamed from: a */
    public final CharSequence f36483a;

    /* renamed from: b */
    public final Layout.Alignment f36484b;

    /* renamed from: c */
    public final Layout.Alignment f36485c;

    /* renamed from: d */
    public final Bitmap f36486d;

    /* renamed from: e */
    public final float f36487e;

    /* renamed from: f */
    public final int f36488f;

    /* renamed from: g */
    public final int f36489g;

    /* renamed from: h */
    public final float f36490h;

    /* renamed from: i */
    public final int f36491i;

    /* renamed from: j */
    public final float f36492j;

    /* renamed from: k */
    public final float f36493k;

    /* renamed from: l */
    public final boolean f36494l;

    /* renamed from: m */
    public final int f36495m;

    /* renamed from: n */
    public final int f36496n;

    /* renamed from: o */
    public final float f36497o;

    /* renamed from: p */
    public final int f36498p;

    /* renamed from: q */
    public final float f36499q;

    /* compiled from: Cue.java */
    /* renamed from: r9.b$b */
    /* loaded from: classes2.dex */
    public static final class C0490b {

        /* renamed from: a */
        private CharSequence f36500a;

        /* renamed from: b */
        private Bitmap f36501b;

        /* renamed from: c */
        private Layout.Alignment f36502c;

        /* renamed from: d */
        private Layout.Alignment f36503d;

        /* renamed from: e */
        private float f36504e;

        /* renamed from: f */
        private int f36505f;

        /* renamed from: g */
        private int f36506g;

        /* renamed from: h */
        private float f36507h;

        /* renamed from: i */
        private int f36508i;

        /* renamed from: j */
        private int f36509j;

        /* renamed from: k */
        private float f36510k;

        /* renamed from: l */
        private float f36511l;

        /* renamed from: m */
        private float f36512m;

        /* renamed from: n */
        private boolean f36513n;

        /* renamed from: o */
        private int f36514o;

        /* renamed from: p */
        private int f36515p;

        /* renamed from: q */
        private float f36516q;

        public b a() {
            return new b(this.f36500a, this.f36502c, this.f36503d, this.f36501b, this.f36504e, this.f36505f, this.f36506g, this.f36507h, this.f36508i, this.f36509j, this.f36510k, this.f36511l, this.f36512m, this.f36513n, this.f36514o, this.f36515p, this.f36516q);
        }

        public C0490b b() {
            this.f36513n = false;
            return this;
        }

        public int c() {
            return this.f36506g;
        }

        public int d() {
            return this.f36508i;
        }

        public CharSequence e() {
            return this.f36500a;
        }

        public C0490b f(Bitmap bitmap) {
            this.f36501b = bitmap;
            return this;
        }

        public C0490b g(float f10) {
            this.f36512m = f10;
            return this;
        }

        public C0490b h(float f10, int i10) {
            this.f36504e = f10;
            this.f36505f = i10;
            return this;
        }

        public C0490b i(int i10) {
            this.f36506g = i10;
            return this;
        }

        public C0490b j(Layout.Alignment alignment) {
            this.f36503d = alignment;
            return this;
        }

        public C0490b k(float f10) {
            this.f36507h = f10;
            return this;
        }

        public C0490b l(int i10) {
            this.f36508i = i10;
            return this;
        }

        public C0490b m(float f10) {
            this.f36516q = f10;
            return this;
        }

        public C0490b n(float f10) {
            this.f36511l = f10;
            return this;
        }

        public C0490b o(CharSequence charSequence) {
            this.f36500a = charSequence;
            return this;
        }

        public C0490b p(Layout.Alignment alignment) {
            this.f36502c = alignment;
            return this;
        }

        public C0490b q(float f10, int i10) {
            this.f36510k = f10;
            this.f36509j = i10;
            return this;
        }

        public C0490b r(int i10) {
            this.f36515p = i10;
            return this;
        }

        public C0490b s(int i10) {
            this.f36514o = i10;
            this.f36513n = true;
            return this;
        }

        public C0490b() {
            this.f36500a = null;
            this.f36501b = null;
            this.f36502c = null;
            this.f36503d = null;
            this.f36504e = -3.4028235E38f;
            this.f36505f = RecyclerView.UNDEFINED_DURATION;
            this.f36506g = RecyclerView.UNDEFINED_DURATION;
            this.f36507h = -3.4028235E38f;
            this.f36508i = RecyclerView.UNDEFINED_DURATION;
            this.f36509j = RecyclerView.UNDEFINED_DURATION;
            this.f36510k = -3.4028235E38f;
            this.f36511l = -3.4028235E38f;
            this.f36512m = -3.4028235E38f;
            this.f36513n = false;
            this.f36514o = -16777216;
            this.f36515p = RecyclerView.UNDEFINED_DURATION;
        }

        private C0490b(b bVar) {
            this.f36500a = bVar.f36483a;
            this.f36501b = bVar.f36486d;
            this.f36502c = bVar.f36484b;
            this.f36503d = bVar.f36485c;
            this.f36504e = bVar.f36487e;
            this.f36505f = bVar.f36488f;
            this.f36506g = bVar.f36489g;
            this.f36507h = bVar.f36490h;
            this.f36508i = bVar.f36491i;
            this.f36509j = bVar.f36496n;
            this.f36510k = bVar.f36497o;
            this.f36511l = bVar.f36492j;
            this.f36512m = bVar.f36493k;
            this.f36513n = bVar.f36494l;
            this.f36514o = bVar.f36495m;
            this.f36515p = bVar.f36498p;
            this.f36516q = bVar.f36499q;
        }
    }

    public static /* synthetic */ b a(Bundle bundle) {
        return c(bundle);
    }

    public static final b c(Bundle bundle) {
        C0490b c0490b = new C0490b();
        CharSequence charSequence = bundle.getCharSequence(d(0));
        if (charSequence != null) {
            c0490b.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(d(1));
        if (alignment != null) {
            c0490b.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(d(2));
        if (alignment2 != null) {
            c0490b.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(d(3));
        if (bitmap != null) {
            c0490b.f(bitmap);
        }
        if (bundle.containsKey(d(4)) && bundle.containsKey(d(5))) {
            c0490b.h(bundle.getFloat(d(4)), bundle.getInt(d(5)));
        }
        if (bundle.containsKey(d(6))) {
            c0490b.i(bundle.getInt(d(6)));
        }
        if (bundle.containsKey(d(7))) {
            c0490b.k(bundle.getFloat(d(7)));
        }
        if (bundle.containsKey(d(8))) {
            c0490b.l(bundle.getInt(d(8)));
        }
        if (bundle.containsKey(d(10)) && bundle.containsKey(d(9))) {
            c0490b.q(bundle.getFloat(d(10)), bundle.getInt(d(9)));
        }
        if (bundle.containsKey(d(11))) {
            c0490b.n(bundle.getFloat(d(11)));
        }
        if (bundle.containsKey(d(12))) {
            c0490b.g(bundle.getFloat(d(12)));
        }
        if (bundle.containsKey(d(13))) {
            c0490b.s(bundle.getInt(d(13)));
        }
        if (!bundle.getBoolean(d(14), false)) {
            c0490b.b();
        }
        if (bundle.containsKey(d(15))) {
            c0490b.r(bundle.getInt(d(15)));
        }
        if (bundle.containsKey(d(16))) {
            c0490b.m(bundle.getFloat(d(16)));
        }
        return c0490b.a();
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public C0490b b() {
        return new C0490b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return TextUtils.equals(this.f36483a, bVar.f36483a) && this.f36484b == bVar.f36484b && this.f36485c == bVar.f36485c && ((bitmap = this.f36486d) != null ? !((bitmap2 = bVar.f36486d) == null || !bitmap.sameAs(bitmap2)) : bVar.f36486d == null) && this.f36487e == bVar.f36487e && this.f36488f == bVar.f36488f && this.f36489g == bVar.f36489g && this.f36490h == bVar.f36490h && this.f36491i == bVar.f36491i && this.f36492j == bVar.f36492j && this.f36493k == bVar.f36493k && this.f36494l == bVar.f36494l && this.f36495m == bVar.f36495m && this.f36496n == bVar.f36496n && this.f36497o == bVar.f36497o && this.f36498p == bVar.f36498p && this.f36499q == bVar.f36499q;
    }

    public int hashCode() {
        return ib.i.b(this.f36483a, this.f36484b, this.f36485c, this.f36486d, Float.valueOf(this.f36487e), Integer.valueOf(this.f36488f), Integer.valueOf(this.f36489g), Float.valueOf(this.f36490h), Integer.valueOf(this.f36491i), Float.valueOf(this.f36492j), Float.valueOf(this.f36493k), Boolean.valueOf(this.f36494l), Integer.valueOf(this.f36495m), Integer.valueOf(this.f36496n), Float.valueOf(this.f36497o), Integer.valueOf(this.f36498p), Float.valueOf(this.f36499q));
    }

    private b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            ea.a.e(bitmap);
        } else {
            ea.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f36483a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f36483a = charSequence.toString();
        } else {
            this.f36483a = null;
        }
        this.f36484b = alignment;
        this.f36485c = alignment2;
        this.f36486d = bitmap;
        this.f36487e = f10;
        this.f36488f = i10;
        this.f36489g = i11;
        this.f36490h = f11;
        this.f36491i = i12;
        this.f36492j = f13;
        this.f36493k = f14;
        this.f36494l = z10;
        this.f36495m = i14;
        this.f36496n = i13;
        this.f36497o = f12;
        this.f36498p = i15;
        this.f36499q = f15;
    }
}
