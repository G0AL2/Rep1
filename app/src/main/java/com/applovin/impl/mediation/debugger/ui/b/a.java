package com.applovin.impl.mediation.debugger.ui.b;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.mediation.debugger.ui.a;
import com.applovin.impl.mediation.debugger.ui.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.AppLovinContentProviderUtils;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {

    /* renamed from: a  reason: collision with root package name */
    private b f7606a;

    /* renamed from: b  reason: collision with root package name */
    private DataSetObserver f7607b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f7608c;

    /* renamed from: d  reason: collision with root package name */
    private ListView f7609d;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.impl.adview.a f7610e;

    private void a() {
        Uri cacheJPEGImageWithFileName;
        Bitmap a10 = this.f7606a.a(this.f7609d);
        if (a10 == null || (cacheJPEGImageWithFileName = AppLovinContentProviderUtils.cacheJPEGImageWithFileName(a10, "mediation_debugger_screenshot.jpeg")) == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/jpeg");
        intent.putExtra("android.intent.extra.STREAM", cacheJPEGImageWithFileName);
        intent.addFlags(1);
        startActivity(Intent.createChooser(intent, "Share Mediation Debugger"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Context context) {
        if (!StringUtils.isValidString(this.f7606a.g()) || this.f7606a.c()) {
            return;
        }
        this.f7606a.a(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.3
            @Override // java.lang.Runnable
            public void run() {
                Utils.showAlert(a.this.f7606a.f(), a.this.f7606a.g(), context);
            }
        });
    }

    private void b() {
        c();
        com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a(this, 50, 16842874);
        this.f7610e = aVar;
        aVar.setColor(-3355444);
        this.f7608c.addView(this.f7610e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f7608c.bringChildToFront(this.f7610e);
        this.f7610e.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.applovin.impl.adview.a aVar = this.f7610e;
        if (aVar != null) {
            aVar.b();
            this.f7608c.removeView(this.f7610e);
            this.f7610e = null;
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    protected m getSdk() {
        b bVar = this.f7606a;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(R.layout.list_view);
        this.f7608c = (FrameLayout) findViewById(16908290);
        this.f7609d = (ListView) findViewById(R.id.listView);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.f7606a;
        if (bVar != null) {
            bVar.unregisterDataSetObserver(this.f7607b);
            this.f7606a.a((d.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share == menuItem.getItemId()) {
            a();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f7609d.setAdapter((ListAdapter) this.f7606a);
        b bVar = this.f7606a;
        if (bVar == null || bVar.a()) {
            return;
        }
        b();
    }

    public void setListAdapter(b bVar, final com.applovin.impl.sdk.a aVar) {
        DataSetObserver dataSetObserver;
        b bVar2 = this.f7606a;
        if (bVar2 != null && (dataSetObserver = this.f7607b) != null) {
            bVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f7606a = bVar;
        this.f7607b = new DataSetObserver() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                a.this.c();
                a aVar2 = a.this;
                aVar2.a((Context) aVar2);
            }
        };
        a((Context) this);
        this.f7606a.registerDataSetObserver(this.f7607b);
        this.f7606a.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar2, final c cVar) {
                a aVar3;
                String str;
                String str2;
                int a10 = aVar2.a();
                if (a10 == b.EnumC0124b.MAX.ordinal()) {
                    Utils.showAlert(cVar.l(), cVar.m(), a.this);
                } else if (a10 != b.EnumC0124b.ADS.ordinal()) {
                    if ((a10 == b.EnumC0124b.INCOMPLETE_NETWORKS.ordinal() || a10 == b.EnumC0124b.COMPLETED_NETWORKS.ordinal()) && (cVar instanceof com.applovin.impl.mediation.debugger.ui.b.a.a)) {
                        a.this.startActivity(MaxDebuggerDetailActivity.class, aVar, new a.InterfaceC0120a<MaxDebuggerDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.3
                            @Override // com.applovin.impl.mediation.debugger.ui.a.InterfaceC0120a
                            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                                maxDebuggerDetailActivity.initialize(((com.applovin.impl.mediation.debugger.ui.b.a.a) cVar).d());
                            }
                        });
                    }
                } else {
                    if (aVar2.b() == b.a.AD_UNITS.ordinal()) {
                        if (a.this.f7606a.e().size() > 0) {
                            a.this.startActivity(MaxDebuggerAdUnitsListActivity.class, aVar, new a.InterfaceC0120a<MaxDebuggerAdUnitsListActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.1
                                @Override // com.applovin.impl.mediation.debugger.ui.a.InterfaceC0120a
                                public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                    maxDebuggerAdUnitsListActivity.initialize(a.this.f7606a.e(), a.this.f7606a.d());
                                }
                            });
                            return;
                        }
                        aVar3 = a.this;
                        str = "No live ad units";
                        str2 = "Please setup or enable your MAX ad units on https://applovin.com.";
                    } else if (aVar2.b() != b.a.SELECT_LIVE_NETWORKS.ordinal()) {
                        return;
                    } else {
                        if (a.this.f7606a.h().size() > 0 || a.this.f7606a.i().size() > 0) {
                            if (a.this.f7606a.d().J().a()) {
                                Utils.showAlert("Restart Required", cVar.m(), a.this);
                                return;
                            } else {
                                a.this.startActivity(MaxDebuggerTestLiveNetworkActivity.class, aVar, new a.InterfaceC0120a<MaxDebuggerTestLiveNetworkActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.2
                                    @Override // com.applovin.impl.mediation.debugger.ui.a.InterfaceC0120a
                                    public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                                        maxDebuggerTestLiveNetworkActivity.initialize(a.this.f7606a.h(), a.this.f7606a.i(), a.this.f7606a.d());
                                    }
                                });
                                return;
                            }
                        }
                        aVar3 = a.this;
                        str = "Complete Integrations";
                        str2 = "Please complete integrations in order to access this.";
                    }
                    Utils.showAlert(str, str2, aVar3);
                }
            }
        });
    }
}
