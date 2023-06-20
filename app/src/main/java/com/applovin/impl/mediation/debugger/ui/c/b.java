package com.applovin.impl.mediation.debugger.ui.c;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.mediation.debugger.b.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.f;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b extends d {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.b.b f7664a;

    /* renamed from: b  reason: collision with root package name */
    private List<c> f7665b;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f7666d;

    /* renamed from: e  reason: collision with root package name */
    private final List<c> f7667e;

    /* renamed from: f  reason: collision with root package name */
    private final List<c> f7668f;

    /* renamed from: g  reason: collision with root package name */
    private final List<c> f7669g;

    /* renamed from: h  reason: collision with root package name */
    private SpannedString f7670h;

    /* loaded from: classes.dex */
    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(com.applovin.impl.mediation.debugger.b.b.b bVar, Context context) {
        super(context);
        this.f7664a = bVar;
        if (bVar.a() == b.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f7670h = new SpannedString(spannableString);
        } else {
            this.f7670h = new SpannedString("");
        }
        this.f7665b = d();
        this.f7666d = a(bVar.r());
        this.f7667e = a(bVar.t());
        this.f7668f = b(bVar.s());
        this.f7669g = h();
        notifyDataSetChanged();
    }

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }

    private c a(b.EnumC0119b enumC0119b) {
        c.a p10 = c.p();
        if (enumC0119b == b.EnumC0119b.READY) {
            p10.a(this.f7722c);
        }
        return p10.a("Test Mode").b(enumC0119b.a()).b(enumC0119b.b()).d(enumC0119b.c()).a(true).a();
    }

    private List<c> a(com.applovin.impl.mediation.debugger.b.b.c cVar) {
        ArrayList arrayList = new ArrayList(1);
        if (cVar.a()) {
            boolean b10 = cVar.b();
            arrayList.add(c.a(b10 ? c.b.RIGHT_DETAIL : c.b.DETAIL).a("Cleartext Traffic").b(b10 ? null : this.f7670h).d(cVar.c()).a(a(b10)).c(b(b10)).a(true ^ b10).a());
        }
        return arrayList;
    }

    private List<c> a(List<com.applovin.impl.mediation.debugger.b.b.d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.b.b.d dVar : list) {
                boolean c10 = dVar.c();
                arrayList.add(c.a(c10 ? c.b.RIGHT_DETAIL : c.b.DETAIL).a(dVar.a()).b(c10 ? null : this.f7670h).d(dVar.b()).a(a(c10)).c(b(c10)).a(!c10).a());
            }
        }
        return arrayList;
    }

    private int b(boolean z10) {
        return f.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f7722c);
    }

    private List<c> b(List<com.applovin.impl.mediation.debugger.b.b.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            for (com.applovin.impl.mediation.debugger.b.b.a aVar : list) {
                boolean c10 = aVar.c();
                arrayList.add(c.a(c10 ? c.b.RIGHT_DETAIL : c.b.DETAIL).a(aVar.a()).b(c10 ? null : this.f7670h).d(aVar.b()).a(a(c10)).c(b(c10)).a(!c10).a());
            }
        }
        return arrayList;
    }

    private c c(List<String> list) {
        return c.p().a("Region/VPN Required").b(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private List<c> d() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(e());
        arrayList.add(f());
        arrayList.add(g());
        return arrayList;
    }

    private c e() {
        c.a b10 = c.p().a("SDK").b(this.f7664a.j());
        if (TextUtils.isEmpty(this.f7664a.j())) {
            b10.a(a(this.f7664a.d())).c(b(this.f7664a.d()));
        }
        return b10.a();
    }

    private String e(int i10) {
        return (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i10 || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i10 || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i10) ? "Initialized" : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i10 ? "Failure" : MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i10 ? "Initializing..." : "Not Initialized";
    }

    private c f() {
        c.a b10 = c.p().a("Adapter").b(this.f7664a.k());
        if (TextUtils.isEmpty(this.f7664a.k())) {
            b10.a(a(this.f7664a.e())).c(b(this.f7664a.e()));
        }
        return b10.a();
    }

    private c g() {
        return c.p().a("Initialization Status").b(e(this.f7664a.b())).a(false).a();
    }

    private List<c> h() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f7664a.u())) {
            arrayList.add(c.a(c.b.DETAIL).a(this.f7664a.u()).a());
        }
        if (this.f7664a.c() != b.EnumC0119b.NOT_SUPPORTED) {
            if (this.f7664a.n() != null) {
                arrayList.add(c(this.f7664a.n()));
            }
            arrayList.add(a(this.f7664a.c()));
        }
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int a(int i10) {
        return (i10 == a.INTEGRATIONS.ordinal() ? this.f7665b : i10 == a.PERMISSIONS.ordinal() ? this.f7666d : i10 == a.CONFIGURATION.ordinal() ? this.f7667e : i10 == a.DEPENDENCIES.ordinal() ? this.f7668f : this.f7669g).size();
    }

    public com.applovin.impl.mediation.debugger.b.b.b a() {
        return this.f7664a;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected c b(int i10) {
        return i10 == a.INTEGRATIONS.ordinal() ? new e("INTEGRATIONS") : i10 == a.PERMISSIONS.ordinal() ? new e("PERMISSIONS") : i10 == a.CONFIGURATION.ordinal() ? new e("CONFIGURATION") : i10 == a.DEPENDENCIES.ordinal() ? new e("DEPENDENCIES") : new e("TEST ADS");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected List<c> c(int i10) {
        return i10 == a.INTEGRATIONS.ordinal() ? this.f7665b : i10 == a.PERMISSIONS.ordinal() ? this.f7666d : i10 == a.CONFIGURATION.ordinal() ? this.f7667e : i10 == a.DEPENDENCIES.ordinal() ? this.f7668f : this.f7669g;
    }

    public void c() {
        this.f7665b = d();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }
}
