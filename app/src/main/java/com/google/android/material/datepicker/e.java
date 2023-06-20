package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class e<S> extends com.google.android.material.datepicker.l<S> {

    /* renamed from: l  reason: collision with root package name */
    static final Object f22284l = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: m  reason: collision with root package name */
    static final Object f22285m = "NAVIGATION_PREV_TAG";

    /* renamed from: n  reason: collision with root package name */
    static final Object f22286n = "NAVIGATION_NEXT_TAG";

    /* renamed from: o  reason: collision with root package name */
    static final Object f22287o = "SELECTOR_TOGGLE_TAG";

    /* renamed from: b  reason: collision with root package name */
    private int f22288b;

    /* renamed from: c  reason: collision with root package name */
    private DateSelector<S> f22289c;

    /* renamed from: d  reason: collision with root package name */
    private CalendarConstraints f22290d;

    /* renamed from: e  reason: collision with root package name */
    private Month f22291e;

    /* renamed from: f  reason: collision with root package name */
    private k f22292f;

    /* renamed from: g  reason: collision with root package name */
    private com.google.android.material.datepicker.b f22293g;

    /* renamed from: h  reason: collision with root package name */
    private RecyclerView f22294h;

    /* renamed from: i  reason: collision with root package name */
    private RecyclerView f22295i;

    /* renamed from: j  reason: collision with root package name */
    private View f22296j;

    /* renamed from: k  reason: collision with root package name */
    private View f22297k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f22298a;

        a(int i10) {
            this.f22298a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f22295i.smoothScrollToPosition(this.f22298a);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    class b extends androidx.core.view.a {
        b(e eVar) {
        }

        @Override // androidx.core.view.a
        public void g(View view, i0.c cVar) {
            super.g(view, cVar);
            cVar.c0(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    class c extends m {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.I = i11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void U1(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = e.this.f22295i.getWidth();
                iArr[1] = e.this.f22295i.getWidth();
                return;
            }
            iArr[0] = e.this.f22295i.getHeight();
            iArr[1] = e.this.f22295i.getHeight();
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    class d implements l {
        d() {
        }

        @Override // com.google.android.material.datepicker.e.l
        public void a(long j10) {
            if (e.this.f22290d.h().b(j10)) {
                e.this.f22289c.d1(j10);
                Iterator<com.google.android.material.datepicker.k<S>> it = e.this.f22355a.iterator();
                while (it.hasNext()) {
                    it.next().a((S) e.this.f22289c.X0());
                }
                e.this.f22295i.getAdapter().notifyDataSetChanged();
                if (e.this.f22294h != null) {
                    e.this.f22294h.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0297e extends RecyclerView.o {

        /* renamed from: a  reason: collision with root package name */
        private final Calendar f22301a = n.k();

        /* renamed from: b  reason: collision with root package name */
        private final Calendar f22302b = n.k();

        C0297e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int width;
            if ((recyclerView.getAdapter() instanceof o) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                o oVar = (o) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (h0.d<Long, Long> dVar : e.this.f22289c.s0()) {
                    Long l10 = dVar.f31049a;
                    if (l10 != null && dVar.f31050b != null) {
                        this.f22301a.setTimeInMillis(l10.longValue());
                        this.f22302b.setTimeInMillis(dVar.f31050b.longValue());
                        int c10 = oVar.c(this.f22301a.get(1));
                        int c11 = oVar.c(this.f22302b.get(1));
                        View M = gridLayoutManager.M(c10);
                        View M2 = gridLayoutManager.M(c11);
                        int b32 = c10 / gridLayoutManager.b3();
                        int b33 = c11 / gridLayoutManager.b3();
                        int i10 = b32;
                        while (i10 <= b33) {
                            View M3 = gridLayoutManager.M(gridLayoutManager.b3() * i10);
                            if (M3 != null) {
                                int top = M3.getTop() + e.this.f22293g.f22275d.c();
                                int bottom = M3.getBottom() - e.this.f22293g.f22275d.b();
                                int left = i10 == b32 ? M.getLeft() + (M.getWidth() / 2) : 0;
                                if (i10 == b33) {
                                    width = M2.getLeft() + (M2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(left, top, width, bottom, e.this.f22293g.f22279h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class f extends androidx.core.view.a {
        f() {
        }

        @Override // androidx.core.view.a
        public void g(View view, i0.c cVar) {
            String string;
            super.g(view, cVar);
            if (e.this.f22297k.getVisibility() == 0) {
                string = e.this.getString(ha.j.f31250p);
            } else {
                string = e.this.getString(ha.j.f31248n);
            }
            cVar.l0(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class g extends RecyclerView.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.j f22305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MaterialButton f22306b;

        g(com.google.android.material.datepicker.j jVar, MaterialButton materialButton) {
            this.f22305a = jVar;
            this.f22306b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                CharSequence text = this.f22306b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int i22;
            if (i10 < 0) {
                i22 = e.this.r().g2();
            } else {
                i22 = e.this.r().i2();
            }
            e.this.f22291e = this.f22305a.b(i22);
            this.f22306b.setText(this.f22305a.c(i22));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.j f22309a;

        i(com.google.android.material.datepicker.j jVar) {
            this.f22309a = jVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int g22 = e.this.r().g2() + 1;
            if (g22 < e.this.f22295i.getAdapter().getItemCount()) {
                e.this.u(this.f22309a.b(g22));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.j f22311a;

        j(com.google.android.material.datepicker.j jVar) {
            this.f22311a = jVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i22 = e.this.r().i2() - 1;
            if (i22 >= 0) {
                e.this.u(this.f22311a.b(i22));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public interface l {
        void a(long j10);
    }

    private void k(View view, com.google.android.material.datepicker.j jVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(ha.f.f31199f);
        materialButton.setTag(f22287o);
        z.q0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(ha.f.f31201h);
        materialButton2.setTag(f22285m);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(ha.f.f31200g);
        materialButton3.setTag(f22286n);
        this.f22296j = view.findViewById(ha.f.f31208o);
        this.f22297k = view.findViewById(ha.f.f31203j);
        v(k.DAY);
        materialButton.setText(this.f22291e.i());
        this.f22295i.addOnScrollListener(new g(jVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(jVar));
        materialButton2.setOnClickListener(new j(jVar));
    }

    private RecyclerView.o l() {
        return new C0297e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(Context context) {
        return context.getResources().getDimensionPixelSize(ha.d.f31179s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> e<T> s(DateSelector<T> dateSelector, int i10, CalendarConstraints calendarConstraints) {
        e<T> eVar = new e<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.k());
        eVar.setArguments(bundle);
        return eVar;
    }

    private void t(int i10) {
        this.f22295i.post(new a(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CalendarConstraints m() {
        return this.f22290d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.b n() {
        return this.f22293g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month o() {
        return this.f22291e;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f22288b = bundle.getInt("THEME_RES_ID_KEY");
        this.f22289c = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f22290d = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f22291e = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f22288b);
        this.f22293g = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month l10 = this.f22290d.l();
        if (com.google.android.material.datepicker.f.q(contextThemeWrapper)) {
            i10 = ha.h.f31230j;
            i11 = 1;
        } else {
            i10 = ha.h.f31228h;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(ha.f.f31204k);
        z.q0(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.d());
        gridView.setNumColumns(l10.f22263e);
        gridView.setEnabled(false);
        this.f22295i = (RecyclerView) inflate.findViewById(ha.f.f31207n);
        this.f22295i.setLayoutManager(new c(getContext(), i11, false, i11));
        this.f22295i.setTag(f22284l);
        com.google.android.material.datepicker.j jVar = new com.google.android.material.datepicker.j(contextThemeWrapper, this.f22289c, this.f22290d, new d());
        this.f22295i.setAdapter(jVar);
        int integer = contextThemeWrapper.getResources().getInteger(ha.g.f31220b);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(ha.f.f31208o);
        this.f22294h = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f22294h.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f22294h.setAdapter(new o(this));
            this.f22294h.addItemDecoration(l());
        }
        if (inflate.findViewById(ha.f.f31199f) != null) {
            k(inflate, jVar);
        }
        if (!com.google.android.material.datepicker.f.q(contextThemeWrapper)) {
            new androidx.recyclerview.widget.h().b(this.f22295i);
        }
        this.f22295i.scrollToPosition(jVar.d(this.f22291e));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f22288b);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f22289c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f22290d);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f22291e);
    }

    public DateSelector<S> p() {
        return this.f22289c;
    }

    LinearLayoutManager r() {
        return (LinearLayoutManager) this.f22295i.getLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(Month month) {
        com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) this.f22295i.getAdapter();
        int d10 = jVar.d(month);
        int d11 = d10 - jVar.d(this.f22291e);
        boolean z10 = Math.abs(d11) > 3;
        boolean z11 = d11 > 0;
        this.f22291e = month;
        if (z10 && z11) {
            this.f22295i.scrollToPosition(d10 - 3);
            t(d10);
        } else if (z10) {
            this.f22295i.scrollToPosition(d10 + 3);
            t(d10);
        } else {
            t(d10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(k kVar) {
        this.f22292f = kVar;
        if (kVar == k.YEAR) {
            this.f22294h.getLayoutManager().F1(((o) this.f22294h.getAdapter()).c(this.f22291e.f22262d));
            this.f22296j.setVisibility(0);
            this.f22297k.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f22296j.setVisibility(8);
            this.f22297k.setVisibility(0);
            u(this.f22291e);
        }
    }

    void w() {
        k kVar = this.f22292f;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            v(k.DAY);
        } else if (kVar == k.DAY) {
            v(kVar2);
        }
    }
}
