package ba;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.common.api.Api;
import ea.n0;
import java.util.Locale;

/* compiled from: TrackSelectionParameters.java */
/* loaded from: classes2.dex */
public class y implements j8.g {

    /* renamed from: z  reason: collision with root package name */
    public static final y f5149z = new a().z();

    /* renamed from: a  reason: collision with root package name */
    public final int f5150a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5151b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5152c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5153d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5154e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5155f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5156g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5157h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5158i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5159j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f5160k;

    /* renamed from: l  reason: collision with root package name */
    public final jb.s<String> f5161l;

    /* renamed from: m  reason: collision with root package name */
    public final int f5162m;

    /* renamed from: n  reason: collision with root package name */
    public final jb.s<String> f5163n;

    /* renamed from: o  reason: collision with root package name */
    public final int f5164o;

    /* renamed from: p  reason: collision with root package name */
    public final int f5165p;

    /* renamed from: q  reason: collision with root package name */
    public final int f5166q;

    /* renamed from: r  reason: collision with root package name */
    public final jb.s<String> f5167r;

    /* renamed from: s  reason: collision with root package name */
    public final jb.s<String> f5168s;

    /* renamed from: t  reason: collision with root package name */
    public final int f5169t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f5170u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f5171v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f5172w;

    /* renamed from: x  reason: collision with root package name */
    public final w f5173x;

    /* renamed from: y  reason: collision with root package name */
    public final jb.u<Integer> f5174y;

    /* JADX INFO: Access modifiers changed from: protected */
    public y(a aVar) {
        this.f5150a = aVar.f5175a;
        this.f5151b = aVar.f5176b;
        this.f5152c = aVar.f5177c;
        this.f5153d = aVar.f5178d;
        this.f5154e = aVar.f5179e;
        this.f5155f = aVar.f5180f;
        this.f5156g = aVar.f5181g;
        this.f5157h = aVar.f5182h;
        this.f5158i = aVar.f5183i;
        this.f5159j = aVar.f5184j;
        this.f5160k = aVar.f5185k;
        this.f5161l = aVar.f5186l;
        this.f5162m = aVar.f5187m;
        this.f5163n = aVar.f5188n;
        this.f5164o = aVar.f5189o;
        this.f5165p = aVar.f5190p;
        this.f5166q = aVar.f5191q;
        this.f5167r = aVar.f5192r;
        this.f5168s = aVar.f5193s;
        this.f5169t = aVar.f5194t;
        this.f5170u = aVar.f5195u;
        this.f5171v = aVar.f5196v;
        this.f5172w = aVar.f5197w;
        this.f5173x = aVar.f5198x;
        this.f5174y = aVar.f5199y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f5150a == yVar.f5150a && this.f5151b == yVar.f5151b && this.f5152c == yVar.f5152c && this.f5153d == yVar.f5153d && this.f5154e == yVar.f5154e && this.f5155f == yVar.f5155f && this.f5156g == yVar.f5156g && this.f5157h == yVar.f5157h && this.f5160k == yVar.f5160k && this.f5158i == yVar.f5158i && this.f5159j == yVar.f5159j && this.f5161l.equals(yVar.f5161l) && this.f5162m == yVar.f5162m && this.f5163n.equals(yVar.f5163n) && this.f5164o == yVar.f5164o && this.f5165p == yVar.f5165p && this.f5166q == yVar.f5166q && this.f5167r.equals(yVar.f5167r) && this.f5168s.equals(yVar.f5168s) && this.f5169t == yVar.f5169t && this.f5170u == yVar.f5170u && this.f5171v == yVar.f5171v && this.f5172w == yVar.f5172w && this.f5173x.equals(yVar.f5173x) && this.f5174y.equals(yVar.f5174y);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((this.f5150a + 31) * 31) + this.f5151b) * 31) + this.f5152c) * 31) + this.f5153d) * 31) + this.f5154e) * 31) + this.f5155f) * 31) + this.f5156g) * 31) + this.f5157h) * 31) + (this.f5160k ? 1 : 0)) * 31) + this.f5158i) * 31) + this.f5159j) * 31) + this.f5161l.hashCode()) * 31) + this.f5162m) * 31) + this.f5163n.hashCode()) * 31) + this.f5164o) * 31) + this.f5165p) * 31) + this.f5166q) * 31) + this.f5167r.hashCode()) * 31) + this.f5168s.hashCode()) * 31) + this.f5169t) * 31) + (this.f5170u ? 1 : 0)) * 31) + (this.f5171v ? 1 : 0)) * 31) + (this.f5172w ? 1 : 0)) * 31) + this.f5173x.hashCode()) * 31) + this.f5174y.hashCode();
    }

    /* compiled from: TrackSelectionParameters.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f5175a;

        /* renamed from: b  reason: collision with root package name */
        private int f5176b;

        /* renamed from: c  reason: collision with root package name */
        private int f5177c;

        /* renamed from: d  reason: collision with root package name */
        private int f5178d;

        /* renamed from: e  reason: collision with root package name */
        private int f5179e;

        /* renamed from: f  reason: collision with root package name */
        private int f5180f;

        /* renamed from: g  reason: collision with root package name */
        private int f5181g;

        /* renamed from: h  reason: collision with root package name */
        private int f5182h;

        /* renamed from: i  reason: collision with root package name */
        private int f5183i;

        /* renamed from: j  reason: collision with root package name */
        private int f5184j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f5185k;

        /* renamed from: l  reason: collision with root package name */
        private jb.s<String> f5186l;

        /* renamed from: m  reason: collision with root package name */
        private int f5187m;

        /* renamed from: n  reason: collision with root package name */
        private jb.s<String> f5188n;

        /* renamed from: o  reason: collision with root package name */
        private int f5189o;

        /* renamed from: p  reason: collision with root package name */
        private int f5190p;

        /* renamed from: q  reason: collision with root package name */
        private int f5191q;

        /* renamed from: r  reason: collision with root package name */
        private jb.s<String> f5192r;

        /* renamed from: s  reason: collision with root package name */
        private jb.s<String> f5193s;

        /* renamed from: t  reason: collision with root package name */
        private int f5194t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f5195u;

        /* renamed from: v  reason: collision with root package name */
        private boolean f5196v;

        /* renamed from: w  reason: collision with root package name */
        private boolean f5197w;

        /* renamed from: x  reason: collision with root package name */
        private w f5198x;

        /* renamed from: y  reason: collision with root package name */
        private jb.u<Integer> f5199y;

        @Deprecated
        public a() {
            this.f5175a = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f5176b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f5177c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f5178d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f5183i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f5184j = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f5185k = true;
            this.f5186l = jb.s.t();
            this.f5187m = 0;
            this.f5188n = jb.s.t();
            this.f5189o = 0;
            this.f5190p = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f5191q = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f5192r = jb.s.t();
            this.f5193s = jb.s.t();
            this.f5194t = 0;
            this.f5195u = false;
            this.f5196v = false;
            this.f5197w = false;
            this.f5198x = w.f5141b;
            this.f5199y = jb.u.r();
        }

        private void A(y yVar) {
            this.f5175a = yVar.f5150a;
            this.f5176b = yVar.f5151b;
            this.f5177c = yVar.f5152c;
            this.f5178d = yVar.f5153d;
            this.f5179e = yVar.f5154e;
            this.f5180f = yVar.f5155f;
            this.f5181g = yVar.f5156g;
            this.f5182h = yVar.f5157h;
            this.f5183i = yVar.f5158i;
            this.f5184j = yVar.f5159j;
            this.f5185k = yVar.f5160k;
            this.f5186l = yVar.f5161l;
            this.f5187m = yVar.f5162m;
            this.f5188n = yVar.f5163n;
            this.f5189o = yVar.f5164o;
            this.f5190p = yVar.f5165p;
            this.f5191q = yVar.f5166q;
            this.f5192r = yVar.f5167r;
            this.f5193s = yVar.f5168s;
            this.f5194t = yVar.f5169t;
            this.f5195u = yVar.f5170u;
            this.f5196v = yVar.f5171v;
            this.f5197w = yVar.f5172w;
            this.f5198x = yVar.f5173x;
            this.f5199y = yVar.f5174y;
        }

        private void E(Context context) {
            CaptioningManager captioningManager;
            if ((n0.f29709a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f5194t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f5193s = jb.s.u(n0.Z(locale));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a B(y yVar) {
            A(yVar);
            return this;
        }

        public a C(int i10) {
            this.f5178d = i10;
            return this;
        }

        public a D(Context context) {
            if (n0.f29709a >= 19) {
                E(context);
            }
            return this;
        }

        public a F(w wVar) {
            this.f5198x = wVar;
            return this;
        }

        public a G(int i10, int i11, boolean z10) {
            this.f5183i = i10;
            this.f5184j = i11;
            this.f5185k = z10;
            return this;
        }

        public a H(Context context, boolean z10) {
            Point O = n0.O(context);
            return G(O.x, O.y, z10);
        }

        public y z() {
            return new y(this);
        }

        public a(Context context) {
            this();
            D(context);
            H(context, true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(y yVar) {
            A(yVar);
        }
    }
}
