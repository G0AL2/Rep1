package com.google.android.ads.mediationtestsuite.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.ads.mediationtestsuite.MediationTestSuite;
import com.google.android.ads.mediationtestsuite.MediationTestSuiteListener;
import com.google.android.ads.mediationtestsuite.g;
import com.google.android.ads.mediationtestsuite.h;
import com.google.android.ads.mediationtestsuite.utils.e;
import com.google.android.ads.mediationtestsuite.utils.k;
import com.google.android.material.tabs.TabLayout;
import java.io.IOException;
import q7.b;
import r7.f;

/* loaded from: classes2.dex */
public class HomeActivity extends androidx.appcompat.app.d implements b.h<s7.d<?>> {

    /* renamed from: a  reason: collision with root package name */
    private ViewPager f20765a;

    /* renamed from: b  reason: collision with root package name */
    private Toolbar f20766b;

    /* renamed from: c  reason: collision with root package name */
    private q7.a f20767c;

    /* renamed from: d  reason: collision with root package name */
    private TabLayout f20768d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements ViewPager.j {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
            r7.c.b(new f(HomeActivity.this.f20767c.b(i10)), HomeActivity.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            HomeActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements DialogInterface.OnClickListener {
        c(HomeActivity homeActivity) {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            e.y(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CheckBox f20771a;

        /* loaded from: classes2.dex */
        class a implements CompoundButton.OnCheckedChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ androidx.appcompat.app.c f20772a;

            a(d dVar, androidx.appcompat.app.c cVar) {
                this.f20772a = cVar;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                this.f20772a.e(-1).setEnabled(z10);
            }
        }

        d(HomeActivity homeActivity, CheckBox checkBox) {
            this.f20771a = checkBox;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) dialogInterface;
            cVar.e(-1).setEnabled(false);
            this.f20771a.setOnCheckedChangeListener(new a(this, cVar));
        }
    }

    private void f() {
        this.f20765a = (ViewPager) findViewById(com.google.android.ads.mediationtestsuite.d.f20817r);
        q7.a aVar = new q7.a(getSupportFragmentManager(), this, e.m().a());
        this.f20767c = aVar;
        this.f20765a.setAdapter(aVar);
        this.f20765a.c(new a());
        this.f20768d.setupWithViewPager(this.f20765a);
    }

    private void g() {
        String format = String.format(getString(g.f20875p), String.format("<a href=\"%1$s\">%2$s</a>", k.d().e(), getString(g.f20877q)));
        View inflate = getLayoutInflater().inflate(com.google.android.ads.mediationtestsuite.e.f20833e, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(com.google.android.ads.mediationtestsuite.d.f20807h);
        textView.setText(Html.fromHtml(format));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        androidx.appcompat.app.c create = new c.a(this, h.f20899c).g(g.f20879r).setView(inflate).b(false).setPositiveButton(g.f20863j, new c(this)).setNegativeButton(g.f20865k, new b()).create();
        create.setOnShowListener(new d(this, (CheckBox) inflate.findViewById(com.google.android.ads.mediationtestsuite.d.f20806g)));
        create.show();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem] */
    @Override // q7.b.h
    /* renamed from: e */
    public void b(s7.d<?> dVar) {
        Intent intent = new Intent(this, ConfigurationItemDetailActivity.class);
        intent.putExtra("ad_unit", dVar.p().e());
        startActivity(intent);
    }

    @Override // android.app.Activity
    public void finish() {
        MediationTestSuiteListener listener = MediationTestSuite.getListener();
        if (listener != null) {
            listener.onMediationTestSuiteDismissed();
        }
        k.s().n();
        super.finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.q(this, getIntent().getStringExtra("app_id"));
        getTheme().applyStyle(k.d().p(), true);
        setContentView(com.google.android.ads.mediationtestsuite.e.f20831c);
        this.f20766b = (Toolbar) findViewById(com.google.android.ads.mediationtestsuite.d.f20815p);
        this.f20768d = (TabLayout) findViewById(com.google.android.ads.mediationtestsuite.d.f20822w);
        setSupportActionBar(this.f20766b);
        setTitle("Mediation Test Suite");
        this.f20766b.setSubtitle(k.d().k());
        try {
            e.h();
        } catch (IOException e10) {
            Log.e("gma_test", "IO Exception: " + e10.getLocalizedMessage());
            e10.printStackTrace();
        }
        f();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.google.android.ads.mediationtestsuite.f.f20844b, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == com.google.android.ads.mediationtestsuite.d.f20820u) {
            r7.c.b(new f(f.a.SEARCH), this);
            startActivity(new Intent(this, ConfigurationItemsSearchActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onResume() {
        super.onResume();
        if (e.l()) {
            return;
        }
        g();
    }
}
