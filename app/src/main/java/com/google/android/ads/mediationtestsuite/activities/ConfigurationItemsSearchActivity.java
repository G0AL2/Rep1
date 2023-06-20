package com.google.android.ads.mediationtestsuite.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.ads.mediationtestsuite.e;
import com.google.android.ads.mediationtestsuite.utils.k;
import q7.b;

/* loaded from: classes2.dex */
public class ConfigurationItemsSearchActivity extends d implements b.h<s7.d<?>> {

    /* renamed from: a  reason: collision with root package name */
    private p7.a f20763a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements SearchView.l {
        a() {
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean a(String str) {
            ConfigurationItemsSearchActivity.this.f20763a.e(str);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.l
        public boolean b(String str) {
            ConfigurationItemsSearchActivity.this.f20763a.e(str);
            return false;
        }
    }

    private void e(SearchView searchView) {
        searchView.setQueryHint(getResources().getString(k.d().b()));
        searchView.setIconified(false);
        searchView.setOnQueryTextListener(new a());
    }

    private void f(Intent intent) {
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            this.f20763a.e(intent.getStringExtra("query"));
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.ads.mediationtestsuite.dataobjects.ConfigurationItem] */
    @Override // q7.b.h
    /* renamed from: g */
    public void b(s7.d<?> dVar) {
        Intent intent = new Intent(this, ConfigurationItemDetailActivity.class);
        intent.putExtra("ad_unit", dVar.p().e());
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(e.f20830b);
        p7.a aVar = (p7.a) getSupportFragmentManager().i0("ConfigItemsSearchFragment");
        this.f20763a = aVar;
        if (aVar == null) {
            this.f20763a = p7.a.g();
            getSupportFragmentManager().m().c(com.google.android.ads.mediationtestsuite.d.f20809j, this.f20763a, "ConfigItemsSearchFragment").g();
        }
        f(getIntent());
        Toolbar toolbar = (Toolbar) findViewById(com.google.android.ads.mediationtestsuite.d.f20824y);
        toolbar.setNavigationIcon((Drawable) null);
        setSupportActionBar(toolbar);
        getSupportActionBar().r(e.f20838j);
        getSupportActionBar().t(true);
        getSupportActionBar().u(false);
        getSupportActionBar().v(false);
        e((SearchView) getSupportActionBar().i());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        f(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
