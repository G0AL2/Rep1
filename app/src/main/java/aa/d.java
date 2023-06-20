package aa;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: WebvttCssStyle.java */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: f  reason: collision with root package name */
    private int f171f;

    /* renamed from: h  reason: collision with root package name */
    private int f173h;

    /* renamed from: o  reason: collision with root package name */
    private float f180o;

    /* renamed from: a  reason: collision with root package name */
    private String f166a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f167b = "";

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f168c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private String f169d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f170e = null;

    /* renamed from: g  reason: collision with root package name */
    private boolean f172g = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f174i = false;

    /* renamed from: j  reason: collision with root package name */
    private int f175j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f176k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f177l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f178m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f179n = -1;

    /* renamed from: p  reason: collision with root package name */
    private int f181p = -1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f182q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public d A(boolean z10) {
        this.f176k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f174i) {
            return this.f173h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f182q;
    }

    public int c() {
        if (this.f172g) {
            return this.f171f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f170e;
    }

    public float e() {
        return this.f180o;
    }

    public int f() {
        return this.f179n;
    }

    public int g() {
        return this.f181p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f166a.isEmpty() && this.f167b.isEmpty() && this.f168c.isEmpty() && this.f169d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B = B(B(B(0, this.f166a, str, 1073741824), this.f167b, str2, 2), this.f169d, str3, 4);
        if (B == -1 || !set.containsAll(this.f168c)) {
            return 0;
        }
        return B + (this.f168c.size() * 4);
    }

    public int i() {
        int i10 = this.f177l;
        if (i10 == -1 && this.f178m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f178m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f174i;
    }

    public boolean k() {
        return this.f172g;
    }

    public boolean l() {
        return this.f175j == 1;
    }

    public boolean m() {
        return this.f176k == 1;
    }

    public d n(int i10) {
        this.f173h = i10;
        this.f174i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f177l = z10 ? 1 : 0;
        return this;
    }

    public d p(boolean z10) {
        this.f182q = z10;
        return this;
    }

    public d q(int i10) {
        this.f171f = i10;
        this.f172g = true;
        return this;
    }

    public d r(String str) {
        this.f170e = str == null ? null : ib.b.e(str);
        return this;
    }

    public d s(float f10) {
        this.f180o = f10;
        return this;
    }

    public d t(int i10) {
        this.f179n = i10;
        return this;
    }

    public d u(boolean z10) {
        this.f178m = z10 ? 1 : 0;
        return this;
    }

    public d v(int i10) {
        this.f181p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f168c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f166a = str;
    }

    public void y(String str) {
        this.f167b = str;
    }

    public void z(String str) {
        this.f169d = str;
    }
}
