package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    e f1062a;

    /* renamed from: b  reason: collision with root package name */
    private int f1063b = -1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1064c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1065d;

    /* renamed from: e  reason: collision with root package name */
    private final LayoutInflater f1066e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1067f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f1065d = z10;
        this.f1066e = layoutInflater;
        this.f1062a = eVar;
        this.f1067f = i10;
        a();
    }

    void a() {
        g v10 = this.f1062a.v();
        if (v10 != null) {
            ArrayList<g> z10 = this.f1062a.z();
            int size = z10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (z10.get(i10) == v10) {
                    this.f1063b = i10;
                    return;
                }
            }
        }
        this.f1063b = -1;
    }

    public e b() {
        return this.f1062a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public g getItem(int i10) {
        ArrayList<g> z10 = this.f1065d ? this.f1062a.z() : this.f1062a.E();
        int i11 = this.f1063b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return z10.get(i10);
    }

    public void d(boolean z10) {
        this.f1064c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> z10 = this.f1065d ? this.f1062a.z() : this.f1062a.E();
        if (this.f1063b < 0) {
            return z10.size();
        }
        return z10.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1066e.inflate(this.f1067f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1062a.F() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f1064c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
