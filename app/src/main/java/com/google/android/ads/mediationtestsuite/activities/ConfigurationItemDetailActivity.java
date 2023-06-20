package com.google.android.ads.mediationtestsuite.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.ads.mediationtestsuite.BatchAdRequestCallbacks;
import com.google.android.ads.mediationtestsuite.dataobjects.BatchAdRequestManager;
import com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.ads.mediationtestsuite.h;
import com.google.android.ads.mediationtestsuite.utils.k;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import q7.b;
import r7.d;
import s7.l;

/* loaded from: classes2.dex */
public class ConfigurationItemDetailActivity extends androidx.appcompat.app.d implements b.h<l>, b.g<l>, p7.c {

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f20745a;

    /* renamed from: b  reason: collision with root package name */
    private s7.d<? extends ConfigurationItem> f20746b;

    /* renamed from: c  reason: collision with root package name */
    private List<com.google.android.ads.mediationtestsuite.viewmodels.e> f20747c;

    /* renamed from: d  reason: collision with root package name */
    private Toolbar f20748d;

    /* renamed from: e  reason: collision with root package name */
    private Toolbar f20749e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<l> f20750f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private q7.b<l> f20751g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f20752h;

    /* renamed from: i  reason: collision with root package name */
    private BatchAdRequestManager f20753i;

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (l lVar : ConfigurationItemDetailActivity.this.f20750f) {
                lVar.k(false);
            }
            ConfigurationItemDetailActivity.this.f20750f.clear();
            ConfigurationItemDetailActivity.m(ConfigurationItemDetailActivity.this.f20748d, ConfigurationItemDetailActivity.this.f20749e);
            ConfigurationItemDetailActivity.this.f20751g.notifyDataSetChanged();
        }
    }

    /* loaded from: classes2.dex */
    class b implements Toolbar.f {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() == com.google.android.ads.mediationtestsuite.d.f20814o) {
                ConfigurationItemDetailActivity.this.n();
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements SearchView.l {
        c() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean a(String str) {
            ConfigurationItemDetailActivity.this.f20751g.getFilter().filter(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean b(String str) {
            ConfigurationItemDetailActivity.this.f20751g.getFilter().filter(str);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements DialogInterface.OnClickListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            ConfigurationItemDetailActivity.this.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements BatchAdRequestCallbacks {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.c f20758a;

        /* loaded from: classes2.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f20758a.dismiss();
                ConfigurationItemDetailActivity.m(ConfigurationItemDetailActivity.this.f20748d, ConfigurationItemDetailActivity.this.f20749e);
                for (l lVar : ConfigurationItemDetailActivity.this.f20750f) {
                    lVar.k(false);
                }
                ConfigurationItemDetailActivity.this.f20750f.clear();
                ConfigurationItemDetailActivity.this.f20751g.notifyDataSetChanged();
            }
        }

        e(androidx.appcompat.app.c cVar) {
            this.f20758a = cVar;
        }

        @Override // com.google.android.ads.mediationtestsuite.BatchAdRequestCallbacks
        public void a(BatchAdRequestManager batchAdRequestManager) {
            Log.i("gma_test", "Finished Testing");
            ConfigurationItemDetailActivity.this.runOnUiThread(new a());
        }

        @Override // com.google.android.ads.mediationtestsuite.BatchAdRequestCallbacks
        public void b(BatchAdRequestManager batchAdRequestManager, NetworkConfig networkConfig) {
            Log.i("gma_test", "Tested config ");
            r7.c.b(new r7.d(networkConfig, d.a.BATCH_REQUEST), ConfigurationItemDetailActivity.this);
        }
    }

    /* loaded from: classes2.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConfigurationItemDetailActivity.this.f20751g.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Toolbar f20762a;

        g(Toolbar toolbar) {
            this.f20762a = toolbar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f20762a.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f20753i.d();
    }

    private void l(SearchView searchView) {
        searchView.setQueryHint(this.f20746b.q(this));
        searchView.setIconified(false);
        searchView.setOnQueryTextListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(Toolbar toolbar, Toolbar toolbar2) {
        toolbar.setAlpha(0.0f);
        toolbar.setVisibility(0);
        ViewPropertyAnimator alpha = toolbar.animate().alpha(1.0f);
        long j10 = (long) ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE;
        alpha.setDuration(j10).setListener(null);
        toolbar2.animate().alpha(0.0f).setDuration(j10).setListener(new g(toolbar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        androidx.appcompat.app.c create = new c.a(this, h.f20900d).g(com.google.android.ads.mediationtestsuite.g.M).h(com.google.android.ads.mediationtestsuite.e.f20834f).b(false).setNegativeButton(com.google.android.ads.mediationtestsuite.g.f20865k, new d()).create();
        create.show();
        HashSet hashSet = new HashSet();
        for (l lVar : this.f20750f) {
            hashSet.add(lVar.n());
        }
        BatchAdRequestManager batchAdRequestManager = new BatchAdRequestManager(this, hashSet, new e(create));
        this.f20753i = batchAdRequestManager;
        batchAdRequestManager.c();
    }

    private void q() {
        if (!this.f20750f.isEmpty()) {
            r();
        }
        boolean z10 = this.f20749e.getVisibility() == 0;
        int size = this.f20750f.size();
        if (!z10 && size > 0) {
            m(this.f20749e, this.f20748d);
        } else if (z10 && size == 0) {
            m(this.f20748d, this.f20749e);
        }
    }

    private void r() {
        this.f20749e.setTitle(getString(com.google.android.ads.mediationtestsuite.g.f20866k0, new Object[]{Integer.valueOf(this.f20750f.size())}));
    }

    @Override // p7.c
    public void a(NetworkConfig networkConfig) {
        if (this.f20747c.contains(new l(networkConfig))) {
            this.f20747c.clear();
            this.f20747c.addAll(this.f20746b.o(this, this.f20752h));
            runOnUiThread(new f());
        }
    }

    @Override // q7.b.g
    /* renamed from: o */
    public void c(l lVar) {
        if (lVar.j()) {
            this.f20750f.add(lVar);
        } else {
            this.f20750f.remove(lVar);
        }
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.google.android.ads.mediationtestsuite.e.f20829a);
        this.f20748d = (Toolbar) findViewById(com.google.android.ads.mediationtestsuite.d.f20815p);
        Toolbar toolbar = (Toolbar) findViewById(com.google.android.ads.mediationtestsuite.d.f20821v);
        this.f20749e = toolbar;
        toolbar.setNavigationIcon(com.google.android.ads.mediationtestsuite.c.f20791d);
        this.f20749e.setNavigationOnClickListener(new a());
        this.f20749e.x(com.google.android.ads.mediationtestsuite.f.f20843a);
        this.f20749e.setOnMenuItemClickListener(new b());
        setSupportActionBar(this.f20748d);
        this.f20752h = getIntent().getBooleanExtra("search_mode", false);
        this.f20745a = (RecyclerView) findViewById(com.google.android.ads.mediationtestsuite.d.f20818s);
        s7.d<? extends ConfigurationItem> n10 = k.d().n(com.google.android.ads.mediationtestsuite.utils.e.j(getIntent().getStringExtra("ad_unit")));
        this.f20746b = n10;
        setTitle(n10.s(this));
        this.f20748d.setSubtitle(this.f20746b.r(this));
        this.f20747c = this.f20746b.o(this, this.f20752h);
        this.f20745a.setLayoutManager(new LinearLayoutManager(this));
        q7.b<l> bVar = new q7.b<>(this, this.f20747c, this);
        this.f20751g = bVar;
        bVar.h(this);
        this.f20745a.setAdapter(this.f20751g);
        if (this.f20752h) {
            this.f20748d.J(0, 0);
            getSupportActionBar().r(com.google.android.ads.mediationtestsuite.e.f20838j);
            getSupportActionBar().t(true);
            getSupportActionBar().u(false);
            getSupportActionBar().v(false);
            l((SearchView) getSupportActionBar().i());
        }
        com.google.android.ads.mediationtestsuite.utils.e.e(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        if (this.f20752h) {
            return false;
        }
        menuInflater.inflate(com.google.android.ads.mediationtestsuite.f.f20844b, menu);
        com.google.android.ads.mediationtestsuite.utils.l.a(menu, getResources().getColor(com.google.android.ads.mediationtestsuite.b.f20779c));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.google.android.ads.mediationtestsuite.utils.e.v(this);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() == com.google.android.ads.mediationtestsuite.d.f20820u) {
            Intent intent = new Intent(this, ConfigurationItemDetailActivity.class);
            intent.putExtra("search_mode", true);
            intent.putExtra("ad_unit", this.f20746b.p().e());
            startActivity(intent);
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        q();
    }

    @Override // q7.b.h
    /* renamed from: p */
    public void b(l lVar) {
        Intent intent = new Intent(this, NetworkDetailActivity.class);
        intent.putExtra("network_config", lVar.n().m());
        startActivityForResult(intent, lVar.n().m());
    }
}
