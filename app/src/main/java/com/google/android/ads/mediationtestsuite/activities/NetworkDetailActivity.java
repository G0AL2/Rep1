package com.google.android.ads.mediationtestsuite.activities;

import android.os.Bundle;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.ads.mediationtestsuite.viewmodels.e;
import java.util.List;
import q7.b;
import s7.k;

/* loaded from: classes2.dex */
public class NetworkDetailActivity extends d {

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f20773a;

    /* renamed from: b  reason: collision with root package name */
    private NetworkConfig f20774b;

    /* renamed from: c  reason: collision with root package name */
    private List<e> f20775c;

    /* renamed from: d  reason: collision with root package name */
    private b<com.google.android.ads.mediationtestsuite.viewmodels.b> f20776d;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.google.android.ads.mediationtestsuite.e.f20832d);
        this.f20773a = (RecyclerView) findViewById(com.google.android.ads.mediationtestsuite.d.f20818s);
        this.f20774b = com.google.android.ads.mediationtestsuite.utils.e.o(getIntent().getIntExtra("network_config", -1));
        k c10 = com.google.android.ads.mediationtestsuite.utils.k.d().c(this.f20774b);
        setTitle(c10.d(this));
        getSupportActionBar().x(c10.c(this));
        this.f20775c = c10.a(this);
        this.f20773a.setLayoutManager(new LinearLayoutManager(this));
        b<com.google.android.ads.mediationtestsuite.viewmodels.b> bVar = new b<>(this, this.f20775c, null);
        this.f20776d = bVar;
        this.f20773a.setAdapter(bVar);
    }
}
