package com.applovin.impl.mediation.debugger.ui.e;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.b.a.d;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import fm.castbox.mediation.model.DisplayResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.mediation.debugger.ui.a {

    /* renamed from: a  reason: collision with root package name */
    private m f7726a;

    /* renamed from: b  reason: collision with root package name */
    private List<d> f7727b;

    /* renamed from: c  reason: collision with root package name */
    private List<d> f7728c;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.ui.d.d f7729d;

    /* renamed from: e  reason: collision with root package name */
    private List<c> f7730e;

    /* renamed from: f  reason: collision with root package name */
    private List<c> f7731f;

    /* renamed from: g  reason: collision with root package name */
    private ListView f7732g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.mediation.debugger.ui.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0126a {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public a() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d a(com.applovin.impl.mediation.debugger.ui.d.a aVar) {
        return (aVar.a() == EnumC0126a.BIDDERS.ordinal() ? this.f7727b : this.f7728c).get(aVar.b());
    }

    private List<c> a(List<d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final d dVar : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(dVar.c(), this) { // from class: com.applovin.impl.mediation.debugger.ui.e.a.3
                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int f() {
                    if (a.this.f7726a.J().c() == null || !a.this.f7726a.J().c().equals(dVar.a())) {
                        return 0;
                    }
                    return R.drawable.applovin_ic_check_mark_borderless;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
                public int g() {
                    if (a.this.f7726a.J().c() == null || !a.this.f7726a.J().c().equals(dVar.a())) {
                        return super.g();
                    }
                    return -16776961;
                }

                @Override // com.applovin.impl.mediation.debugger.ui.d.c
                public SpannedString k() {
                    return StringUtils.createSpannedString(dVar.b(), b() ? -16777216 : -7829368, 18, 1);
                }
            });
        }
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    protected m getSdk() {
        return this.f7726a;
    }

    public void initialize(List<d> list, List<d> list2, final m mVar) {
        this.f7726a = mVar;
        this.f7727b = list;
        this.f7728c = list2;
        this.f7730e = a(list);
        this.f7731f = a(list2);
        com.applovin.impl.mediation.debugger.ui.d.d dVar = new com.applovin.impl.mediation.debugger.ui.d.d(this) { // from class: com.applovin.impl.mediation.debugger.ui.e.a.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int a(int i10) {
                return (i10 == EnumC0126a.BIDDERS.ordinal() ? a.this.f7730e : a.this.f7731f).size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int b() {
                return EnumC0126a.COUNT.ordinal();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected c b(int i10) {
                return i10 == EnumC0126a.BIDDERS.ordinal() ? new e("BIDDERS") : new e(DisplayResult.CATEGORY_WATERFALL);
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected List<c> c(int i10) {
                return i10 == EnumC0126a.BIDDERS.ordinal() ? a.this.f7730e : a.this.f7731f;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected c k() {
                return new c.a(c.b.SECTION_CENTERED).a("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
            }
        };
        this.f7729d = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.e.a.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                String a10 = a.this.a(aVar).a();
                if (StringUtils.isValidString(a10) && StringUtils.isValidString(mVar.J().c()) && a10.equals(mVar.J().c())) {
                    mVar.J().a(false);
                    mVar.J().a((String) null);
                } else {
                    mVar.J().a(true);
                    mVar.J().a(a10);
                }
                a.this.f7729d.notifyDataSetChanged();
            }
        });
        this.f7729d.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f7732g = listView;
        listView.setAdapter((ListAdapter) this.f7729d);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f7730e = a(this.f7727b);
        this.f7731f = a(this.f7728c);
        this.f7729d.j();
    }
}
