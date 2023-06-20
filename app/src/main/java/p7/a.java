package p7;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem;
import com.google.android.ads.mediationtestsuite.utils.k;
import com.google.android.ads.mediationtestsuite.viewmodels.e;
import java.util.ArrayList;
import java.util.List;
import q7.b;
import s7.d;
import s7.m;
import s7.o;

/* compiled from: ConfigurationItemsFragment.java */
/* loaded from: classes2.dex */
public class a extends Fragment implements p7.b {

    /* renamed from: a  reason: collision with root package name */
    private int f35581a;

    /* renamed from: b  reason: collision with root package name */
    private int f35582b;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f35583c;

    /* renamed from: d  reason: collision with root package name */
    private List<e> f35584d;

    /* renamed from: e  reason: collision with root package name */
    private q7.b<d<? extends ConfigurationItem>> f35585e;

    /* compiled from: ConfigurationItemsFragment.java */
    /* renamed from: p7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0476a implements m.c {
        C0476a() {
        }

        @Override // s7.m.c
        public void a() {
            String f10;
            try {
                f10 = com.google.android.ads.mediationtestsuite.utils.c.f();
            } catch (ActivityNotFoundException e10) {
                Log.w("gma_test", e10.getLocalizedMessage());
                e10.printStackTrace();
            }
            if (f10 == null) {
                Toast.makeText(a.this.getContext(), "AdvertisingId not available", 0).show();
                return;
            }
            a.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(k.d().g(f10))));
            k.u();
            a.this.h();
        }

        @Override // s7.m.c
        public void b() {
            k.u();
            a.this.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfigurationItemsFragment.java */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s7.e d10 = a.this.d();
            List<ConfigurationItem> a10 = d10.a();
            if (a10 != null) {
                a.this.f35584d.clear();
                a.this.f35584d.addAll(o.a(a10, d10.c()));
                a.this.f35585e.g();
            }
        }
    }

    public static a f(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("index", i10);
        bundle.putInt("type", 0);
        a aVar = new a();
        aVar.setArguments(bundle);
        return aVar;
    }

    public static a g() {
        Bundle bundle = new Bundle();
        bundle.putInt("index", -1);
        bundle.putInt("type", 1);
        a aVar = new a();
        aVar.setArguments(bundle);
        return aVar;
    }

    @Override // p7.b
    public void a() {
        h();
    }

    public s7.e d() {
        int i10 = this.f35582b;
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return com.google.android.ads.mediationtestsuite.utils.e.p();
        }
        return com.google.android.ads.mediationtestsuite.utils.e.m().a().get(this.f35581a);
    }

    public void e(CharSequence charSequence) {
        this.f35585e.getFilter().filter(charSequence);
    }

    public void h() {
        getActivity().runOnUiThread(new b());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f35581a = getArguments().getInt("index");
        this.f35582b = getArguments().getInt("type");
        this.f35584d = new ArrayList();
        androidx.fragment.app.d activity = getActivity();
        this.f35583c.setLayoutManager(new LinearLayoutManager(activity));
        q7.b<d<? extends ConfigurationItem>> bVar = new q7.b<>(activity, this.f35584d, null);
        this.f35585e = bVar;
        this.f35583c.setAdapter(bVar);
        com.google.android.ads.mediationtestsuite.utils.e.d(this);
        if (b.h.class.isInstance(activity)) {
            this.f35585e.i((b.h) activity);
        }
        this.f35585e.j(new C0476a());
        h();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(com.google.android.ads.mediationtestsuite.e.f20835g, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.google.android.ads.mediationtestsuite.utils.e.u(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f35583c = (RecyclerView) view.findViewById(com.google.android.ads.mediationtestsuite.d.f20818s);
    }
}
