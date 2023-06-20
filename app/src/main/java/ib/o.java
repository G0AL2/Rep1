package ib;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Splitter.java */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final ib.c f31909a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31910b;

    /* renamed from: c  reason: collision with root package name */
    private final c f31911c;

    /* renamed from: d  reason: collision with root package name */
    private final int f31912d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Splitter.java */
    /* loaded from: classes3.dex */
    public class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ib.c f31913a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Splitter.java */
        /* renamed from: ib.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0409a extends b {
            C0409a(o oVar, CharSequence charSequence) {
                super(oVar, charSequence);
            }

            @Override // ib.o.b
            int f(int i10) {
                return i10 + 1;
            }

            @Override // ib.o.b
            int g(int i10) {
                return a.this.f31913a.c(this.f31915c, i10);
            }
        }

        a(ib.c cVar) {
            this.f31913a = cVar;
        }

        @Override // ib.o.c
        /* renamed from: b */
        public b a(o oVar, CharSequence charSequence) {
            return new C0409a(oVar, charSequence);
        }
    }

    /* compiled from: Splitter.java */
    /* loaded from: classes3.dex */
    private static abstract class b extends ib.a<String> {

        /* renamed from: c  reason: collision with root package name */
        final CharSequence f31915c;

        /* renamed from: d  reason: collision with root package name */
        final ib.c f31916d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f31917e;

        /* renamed from: f  reason: collision with root package name */
        int f31918f = 0;

        /* renamed from: g  reason: collision with root package name */
        int f31919g;

        protected b(o oVar, CharSequence charSequence) {
            this.f31916d = oVar.f31909a;
            this.f31917e = oVar.f31910b;
            this.f31919g = oVar.f31912d;
            this.f31915c = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ib.a
        /* renamed from: e */
        public String b() {
            int g10;
            int i10 = this.f31918f;
            while (true) {
                int i11 = this.f31918f;
                if (i11 != -1) {
                    g10 = g(i11);
                    if (g10 == -1) {
                        g10 = this.f31915c.length();
                        this.f31918f = -1;
                    } else {
                        this.f31918f = f(g10);
                    }
                    int i12 = this.f31918f;
                    if (i12 == i10) {
                        int i13 = i12 + 1;
                        this.f31918f = i13;
                        if (i13 > this.f31915c.length()) {
                            this.f31918f = -1;
                        }
                    } else {
                        while (i10 < g10 && this.f31916d.e(this.f31915c.charAt(i10))) {
                            i10++;
                        }
                        while (g10 > i10 && this.f31916d.e(this.f31915c.charAt(g10 - 1))) {
                            g10--;
                        }
                        if (!this.f31917e || i10 != g10) {
                            break;
                        }
                        i10 = this.f31918f;
                    }
                } else {
                    return c();
                }
            }
            int i14 = this.f31919g;
            if (i14 == 1) {
                g10 = this.f31915c.length();
                this.f31918f = -1;
                while (g10 > i10 && this.f31916d.e(this.f31915c.charAt(g10 - 1))) {
                    g10--;
                }
            } else {
                this.f31919g = i14 - 1;
            }
            return this.f31915c.subSequence(i10, g10).toString();
        }

        abstract int f(int i10);

        abstract int g(int i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Splitter.java */
    /* loaded from: classes3.dex */
    public interface c {
        Iterator<String> a(o oVar, CharSequence charSequence);
    }

    private o(c cVar) {
        this(cVar, false, ib.c.f(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public static o d(char c10) {
        return e(ib.c.d(c10));
    }

    public static o e(ib.c cVar) {
        l.j(cVar);
        return new o(new a(cVar));
    }

    private Iterator<String> g(CharSequence charSequence) {
        return this.f31911c.a(this, charSequence);
    }

    public List<String> f(CharSequence charSequence) {
        l.j(charSequence);
        Iterator<String> g10 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g10.hasNext()) {
            arrayList.add(g10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private o(c cVar, boolean z10, ib.c cVar2, int i10) {
        this.f31911c = cVar;
        this.f31910b = z10;
        this.f31909a = cVar2;
        this.f31912d = i10;
    }
}
