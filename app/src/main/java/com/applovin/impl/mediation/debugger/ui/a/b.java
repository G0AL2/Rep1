package com.applovin.impl.mediation.debugger.ui.a;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.b.a.e;
import com.applovin.impl.sdk.utils.StringUtils;
import fm.castbox.mediation.model.DisplayResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends com.applovin.impl.mediation.debugger.ui.d.d {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.a.a f7576a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.a.b f7577b;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f7578d;

    /* renamed from: e  reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f7579e;

    /* renamed from: f  reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f7580f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends com.applovin.impl.mediation.debugger.ui.b.a.a {

        /* renamed from: o  reason: collision with root package name */
        private final com.applovin.impl.mediation.debugger.b.a.b f7582o;

        a(com.applovin.impl.mediation.debugger.b.a.b bVar, String str, boolean z10) {
            super(bVar.a().c(), ((com.applovin.impl.mediation.debugger.ui.d.d) b.this).f7722c);
            this.f7582o = bVar;
            this.f7688d = StringUtils.createSpannedString(bVar.a().b(), -16777216, 18, 1);
            this.f7689e = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f7687c = z10;
        }

        public com.applovin.impl.mediation.debugger.b.a.b a() {
            return this.f7582o;
        }

        @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
        public boolean b() {
            return this.f7687c;
        }

        @Override // com.applovin.impl.mediation.debugger.ui.d.c
        public int c() {
            return -12303292;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    enum EnumC0122b {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(com.applovin.impl.mediation.debugger.b.a.a aVar, com.applovin.impl.mediation.debugger.b.a.b bVar, Context context) {
        super(context);
        this.f7576a = aVar;
        this.f7577b = bVar;
        this.f7578d = c();
        this.f7579e = d();
        this.f7580f = e();
        notifyDataSetChanged();
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> c() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(f());
        arrayList.add(g());
        if (this.f7577b != null) {
            arrayList.add(h());
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> d() {
        com.applovin.impl.mediation.debugger.b.a.b bVar = this.f7577b;
        if (bVar == null || bVar.c()) {
            List<com.applovin.impl.mediation.debugger.b.a.b> a10 = this.f7576a.e().a();
            ArrayList arrayList = new ArrayList(a10.size());
            for (com.applovin.impl.mediation.debugger.b.a.b bVar2 : a10) {
                com.applovin.impl.mediation.debugger.b.a.b bVar3 = this.f7577b;
                if (bVar3 == null || bVar3.a().a().equals(bVar2.a().a())) {
                    arrayList.add(new a(bVar2, bVar2.b() != null ? bVar2.b().a() : "", this.f7577b == null));
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> e() {
        com.applovin.impl.mediation.debugger.b.a.b bVar = this.f7577b;
        if (bVar == null || !bVar.c()) {
            List<com.applovin.impl.mediation.debugger.b.a.b> b10 = this.f7576a.e().b();
            ArrayList arrayList = new ArrayList(b10.size());
            for (com.applovin.impl.mediation.debugger.b.a.b bVar2 : b10) {
                com.applovin.impl.mediation.debugger.b.a.b bVar3 = this.f7577b;
                if (bVar3 == null || bVar3.a().a().equals(bVar2.a().a())) {
                    arrayList.add(new a(bVar2, null, this.f7577b == null));
                    for (e eVar : bVar2.d()) {
                        arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.p().a(eVar.a()).b(eVar.b()).b(true).a());
                    }
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c f() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("ID").b(this.f7576a.a()).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c g() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("Ad Format").b(this.f7576a.c()).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c h() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("Selected Network").b(this.f7577b.a().b()).a();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int a(int i10) {
        return (i10 == EnumC0122b.INFO.ordinal() ? this.f7578d : i10 == EnumC0122b.BIDDERS.ordinal() ? this.f7579e : this.f7580f).size();
    }

    public String a() {
        return this.f7576a.b();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int b() {
        return EnumC0122b.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
        return i10 == EnumC0122b.INFO.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("INFO") : i10 == EnumC0122b.BIDDERS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("BIDDERS") : new com.applovin.impl.mediation.debugger.ui.d.e(DisplayResult.CATEGORY_WATERFALL);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
        return i10 == EnumC0122b.INFO.ordinal() ? this.f7578d : i10 == EnumC0122b.BIDDERS.ordinal() ? this.f7579e : this.f7580f;
    }
}
