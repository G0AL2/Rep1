package com.applovin.impl.mediation.debugger.ui.a;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.mediation.debugger.ui.a;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c extends com.applovin.impl.mediation.debugger.ui.a {

    /* renamed from: a  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.a> f7588a;

    /* renamed from: b  reason: collision with root package name */
    private m f7589b;

    /* renamed from: c  reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.ui.d.d f7590c;

    /* renamed from: d  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f7591d;

    /* renamed from: e  reason: collision with root package name */
    private ListView f7592e;

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<com.applovin.impl.mediation.debugger.b.a.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (com.applovin.impl.mediation.debugger.b.a.a aVar : list) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(aVar.a(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(aVar.c(), -16777216));
            arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.a(c.b.DETAIL).a(StringUtils.createSpannedString(aVar.b(), -16777216, 18, 1)).b(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.a
    protected m getSdk() {
        return this.f7589b;
    }

    public void initialize(final List<com.applovin.impl.mediation.debugger.b.a.a> list, final m mVar) {
        this.f7588a = list;
        this.f7589b = mVar;
        this.f7591d = a(list);
        com.applovin.impl.mediation.debugger.ui.d.d dVar = new com.applovin.impl.mediation.debugger.ui.d.d(this) { // from class: com.applovin.impl.mediation.debugger.ui.a.c.1
            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int a(int i10) {
                return list.size();
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected int b() {
                return 1;
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
                return new e("");
            }

            @Override // com.applovin.impl.mediation.debugger.ui.d.d
            protected List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
                return c.this.f7591d;
            }
        };
        this.f7590c = dVar;
        dVar.a(new d.a() { // from class: com.applovin.impl.mediation.debugger.ui.a.c.2
            @Override // com.applovin.impl.mediation.debugger.ui.d.d.a
            public void a(final com.applovin.impl.mediation.debugger.ui.d.a aVar, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                c.this.startActivity(MaxDebuggerAdUnitDetailActivity.class, mVar.af(), new a.InterfaceC0120a<MaxDebuggerAdUnitDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.a.c.2.1
                    @Override // com.applovin.impl.mediation.debugger.ui.a.InterfaceC0120a
                    public void a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                        maxDebuggerAdUnitDetailActivity.initialize((com.applovin.impl.mediation.debugger.b.a.a) list.get(aVar.b()), null, mVar);
                    }
                });
            }
        });
        this.f7590c.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.mediation.debugger.ui.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Ad Units");
        setContentView(R.layout.list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f7592e = listView;
        listView.setAdapter((ListAdapter) this.f7590c);
    }
}
