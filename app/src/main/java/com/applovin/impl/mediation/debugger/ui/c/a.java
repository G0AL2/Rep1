package com.applovin.impl.mediation.debugger.ui.c;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.b.b.b;
import com.applovin.impl.mediation.debugger.ui.a;
import com.applovin.impl.mediation.debugger.ui.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {

    /* renamed from: a  reason: collision with root package name */
    private b f7659a;

    /* renamed from: b  reason: collision with root package name */
    private ListView f7660b;

    public a() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    protected m getSdk() {
        b bVar = this.f7659a;
        if (bVar != null) {
            return bVar.a().v();
        }
        return null;
    }

    public void initialize(final com.applovin.impl.mediation.debugger.b.b.b bVar) {
        setTitle(bVar.i());
        b bVar2 = new b(bVar, this);
        this.f7659a = bVar2;
        bVar2.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                if (aVar.a() == b.a.TEST_ADS.ordinal()) {
                    m v10 = bVar.v();
                    b.EnumC0119b c10 = bVar.c();
                    if (b.EnumC0119b.READY == c10) {
                        a.this.startActivity(MaxDebuggerMultiAdActivity.class, v10.af(), new a.InterfaceC0120a<MaxDebuggerMultiAdActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.c.a.1.1
                            @Override // com.applovin.impl.mediation.debugger.ui.a.InterfaceC0120a
                            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                                maxDebuggerMultiAdActivity.initialize(bVar);
                            }
                        });
                        return;
                    } else if (b.EnumC0119b.DISABLED == c10) {
                        v10.J().d();
                        Utils.showAlert("Restart Required", cVar.m(), a.this);
                        return;
                    }
                }
                Utils.showAlert("Instructions", cVar.m(), a.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f7660b = listView;
        listView.setAdapter((ListAdapter) this.f7659a);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f7659a.a().m().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f7659a.c();
            this.f7659a.j();
        }
    }
}
