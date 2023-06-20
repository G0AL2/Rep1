package l3;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* compiled from: VideoUrlModel.java */
/* loaded from: classes.dex */
public class c implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private b f33683a;

    /* renamed from: b  reason: collision with root package name */
    private b f33684b;

    /* renamed from: c  reason: collision with root package name */
    private String f33685c;

    /* renamed from: d  reason: collision with root package name */
    private int f33686d;

    /* renamed from: e  reason: collision with root package name */
    private int f33687e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f33688f;

    /* renamed from: g  reason: collision with root package name */
    private long f33689g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f33690h;

    /* renamed from: i  reason: collision with root package name */
    public int f33691i;

    /* renamed from: j  reason: collision with root package name */
    private int f33692j;

    /* renamed from: k  reason: collision with root package name */
    private int f33693k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap<String, Object> f33694l = new HashMap<>();

    /* renamed from: m  reason: collision with root package name */
    private int f33695m = 10000;

    /* renamed from: n  reason: collision with root package name */
    private int f33696n = 10000;

    /* renamed from: o  reason: collision with root package name */
    private int f33697o = 10000;

    /* renamed from: p  reason: collision with root package name */
    private int f33698p = 0;

    public c(String str, b bVar, b bVar2, int i10, int i11) {
        this.f33692j = 0;
        this.f33693k = 0;
        this.f33685c = str;
        this.f33683a = bVar;
        this.f33684b = bVar2;
        this.f33692j = i10;
        this.f33693k = i11;
    }

    public String A() {
        if (y()) {
            return this.f33684b.C();
        }
        b bVar = this.f33683a;
        if (bVar != null) {
            return bVar.C();
        }
        return null;
    }

    public int B() {
        return this.f33692j;
    }

    public int C() {
        return this.f33695m;
    }

    public int D() {
        return this.f33696n;
    }

    public int E() {
        return this.f33697o;
    }

    public int F() {
        return this.f33698p;
    }

    public b G() {
        return this.f33683a;
    }

    public b H() {
        return this.f33684b;
    }

    public String a() {
        return this.f33685c;
    }

    public void b(int i10) {
        this.f33686d = i10;
    }

    public void c(long j10) {
        this.f33689g = j10;
    }

    public void d(String str) {
        this.f33685c = str;
    }

    public synchronized void e(String str, Object obj) {
        this.f33694l.put(str, obj);
    }

    public void f(List<String> list) {
        this.f33688f = list;
    }

    public void g(boolean z10) {
        this.f33690h = z10;
    }

    public int h() {
        if (y()) {
            return this.f33684b.D();
        }
        b bVar = this.f33683a;
        if (bVar != null) {
            return bVar.D();
        }
        return 0;
    }

    public void i(int i10) {
        this.f33687e = i10;
    }

    public void j(String str) {
    }

    public int k() {
        return this.f33686d;
    }

    public void l(int i10) {
        this.f33691i = i10;
    }

    public void m(String str) {
    }

    public int n() {
        return this.f33687e;
    }

    public void o(int i10) {
        this.f33695m = i10;
    }

    public void p(String str) {
    }

    public long q() {
        return this.f33689g;
    }

    public synchronized Object r(String str) {
        return this.f33694l.get(str);
    }

    public void s(int i10) {
        this.f33696n = i10;
    }

    public void t(int i10) {
        this.f33697o = i10;
    }

    public boolean u() {
        return this.f33690h;
    }

    public long v() {
        if (y()) {
            return this.f33684b.o();
        }
        b bVar = this.f33683a;
        if (bVar != null) {
            return bVar.o();
        }
        return 0L;
    }

    public void w(int i10) {
        this.f33698p = i10;
    }

    public boolean x() {
        if (y()) {
            return this.f33684b.K();
        }
        b bVar = this.f33683a;
        if (bVar != null) {
            return bVar.K();
        }
        return true;
    }

    public boolean y() {
        return this.f33692j == 1 && this.f33693k == 1 && this.f33684b != null;
    }

    public String z() {
        if (y()) {
            return this.f33684b.y();
        }
        b bVar = this.f33683a;
        if (bVar != null) {
            return bVar.y();
        }
        return null;
    }
}
