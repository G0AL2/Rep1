package s7;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.ads.mediationtestsuite.dataobjects.AdFormat;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.ads.mediationtestsuite.dataobjects.TestResult;
import com.google.android.ads.mediationtestsuite.viewmodels.TestState;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeAd;
import r7.d;

/* compiled from: AdLoadViewHolder.java */
/* loaded from: classes2.dex */
public class a extends RecyclerView.d0 implements com.google.android.ads.mediationtestsuite.a {

    /* renamed from: a  reason: collision with root package name */
    private NetworkConfig f36747a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f36748b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageView f36749c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f36750d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f36751e;

    /* renamed from: f  reason: collision with root package name */
    private final Button f36752f;

    /* renamed from: g  reason: collision with root package name */
    private final FrameLayout f36753g;

    /* renamed from: h  reason: collision with root package name */
    private final ConstraintLayout f36754h;

    /* renamed from: i  reason: collision with root package name */
    private final View.OnClickListener f36755i;

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f36756j;

    /* renamed from: k  reason: collision with root package name */
    private final View.OnClickListener f36757k;

    /* renamed from: l  reason: collision with root package name */
    private com.google.android.ads.mediationtestsuite.utils.a f36758l;

    /* compiled from: AdLoadViewHolder.java */
    /* renamed from: s7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class View$OnClickListenerC0496a implements View.OnClickListener {
        View$OnClickListenerC0496a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.m();
        }
    }

    /* compiled from: AdLoadViewHolder.java */
    /* loaded from: classes2.dex */
    class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f36760a;

        b(Activity activity) {
            this.f36760a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p(true);
            a aVar = a.this;
            aVar.f36758l = aVar.f36747a.i().g().createAdLoader(a.this.f36747a, a.this);
            a.this.f36758l.e(this.f36760a);
        }
    }

    /* compiled from: AdLoadViewHolder.java */
    /* loaded from: classes2.dex */
    class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f36762a;

        c(Activity activity) {
            this.f36762a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            r7.c.b(new r7.e(a.this.f36747a), view.getContext());
            a.this.f36758l.f(this.f36762a);
            a.this.f36752f.setText(com.google.android.ads.mediationtestsuite.g.f20867l);
            a.this.k();
        }
    }

    /* compiled from: AdLoadViewHolder.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f36764a;

        static {
            int[] iArr = new int[AdFormat.values().length];
            f36764a = iArr;
            try {
                iArr[AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36764a[AdFormat.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(Activity activity, View view) {
        super(view);
        this.f36748b = false;
        this.f36749c = (ImageView) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20813n);
        this.f36750d = (TextView) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20823x);
        TextView textView = (TextView) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20810k);
        this.f36751e = textView;
        this.f36752f = (Button) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20800a);
        this.f36753g = (FrameLayout) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20801b);
        this.f36754h = (ConstraintLayout) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20816q);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f36757k = new View$OnClickListenerC0496a();
        this.f36756j = new b(activity);
        this.f36755i = new c(activity);
    }

    private void j() {
        this.f36752f.setOnClickListener(this.f36757k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f36752f.setOnClickListener(this.f36756j);
    }

    private void l() {
        this.f36752f.setOnClickListener(this.f36755i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.f36758l.a();
        this.f36748b = false;
        this.f36752f.setText(com.google.android.ads.mediationtestsuite.g.f20867l);
        t();
        k();
        this.f36753g.setVisibility(4);
    }

    private void n() {
        r7.c.b(new r7.d(this.f36747a, d.a.AD_SOURCE), this.itemView.getContext());
    }

    private void o() {
        this.f36751e.setText(com.google.android.ads.mediationtestsuite.utils.k.d().l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(boolean z10) {
        this.f36748b = z10;
        if (z10) {
            j();
        }
        t();
    }

    private void r(TestResult testResult) {
        this.f36750d.setText(testResult.getText(this.itemView.getContext()));
    }

    private void s() {
        this.f36750d.setText(com.google.android.ads.mediationtestsuite.utils.e.k().getString(com.google.android.ads.mediationtestsuite.g.f20845a, this.f36747a.i().g().getDisplayString()));
        this.f36751e.setVisibility(8);
    }

    private void t() {
        this.f36752f.setEnabled(true);
        if (!this.f36747a.i().g().equals(AdFormat.BANNER)) {
            this.f36753g.setVisibility(4);
            if (this.f36747a.I()) {
                this.f36752f.setVisibility(0);
                this.f36752f.setText(com.google.android.ads.mediationtestsuite.g.f20867l);
            }
        }
        TestState testState = this.f36747a.o().getTestState();
        int h10 = testState.h();
        int g10 = testState.g();
        int j10 = testState.j();
        this.f36749c.setImageResource(h10);
        ImageView imageView = this.f36749c;
        z.v0(imageView, ColorStateList.valueOf(imageView.getResources().getColor(g10)));
        androidx.core.widget.f.c(this.f36749c, ColorStateList.valueOf(this.f36749c.getResources().getColor(j10)));
        if (this.f36748b) {
            this.f36749c.setImageResource(com.google.android.ads.mediationtestsuite.c.f20795h);
            int color = this.f36749c.getResources().getColor(com.google.android.ads.mediationtestsuite.b.f20778b);
            int color2 = this.f36749c.getResources().getColor(com.google.android.ads.mediationtestsuite.b.f20777a);
            z.v0(this.f36749c, ColorStateList.valueOf(color));
            androidx.core.widget.f.c(this.f36749c, ColorStateList.valueOf(color2));
            this.f36750d.setText(com.google.android.ads.mediationtestsuite.g.f20849c);
            this.f36752f.setText(com.google.android.ads.mediationtestsuite.g.f20865k);
        } else if (this.f36747a.D()) {
            if (this.f36747a.I()) {
                s();
            } else if (this.f36747a.o().equals(TestResult.UNTESTED)) {
                this.f36752f.setText(com.google.android.ads.mediationtestsuite.g.f20867l);
                this.f36750d.setText(com.google.android.ads.mediationtestsuite.g.f20864j0);
                this.f36751e.setText(com.google.android.ads.mediationtestsuite.utils.k.d().a());
            } else {
                r(this.f36747a.o());
                o();
                this.f36752f.setText(com.google.android.ads.mediationtestsuite.g.f20871n);
            }
        } else {
            this.f36750d.setText(com.google.android.ads.mediationtestsuite.g.f20887v);
            this.f36751e.setText(Html.fromHtml(this.f36747a.r(this.f36749c.getContext())));
            this.f36752f.setVisibility(0);
            this.f36752f.setEnabled(false);
        }
    }

    @Override // com.google.android.ads.mediationtestsuite.a
    public void a(com.google.android.ads.mediationtestsuite.utils.a aVar, LoadAdError loadAdError) {
        n();
        TestResult failureResult = TestResult.getFailureResult(loadAdError.getCode());
        p(false);
        k();
        r(failureResult);
        o();
    }

    @Override // com.google.android.ads.mediationtestsuite.a
    public void b(com.google.android.ads.mediationtestsuite.utils.a aVar) {
        n();
        int i10 = d.f36764a[aVar.d().i().g().ordinal()];
        if (i10 == 1) {
            AdView g10 = ((com.google.android.ads.mediationtestsuite.utils.d) this.f36758l).g();
            if (g10 != null && g10.getParent() == null) {
                this.f36753g.addView(g10);
            }
            this.f36752f.setVisibility(8);
            this.f36753g.setVisibility(0);
            p(false);
        } else if (i10 != 2) {
            p(false);
            this.f36752f.setText(com.google.android.ads.mediationtestsuite.g.f20869m);
            l();
        } else {
            p(false);
            NativeAd h10 = ((com.google.android.ads.mediationtestsuite.utils.h) this.f36758l).h();
            if (h10 == null) {
                k();
                this.f36752f.setText(com.google.android.ads.mediationtestsuite.g.f20867l);
                this.f36752f.setVisibility(0);
                this.f36754h.setVisibility(8);
                return;
            }
            ((TextView) this.f36754h.findViewById(com.google.android.ads.mediationtestsuite.d.f20810k)).setText(new j(this.itemView.getContext(), h10).b());
            this.f36752f.setVisibility(8);
            this.f36754h.setVisibility(0);
        }
    }

    public void q(NetworkConfig networkConfig) {
        this.f36747a = networkConfig;
        this.f36748b = false;
        t();
        k();
    }
}
