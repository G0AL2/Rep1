package q7;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.ads.mediationtestsuite.dataobjects.Caption;
import com.google.android.ads.mediationtestsuite.dataobjects.Matchable;
import com.google.android.ads.mediationtestsuite.viewmodels.b;
import com.google.android.ads.mediationtestsuite.viewmodels.e;
import java.util.ArrayList;
import java.util.List;
import s7.i;
import s7.m;

/* compiled from: ItemsListRecyclerViewAdapter.java */
/* loaded from: classes2.dex */
public class b<T extends com.google.android.ads.mediationtestsuite.viewmodels.b> extends RecyclerView.h<RecyclerView.d0> implements Filterable {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.google.android.ads.mediationtestsuite.viewmodels.e> f35957a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.google.android.ads.mediationtestsuite.viewmodels.e> f35958b;

    /* renamed from: c  reason: collision with root package name */
    private CharSequence f35959c;

    /* renamed from: d  reason: collision with root package name */
    private Activity f35960d;

    /* renamed from: e  reason: collision with root package name */
    private h<T> f35961e;

    /* renamed from: f  reason: collision with root package name */
    private g<T> f35962f;

    /* renamed from: g  reason: collision with root package name */
    private m.c f35963g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemsListRecyclerViewAdapter.java */
    /* loaded from: classes2.dex */
    public class a extends Filter {
        a() {
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            b.this.f35959c = charSequence;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (charSequence != null && charSequence.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (com.google.android.ads.mediationtestsuite.viewmodels.e eVar : b.this.f35957a) {
                    if (eVar instanceof Matchable) {
                        if (((Matchable) eVar).c(charSequence)) {
                            arrayList.add(eVar);
                        }
                    } else {
                        arrayList.add(eVar);
                    }
                }
                filterResults.values = new C0480b(b.this, arrayList);
            }
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            Object obj = filterResults.values;
            if (obj != null && C0480b.class.isAssignableFrom(obj.getClass())) {
                b.this.f35958b = ((C0480b) obj).f35965a;
            } else {
                b bVar = b.this;
                bVar.f35958b = bVar.f35957a;
            }
            b.this.notifyDataSetChanged();
        }
    }

    /* compiled from: ItemsListRecyclerViewAdapter.java */
    /* renamed from: q7.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0480b {

        /* renamed from: a  reason: collision with root package name */
        final List<com.google.android.ads.mediationtestsuite.viewmodels.e> f35965a;

        C0480b(b bVar, List<com.google.android.ads.mediationtestsuite.viewmodels.e> list) {
            this.f35965a = list;
        }
    }

    /* compiled from: ItemsListRecyclerViewAdapter.java */
    /* loaded from: classes2.dex */
    class c implements m.c {
        c() {
        }

        @Override // s7.m.c
        public void a() {
            if (b.this.f35963g != null) {
                b.this.f35963g.a();
            }
        }

        @Override // s7.m.c
        public void b() {
            if (b.this.f35963g != null) {
                b.this.f35963g.b();
            }
        }
    }

    /* compiled from: ItemsListRecyclerViewAdapter.java */
    /* loaded from: classes2.dex */
    class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.ads.mediationtestsuite.viewmodels.b f35967a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CheckBox f35968b;

        d(com.google.android.ads.mediationtestsuite.viewmodels.b bVar, CheckBox checkBox) {
            this.f35967a = bVar;
            this.f35968b = checkBox;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f35962f != null) {
                this.f35967a.k(this.f35968b.isChecked());
                try {
                    b.this.f35962f.c(this.f35967a);
                } catch (ClassCastException e10) {
                    Log.e("gma_test", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* compiled from: ItemsListRecyclerViewAdapter.java */
    /* loaded from: classes2.dex */
    class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.android.ads.mediationtestsuite.viewmodels.b f35970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.android.ads.mediationtestsuite.viewmodels.e f35971b;

        e(com.google.android.ads.mediationtestsuite.viewmodels.b bVar, com.google.android.ads.mediationtestsuite.viewmodels.e eVar) {
            this.f35970a = bVar;
            this.f35971b = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b.this.f35961e != null) {
                try {
                    b.this.f35961e.b(this.f35970a);
                } catch (ClassCastException unused) {
                    Log.w("gma_test", "Item not selectable: " + this.f35971b.toString());
                }
            }
        }
    }

    /* compiled from: ItemsListRecyclerViewAdapter.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35973a;

        static {
            int[] iArr = new int[e.a.values().length];
            f35973a = iArr;
            try {
                iArr[e.a.AD_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35973a[e.a.DETAIL_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35973a[e.a.HEADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35973a[e.a.REGISTER_TEST_DEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35973a[e.a.INFO_LABEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: ItemsListRecyclerViewAdapter.java */
    /* loaded from: classes2.dex */
    public interface g<T extends com.google.android.ads.mediationtestsuite.viewmodels.b> {
        void c(T t10);
    }

    /* compiled from: ItemsListRecyclerViewAdapter.java */
    /* loaded from: classes2.dex */
    public interface h<T extends com.google.android.ads.mediationtestsuite.viewmodels.b> {
        void b(T t10);
    }

    public b(Activity activity, List<com.google.android.ads.mediationtestsuite.viewmodels.e> list, h<T> hVar) {
        this.f35960d = activity;
        this.f35957a = list;
        this.f35958b = list;
        this.f35961e = hVar;
    }

    public void g() {
        getFilter().filter(this.f35959c);
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return new a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f35958b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f35958b.get(i10).f().g();
    }

    public void h(g<T> gVar) {
        this.f35962f = gVar;
    }

    public void i(h<T> hVar) {
        this.f35961e = hVar;
    }

    public void j(m.c cVar) {
        this.f35963g = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i10) {
        e.a h10 = e.a.h(getItemViewType(i10));
        com.google.android.ads.mediationtestsuite.viewmodels.e eVar = this.f35958b.get(i10);
        int i11 = f.f35973a[h10.ordinal()];
        if (i11 == 1) {
            ((s7.a) d0Var).q(((com.google.android.ads.mediationtestsuite.viewmodels.a) this.f35958b.get(i10)).a());
        } else if (i11 == 2) {
            com.google.android.ads.mediationtestsuite.viewmodels.b bVar = (com.google.android.ads.mediationtestsuite.viewmodels.b) eVar;
            i iVar = (i) d0Var;
            iVar.c().removeAllViewsInLayout();
            Context context = iVar.g().getContext();
            iVar.f().setText(bVar.i(context));
            String h11 = bVar.h(context);
            TextView e10 = iVar.e();
            if (h11 == null) {
                e10.setVisibility(8);
            } else {
                e10.setText(h11);
                e10.setVisibility(0);
            }
            CheckBox d10 = iVar.d();
            d10.setChecked(bVar.j());
            d10.setVisibility(bVar.m() ? 0 : 8);
            d10.setEnabled(bVar.l());
            d10.setOnClickListener(new d(bVar, d10));
            d10.setVisibility(bVar.m() ? 0 : 8);
            List<Caption> g10 = bVar.g();
            if (g10.isEmpty()) {
                iVar.c().setVisibility(8);
            } else {
                for (Caption caption : g10) {
                    iVar.c().addView(new s7.c(context, caption));
                }
                iVar.c().setVisibility(0);
            }
            iVar.g().setOnClickListener(new e(bVar, eVar));
        } else if (i11 == 3) {
            ((s7.f) d0Var).c().setText(((com.google.android.ads.mediationtestsuite.viewmodels.c) eVar).a());
        } else if (i11 == 5) {
            s7.h hVar = (s7.h) d0Var;
            Context context2 = hVar.f().getContext();
            com.google.android.ads.mediationtestsuite.viewmodels.d dVar = (com.google.android.ads.mediationtestsuite.viewmodels.d) eVar;
            hVar.e().setText(dVar.c());
            hVar.c().setText(dVar.a());
            if (dVar.b() != null) {
                hVar.d().setVisibility(0);
                hVar.d().setImageResource(dVar.b().h());
                androidx.core.widget.f.c(hVar.d(), ColorStateList.valueOf(context2.getResources().getColor(dVar.b().j())));
                return;
            }
            hVar.d().setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        int i11 = f.f35973a[e.a.h(i10).ordinal()];
        if (i11 == 1) {
            return new s7.a(this.f35960d, LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.ads.mediationtestsuite.e.f20839k, viewGroup, false));
        } else if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        return null;
                    }
                    return new s7.h(LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.ads.mediationtestsuite.e.f20836h, viewGroup, false));
                }
                return new m(LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.ads.mediationtestsuite.e.f20841m, viewGroup, false), new c());
            }
            return new s7.f(LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.ads.mediationtestsuite.e.f20842n, viewGroup, false));
        } else {
            return new i(LayoutInflater.from(viewGroup.getContext()).inflate(com.google.android.ads.mediationtestsuite.e.f20837i, viewGroup, false));
        }
    }
}
