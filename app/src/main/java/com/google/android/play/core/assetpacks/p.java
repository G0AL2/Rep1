package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class p implements d3 {

    /* renamed from: f  reason: collision with root package name */
    private static final cb.e f22960f = new cb.e("AssetPackServiceImpl");

    /* renamed from: g  reason: collision with root package name */
    private static final Intent f22961g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a  reason: collision with root package name */
    private final String f22962a;

    /* renamed from: b  reason: collision with root package name */
    private final w0 f22963b;

    /* renamed from: c  reason: collision with root package name */
    private cb.o<cb.n0> f22964c;

    /* renamed from: d  reason: collision with root package name */
    private cb.o<cb.n0> f22965d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f22966e = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Context context, w0 w0Var) {
        this.f22962a = context.getPackageName();
        this.f22963b = w0Var;
        if (cb.s.a(context)) {
            Context a10 = eb.a.a(context);
            cb.e eVar = f22960f;
            Intent intent = f22961g;
            this.f22964c = new cb.o<>(a10, eVar, "AssetPackService", intent, e3.f22814a);
            this.f22965d = new cb.o<>(eb.a.a(context), eVar, "AssetPackService-keepAlive", intent, f3.f22829a);
        }
        f22960f.c("AssetPackService initiated.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ArrayList d(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List e(p pVar, List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AssetPackState next = c.b((Bundle) list.get(i10), pVar.f22963b).e().values().iterator().next();
            if (next == null) {
                f22960f.e("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (u1.c(next.f())) {
                arrayList.add(next.e());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(int i10, String str, int i11) {
        if (this.f22964c == null) {
            throw new s0("The Play Store app is not installed or is an unofficial version.", i10);
        }
        f22960f.f("notifyModuleCompleted", new Object[0]);
        gb.p pVar = new gb.p();
        this.f22964c.c(new g(this, pVar, i10, str, pVar, i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle j(Map map) {
        Bundle s10 = s();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        s10.putParcelableArrayList("installed_asset_module", arrayList);
        return s10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle m(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i10);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle n(int i10, String str) {
        Bundle m10 = m(i10);
        m10.putString("module_name", str);
        return m10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle o(int i10, String str, String str2, int i11) {
        Bundle n10 = n(i10, str);
        n10.putString("slice_id", str2);
        n10.putInt("chunk_number", i11);
        return n10;
    }

    private static <T> gb.e<T> r() {
        f22960f.e("onError(%d)", -11);
        return gb.g.a(new a(-11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle s() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10800);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final gb.e<ParcelFileDescriptor> a(int i10, String str, String str2, int i11) {
        if (this.f22964c == null) {
            return r();
        }
        f22960f.f("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i11), Integer.valueOf(i10));
        gb.p pVar = new gb.p();
        this.f22964c.c(new i(this, pVar, i10, str, str2, i11, pVar));
        return pVar.a();
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final gb.e<List<String>> a(Map<String, Long> map) {
        if (this.f22964c == null) {
            return r();
        }
        f22960f.f("syncPacks", new Object[0]);
        gb.p pVar = new gb.p();
        this.f22964c.c(new e(this, pVar, map, pVar));
        return pVar.a();
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final synchronized void a() {
        if (this.f22965d == null) {
            f22960f.g("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        cb.e eVar = f22960f;
        eVar.f("keepAlive", new Object[0]);
        if (!this.f22966e.compareAndSet(false, true)) {
            eVar.f("Service is already kept alive.", new Object[0]);
            return;
        }
        gb.p pVar = new gb.p();
        this.f22965d.c(new j(this, pVar, pVar));
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final void a(int i10) {
        if (this.f22964c == null) {
            throw new s0("The Play Store app is not installed or is an unofficial version.", i10);
        }
        f22960f.f("notifySessionFailed", new Object[0]);
        gb.p pVar = new gb.p();
        this.f22964c.c(new h(this, pVar, i10, pVar));
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final void a(int i10, String str) {
        f(i10, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final void a(List<String> list) {
        if (this.f22964c == null) {
            return;
        }
        f22960f.f("cancelDownloads(%s)", list);
        gb.p pVar = new gb.p();
        this.f22964c.c(new d(this, pVar, list, pVar));
    }

    @Override // com.google.android.play.core.assetpacks.d3
    public final void b(int i10, String str, String str2, int i11) {
        if (this.f22964c == null) {
            throw new s0("The Play Store app is not installed or is an unofficial version.", i10);
        }
        f22960f.f("notifyChunkTransferred", new Object[0]);
        gb.p pVar = new gb.p();
        this.f22964c.c(new f(this, pVar, i10, str, str2, i11, pVar));
    }
}
