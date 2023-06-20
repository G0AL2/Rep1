package q7;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;
import java.util.ArrayList;
import java.util.List;
import r7.f;
import s7.e;

/* compiled from: HomeActivityPagerAdapter.java */
/* loaded from: classes2.dex */
public class a extends r {

    /* renamed from: h  reason: collision with root package name */
    private final Context f35954h;

    /* renamed from: i  reason: collision with root package name */
    private final List<p7.a> f35955i;

    /* renamed from: j  reason: collision with root package name */
    private List<e> f35956j;

    public a(FragmentManager fragmentManager, Context context, List<e> list) {
        super(fragmentManager, 1);
        this.f35955i = new ArrayList();
        this.f35954h = context;
        this.f35956j = list;
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f35955i.add(p7.a.f(i10));
        }
    }

    @Override // androidx.fragment.app.r
    public Fragment a(int i10) {
        return this.f35955i.get(i10);
    }

    public f.a b(int i10) {
        return this.f35956j.get(i10).c();
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f35955i.size();
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence getPageTitle(int i10) {
        return this.f35956j.get(i10).b(this.f35954h);
    }
}
