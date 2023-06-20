package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    Context f1051a;

    /* renamed from: b  reason: collision with root package name */
    LayoutInflater f1052b;

    /* renamed from: c  reason: collision with root package name */
    e f1053c;

    /* renamed from: d  reason: collision with root package name */
    ExpandedMenuView f1054d;

    /* renamed from: e  reason: collision with root package name */
    int f1055e;

    /* renamed from: f  reason: collision with root package name */
    int f1056f;

    /* renamed from: g  reason: collision with root package name */
    int f1057g;

    /* renamed from: h  reason: collision with root package name */
    private j.a f1058h;

    /* renamed from: i  reason: collision with root package name */
    a f1059i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private int f1060a = -1;

        public a() {
            a();
        }

        void a() {
            g v10 = c.this.f1053c.v();
            if (v10 != null) {
                ArrayList<g> z10 = c.this.f1053c.z();
                int size = z10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (z10.get(i10) == v10) {
                        this.f1060a = i10;
                        return;
                    }
                }
            }
            this.f1060a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public g getItem(int i10) {
            ArrayList<g> z10 = c.this.f1053c.z();
            int i11 = i10 + c.this.f1055e;
            int i12 = this.f1060a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return z10.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f1053c.z().size() - c.this.f1055e;
            return this.f1060a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f1052b.inflate(cVar.f1057g, viewGroup, false);
            }
            ((k.a) view).c(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f1051a = context;
        this.f1052b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f1059i == null) {
            this.f1059i = new a();
        }
        return this.f1059i;
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z10) {
        j.a aVar = this.f1058h;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(j.a aVar) {
        this.f1058h = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e(m mVar) {
        if (mVar.hasVisibleItems()) {
            new f(mVar).d(null);
            j.a aVar = this.f1058h;
            if (aVar != null) {
                aVar.c(mVar);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        a aVar = this.f1059i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean h(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        if (this.f1056f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1056f);
            this.f1051a = contextThemeWrapper;
            this.f1052b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1051a != null) {
            this.f1051a = context;
            if (this.f1052b == null) {
                this.f1052b = LayoutInflater.from(context);
            }
        }
        this.f1053c = eVar;
        a aVar = this.f1059i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public k j(ViewGroup viewGroup) {
        if (this.f1054d == null) {
            this.f1054d = (ExpandedMenuView) this.f1052b.inflate(d.g.f28763g, viewGroup, false);
            if (this.f1059i == null) {
                this.f1059i = new a();
            }
            this.f1054d.setAdapter((ListAdapter) this.f1059i);
            this.f1054d.setOnItemClickListener(this);
        }
        return this.f1054d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f1053c.M(this.f1059i.getItem(i10), this, 0);
    }

    public c(int i10, int i11) {
        this.f1057g = i10;
        this.f1056f = i11;
    }
}
